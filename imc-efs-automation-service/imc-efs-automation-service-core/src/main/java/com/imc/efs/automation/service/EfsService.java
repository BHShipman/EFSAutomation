package com.imc.efs.automation.service;

import java.math.BigDecimal;

import com.imc.efs.automation.bo.IEfsIntegrator;
import com.imc.efs.automation.dto.MoneyCodeDetailsDTO;
import com.imc.efs.automation.model.EfsMoneyCode;

public class EfsService {

	private IEfsIntegrator _efs;
	
	public EfsService() {

	}

	public EfsService(IEfsIntegrator efs){
		this._efs = efs;
	}
	
	public EfsMoneyCode IssueMoneyCode(double efsAmount, String issueTo, String description, String company){
		EfsMoneyCode moneyCode;
		
		moneyCode = _efs.getMoneyCode(efsAmount, issueTo, description, company);
		
		return moneyCode;
	}
	
	public MoneyCodeDetailsDTO GetMoneyCodeDetails(String company, int referenceNumber){
		MoneyCodeDetailsDTO moneyCodeDetails;
		
		moneyCodeDetails = _efs.GetMoneyCodeDetails(company, referenceNumber);
		
		return moneyCodeDetails;
	}

}
