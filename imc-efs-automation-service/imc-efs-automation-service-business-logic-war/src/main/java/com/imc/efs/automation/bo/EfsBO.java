package com.imc.efs.automation.bo;

import java.math.BigDecimal;

import com.imc.efs.automation.data.EfsMoneyCode;
import com.imc.efs.automation.dto.MoneyCodeDetailsDTO;

public interface EfsBO {

	public abstract EfsMoneyCode IssueMoneyCode(BigDecimal efsAmount,
			String issueTo, String description, String company);

	public abstract MoneyCodeDetailsDTO GetMoneyCodeDetails(String company,
			int referenceNumber);
	
}