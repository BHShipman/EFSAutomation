package com.imc.efs.automation.bo;

import java.math.BigDecimal;
import java.util.Date;

public interface GpBO {

	public abstract void createIssuanceTransaction(String debitGlAccount,
			String creditGlAcount, String company, int requestId,
			int moneyCodeReferenceNumber, BigDecimal efsAmount, Date issueDate,
			String proNumber, String containerNumber, String chassisNumber,
			String driverId, String poWoNumber);

}