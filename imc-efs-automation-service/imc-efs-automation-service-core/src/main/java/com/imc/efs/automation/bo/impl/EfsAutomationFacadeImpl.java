package com.imc.efs.automation.bo.impl;

import java.math.BigDecimal;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.lang3.StringUtils;

import com.imc.efs.automation.bo.EfsAutomationFacade;
import com.imc.efs.automation.data.EfsCheckRequest;
import com.imc.efs.automation.data.EfsMoneyCode;
import com.imc.efs.automation.data.FileUpload;
import com.imc.efs.automation.entities.Requests;
import com.imc.efs.automation.enums.RequestStatuses;
import com.imc.efs.automation.helper.EfsCheckRequestExtensions;

public class EfsAutomationFacadeImpl implements EfsAutomationFacade {

	private CredentialsBOImpl credentialsBOImpl;
	private DocBOImpl docBOImpl;
	private EfsBOImpl efsBOImpl;
	private GpBOImpl gpBOImpl;
	private NotificationBOImpl notificationBOImpl;
	private RequestBOImpl requestBOImpl;
	EfsCheckRequestExtensions requestExtension;

	public EfsAutomationFacadeImpl(CredentialsBOImpl credentials,
			DocBOImpl doc, EfsBOImpl efs, GpBOImpl gp,
			NotificationBOImpl notification, RequestBOImpl request) {
		this.credentialsBOImpl = credentials;
		this.docBOImpl = doc;
		this.efsBOImpl = efs;
		this.gpBOImpl = gp;
		this.notificationBOImpl = notification;
		this.requestBOImpl = request;
	}

	public boolean validateCredentials(String username, String password) {
		return credentialsBOImpl.validateCredentials(username, password);
	}

	public EfsMoneyCode requestEfsCheck(EfsCheckRequest newRequest) throws Exception {
		requestExtension = new EfsCheckRequestExtensions();
		Requests request = requestExtension.ToRequest(newRequest);

		request.setRequestDate(new Date());
		request.setCompany(request.getCompany().trim());
		if (request.getDriverId() != null) {
			request.setDriverId(request.getDriverId().trim());
		}

		// Get request type in order to determine what validations should take
		// place
		request.setRequestTypes(requestBOImpl.getRequestType(request
				.getRequestTypeId()));

		requestBOImpl.validateRequestInputAgainstConfig(request
				.getRequestTypes().getRequestTypeConfigs(), request);

		if (!StringUtils.isEmpty(request.getPoWoNumber())
				|| request.getPoWoNumber() != null) {
			requestBOImpl
					.validateIsNotDuplicateRequest(request.getPoWoNumber());
		}
		boolean hasInvoice = false;
		for (FileUpload file : newRequest.getFileUploads()) {
			if (file.getFileType() == ("INV"))
				;
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

				request.setRequestId(requestBOImpl.saveRequest(request));
				long efsDexProjId = 129;
				docBOImpl.storeDocuments(newRequest.getFileUploads(),
						request.getRequestId(), request.getRequester(),
						efsDexProjId);
			} else {
				Pattern pattern = Pattern.compile("@\\d+");
				Matcher matcher = pattern.matcher(request.getPoWoNumber());
				docBOImpl.validateHasInvoice(request.getRequestTypes()
						.getRequestTypeConfigs().getDexProjectId(),
						matcher.group(1));

			}
		}

		return processRequest(request, false);
	}

	public EfsMoneyCode resumeEfsCheckIssuance(int requestId) {
		Requests request = requestBOImpl.getRequest(requestId);
		return processRequest(request, true);
	}

	private EfsMoneyCode processRequest(Requests request, boolean resumed) {

		if (request.getStatus().getStatusId() <= RequestStatuses.PendingApproval
				.index()) {
			if (request.getRequestTypes().isRequiresManagementApproval()) {
				request.getStatus().setStatusId(
						RequestStatuses.PendingApproval.index());
				try {
					requestBOImpl.saveRequest(request);
				} catch (Exception e) {
					e.printStackTrace();
				}
				String recipient = notificationBOImpl
						.sendApprovalRequestEmail(request);

				EfsMoneyCode moneyCode = new EfsMoneyCode();
				moneyCode.setIssued(false);
				moneyCode.setMessage("A request for approval has been sent to "
						+ recipient
						+ ". You will be notified when he/she responds.");
				return moneyCode;
			} else {
				BigDecimal requestersLimit = null;
				try {
					requestersLimit = requestBOImpl
							.getUsersEfsCheckLimit(request.getRequester(), request
									.getRequestTypes().getRequestTypeId());
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				if (request.getEfsAmount().subtract(requestersLimit).intValue() > 0) {
					request.getStatus().setStatusId(
							RequestStatuses.PendingApproval.index());
					try {
						requestBOImpl.saveRequest(request);
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					String recipient = notificationBOImpl
							.sendApprovalRequestEmail(request);
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
				requestBOImpl.saveRequest(request);
			} catch (Exception e) {
				// TODO Auto-generated catch block
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

		EfsMoneyCode moneyCode = efsBOImpl.IssueMoneyCode(
				request.getEfsAmount(), issueTo, request.getDescription(),
				request.getCompany());

		request.getStatus().setStatusId(RequestStatuses.Issued.index());
		request.setMoneyCodeReferenceNumber(moneyCode.getReferenceNumber());
		request.setIssueDate(new Date());
		if (!resumed)
			request.setIssuer(request.getRequester());

		try {
			requestBOImpl.saveRequest(request);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		gpBOImpl.createIssuanceTransaction(request.getRequestTypes()
				.getIssuanceDebit(), request.getRequestTypes()
				.getIssuanceCredit(), request.getCompany(), request
				.getRequestId(), moneyCode.getReferenceNumber(), request
				.getEfsAmount(), new Date(), request.getProNumber(), request
				.getContainerNumber(), request.getChassisNumber(), request
				.getDriverId(), request.getPoWoNumber());

		// should send issuance email if IsOpsPortalType
		if (request.getRequestTypes().isIsOpsPortalType()) {
			docBOImpl.createIssueDoc(request, 129);
			notificationBOImpl.sendIssuanceEmail(request,
					moneyCode.getMoneyCode());
		} else {
			docBOImpl.createIssueDoc(request, request.getRequestTypes()
					.getDexProjectId());
			if (resumed)
				notificationBOImpl.sendIssuanceEmail(request,
						moneyCode.getMoneyCode());
		}

		return moneyCode;
	}

}
