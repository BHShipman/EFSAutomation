package com.imc.efs.automation.bo.impl;

import java.math.BigDecimal;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.lang.NotImplementedException;
import org.apache.commons.lang3.StringUtils;

import com.imc.efs.automation.bo.EfsAutomationFacade;
import com.imc.efs.automation.dao.RequestDAO;
import com.imc.efs.automation.dao.impl.RequestDAOImpl;
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

	public EfsMoneyCode requestEfsCheck(EfsCheckRequest newRequest) {
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
				.getRequestId()));

		requestBOImpl.validateRequestInputAgainstConfig(request
				.getRequestTypes().getRequestTypeConfigs(), request);

		if (StringUtils.isEmpty(request.getPoWoNumber())
				|| request.getPoWoNumber() == null) {
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
					throw new NotImplementedException();
				}
				
				request.setRequestId(requestBOImpl.saveRequest(request));
				long efsDexProjId = 129;
				docBOImpl.storeDocuments(newRequest.getFileUploads(), request.getRequestId(), request.getRequester(), efsDexProjId);
			} else
			{
				Pattern pattern = Pattern.compile("@\\d+");
				Matcher matcher = pattern.matcher(request.getPoWoNumber());
				docBOImpl.validateHasInvoice(request.getRequestTypes().getRequestTypeConfigs().getDexProjectId(), matcher.group(1));
				
			}
		}
		
		return processRequest(request, true);
	}

	public EfsMoneyCode resumeEfsCheckIssuance(int requestId) {
		Requests request = requestBOImpl.getRequest(requestId);
		return processRequest(request, true);
	}
	
	private EfsMoneyCode processRequest(Requests request, boolean resumed){
		
		if(request.getStatus().getStatusId() <= RequestStatuses.PendingApproval.index()){
			if(request.getRequestTypes().isRequiresManagementApproval()){
				request.getStatus().setStatusId(RequestStatuses.PendingApproval.index());
				requestBOImpl.saveRequest(request);
				String recipient = notificationBOImpl.sendApprovalRequestEmail(request);
				
				EfsMoneyCode moneyCode = new EfsMoneyCode();
				moneyCode.setIssued(false);
				moneyCode.setMessage("A request for approval has been sent to " + recipient + ". You will be notified when he/she responds.");
				return moneyCode;
			}
			else
			{
				BigDecimal requestersLimit = requestBOImpl.getUsersEfsCheckLimit(request.getRequester(), request.getRequestTypes().getRequestTypeId());
				if(request.getEfsAmount().subtract(requestersLimit).intValue() > 0){
					request.getStatus().setStatusId(RequestStatuses.PendingApproval.index());
					requestBOImpl.saveRequest(request);
					String recipient = notificationBOImpl.sendApprovalRequestEmail(request);
					EfsMoneyCode moneyCode = new EfsMoneyCode();
					moneyCode.setIssued(false);
					moneyCode.setMessage("A request for approval has been sent to " + recipient + ". You will be notified when he/she responds.");
				}
			}
		}
		
		if(request.getRequestTypes().isIsOpsPortalType() && request.getStatus().getStatusId() <= RequestStatuses.PendingDsAudit.index()){
			request.getStatus().setStatusId(RequestStatuses.PendingDsAudit.index());
			requestBOImpl.saveRequest(request);
			EfsMoneyCode moneyCode = new EfsMoneyCode();
			moneyCode.setIssued(false);
			moneyCode.setMessage("Your request is now awaiting Driver Services Audit. You will be notified when your request is approved or rejected.");
		}
		
		return issueEfsCheck(request, resumed);
	}
	
	private EfsMoneyCode issueEfsCheck(Requests request, boolean resumed){
		
		
		return null;
	}
	
	

}
