package com.imc.efs.automation.dao;

import java.math.BigDecimal;
import java.util.List;

import com.imc.efs.automation.entities.Requests;
import com.imc.efs.automation.entities.Status;

public interface RequestDAO {

	int addRequest(Requests request);
	int updateRequest(Requests request);
	Requests getRequestsById(int requestId);
	boolean checkIfQualifiedVendor(int vendorId);
	boolean checkIfFirstTimeVendor(int vendorId);
	boolean checkIfDuplicateRequest(String poWoNumber);
	Requests addAndReturnRequestWithReferences(Requests request);
	Requests returnRequestWithReference(Requests request);
	Requests updateAndReturnRequestWithReference(Requests request) throws Exception;
	List<Requests> getRequestsOfStatusIssued() throws Exception;
	BigDecimal getUsersEfsCheckLimit(String requester, int requestTypeId);
	Status getStatus(int statusId);
}
