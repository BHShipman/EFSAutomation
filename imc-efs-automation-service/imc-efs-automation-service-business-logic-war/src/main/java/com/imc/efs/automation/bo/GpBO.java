package com.imc.efs.automation.bo;

import java.math.BigDecimal;
import java.util.Date;

public interface GpBO {

	void createIssuanceTransaction(String company, int requestId,
			int moneyCodeReferenceNumber, BigDecimal efsAmount, Date issueDate,
			String proNumber, String containerNumber, String chassisNumber,
			String driverId, String poWoNumber);
	
	int relaseAPHold(String company, String moneyCodeReferenceNumber);

}