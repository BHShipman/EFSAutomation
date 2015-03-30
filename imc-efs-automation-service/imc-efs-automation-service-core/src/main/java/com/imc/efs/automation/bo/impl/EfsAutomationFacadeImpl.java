package com.imc.efs.automation.bo.impl;

import java.math.BigDecimal;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;

import org.apache.commons.lang3.StringUtils;

import com.imc.efs.automation.bo.CredentialsBO;
import com.imc.efs.automation.bo.DocBO;
import com.imc.efs.automation.bo.EfsAutomationFacade;
import com.imc.efs.automation.bo.EfsBO;
import com.imc.efs.automation.bo.GpBO;
import com.imc.efs.automation.bo.NotificationBO;
import com.imc.efs.automation.bo.RequestBO;
import com.imc.efs.automation.data.EfsCheckRequest;
import com.imc.efs.automation.data.EfsMoneyCode;
import com.imc.efs.automation.data.FileUpload;
import com.imc.efs.automation.entities.Requests;
import com.imc.efs.automation.enums.RequestStatuses;
import com.imc.efs.automation.helper.EfsCheckRequestExtensions;
@Stateless(name="EfsAutomationFacadeImpl")
@Remote(EfsAutomationFacade.class)
public class EfsAutomationFacadeImpl implements EfsAutomationFacade {

	@EJB(beanName="CredentialsBO")
	private CredentialsBO credentialsBO;
	@EJB(beanName="DocBO")
	private DocBO docBO;
	@EJB(beanName="EfsBO")
	private EfsBO efsBO;
	@EJB(beanName="GpBO")
	private GpBO gpBO;
	@EJB(beanName="NotificationBO")
	private NotificationBO notificationBO;
	@EJB(beanName="RequestBO")
	private RequestBO requestBO;
	@EJB(beanName="RequestExtensions")
	EfsCheckRequestExtensions requestExtension;

	public EfsAutomationFacadeImpl(CredentialsBO credentials,
			DocBO doc, EfsBO efs, GpBO gp,
			NotificationBO notification, RequestBO request) {
		this.credentialsBO = credentials;
		this.docBO = doc;
		this.efsBO = efs;
		this.gpBO = gp;
		this.notificationBO = notification;
		this.requestBO = request;
	}
	
	public EfsAutomationFacadeImpl(){
		
	}

	public boolean validateCredentials(String username, String password) {
		return credentialsBO.validateCredentials(username, password);
	}

	public EfsMoneyCode requestEfsCheck(EfsCheckRequest newRequest)
			throws Exception {
		Requests request = requestExtension.ToRequest(newRequest);
		
		request.setRequestDate(new Date());
		request.setCompany(request.getCompany().trim());
		if (request.getDriverId() != null) {
			request.setDriverId(request.getDriverId().trim());
		}

		// Get request type in order to determine what validations should take
		// place
		request.setRequestTypes(requestBO.getRequestType(request
				.getRequestTypeId()));

		requestBO.validateRequestInputAgainstConfig(request
				.getRequestTypes().getRequestTypeConfigs(), request);

		if (!StringUtils.isEmpty(request.getPoWoNumber())
				|| request.getPoWoNumber() != null) {
			requestBO
					.validateIsNotDuplicateRequest(request.getPoWoNumber());
		}
		boolean hasInvoice = false;
		for (FileUpload file : newRequest.getFileUploads()) {
			if (file.getFileType() == ("INV"))
			hasInvoice = true;
		}
		if (request.getRequestTypes().getRequestTypeConfigs()
				.isRequiresInvoice()) {
			if (request.getRequestTypes().getRequestTypeConfigs()
					.isIsOpsPortalType()) {
				if (newRequest.getFileUploads() == null || !hasInvoice) {
					// an invoice is required for this type of request
					throw new Exception("Not Implemented");
				}

				request.setRequestId(requestBO.saveRequest(request));
				
				long efsDexProjId = 129;
				docBO.storeDocuments(newRequest.getFileUploads(),
						request.getRequestId(), request.getRequester(),
						efsDexProjId);
			} else {
				Pattern pattern = Pattern.compile("\\d+");
				Matcher matcher = pattern.matcher(request.getPoWoNumber());
				matcher.find();
				docBO.validateHasInvoice(request.getRequestTypes()
						.getRequestTypeConfigs().getDexProjectId(),
						matcher.group(0));
			}
		}

		return processRequest(request, false);
	}

	public EfsMoneyCode resumeEfsCheckIssuance(int requestId) {
		Requests request = requestBO.getRequest(requestId);
		return processRequest(request, true);
	}

