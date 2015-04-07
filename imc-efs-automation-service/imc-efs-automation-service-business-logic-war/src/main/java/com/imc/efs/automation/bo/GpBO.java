package com.imc.efs.automation.bo;

import java.math.BigDecimal;

public interface GpBO {

	void createIssuanceTransaction(String company, int requestId,
			int moneyCodeReferenceNumber, BigDecimal efsAmount,
			String proNumber, String containerNumber, String chassisNumber,
			String driverId, String poWoNumber);
	
	int relaseAPHold(String company, String moneyCodeReferenceNumber);

}