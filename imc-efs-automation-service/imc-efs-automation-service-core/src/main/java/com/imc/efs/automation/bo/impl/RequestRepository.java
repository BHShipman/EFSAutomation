package com.imc.efs.automation.bo.impl;

import java.util.List;

import com.imc.efs.automation.bo.IRequestRepository;
import com.imc.efs.automation.dao.RequestDAO;
import com.imc.efs.automation.entities.Requests;

public class RequestRepository implements IRequestRepository {

	private RequestDAO requestDAO;

	public RequestRepository() {
	}

	public int addRequest(Requests request) {
		requestDAO.add(request);
		return request.getRequestId();
	}

	public int updateRequest(Requests request) {
		requestDAO.update(request);
		return request.getRequestId();
	}

	public Requests getRequestsById(int requestId) {
		return requestDAO.getRequestsById(requestId);
	}

	public boolean checkIfQualifiedVendor(int vendorId) {
		return requestDAO.checkIfQualifiedVendor(vendorId);
	}

	public boolean checkIfFirstTimeVendor(int vendorId) {
		return requestDAO.checkIfFirstTimeVendor(vendorId);
	}

	public boolean checkIfDuplicateRequest(String poWoNumber) {
		return requestDAO.checkIfDuplicateRequest(poWoNumber);
	}

	public Requests addAndReturnRequestWithReferences(Requests request) {
		return requestDAO.addAndReturnRequestWithReferences(request);
	}

	public Requests returnRequestWithReference(Requests request) {
		return requestDAO.returnRequestWithReference(request);
	}

	public Requests updateAndReturnRequestWithReference(Requests request) {
		return requestDAO.updateAndReturnRequestWithReference(request);
	}

	public List<Requests> getRequestsOfStatusIssued() {
		return requestDAO.getRequestsOfStatusIssued();
	}

}
