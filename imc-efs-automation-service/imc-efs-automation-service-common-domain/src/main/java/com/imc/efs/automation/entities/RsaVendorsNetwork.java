// Generated Mar 17, 2015 3:53:31 PM by Hibernate Tools 4.0.0
package com.imc.efs.automation.entities;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * RsaVendorsNetwork generated by hbm2java
 */
//Deprecated from old release, currently not being used
@Entity
@Table(name = "RSA_VendorsNetwork", schema = "dbo", catalog = "GPCustom")
public class RsaVendorsNetwork implements java.io.Serializable {

	private int rsaVendorsNetworkId;
	private String vendor;
	private String address;
	private String city;
	private String state;
	private String zip;
	private String phone;
	private String hours;
	private Boolean mobile;
	private Boolean withAccount;
	private BigDecimal latitude;
	private BigDecimal longitude;
	private Integer vendorType;
	private Integer payment;
	private boolean requireApproval;
	private Date creation;
	private boolean active;
	private short rate;
	private String notes;
	private boolean justMyTruck;
	private String taxId;
	private boolean tireRackProgram;
	private boolean efsQualified;

	public RsaVendorsNetwork() {
	}

	public RsaVendorsNetwork(int rsaVendorsNetworkId, String vendor,
			boolean requireApproval, Date creation, boolean active, short rate,
			boolean justMyTruck, boolean tireRackProgram, boolean efsQualified) {
		this.rsaVendorsNetworkId = rsaVendorsNetworkId;
		this.vendor = vendor;
		this.requireApproval = requireApproval;
		this.creation = creation;
		this.active = active;
		this.rate = rate;
		this.justMyTruck = justMyTruck;
		this.tireRackProgram = tireRackProgram;
		this.efsQualified = efsQualified;
	}

	public RsaVendorsNetwork(int rsaVendorsNetworkId, String vendor,
			String address, String city, String state, String zip,
			String phone, String hours, Boolean mobile, Boolean withAccount,
			BigDecimal latitude, BigDecimal longitude, Integer vendorType,
			Integer payment, boolean requireApproval, Date creation,
			boolean active, short rate, String notes, boolean justMyTruck,
			String taxId, boolean tireRackProgram, boolean efsQualified) {
		this.rsaVendorsNetworkId = rsaVendorsNetworkId;
		this.vendor = vendor;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.phone = phone;
		this.hours = hours;
		this.mobile = mobile;
		this.withAccount = withAccount;
		this.latitude = latitude;
		this.longitude = longitude;
		this.vendorType = vendorType;
		this.payment = payment;
		this.requireApproval = requireApproval;
		this.creation = creation;
		this.active = active;
		this.rate = rate;
		this.notes = notes;
		this.justMyTruck = justMyTruck;
		this.taxId = taxId;
		this.tireRackProgram = tireRackProgram;
		this.efsQualified = efsQualified;
	}

	@Id
	@Column(name = "RSA_VendorsNetworkId", unique = true, nullable = false)
	public int getRsaVendorsNetworkId() {
		return this.rsaVendorsNetworkId;
	}

	public void setRsaVendorsNetworkId(int rsaVendorsNetworkId) {
		this.rsaVendorsNetworkId = rsaVendorsNetworkId;
	}

	@Column(name = "Vendor", nullable = false, length = 75)
	public String getVendor() {
		return this.vendor;
	}

	public void setVendor(String vendor) {
		this.vendor = vendor;
	}

	@Column(name = "Address", length = 75)
	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Column(name = "City", length = 20)
	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Column(name = "State", length = 2)
	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Column(name = "ZIP", length = 7)
	public String getZip() {
		return this.zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	@Column(name = "Phone", length = 15)
	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Column(name = "Hours", length = 10)
	public String getHours() {
		return this.hours;
	}

	public void setHours(String hours) {
		this.hours = hours;
	}

	@Column(name = "Mobile")
	public Boolean getMobile() {
		return this.mobile;
	}

	public void setMobile(Boolean mobile) {
		this.mobile = mobile;
	}

	@Column(name = "WithAccount")
	public Boolean getWithAccount() {
		return this.withAccount;
	}

	public void setWithAccount(Boolean withAccount) {
		this.withAccount = withAccount;
	}

	@Column(name = "Latitude", precision = 18, scale = 13)
	public BigDecimal getLatitude() {
		return this.latitude;
	}

	public void setLatitude(BigDecimal latitude) {
		this.latitude = latitude;
	}

	@Column(name = "Longitude", precision = 18, scale = 13)
	public BigDecimal getLongitude() {
		return this.longitude;
	}

	public void setLongitude(BigDecimal longitude) {
		this.longitude = longitude;
	}

	@Column(name = "VendorType")
	public Integer getVendorType() {
		return this.vendorType;
	}

	public void setVendorType(Integer vendorType) {
		this.vendorType = vendorType;
	}

	@Column(name = "Payment")
	public Integer getPayment() {
		return this.payment;
	}

	public void setPayment(Integer payment) {
		this.payment = payment;
	}

	@Column(name = "RequireApproval", nullable = false)
	public boolean isRequireApproval() {
		return this.requireApproval;
	}

	public void setRequireApproval(boolean requireApproval) {
		this.requireApproval = requireApproval;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "Creation", nullable = false, length = 23)
	public Date getCreation() {
		return this.creation;
	}

	public void setCreation(Date creation) {
		this.creation = creation;
	}

	@Column(name = "Active", nullable = false)
	public boolean isActive() {
		return this.active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	@Column(name = "Rate", nullable = false)
	public short getRate() {
		return this.rate;
	}

	public void setRate(short rate) {
		this.rate = rate;
	}

	@Column(name = "Notes", length = 1000)
	public String getNotes() {
		return this.notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	@Column(name = "JustMyTruck", nullable = false)
	public boolean isJustMyTruck() {
		return this.justMyTruck;
	}

	public void setJustMyTruck(boolean justMyTruck) {
		this.justMyTruck = justMyTruck;
	}

	@Column(name = "TaxId", length = 15)
	public String getTaxId() {
		return this.taxId;
	}

	public void setTaxId(String taxId) {
		this.taxId = taxId;
	}

	@Column(name = "TireRackProgram", nullable = false)
	public boolean isTireRackProgram() {
		return this.tireRackProgram;
	}

	public void setTireRackProgram(boolean tireRackProgram) {
		this.tireRackProgram = tireRackProgram;
	}

	@Column(name = "EFS_Qualified", nullable = false)
	public boolean isEfsQualified() {
		return this.efsQualified;
	}

	public void setEfsQualified(boolean efsQualified) {
		this.efsQualified = efsQualified;
	}

}
