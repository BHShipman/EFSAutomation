package com.imc.efs.automation.bo;

import com.imc.efs.automation.dto.MoneyCodeDetailsDTO;
import com.imc.efs.automation.data.EfsMoneyCode;

public interface IEfsIntegrator {

	EfsMoneyCode getMoneyCode(double efsAmount, String issueTo, String description, String company);
	EfsMoneyCode GetMoneyCode_TEST(double efsAmount, String issueTo, String description, String company);
	MoneyCodeDetailsDTO GetMoneyCodeDetails(String company, int referenceNumber);
	MoneyCodeDetailsDTO GetMoneyCodeDetails_TEST(String company, int referenceNumber);
}
