package com.imc.efs.automation.data.access.ws;

import java.math.BigDecimal;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.imc.efs.automation.dto.CredentialsDTO;
import com.imc.efs.automation.dto.GpIntegrationDTO;
import com.imc.efs.automation.entities.Requests;
import com.imc.efs.automation.entities.Requesttypes;
import com.imc.efs.automation.entities.Status;

@WebService
public interface EfsAutomationDataAccessService {

	@WebMethod
	BigDecimal getEfsCheckLimitByUser(String requester, int requestTypeId) throws Exception;

	@WebMethod
	CredentialsDTO GetEncryptedCredentials(String username);

	@WebMethod
	void saveDocument(String username, String password, String requestId, String docType, String filePath);

//	@WebMethod
//	 boolean checkIfHasInvoice(long dexProjectId, String field1);
	
	@WebMethod
	List<String> getDocumentFilePathsByRequestId(int requestId);
	
	@WebMethod
	void integrateIssuance(GpIntegrationDTO gpDto);
	
	@WebMethod
	void executeRecievedIntegrations(String company, String batchId);
	
	@WebMethod
	String getEfsGpVendorIdByCompany(String company) throws Exception;
	
	@WebMethod
	String getDivisionByDriverId(String driverId);
	
	@WebMethod
	int releaseAPHold(String company, String moneyCodeReferenceNumber);
	
	@WebMethod
	int addRequest(Requests request);
	
	@WebMethod
	int updateRequest(Requests request);
	
	@WebMethod
	Requests getRequestsById(int requestId);
	
	@WebMethod
	boolean checkIfQualifiedVendor(int vendorId);
	
	@WebMethod
	boolean checkIfFirstTimeVendor(int vendorId);
	
	@WebMethod
	boolean checkIfDuplicateRequest(String poWoNumber);
	
	@WebMethod
	Requests addAndReturnRequestWithReferences(Requests request);
	
	@WebMethod
	Requests returnRequestWithReference(Requests request);
	
	@WebMethod
	Requests updateAndReturnRequestWithReference(Requests request) throws Exception;
	
	@WebMethod
	List<Requests> getRequestsOfStatusIssued() throws Exception;
	
	@WebMethod
	BigDecimal getUsersEfsCheckLimit(String requester, int requestTypeId);
	
	@WebMethod
	Status getStatus(int statusId);
	
	@WebMethod
	Requesttypes getRequestTypeById(int requestTypeId);
}
