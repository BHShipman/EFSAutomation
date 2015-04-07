package com.imc.efs.automation.bo;

import java.math.BigDecimal;
import java.util.List;

import com.imc.efs.automation.entities.Requests;
import com.imc.efs.automation.entities.Requesttypes;
import com.imc.efs.automation.entities.Status;
import com.imc.efs.automation.exception.NotImplemented;

public interface RequestBO {

	public abstract Requests getRequest(int id);

	public abstract Requesttypes getRequestType(int requestTypeId);

	public abstract void validateRequestInputAgainstConfig(
			Requests request) throws NotImplemented;

	public abstract void validateIsNotDuplicateRequest(String poWoNumber)
			throws NotImplemented;

	public abstract int saveRequest(Requests request) throws Exception;
	
	public abstract int updateRequest(Requests request);

	public abstract BigDecimal getUsersEfsCheckLimit(String p1, int p2)
			throws NotImplemented;

	public abstract List<Requests> getIssuedRequests();

	public abstract Status getStatus(int statusId);

}