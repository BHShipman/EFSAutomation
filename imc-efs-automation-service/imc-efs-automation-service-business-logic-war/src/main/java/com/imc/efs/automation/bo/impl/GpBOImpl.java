package com.imc.efs.automation.bo.impl;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;

import com.imc.data.access.service.EfsDataAccessServiceBean;
import com.imc.efs.automation.bo.GpBO;
import com.imc.efs.automation.dto.GpIntegrationDTO;

@Remote(GpBO.class)
@Stateless(name="GpBO")
public class GpBOImpl implements GpBO {

	@EJB(beanName="EfsDAOService")
	private EfsDataAccessServiceBean efsDAOService;


	public GpBOImpl() {
	}

	public GpBOImpl(EfsDataAccessServiceBean efsDAOService) {
		this.efsDAOService = efsDAOService;
	}

	/* (non-Javadoc)
	 * @see com.imc.efs.automation.bo.impl.GpBO#createIssuanceTransaction(java.lang.String, java.lang.String, java.lang.String, int, int, double, java.util.Date, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String)
	 */
	@Override
	public void createIssuanceTransaction(String company, int requestId,
			int moneyCodeReferenceNumber, BigDecimal efsAmount, Date issueDate,
			String proNumber, String containerNumber, String chassisNumber,
			String driverId, String poWoNumber) {

		String vendorId = null;
		try {
			vendorId = efsDAOService.efsDAOService.getEfsGpVendorIdByCompany(company);
		} catch (Exception e) {
			e.printStackTrace();
		}

		Date now = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");

		String dailyBatchId = "EFS" + sdf.format(now);

		String division = null;
		if (driverId != null) {
			if (driverId.isEmpty()) {
				division = efsDAOService.efsDAOService.getDivisionByDriverId(driverId);
			}
		}

		double efsAmountPlusEfsFee = efsAmount.doubleValue() + 1;
		String moneyCodeReferenceNumberString = String
				.valueOf(moneyCodeReferenceNumber);

		GpIntegrationDTO gpDto = new GpIntegrationDTO();
		BigDecimal amount = new BigDecimal(String.valueOf(efsAmountPlusEfsFee));
		gpDto.setIntegration("EFS");
		gpDto.setCompany(company);
		gpDto.setBatchId(dailyBatchId);
		gpDto.setVCHNUMWK("EFS" + String.format("%06d", requestId));
		gpDto.setVendorId(vendorId);
		gpDto.setDocNumber(moneyCodeReferenceNumberString);
		gpDto.setDocType((short) 1);
		gpDto.setDocAmount(String.valueOf(efsAmountPlusEfsFee));
		gpDto.setDocDate(sdf.format(issueDate));
		gpDto.setPstgDate(sdf.format(now));
		gpDto.setChrgAmount(amount);
		gpDto.setTen99Amount(amount);
		gpDto.setPrchAmount(amount);
		gpDto.setCurrency("USD2");
		gpDto.setRateTPid("AVERAGE");
		gpDto.setExchangeDate("20070101");
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

		if(driverId.isEmpty()){
			driverId="NoDriverId";
		}
		// Debit EFS Amount + EFS Fee to flow-through
		String description = driverId + "|Flow Through";
		gpDto.setTRXDSCRN(description);
		gpDto.setDISTREF(moneyCodeReferenceNumberString + "|" + poWoNumber);
		gpDto.setActNumSt("0-00-2109");
		gpDto.setDistType((short)6);
		gpDto.setDebitAmount(amount);
		gpDto.setCreditAmount(new BigDecimal(0));
		efsDAOService.efsDAOService.integrateIssuance(gpDto);
		
		// Credit to EFS Payables
		description = driverId + "|EFS Payables";
		gpDto.setTRXDSCRN(description);
		gpDto.setDISTREF(description);
		gpDto.setActNumSt("0-00-2070");
		gpDto.setDistType((short)2);
		gpDto.setDebitAmount(new BigDecimal(0));
		gpDto.setCreditAmount(amount);
		efsDAOService.efsDAOService.integrateIssuance(gpDto);
		
		//call to execute recievedIntegrations
		efsDAOService.efsDAOService.executeRecievedIntegrations(company, dailyBatchId);
			
	}
	
	public int relaseAPHold(String company, String moneyCodeReferenceNumber){
		return efsDAOService.efsDAOService.releaseAPHold(company, moneyCodeReferenceNumber);
	}

}
