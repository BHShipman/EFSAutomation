package com.imc.efs.automation.facade.impl;

import java.math.BigDecimal;
import java.util.Date;
import java.util.logging.Logger;

import javax.ejb.Remote;
import javax.ejb.Stateless;

import com.imc.business.logic.service.EfsBusinessLogicServiceBean;
import com.imc.business.logic.service.NotImplemented_Exception;
import com.imc.efs.automation.data.EfsCheckRequest;
import com.imc.efs.automation.data.EfsMoneyCode;
import com.imc.efs.automation.data.FileUpload;
import com.imc.efs.automation.entities.Requests;
import com.imc.efs.automation.enums.RequestStatuses;
import com.imc.efs.automation.exception.NotImplemented;
import com.imc.efs.automation.exception.Unexpected;
import com.imc.efs.automation.facade.EfsAutomationFacade;

@Stateless(name = "EfsAutomationFacadeImpl")
@Remote(EfsAutomationFacade.class)
public class EfsAutomationFacadeImpl implements EfsAutomationFacade {

//	@EJB(beanName = "EfsBOService")
	private EfsBusinessLogicServiceBean boService;
	
	private Logger log = Logger.getLogger("EfsAutomationFacadeImpl");
	
	public EfsAutomationFacadeImpl(EfsBusinessLogicServiceBean boService) {
		this.boService = boService;

	}

	public EfsAutomationFacadeImpl() {

	}

	public boolean validateCredentials(String username, String password) {
		return boService.efsBOService.validateCredentials(username, password);
	}

