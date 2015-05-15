package com.imc.bnsfworkorder.model;

import java.util.Date;
import java.util.List;


//Entity
//Table(name = "trb_vendor_header_data")
public class BNSFHeader {

	//Id
	//SequenceGenerator(name = "trb_vendor_header_data_key_column_seq", sequenceName = "trb_vendor_header_data_key_column_seq", allocationSize = 1)
	//GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "trb_vendor_header_data_key_column_seq")
	//Column(name = "key_column", unique = true, nullable = false)
	private Long key_column;
	//Column(name = "rec_indicator")
	private String recIndicator;
	//Column(name = "rec_type")
	private String recType;
	//Column(name = "patron_nbr")
	private String patronNbr;
	//Column(name = "invoice_nbr")
	private String invoiceNbr;
	//Column(name = "po_nbr")
	private String poNbr;
	//Column(name = "wo_nbr")
	private String woNbr;
	//Column(name = "complete_dt")
	private Date completeDate;
	//Column(name = "nbr_details")
	private String nbrDetails;
	//Column(name = "mechanic")
	private String mechanic;
	//Column(name = "vendor_name")
	private String vendorName;
	//Column(name = "payable_amt")
	private float payableAmt;
	//Column(name = "eqp_init")
	private String eqpInit;
	//Column(name = "eqp_numb")
	private String eqpNumb;
	//Column(name = "atch_init")
	private String atchInit;
	//Column(name = "atch_numb")
	private String atchNumb;
	//Column(name = "maint_resp")
	private String mainResp;
	//Column(name = "owner_abbr")
	private String ownerAbbr;
	//Column(name = "driver_name")
	private String driverName;
	//Column(name = "driver_license")
	private String driverLicense;
	//Column(name = "load_empty")
	private String loadEmpty;
	//Column(name = "car_knd_abbr")
	private String carKndAbbr;
	//Column(name = "length")
	private String length;
	//Column(name = "stn_333")
	private String stn333;
	//Column(name = "stn_st")
	private String stnSt;
	//Column(name = "repair_loc_city")
	private String repairLocCity;
	//Column(name = "repair_loc_st")
	private String repairLocSt;
	//Column(name = "composition")
	private String composition;
	//Column(name = "year_built")
	private String yearBuilt;
	//Column(name = "manufacturer")
	private String manufacturer;
	//Column(name = "inspect")
	private boolean inspect;
	//Column(name = "total_labor_hours")
	private float totalLaborHrs;
	//Transient
	private List<BNSFJobDetail> details;

	public List<BNSFJobDetail> getDetails() {
		return details;
	}

	public void setDetails(List<BNSFJobDetail> details) {
		this.details = details;
	}

	public Long getKey_column() {
		return key_column;
	}

	public void setKey_column(Long key_column) {
		this.key_column = key_column;
	}

	public String getRecType() {
		return recType;
	}

	public void setRecType(String recType) {
		this.recType = recType;
	}

	public String getRecIndicator() {
		return recIndicator;
	}

	public void setRecIndicator(String recIndicator) {
		this.recIndicator = recIndicator;
	}

	public String getPatronNbr() {
		return patronNbr;
	}

	public void setPatronNbr(String patronNbr) {
		this.patronNbr = patronNbr;
	}

	public String getInvoiceNbr() {
		return invoiceNbr;
	}

	public void setInvoiceNbr(String invoiceNbr) {
		this.invoiceNbr = invoiceNbr;
	}

	public String getPoNbr() {
		return poNbr;
	}

	public void setPoNbr(String poNbr) {
		this.poNbr = poNbr;
	}

	public String getWoNbr() {
		return woNbr;
	}

	public void setWoNbr(String woNbr) {
		this.woNbr = woNbr;
	}

	public Date getCompleteDate() {
		return completeDate;
	}

	public void setCompleteDate(Date completeDate) {
		this.completeDate = completeDate;
	}

	public String getNbrDetails() {
		return nbrDetails;
	}

	public void setNbrDetails(String nbrDetails) {
		this.nbrDetails = nbrDetails;
	}

	public String getMechanic() {
		return mechanic;
	}

	public void setMechanic(String mechanic) {
		this.mechanic = mechanic;
	}

	public String getVendorName() {
		return vendorName;
	}

	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}

	public float getPayableAmt() {
		return payableAmt;
	}

	public void setPayableAmt(float payableAmt) {
		this.payableAmt = payableAmt;
	}

	public String getEqpInit() {
		return eqpInit;
	}

	public void setEqpInit(String eqpInit) {
		this.eqpInit = eqpInit;
	}

	public String getEqpNumb() {
		return eqpNumb;
	}

	public void setEqpNumb(String eqpNumb) {
		this.eqpNumb = eqpNumb;
	}

	public String getAtchInit() {
		return atchInit;
	}

	public void setAtchInit(String atchInit) {
		this.atchInit = atchInit;
	}

	public String getAtchNumb() {
		return atchNumb;
	}

	public void setAtchNumb(String atchNumb) {
		this.atchNumb = atchNumb;
	}

	public String getMainResp() {
		return mainResp;
	}

	public void setMainResp(String mainResp) {
		this.mainResp = mainResp;
	}

	public String getOwnerAbbr() {
		return ownerAbbr;
	}

	public void setOwnerAbbr(String ownerAbbr) {
		this.ownerAbbr = ownerAbbr;
	}

	public String getDriverName() {
		return driverName;
	}

	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}

	public String getDriverLicense() {
		return driverLicense;
	}

	public void setDriverLicense(String driverLicense) {
		this.driverLicense = driverLicense;
	}

	public String getLoadEmpty() {
		return loadEmpty;
	}

	public void setLoadEmpty(String loadEmpty) {
		this.loadEmpty = loadEmpty;
	}

	public String getCarKndAbbr() {
		return carKndAbbr;
	}

	public void setCarKndAbbr(String carKndAbbr) {
		this.carKndAbbr = carKndAbbr;
	}

	public String getLength() {
		return length;
	}

	public void setLength(String length) {
		this.length = length;
	}

	public String getStn333() {
		return stn333;
	}

	public void setStn333(String stn333) {
		this.stn333 = stn333;
	}

	public String getStnSt() {
		return stnSt;
	}

	public void setStnSt(String stnSt) {
		this.stnSt = stnSt;
	}

	public String getRepairLocCity() {
		return repairLocCity;
	}

	public void setRepairLocCity(String repairLocCity) {
		this.repairLocCity = repairLocCity;
	}

	public String getRepairLocSt() {
		return repairLocSt;
	}

	public void setRepairLocSt(String repairLocSt) {
		this.repairLocSt = repairLocSt;
	}

	public String getComposition() {
		return composition;
	}

	public void setComposition(String composition) {
		this.composition = composition;
	}

	public String getYearBuilt() {
		return yearBuilt;
	}

	public void setYearBuilt(String yearBuilt) {
		this.yearBuilt = yearBuilt;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public boolean getInspect() {
		return inspect;
	}

	public void setInspect(boolean inspect) {
		this.inspect = inspect;
	}

	public float getTotalLaborHrs() {
		return totalLaborHrs;
	}

	public void setTotalLaborHrs(float totalLaborHrs) {
		this.totalLaborHrs = totalLaborHrs;
	}

}
