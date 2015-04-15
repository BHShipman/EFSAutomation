package com.imc.efs.automation.business.logic.ws;

import java.math.BigDecimal;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.imc.efs.automation.data.EfsCheckRequest;
import com.imc.efs.automation.data.EfsMoneyCode;
import com.imc.efs.automation.data.FileUpload;
import com.imc.efs.automation.dto.MoneyCodeDetailsDTO;
import com.imc.efs.automation.entities.Requests;
import com.imc.efs.automation.entities.Requesttypes;
import com.imc.efs.automation.entities.Status;

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
			int moneyCodeReferenceNumber, BigDecimal efsAmount,
			String proNumber, String containerNumber, String chassisNumber,
			String driverId, String poWoNumber);

	@WebMethod
	int releaseAPHold(String company, String moneyCodeReferenceNumber);

	@WebMethod
	void sendIssuanceEmail(Requests request, String moneyCode) throws Exception;

	@WebMethod
	String sendApprovalRequestEmail(Requests request) throws Exception;

	@WebMethod
	Requests getRequest(int id);

	@WebMethod
	Requesttypes getRequestType(int requestTypeId);

	@WebMethod
	void validateRequestInputAgainstConfig(Requests request)
			throws Exception;

	@WebMethod
	void validateIsNotDuplicateRequest(String poWoNumber) throws Exception;

	@WebMethod
	int saveRequest(Requests request) throws Exception;

	@WebMethod
	int updateRequest(Requests request);

	@WebMethod
	BigDecimal getUsersEfsCheckLimit(String p1, int p2) throws Exception;

	@WebMethod
	List<Requests> getIssuedRequests();

	@WebMethod
	Status getStatus(int statusId);

	Requests toRequest(EfsCheckRequest request);
}
