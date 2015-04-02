package com.imc.efs.automation.data;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "EfsCheckRequest")
public class EfsCheckRequest implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public EfsCheckRequest() {
	}

	private int requestTypeId;
	private String company;
	private double efsAmount;
	private String requester;
	private String description;
	private int vendorId;
	private String vendorName;
	private String driverId;
	private String driverName;
	private String poWoNumber;
	private String truckId;
	private String pathToInvoice;

	private List<FileUpload> FileUploads;

	@XmlElement(required = true)
	public int getRequestTypeId() {
		return requestTypeId;
	}

	public void setRequestTypeId(int requestTypeId) {
		this.requestTypeId = requestTypeId;
	}

	@XmlElement(required = true)
	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	@XmlElement(required = true)
	public double getEfsAmount() {
		return efsAmount;
	}

	public void setEfsAmount(double efsAmount) {
		this.efsAmount = efsAmount;
	}

	@XmlElement(required = true)
	public String getRequester() {
		return requester;
	}

	public void setRequester(String requester) {
		this.requester = requester;
	}

	@XmlElement(required = true)
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@XmlElement(required = true)
	public int getVendorId() {
		return vendorId;
	}

	public void setVendorId(int vendorId) {
		this.vendorId = vendorId;
	}

	@XmlElement(required = true)
	public String getVendorName() {
		return vendorName;
	}

	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}

	@XmlElement(required = true)
	public String getDriverId() {
		return driverId;
	}

	public void setDriverId(String driverId) {
		this.driverId = driverId;
	}

	@XmlElement(required = true)
	public String getDriverName() {
		return driverName;
	}

	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}

	@XmlElement(required = true)
	public String getPoWoNumber() {
		return poWoNumber;
	}

	public void setPoWoNumber(String poWoNumber) {
		this.poWoNumber = poWoNumber;
	}

	@XmlElement(required = true)
	public String getTruckId() {
		return truckId;
	}

	public void setTruckId(String truckId) {
		this.truckId = truckId;
	}

	@XmlElement(required = true)
	public List<FileUpload> getFileUploads() {
		return FileUploads;
	}

	public void setFileUploads(List<FileUpload> fileUploads) {
		FileUploads = fileUploads;
	}

	@XmlElement(required = true)
	public String getPathToInvoice() {
		return pathToInvoice;
	}

	public void setPathToInvoice(String pathToInvoice) {
		this.pathToInvoice = pathToInvoice;
	}

}
