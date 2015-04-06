package com.imc.efs.automation.business.logic.ws;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.imc.efs.automation.data.EfsCheckRequest;
import com.imc.efs.automation.data.EfsMoneyCode;
import com.imc.efs.automation.data.FileUpload;
import com.imc.efs.automation.dto.MoneyCodeDetailsDTO;
import com.imc.efs.automation.entities.RequestTypes;
import com.imc.efs.automation.entities.Requests;
import com.imc.efs.automation.entities.Status;
import com.imc.efs.automation.exception.NotImplemented;

@WebService
public interface EfsAutomationBusinessLogicService {

	@WebMethod
	boolean validateCredentials(String username, String password);

	@WebMethod
	void createIssueDoc(Requests request);

	@WebMethod
	void storeDocuments(List<FileUpload> fileUploads, int requestId, String user);

	// void validateHasInvoice(long dexProjectId, String poWoNumber) throws
	// Exception;
	@WebMethod
	boolean validateHasInvoice(Requests request);

	@WebMethod
	EfsMoneyCode IssueMoneyCode(BigDecimal efsAmount, String issueTo,
			String description, String company);

	@WebMethod
	MoneyCodeDetailsDTO GetMoneyCodeDetails(String company, int referenceNumber);

	@WebMethod
	void createIssuanceTransaction(String company, int requestId,
			int moneyCodeReferenceNumber, BigDecimal efsAmount, Date issueDate,
			String proNumber, String containerNumber, String chassisNumber,
			String driverId, String poWoNumber);

	@WebMethod
	int relaseAPHold(String company, String moneyCodeReferenceNumber);

	@WebMethod
	void sendIssuanceEmail(Requests request, String moneyCode) throws Exception;

	@WebMethod
	String sendApprovalRequestEmail(Requests request) throws Exception;

	@WebMethod
	Requests getRequest(int id);

	@WebMethod
	RequestTypes getRequestType(int requestTypeId);

	@WebMethod
	void validateRequestInputAgainstConfig(Requests request)
			throws NotImplemented;

	@WebMethod
	void validateIsNotDuplicateRequest(String poWoNumber) throws NotImplemented;

	@WebMethod
	int saveRequest(Requests request) throws Exception;

	@WebMethod
	int updateRequest(Requests request);

	@WebMethod
	BigDecimal getUsersEfsCheckLimit(String p1, int p2) throws NotImplemented;

	@WebMethod
	List<Requests> getIssuedRequests();

	@WebMethod
	Status getStatus(int statusId);

	Requests toRequest(EfsCheckRequest request);
}
