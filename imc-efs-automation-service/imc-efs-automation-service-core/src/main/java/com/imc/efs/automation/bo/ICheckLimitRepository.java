package com.imc.efs.automation.bo;

public interface ICheckLimitRepository {

	double getEfsCheckLimitByUser(String requester, int requestTypeId);
}
