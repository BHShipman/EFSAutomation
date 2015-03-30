package com.imc.efs.automation.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class GpIntegrationDTO implements Serializable {

	public GpIntegrationDTO() {
	}

	private String integration;
	private String company;
	private String batchId;
	private String VCHNUMWK;
	private String vendorId;
	private String docNumber;
	private short docType;
	private String docAmount;
	private Date docDate;
	private Date pstgDate;
	private BigDecimal chrgAmount;
	private BigDecimal ten99Amount;
	private BigDecimal prchAmount;
	private String TRXDSCRN;
	private String currency;
	private String rateTPid;
	private Date exchangeDate;
	private short rateExp;
	private short createDist;
	private short distType;
	private String actNumSt;
	private BigDecimal debitAmount;
	private BigDecimal creditAmount;
	private String DISTREF;
	private int recordid;
	private String userId;
	private String proNumber;
	private String container;
	private String chassis;
	private String driverId;
	private String pordNumber;
	private String division;
	private String failure;
	private String repairType;
	private String invoiceNumber;
	private boolean apHold;

	public String getIntegration() {
		return integration;
	}

	public void setIntegration(String integration) {
		this.integration = integration;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getBatchId() {
		return batchId;
	}

	public void setBatchId(String batchId) {
		this.batchId = batchId;
	}

	public String getVCHNUMWK() {
		return VCHNUMWK;
	}

	public void setVCHNUMWK(String vCHNUMWK) {
		VCHNUMWK = vCHNUMWK;
	}

	public String getVendorId() {
		return vendorId;
	}

	public void setVendorId(String vendorId) {
		this.vendorId = vendorId;
	}

	public String getDocNumber() {
		return docNumber;
	}

	public void setDocNumber(String docNumber) {
		this.docNumber = docNumber;
	}

	public String getDocAmount() {
		return docAmount;
	}

	public void setDocAmount(String docAmount) {
		this.docAmount = docAmount;
	}

	public Date getDocDate() {
		return docDate;
	}

	public void setDocDate(Date docDate) {
		this.docDate = docDate;
	}

	public Date getPstgDate() {
		return pstgDate;
	}

	public void setPstgDate(Date pstgDate) {
		this.pstgDate = pstgDate;
	}

	public BigDecimal getChrgAmount() {
		return chrgAmount;
	}

	public void setChrgAmount(BigDecimal chrgAmount) {
		this.chrgAmount = chrgAmount;
	}

	public BigDecimal getTen99Amount() {
		return ten99Amount;
	}

	public void setTen99Amount(BigDecimal ten99Amount) {
		this.ten99Amount = ten99Amount;
	}

	public BigDecimal getPrchAmount() {
		return prchAmount;
	}

	public void setPrchAmount(BigDecimal prchAmount) {
		this.prchAmount = prchAmount;
	}

	public String getTRXDSCRN() {
		return TRXDSCRN;
	}

	public void setTRXDSCRN(String tRXDSCRN) {
		TRXDSCRN = tRXDSCRN;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getRateTPid() {
		return rateTPid;
	}

	public void setRateTPid(String rateTPid) {
		this.rateTPid = rateTPid;
	}

	public Date getExchangeDate() {
		return exchangeDate;
	}

	public void setExchangeDate(Date exchangeDate) {
		this.exchangeDate = exchangeDate;
	}

	public short getRateExp() {
		return rateExp;
	}

	public void setRateExp(short rateExp) {
		this.rateExp = rateExp;
	}

	public short getCreateDist() {
		return createDist;
	}

	public void setCreateDist(short createDist) {
		this.createDist = createDist;
	}

	public short getDistType() {
		return distType;
	}

	public void setDistType(short distType) {
		this.distType = distType;
	}

	public String getActNumSt() {
		return actNumSt;
	}

	public void setActNumSt(String actNumSt) {
		this.actNumSt = actNumSt;
	}

	public BigDecimal getDebitAmount() {
		return debitAmount;
	}

	public void setDebitAmount(BigDecimal debitAmount) {
		this.debitAmount = debitAmount;
	}

	public BigDecimal getCreditAmount() {
		return creditAmount;
	}

	public void setCreditAmount(BigDecimal creditAmount) {
		this.creditAmount = creditAmount;
	}

	public String getDISTREF() {
		return DISTREF;
	}

	public void setDISTREF(String dISTREF) {
		DISTREF = dISTREF;
	}

	public int getRecordid() {
		return recordid;
	}

	public void setRecordid(int recordid) {
		this.recordid = recordid;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getProNumber() {
		return proNumber;
	}

	public void setProNumber(String proNumber) {
		this.proNumber = proNumber;
	}

	public String getContainer() {
		return container;
	}

	public void setContainer(String container) {
		this.container = container;
	}

	public String getChassis() {
		return chassis;
	}

	public void setChassis(String chassis) {
		this.chassis = chassis;
	}

	public String getDriverId() {
		return driverId;
	}

	public void setDriverId(String driverId) {
		this.driverId = driverId;
	}

	public String getPordNumber() {
		return pordNumber;
	}

	public void setPordNumber(String pordNumber) {
		this.pordNumber = pordNumber;
	}

	public String getDivision() {
		return division;
	}

	public void setDivision(String division) {
		this.division = division;
	}

	public String getFailure() {
		return failure;
	}

	public void setFailure(String failure) {
		this.failure = failure;
	}

	public String getRepairType() {
		return repairType;
	}

	public void setRepairType(String repairType) {
		this.repairType = repairType;
	}

	public String getInvoiceNumber() {
		return invoiceNumber;
	}

	public void setInvoiceNumber(String invoiceNumber) {
		this.invoiceNumber = invoiceNumber;
	}

	public boolean isApHold() {
		return apHold;
	}

	public void setApHold(boolean apHold) {
		this.apHold = apHold;
	}

	public short getDocType() {
		return docType;
	}

	public void setDocType(short docType) {
		this.docType = docType;
	}

}
