package com.imc.efs.automation.dao.impl;

import java.util.List;

import com.imc.efs.automation.dao.RequestDAO;
import com.imc.efs.automation.entities.Requests;

public class RequestDAOImpl implements RequestDAO{

	
	public int addRequest(Requests request) {
		// TODO Finish
		return 0;
	}

	
	public int updateRequest(Requests request) {
		// TODO Finish
		return 0;
	}

	
	public Requests getRequestsById(int requestId) {
		// TODO Finish
		return null;
	}

	
	public boolean checkIfQualifiedVendor(int vendorId) {
		// TODO Finish
		return false;
	}

	
	public boolean checkIfFirstTimeVendor(int vendorId) {
		// TODO Finish
		return false;
	}

	
	public boolean checkIfDuplicateRequest(String poWoNumber) {
		// TODO Finish
		return false;
	}

	
	public Requests addAndReturnRequestWithReferences(Requests request) {
		// TODO Finish
		return null;
	}

	
	public Requests returnRequestWithReference(Requests request) {
		// TODO Finish
		return null;
	}

	
	public Requests updateAndReturnRequestWithReference(Requests request) {
		// TODO Finish
		return null;
	}

	
	public List<Requests> getRequestsOfStatusIssued() {
		// TODO Finish
		return null;
	}

}
