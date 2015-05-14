package com.imc.efs.automation.data.access.ws.impl;

import java.math.BigDecimal;
import java.util.List;

import javax.ejb.EJB;
import javax.jws.WebMethod;
import javax.jws.WebService;

import org.apache.log4j.Logger;

import com.imc.efs.automation.dao.CheckLimitDAO;
import com.imc.efs.automation.dao.CredentialsDAO;
import com.imc.efs.automation.dao.DexDAO;
import com.imc.efs.automation.dao.GpDAO;
import com.imc.efs.automation.dao.RequestDAO;
import com.imc.efs.automation.dao.RequestTypeDAO;
import com.imc.efs.automation.data.access.ws.EfsAutomationDataAccessService;
import com.imc.efs.automation.dto.CredentialsDTO;
import com.imc.efs.automation.dto.GpIntegrationDTO;
import com.imc.efs.automation.entities.Requests;
import com.imc.efs.automation.entities.Requesttypes;
import com.imc.efs.automation.entities.Status;

@WebService(serviceName = "EfsAutomationDataAccessWS", portName = "EfsAutomationDataAccessWS", endpointInterface = "com.imc.efs.automation.data.access.ws.EfsAutomationDataAccessService")
public class EfsAutomationDataAccessServiceImpl implements
		EfsAutomationDataAccessService {

	@EJB(name = "CheckLimitDAO")
	CheckLimitDAO checkLimitDAO;
	@EJB(name = "CredentialsDAO")
	CredentialsDAO credentialsDAO;
	@EJB(name = "DexDAO")
	DexDAO dexDAO;
	@EJB(name = "GpDAO")
	GpDAO gpDAO;
	@EJB(name = "RequestDAO")
	RequestDAO requestDAO;
	@EJB(name = "RequestTypeDAO")
	RequestTypeDAO requestTypeDAO;

	private static Logger log = Logger
			.getLogger(EfsAutomationDataAccessServiceImpl.class);

	@WebMethod
	@Override
	public BigDecimal getEfsCheckLimitByUser(String requester, int requestTypeId)
			throws Exception {
		log.info("getting Limit for Requester: " + requester);
		return checkLimitDAO.getEfsCheckLimitByUser(requester, requestTypeId);
	}

	@WebMethod
	@Override
	public CredentialsDTO GetEncryptedCredentials(String username) {
		log.info("getting encrypted credentials for username: " + username);
		return credentialsDAO.GetEncryptedCredentials(username);
	}

	@WebMethod
	@Override
	public void saveDocument(String username, String password,
			String requestId, String docType, String filePath) {

		log.info("saving document to DEX: " + filePath);
		dexDAO.saveDocument(username, password, requestId, docType, filePath);

	}

	@WebMethod
	@Override
	public List<String> getDocumentFilePathsByRequestId(int requestId) {
		log.info("getting document file paths by requestId: " + requestId);
		return dexDAO.getDocumentFilePathsByRequestId(requestId);
	}

	@WebMethod
	@Override
	public void integrateIssuance(GpIntegrationDTO gpDto) {
		log.info("integrating issuance to Great Plains");
		gpDAO.integrateIssuance(gpDto);
	}

	@WebMethod
	@Override
	public void executeRecievedIntegrations(String company, String batchId) {
		log.info("calling stored procedure to execute received integrations");
		gpDAO.executeRecievedIntegrations(company, batchId);

	}

	@WebMethod
	@Override
	public String getEfsGpVendorIdByCompany(String company) throws Exception {
		log.info("getting Great Plains vendor id for company: " + company);
		return gpDAO.getEfsGpVendorIdByCompany(company);
	}

	@WebMethod
	@Override
	public String getDivisionByDriverId(String driverId) {
		log.info("getting divison for driver id: " + driverId);
		return gpDAO.getDivisionByDriverId(driverId);
	}

	@WebMethod
	@Override
	public int releaseAPHold(String company, String moneyCodeReferenceNumber) {
		log.info("releasing AP hold for Money Code Reference: " + moneyCodeReferenceNumber + " and company: " + company);
		return gpDAO.releaseAPHold(company, moneyCodeReferenceNumber);
	}

	@WebMethod
	@Override
	public int addRequest(Requests request) {
		log.info("adding request with PoWoNumber: " + request.getPoWoNumber());
		return requestDAO.addRequest(request);
	}

	@WebMethod
	@Override
	public int updateRequest(Requests request) {
		log.info("updating request with PoWoNumber: " + request.getPoWoNumber());
		return requestDAO.updateRequest(request);
	}

	@WebMethod
	@Override
	public Requests getRequestsById(int requestId) {
		return requestDAO.getRequestsById(requestId);
	}

	@WebMethod
	@Override
	public boolean checkIfQualifiedVendor(int vendorId) {
		return requestDAO.checkIfQualifiedVendor(vendorId);
	}

	@WebMethod
	@Override
	public boolean checkIfFirstTimeVendor(int vendorId) {
		return requestDAO.checkIfFirstTimeVendor(vendorId);
	}

	@WebMethod
	@Override
	public boolean checkIfDuplicateRequest(String poWoNumber) {
		return requestDAO.checkIfDuplicateRequest(poWoNumber);
	}

	@WebMethod
	@Override
	public Requests addAndReturnRequestWithReferences(Requests request) {
		return requestDAO.addAndReturnRequestWithReferences(request);
	}

	@WebMethod
	@Override
	public Requests returnRequestWithReference(Requests request) {
		return requestDAO.returnRequestWithReference(request);
	}

	@WebMethod
	@Override
	public Requests updateAndReturnRequestWithReference(Requests request)
			throws Exception {
		return requestDAO.updateAndReturnRequestWithReference(request);
	}

	@WebMethod
	@Override
	public List<Requests> getRequestsOfStatusIssued() throws Exception {
		return requestDAO.getRequestsOfStatusIssued();
	}

	@WebMethod
	@Override
	public BigDecimal getUsersEfsCheckLimit(String requester, int requestTypeId) {
		return requestDAO.getUsersEfsCheckLimit(requester, requestTypeId);
	}

	@WebMethod
	@Override
	public Status getStatus(int statusId) {
		return requestDAO.getStatus(statusId);
	}

	@WebMethod
	@Override
	public Requesttypes getRequestTypeById(int requestTypeId) {
		return requestTypeDAO.getRequestTypeById(requestTypeId);
	}

}