	public EfsMoneyCode requestEfsCheck(EfsCheckRequest newRequest)
			throws NotImplemented, Unexpected, NotImplemented_Exception {
		
		Requests request = boService.efsBOService.toRequest(newRequest);

		request.setRequestDate(new Date());
		request.setCompany(request.getCompany().trim());
		if (request.getDriverId() != null) {
			request.setDriverId(request.getDriverId().trim());
		}

		// Get request type in order to determine what validations should take
		// place
		try {
			request.setRequesttypes(boService.efsBOService
					.getRequestType(request.getRequestTypeId()));
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		log.info("Validating request input against request config");
		boService.efsBOService.validateRequestInputAgainstConfig(request);

		if (!(request.getPoWoNumber().isEmpty())
				|| request.getPoWoNumber() != null) {
			boService.efsBOService.validateIsNotDuplicateRequest(request
					.getPoWoNumber());
		}
		log.info("Request is not duplicate");
		boolean hasInvoice = false;
		for (FileUpload file : newRequest.getFileUploads()) {
			if (file.getFileType() == ("INV"))
				hasInvoice = true;
		}
		if (hasInvoice){
			log.info("invoice has been attached to this request");
		}
		if (request.getRequesttypes().isRequiresInvoice()) {
			log.info("This request requires an invoice");
			if (request.getRequesttypes().isIsOpsPortalType()) {
				log.info("This request is Ops Portal Type");
				if (newRequest.getFileUploads() == null || !hasInvoice) {
					throw new NotImplemented(
							"Not Implemented - An invoice is required for this type of request");
				}

				try {
					log.info("Saving request to DB");
					request.setRequestId(boService.efsBOService
							.updateRequest(request));
				} catch (Exception e) {
					throw new Unexpected(e.getLocalizedMessage());
				}
				
				log.info("Saving attached documents to Filebound");
				
				long efsDexProjId = 129;
				boService.efsBOService.storeDocuments(
						newRequest.getFileUploads(), request.getRequestId(),
						request.getRequester());
			} else {
				log.info("Validating invoice is attached");
				if (!boService.efsBOService.validateHasInvoice(request)) {
					throw new NotImplemented(
							"Not Implemented - An invoice is required for this type of request");

				}
			}
		}

		log.info("moving to processRequest");
		return processRequest(request, false);
	}

	public EfsMoneyCode resumeEfsCheckIssuance(int requestId)
			throws Unexpected, NotImplemented, NotImplemented_Exception {
		Requests request = boService.efsBOService.getRequest(requestId);
		log.info("received request from id:" + requestId);
		return processRequest(request, true);
	}

	private EfsMoneyCode processRequest(Requests request, boolean resumed)
			throws NotImplemented, Unexpected, NotImplemented_Exception {
		if (request.getStatus() == null) {
			request.setStatus(boService.efsBOService.getStatus(request
					.getStatusId()));
		}
		log.info("Checking Request Status");
		if (request.getStatus().getStatusId() <= RequestStatuses.PendingApproval.index()) {
			log.info("Status is New or Pending Approval");
			if (request.getRequesttypes().isRequiresManagementApproval()) {
				request.getStatus().setStatusId(
						RequestStatuses.PendingApproval.index());
				request.setStatusId(RequestStatuses.PendingApproval.index());
				try {
					log.info("Saving request to DB");
					request.setRequestId(boService.efsBOService
							.updateRequest(request));

				} catch (Exception e) {
					throw new Unexpected(e.getLocalizedMessage());
				}
				String recipient = null;
				try {
					log.info("Sending Approval Request Email");
					recipient = boService.efsBOService
							.sendApprovalRequestEmail(request);
				} catch (Exception e) {
					log.info("Error(s) invoking email service");
					throw new Unexpected(e.getLocalizedMessage());
				}

				log.info("Creating response moneyCode");
				EfsMoneyCode moneyCode = new EfsMoneyCode();
				moneyCode.setIssued(false);
				moneyCode.setMessage("A request for approval has been sent to "
						+ recipient
						+ ". You will be notified when he/she responds.");
				log.info("MoneyCode returned");
				return moneyCode;
			} else {
				log.info("Request may not need approval, checking requesters limit");
				BigDecimal requestersLimit = null;
				requestersLimit = boService.efsBOService.getUsersEfsCheckLimit(
						request.getRequester(), request.getRequesttypes()
								.getRequestTypeId());
				if (request.getEfsAmount().subtract(requestersLimit)
						.doubleValue() > 0) {
					log.info("Request needs approval, above requesters limit");
					request.setStatusId(1);
					request.setStatus(boService.efsBOService.getStatus(request
							.getStatusId()));
					try {
						log.info("saving request to DB");
						request.setRequestId(boService.efsBOService
								.updateRequest(request));

					} catch (Exception e) {
						throw new Unexpected(e.getLocalizedMessage());
					}
					String recipient = null;
					try {
						log.info("Sending Approval Request Email");
						recipient = boService.efsBOService
								.sendApprovalRequestEmail(request);
					} catch (Exception e) {
						throw new Unexpected(e.getLocalizedMessage());
					}
					log.info("Creating response moneyCode");
					EfsMoneyCode moneyCode = new EfsMoneyCode();
					moneyCode.setIssued(false);
					moneyCode
							.setMessage("A request for approval has been sent to "
									+ recipient
									+ ". You will be notified when he/she responds.");
					log.info("MoneyCode returned");
					return moneyCode;
				}
				log.info("Request does not need approval, below requesters limit");

			}
		}

		if (request.getRequesttypes().isIsOpsPortalType()
				&& request.getStatus().getStatusId() <= RequestStatuses.PendingDsAudit
						.index()) {
			request.getStatus().setStatusId(
					RequestStatuses.PendingDsAudit.index());
			request.setStatusId(RequestStatuses.PendingDsAudit.index());
			try {
				request.setRequestId(boService.efsBOService
						.updateRequest(request));

			} catch (Exception e) {
				throw new Unexpected(e.getLocalizedMessage());
			}
			EfsMoneyCode moneyCode = new EfsMoneyCode();
			moneyCode.setIssued(false);
			moneyCode
					.setMessage("Your request is now awaiting Driver Services Audit. You will be notified when your request is approved or rejected.");
		}

		log.info("issuing check");
		return issueEfsCheck(request, resumed);
	}

	private EfsMoneyCode issueEfsCheck(Requests request, boolean resumed)
			throws Unexpected {
		// If requestType is driver pay, use the driver for "Issue to." Else,
		// use vendor name
		String issueTo = request.getRequesttypes().isIsDriverPay() ? request
				.getDriverId() + " " + request.getDriverName() : request
				.getVendorName();

		EfsMoneyCode moneyCode = boService.efsBOService.issueMoneyCode(
				request.getEfsAmount(), issueTo, request.getDescription(),
				request.getCompany());

		request.getStatus().setStatusId(RequestStatuses.Issued.index());
		request.setStatusId(RequestStatuses.Issued.index());
		request.setMoneyCodeReferenceNumber(moneyCode.getReferenceNumber());
		request.setIssueDate(new Date());
		if (!resumed)
			request.setIssuer(request.getRequester());

		try {
			request.setRequestId(boService.efsBOService.updateRequest(request));

		} catch (Exception e) {
			throw new Unexpected(e.getLocalizedMessage());
		}

		boService.efsBOService.createIssuanceTransaction(request.getCompany(),
				request.getRequestId(), moneyCode.getReferenceNumber(),
				request.getEfsAmount(), request.getProNumber(),
				request.getContainerNumber(), request.getChassisNumber(),
				request.getDriverId(), request.getPoWoNumber());

		// should send issuance email if IsOpsPortalType
		if (request.getRequesttypes().isIsOpsPortalType()) {
			boService.efsBOService.createIssueDoc(request);
			try {
				boService.efsBOService.sendIssuanceEmail(request,
						moneyCode.getMoneyCode());
			} catch (Exception e) {
				throw new Unexpected(e.getLocalizedMessage());
			}
		} else {
			boService.efsBOService.createIssueDoc(request);
			if (resumed)
				try {
					boService.efsBOService.sendIssuanceEmail(request,
							moneyCode.getMoneyCode());
				} catch (Exception e) {
					throw new Unexpected(e.getLocalizedMessage());
				}
		}

		return moneyCode;
	}

}
