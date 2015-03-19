package com.imc.efs.automation.bo.impl;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.lang3.StringUtils;

import com.imc.efs.automation.bo.GpBO;
import com.imc.efs.automation.dao.GpDAO;
import com.imc.efs.automation.dto.GpIntegrationDTO;

public class GpBOImpl implements GpBO {

	private GpDAO _gp;

	public GpBOImpl() {
	}

	public GpBOImpl(GpDAO gp) {
		this._gp = gp;
	}

	/* (non-Javadoc)
	 * @see com.imc.efs.automation.bo.impl.GpBO#createIssuanceTransaction(java.lang.String, java.lang.String, java.lang.String, int, int, double, java.util.Date, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String)
	 */
	@Override
	public void createIssuanceTransaction(String debitGlAccount,
			String creditGlAcount, String company, int requestId,
			int moneyCodeReferenceNumber, double efsAmount, Date issueDate,
			String proNumber, String containerNumber, String chassisNumber,
			String driverId, String poWoNumber) {

		String vendorId = _gp.getEfsGpVendorIdByCompany(company);

		Date now = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");

		String dailyBatchId = "EFS" + sdf.format(now);

		String division = null;
		if (driverId != null) {
			if (StringUtils.isNotEmpty(driverId)) {
				division = _gp.getDivisionByDriverId(driverId);
			}
		}

		double efsAmountPlusEfsFee = efsAmount + 1;
		String moneyCodeReferenceNumberString = String
				.valueOf(moneyCodeReferenceNumber);

		GpIntegrationDTO gpDto = new GpIntegrationDTO();
		BigDecimal amount = new BigDecimal(String.valueOf(efsAmountPlusEfsFee));
		gpDto.setIntegration("EFS");
		gpDto.setCompany(company);
		gpDto.setBatchId(dailyBatchId);
		gpDto.setVCHNUMWK(String.valueOf(requestId));
		gpDto.setVendorId(vendorId);
		gpDto.setDocNumber(moneyCodeReferenceNumberString + "_I");
		gpDto.setDocType((short) 1);
		gpDto.setDocAmount(String.valueOf(efsAmountPlusEfsFee));
		gpDto.setDocDate(issueDate);
		gpDto.setPstgDate(now);
		gpDto.setChrgAmount(amount);
		gpDto.setTen99Amount(amount);
		gpDto.setPrchAmount(amount);
		gpDto.setCurrency("USD2");
		gpDto.setRateTPid("AVERAGE");
		gpDto.setExchangeDate(new Date(2007, 1, 1));
		gpDto.setRateExp((short) 0);
		gpDto.setCreateDist((short) 0);
		gpDto.setRecordid(requestId);
		gpDto.setUserId("EFS_AUTOMATION");
		gpDto.setProNumber(proNumber);
		gpDto.setContainer(containerNumber);
		gpDto.setChassis(chassisNumber);
		gpDto.setDriverId(driverId);
		gpDto.setPordNumber(poWoNumber);
		gpDto.setInvoiceNumber(moneyCodeReferenceNumberString);
		gpDto.setDivision(division);
		gpDto.setApHold(true);

		if(StringUtils.isEmpty(driverId)){
			driverId="NoDriverId";
		}
		// Debit EFS Amount + EFS Fee to flow-through
		String description = driverId + "|Flow Through";
		gpDto.setTRXDSCRN(description);
		gpDto.setDISTREF(moneyCodeReferenceNumberString + "|" + poWoNumber);
		gpDto.setActNumSt(debitGlAccount);
		gpDto.setDistType((short)6);
		gpDto.setDebitAmount(amount);
		gpDto.setCreditAmount(new BigDecimal(0));
		_gp.integrateIssuance(gpDto);
		
		// Credit to EFS Payables
		description = driverId + "|EFS Payables";
		gpDto.setTRXDSCRN(description);
		gpDto.setDISTREF(description);
		gpDto.setActNumSt(creditGlAcount);
		gpDto.setDistType((short)2);
		gpDto.setDebitAmount(new BigDecimal(0));
		gpDto.setCreditAmount(amount);
		_gp.integrateIssuance(gpDto);
		
		//call to execute recievedIntegrations
		_gp.executeRecievedIntegrations(company, dailyBatchId);
		
		
		
	}

}
