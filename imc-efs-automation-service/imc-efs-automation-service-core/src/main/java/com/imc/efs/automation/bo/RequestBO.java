package com.imc.efs.automation.bo;

import java.math.BigDecimal;
import java.util.List;

import com.imc.efs.automation.entities.RequestTypeConfigs;
import com.imc.efs.automation.entities.RequestTypes;
import com.imc.efs.automation.entities.Requests;
import com.imc.efs.automation.entities.Status;

public interface RequestBO {

	public abstract Requests getRequest(int id);

	public abstract RequestTypes getRequestType(int requestTypeId);

	public abstract void validateRequestInputAgainstConfig(
			RequestTypeConfigs config, Requests request) throws Exception;

	public abstract void validateIsNotDuplicateRequest(String poWoNumber)
			throws Exception;

	public abstract int saveRequest(Requests request) throws Exception;
	
	public abstract int updateRequest(Requests request);

	public abstract BigDecimal getUsersEfsCheckLimit(String p1, int p2)
			throws Exception;

	public abstract List<Requests> getIssuedRequests();

	public abstract Status getStatus(int statusId);

}