	private EfsMoneyCode processRequest(Requests request, boolean resumed) {

		request.setStatus(requestBO.getStatus(request.getStatusId()));
		
		
		if (request.getStatusId() <= RequestStatuses.PendingApproval
				.index()) {
			if (request.getRequestTypes().isRequiresManagementApproval()) {
				request.getStatus().setStatusId(
						RequestStatuses.PendingApproval.index());
				try {
					requestBO.saveRequest(request);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
				String recipient  = null;
				try {
					recipient = notificationBO
							.sendApprovalRequestEmail(request);
				} catch (Exception e) {
					e.printStackTrace();
				}

				EfsMoneyCode moneyCode = new EfsMoneyCode();
				moneyCode.setIssued(false);
				moneyCode.setMessage("A request for approval has been sent to "
						+ recipient
						+ ". You will be notified when he/she responds.");
				return moneyCode;
			} else {
				BigDecimal requestersLimit = null;
				try {
					requestersLimit = requestBO.getUsersEfsCheckLimit(
							request.getRequester(), request.getRequestTypes()
									.getRequestTypeId());
				} catch (Exception e) {
					e.printStackTrace();
				}
				if (request.getEfsAmount().subtract(requestersLimit).doubleValue() > 0) {
					request.setStatusId(1);
					request.setStatus(requestBO.getStatus(request.getStatusId()));
					try {
						requestBO.saveRequest(request);
						
					} catch (Exception e) {
						e.printStackTrace();
					}
					String recipient = null;
					try {
						recipient = notificationBO
								.sendApprovalRequestEmail(request);
					} catch (Exception e) {
						e.printStackTrace();
					}
					EfsMoneyCode moneyCode = new EfsMoneyCode();
					moneyCode.setIssued(false);
					moneyCode
							.setMessage("A request for approval has been sent to "
									+ recipient
									+ ". You will be notified when he/she responds.");
				}
			}
		}

		if (request.getRequestTypes().isIsOpsPortalType()
				&& request.getStatus().getStatusId() <= RequestStatuses.PendingDsAudit
						.index()) {
			request.getStatus().setStatusId(
					RequestStatuses.PendingDsAudit.index());
			try {
				requestBO.saveRequest(request);
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			EfsMoneyCode moneyCode = new EfsMoneyCode();
			moneyCode.setIssued(false);
			moneyCode
					.setMessage("Your request is now awaiting Driver Services Audit. You will be notified when your request is approved or rejected.");
		}

		return issueEfsCheck(request, resumed);
	}

	private EfsMoneyCode issueEfsCheck(Requests request, boolean resumed) {
		// If requestType is driver pay, use the driver for "Issue to." Else,
		// use vendor name
		String issueTo = request.getRequestTypes().isIsDriverPay() ? request
				.getDriverId() + " " + request.getDriverName() : request
				.getVendorName();
		
		EfsMoneyCode moneyCode = efsBO.IssueMoneyCode(
				request.getEfsAmount(), issueTo, request.getDescription(),
				request.getCompany());

		request.getStatus().setStatusId(RequestStatuses.Issued.index());
		request.setMoneyCodeReferenceNumber(moneyCode.getReferenceNumber());
		request.setIssueDate(new Date());
		if (!resumed)
			request.setIssuer(request.getRequester());

		try {
			requestBO.updateRequest(request);
			
		} catch (Exception e) {
			e.printStackTrace();
		}

		gpBO.createIssuanceTransaction(request.getRequestTypes()
				.getIssuanceDebit(), request.getRequestTypes()
				.getIssuanceCredit(), request.getCompany(), request
				.getRequestId(), moneyCode.getReferenceNumber(), request
				.getEfsAmount(), new Date(), request.getProNumber(), request
				.getContainerNumber(), request.getChassisNumber(), request
				.getDriverId(), request.getPoWoNumber());

		// should send issuance email if IsOpsPortalType
		if (request.getRequestTypes().isIsOpsPortalType()) {
			docBO.createIssueDoc(request, 129);
			try {
				notificationBO.sendIssuanceEmail(request,
						moneyCode.getMoneyCode());
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else {
			docBO.createIssueDoc(request, request.getRequestTypes()
					.getDexProjectId());
			if (resumed)
				try {
					notificationBO.sendIssuanceEmail(request,
							moneyCode.getMoneyCode());
				} catch (Exception e) {
					e.printStackTrace();
				}
		}

		return moneyCode;
	}

}
