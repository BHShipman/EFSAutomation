package com.imc.efs.automation.entities;

// Generated Mar 16, 2015 4:02:11 PM by Hibernate Tools 4.0.0

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

/**
 * RequestTypeConfigs generated by hbm2java
 */
@Entity
@Table(name = "RequestTypeConfigs", schema = "dbo", catalog = "EfsAutomation")
public class RequestTypeConfigs implements java.io.Serializable {

	private int requestTypeId;
	private RequestTypes requestTypes;
	private byte driverId;
	private byte vendorId;
	private byte serviceCharge;
	private byte proNumber;
	private byte poWoNumber;
	private byte truckId;
	private byte chassisNumber;
	private byte containerNumber;
	private byte claimNumber;
	private byte claimType;
	private byte tagEquipment;
	private byte tagPurchType;
	private byte isChargedToCustomer;
	private boolean isOpsPortalType;
	private boolean isDriverPay;
	private boolean requiresManagementApproval;
	private boolean requiresAuthorizedVendor;
	private boolean requiresInvoice;
	private Long dexProjectId;
	private String issuanceDebit;
	private String issuanceCredit;
	private String expenseDebit;
	private String expenseCredit;

	public RequestTypeConfigs() {
	}

	public RequestTypeConfigs(RequestTypes requestTypes, byte driverId,
			byte vendorId, byte serviceCharge, byte proNumber, byte poWoNumber,
			byte truckId, byte chassisNumber, byte containerNumber,
			byte claimNumber, byte claimType, byte tagEquipment,
			byte tagPurchType, byte isChargedToCustomer,
			boolean isOpsPortalType, boolean isDriverPay,
			boolean requiresManagementApproval,
			boolean requiresAuthorizedVendor, boolean requiresInvoice) {
		this.requestTypes = requestTypes;
		this.driverId = driverId;
		this.vendorId = vendorId;
		this.serviceCharge = serviceCharge;
		this.proNumber = proNumber;
		this.poWoNumber = poWoNumber;
		this.truckId = truckId;
		this.chassisNumber = chassisNumber;
		this.containerNumber = containerNumber;
		this.claimNumber = claimNumber;
		this.claimType = claimType;
		this.tagEquipment = tagEquipment;
		this.tagPurchType = tagPurchType;
		this.isChargedToCustomer = isChargedToCustomer;
		this.isOpsPortalType = isOpsPortalType;
		this.isDriverPay = isDriverPay;
		this.requiresManagementApproval = requiresManagementApproval;
		this.requiresAuthorizedVendor = requiresAuthorizedVendor;
		this.requiresInvoice = requiresInvoice;
	}

	public RequestTypeConfigs(RequestTypes requestTypes, byte driverId,
			byte vendorId, byte serviceCharge, byte proNumber, byte poWoNumber,
			byte truckId, byte chassisNumber, byte containerNumber,
			byte claimNumber, byte claimType, byte tagEquipment,
			byte tagPurchType, byte isChargedToCustomer,
			boolean isOpsPortalType, boolean isDriverPay,
			boolean requiresManagementApproval,
			boolean requiresAuthorizedVendor, boolean requiresInvoice,
			Long dexProjectId, String issuanceDebit,
			String issuanceCredit, String expenseDebit,
			String expenseCredit) {
		this.requestTypes = requestTypes;
		this.driverId = driverId;
		this.vendorId = vendorId;
		this.serviceCharge = serviceCharge;
		this.proNumber = proNumber;
		this.poWoNumber = poWoNumber;
		this.truckId = truckId;
		this.chassisNumber = chassisNumber;
		this.containerNumber = containerNumber;
		this.claimNumber = claimNumber;
		this.claimType = claimType;
		this.tagEquipment = tagEquipment;
		this.tagPurchType = tagPurchType;
		this.isChargedToCustomer = isChargedToCustomer;
		this.isOpsPortalType = isOpsPortalType;
		this.isDriverPay = isDriverPay;
		this.requiresManagementApproval = requiresManagementApproval;
		this.requiresAuthorizedVendor = requiresAuthorizedVendor;
		this.requiresInvoice = requiresInvoice;
		this.dexProjectId = dexProjectId;
		this.issuanceDebit = issuanceDebit;
		this.issuanceCredit = issuanceCredit;
		this.expenseDebit = expenseDebit;
		this.expenseCredit = expenseCredit;
	}

	@GenericGenerator(name = "generator", strategy = "foreign", parameters = @Parameter(name = "property", value = "requestTypes"))
	@Id
	@GeneratedValue(generator = "generator")
	@Column(name = "RequestTypeId", unique = true, nullable = false)
	public int getRequestTypeId() {
		return this.requestTypeId;
	}

	public void setRequestTypeId(int requestTypeId) {
		this.requestTypeId = requestTypeId;
	}

	@OneToOne(fetch = FetchType.LAZY)
	@PrimaryKeyJoinColumn
	public RequestTypes getRequestTypes() {
		return this.requestTypes;
	}

	public void setRequestTypes(RequestTypes requestTypes) {
		this.requestTypes = requestTypes;
	}

	@Column(name = "DriverId", nullable = false)
	public byte getDriverId() {
		return this.driverId;
	}

	public void setDriverId(byte driverId) {
		this.driverId = driverId;
	}

