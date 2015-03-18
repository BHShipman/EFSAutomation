package com.imc.efs.automation.dao;

public interface CheckLimitDAO {

	double getEfsCheckLimitByUser(String requester, int requestTypeId);
}
