package com.imc.efs.automation.business.logic.ws.impl;

import java.math.BigDecimal;
import java.util.List;

import javax.ejb.EJB;
import javax.jws.WebMethod;
import javax.jws.WebService;

import com.imc.efs.automation.bo.CredentialsBO;
import com.imc.efs.automation.bo.DocBO;
import com.imc.efs.automation.bo.EfsBO;
import com.imc.efs.automation.bo.GpBO;
import com.imc.efs.automation.bo.NotificationBO;
import com.imc.efs.automation.bo.RequestBO;
import com.imc.efs.automation.business.logic.ws.EfsAutomationBusinessLogicService;
import com.imc.efs.automation.data.EfsCheckRequest;
import com.imc.efs.automation.data.EfsMoneyCode;
import com.imc.efs.automation.data.FileUpload;
import com.imc.efs.automation.dto.MoneyCodeDetailsDTO;
import com.imc.efs.automation.entities.Requests;
import com.imc.efs.automation.entities.Requesttypes;
import com.imc.efs.automation.entities.Status;
import com.imc.efs.automation.exception.NotImplemented;
import com.imc.efs.automation.helper.EfsCheckRequestExtensions;

@WebService(serviceName = "EfsAutomationBusinessLogicWS", portName = "EfsAutomationBusinessLogicWS", endpointInterface = "com.imc.efs.automation.business.logic.ws.EfsAutomationBusinessLogicService")
public class EfsAutomationBusinessLogicServiceImpl implements
		EfsAutomationBusinessLogicService {

	@EJB(name = "CredentialsBO")
	CredentialsBO credentialsBO;
	@EJB(name = "DocBO")
	DocBO docBO;
	@EJB(name = "EfsBO")
	EfsBO efsBO;
	@EJB(name = "GpBO")
	GpBO gpBO;
	@EJB(name = "NotificationBO")
	NotificationBO notificationBO;
	@EJB(name = "RequestBO")
	RequestBO requestBO;
	@EJB(name="RequestExtensions")
	EfsCheckRequestExtensions requestExtensions;

	@WebMethod
	@Override
	public boolean validateCredentials(String username, String password) {
		return credentialsBO.validateCredentials(username, password);
	}

	@WebMethod
	@Override
	public void createIssueDoc(Requests request) {
		docBO.createIssueDoc(request);
	}

	@WebMethod
	@Override
	public void storeDocuments(List<FileUpload> fileUploads, int requestId,
			String user) {
		docBO.storeDocuments(fileUploads, requestId, user);

	}

	@WebMethod
	@Override
	public boolean validateHasInvoice(Requests request) {
		return docBO.validateHasInvoice(request);
	}

	@WebMethod
	@Override
	public EfsMoneyCode IssueMoneyCode(BigDecimal efsAmount, String issueTo,
			String description, String company) {
		return efsBO.IssueMoneyCode(efsAmount, issueTo, description, company);
	}

	@WebMethod
	@Override
	public MoneyCodeDetailsDTO GetMoneyCodeDetails(String company,
			int referenceNumber) {
		return efsBO.GetMoneyCodeDetails(company, referenceNumber);
	}

	@WebMethod
	@Override
	public void createIssuanceTransaction(String company, int requestId,
			int moneyCodeReferenceNumber, BigDecimal efsAmount,
			String proNumber, String containerNumber, String chassisNumber,
			String driverId, String poWoNumber) {

		gpBO.createIssuanceTransaction(company, requestId,
				moneyCodeReferenceNumber, efsAmount, proNumber,
				containerNumber, chassisNumber, driverId, poWoNumber);

	}

	@WebMethod
	@Override
	public int relaseAPHold(String company, String moneyCodeReferenceNumber) {
		return gpBO.relaseAPHold(company, moneyCodeReferenceNumber);
	}

	@WebMethod
	@Override
	public void sendIssuanceEmail(Requests request, String moneyCode)
			throws Exception {
		notificationBO.sendIssuanceEmail(request, moneyCode);

	}

	@WebMethod
	@Override
	public String sendApprovalRequestEmail(Requests request) throws Exception {
		return notificationBO.sendApprovalRequestEmail(request);
	}

	@WebMethod
	@Override
	public Requests getRequest(int id) {
		return requestBO.getRequest(id);
	}

	@WebMethod
	@Override
	public Requesttypes getRequestType(int requestTypeId) {
		return requestBO.getRequestType(requestTypeId);
	}

	@WebMethod
	@Override
	public void validateRequestInputAgainstConfig(Requests request)
			throws NotImplemented {
		requestBO.validateRequestInputAgainstConfig(request);

	}

	@WebMethod
	@Override
	public void validateIsNotDuplicateRequest(String poWoNumber)
			throws NotImplemented {
		requestBO.validateIsNotDuplicateRequest(poWoNumber);

	}

	@WebMethod
	@Override
	public int saveRequest(Requests request) throws Exception {
		return requestBO.saveRequest(request);
	}

	@WebMethod
	@Override
	public int updateRequest(Requests request) {
		return requestBO.updateRequest(request);
	}

	@WebMethod
	@Override
	public BigDecimal getUsersEfsCheckLimit(String p1, int p2)
			throws NotImplemented {
		return requestBO.getUsersEfsCheckLimit(p1, p2);
	}

	@WebMethod
	@Override
	public List<Requests> getIssuedRequests() {
		return requestBO.getIssuedRequests();
	}

	@WebMethod
	@Override
	public Status getStatus(int statusId) {
		return requestBO.getStatus(statusId);
	}
	
	@WebMethod
	@Override
	public Requests toRequest(EfsCheckRequest request){
		return requestExtensions.toRequest(request);
	}

}
