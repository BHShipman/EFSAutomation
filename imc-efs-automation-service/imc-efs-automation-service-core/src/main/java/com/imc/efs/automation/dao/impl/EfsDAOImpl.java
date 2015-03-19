package com.imc.efs.automation.dao.impl;

import java.math.BigDecimal;

import com.imc.efs.automation.dao.EfsDAO;
import com.imc.efs.automation.data.EfsMoneyCode;
import com.imc.efs.automation.dto.MoneyCodeDetailsDTO;

public class EfsDAOImpl implements EfsDAO {

	@Override
	public EfsMoneyCode getMoneyCode(BigDecimal efsAmount, String issueTo,
			String description, String company) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EfsMoneyCode GetMoneyCode_TEST(double efsAmount, String issueTo,
			String description, String company) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MoneyCodeDetailsDTO GetMoneyCodeDetails(String company,
			int referenceNumber) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MoneyCodeDetailsDTO GetMoneyCodeDetails_TEST(String company,
			int referenceNumber) {
		// TODO Auto-generated method stub
		return null;
	}

}
