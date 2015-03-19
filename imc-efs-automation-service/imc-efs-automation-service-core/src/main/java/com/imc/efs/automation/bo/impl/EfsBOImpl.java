package com.imc.efs.automation.bo.impl;

import java.math.BigDecimal;

import com.imc.efs.automation.bo.EfsBO;
import com.imc.efs.automation.dao.EfsDAO;
import com.imc.efs.automation.data.EfsMoneyCode;
import com.imc.efs.automation.dto.MoneyCodeDetailsDTO;

public class EfsBOImpl implements EfsBO {

	private EfsDAO _efs;
	
	public EfsBOImpl() {

	}

	public EfsBOImpl(EfsDAO efs){
		this._efs = efs;
	}
	
	/* (non-Javadoc)
	 * @see com.imc.efs.automation.bo.impl.EfsBO#IssueMoneyCode(double, java.lang.String, java.lang.String, java.lang.String)
	 */
	@Override
	public EfsMoneyCode IssueMoneyCode(BigDecimal efsAmount, String issueTo, String description, String company){
		EfsMoneyCode moneyCode;
		
		moneyCode = _efs.getMoneyCode(efsAmount, issueTo, description, company);
		
		return moneyCode;
	}
	
	/* (non-Javadoc)
	 * @see com.imc.efs.automation.bo.impl.EfsBO#GetMoneyCodeDetails(java.lang.String, int)
	 */
	@Override
	public MoneyCodeDetailsDTO GetMoneyCodeDetails(String company, int referenceNumber){
		MoneyCodeDetailsDTO moneyCodeDetails;
		
		moneyCodeDetails = _efs.GetMoneyCodeDetails(company, referenceNumber);
		
		return moneyCodeDetails;
	}

}