	@Column(name = "VendorId", nullable = false)
	public byte getVendorId() {
		return this.vendorId;
	}

	public void setVendorId(byte vendorId) {
		this.vendorId = vendorId;
	}

	@Column(name = "ServiceCharge", nullable = false)
	public byte getServiceCharge() {
		return this.serviceCharge;
	}

	public void setServiceCharge(byte serviceCharge) {
		this.serviceCharge = serviceCharge;
	}

	@Column(name = "ProNumber", nullable = false)
	public byte getProNumber() {
		return this.proNumber;
	}

	public void setProNumber(byte proNumber) {
		this.proNumber = proNumber;
	}

	@Column(name = "PoWoNumber", nullable = false)
	public byte getPoWoNumber() {
		return this.poWoNumber;
	}

	public void setPoWoNumber(byte poWoNumber) {
		this.poWoNumber = poWoNumber;
	}

	@Column(name = "TruckId", nullable = false)
	public byte getTruckId() {
		return this.truckId;
	}

	public void setTruckId(byte truckId) {
		this.truckId = truckId;
	}

	@Column(name = "ChassisNumber", nullable = false)
	public byte getChassisNumber() {
		return this.chassisNumber;
	}

	public void setChassisNumber(byte chassisNumber) {
		this.chassisNumber = chassisNumber;
	}

	@Column(name = "ContainerNumber", nullable = false)
	public byte getContainerNumber() {
		return this.containerNumber;
	}

	public void setContainerNumber(byte containerNumber) {
		this.containerNumber = containerNumber;
	}

	@Column(name = "ClaimNumber", nullable = false)
	public byte getClaimNumber() {
		return this.claimNumber;
	}

	public void setClaimNumber(byte claimNumber) {
		this.claimNumber = claimNumber;
	}

	@Column(name = "ClaimType", nullable = false)
	public byte getClaimType() {
		return this.claimType;
	}

	public void setClaimType(byte claimType) {
		this.claimType = claimType;
	}

	@Column(name = "TagEquipment", nullable = false)
	public byte getTagEquipment() {
		return this.tagEquipment;
	}

	public void setTagEquipment(byte tagEquipment) {
		this.tagEquipment = tagEquipment;
	}

	@Column(name = "TagPurchType", nullable = false)
	public byte getTagPurchType() {
		return this.tagPurchType;
	}

	public void setTagPurchType(byte tagPurchType) {
		this.tagPurchType = tagPurchType;
	}

	@Column(name = "IsChargedToCustomer", nullable = false)
	public byte getIsChargedToCustomer() {
		return this.isChargedToCustomer;
	}

	public void setIsChargedToCustomer(byte isChargedToCustomer) {
		this.isChargedToCustomer = isChargedToCustomer;
	}

	@Column(name = "IsOpsPortalType", nullable = false)
	public boolean isIsOpsPortalType() {
		return this.isOpsPortalType;
	}

	public void setIsOpsPortalType(boolean isOpsPortalType) {
		this.isOpsPortalType = isOpsPortalType;
	}

	@Column(name = "IsDriverPay", nullable = false)
	public boolean isIsDriverPay() {
		return this.isDriverPay;
	}

	public void setIsDriverPay(boolean isDriverPay) {
		this.isDriverPay = isDriverPay;
	}

	@Column(name = "RequiresManagementApproval", nullable = false)
	public boolean isRequiresManagementApproval() {
		return this.requiresManagementApproval;
	}

	public void setRequiresManagementApproval(boolean requiresManagementApproval) {
		this.requiresManagementApproval = requiresManagementApproval;
	}

	@Column(name = "RequiresAuthorizedVendor", nullable = false)
	public boolean isRequiresAuthorizedVendor() {
		return this.requiresAuthorizedVendor;
	}

	public void setRequiresAuthorizedVendor(boolean requiresAuthorizedVendor) {
		this.requiresAuthorizedVendor = requiresAuthorizedVendor;
	}

	@Column(name = "RequiresInvoice", nullable = false)
	public boolean isRequiresInvoice() {
		return this.requiresInvoice;
	}

	public void setRequiresInvoice(boolean requiresInvoice) {
		this.requiresInvoice = requiresInvoice;
	}

	@Column(name = "DexProjectId")
	public Long getDexProjectId() {
		return this.dexProjectId;
	}

	public void setDexProjectId(Long dexProjectId) {
		this.dexProjectId = dexProjectId;
	}

	@Column(name = "IssuanceDebit")
	public String getIssuanceDebit() {
		return this.issuanceDebit;
	}

	public void setIssuanceDebit(String issuanceDebit) {
		this.issuanceDebit = issuanceDebit;
	}

	@Column(name = "IssuanceCredit")
	public String getIssuanceCredit() {
		return this.issuanceCredit;
	}

	public void setIssuanceCredit(String issuanceCredit) {
		this.issuanceCredit = issuanceCredit;
	}

	@Column(name = "ExpenseDebit")
	public String getExpenseDebit() {
		return this.expenseDebit;
	}

	public void setExpenseDebit(String expenseDebit) {
		this.expenseDebit = expenseDebit;
	}

	@Column(name = "ExpenseCredit")
	public String getExpenseCredit() {
		return this.expenseCredit;
	}

	public void setExpenseCredit(String expenseCredit) {
		this.expenseCredit = expenseCredit;
	}

}
