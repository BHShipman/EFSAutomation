package com.imc.efs.automation.bo.impl;

import com.imc.efs.automation.bo.ICheckLimitRepository;
import com.imc.efs.automation.dao.CheckLimitDAO;

public class CheckLimitRepository implements ICheckLimitRepository {

	CheckLimitDAO checkLimitDao;
	
	public CheckLimitRepository() {
		// TODO Auto-generated constructor stub
	}

	public double getEfsCheckLimitByUser(String requester, int requestTypeId) {
		return checkLimitDao.getEfsCheckLimitByUser(requester, requestTypeId);
	}

}
