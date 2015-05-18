package com.imc.efs.automation.service;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for efsCheckRequest complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="efsCheckRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="company" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="driverId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="driverName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="efsAmount" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="fileUploads" type="{http://webservice.automation.efs.imc.com/}fileUpload" maxOccurs="unbounded"/>
 *         &lt;element name="pass" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pathToInvoice" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="poWoNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="requestTypeId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="requester" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="truckId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="user" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="vendorId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="vendorName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "efsCheckRequest", propOrder = { "company", "description",
		"driverId", "driverName", "efsAmount", "fileUploads", "pass",
		"pathToInvoice", "poWoNumber", "requestTypeId", "requester", "truckId",
		"user", "vendorId", "vendorName" })
public class EfsCheckRequest {

	@XmlElement(required = true)
	protected String company;
	@XmlElement(required = true)
	protected String description;
	@XmlElement(required = true)
	protected String driverId;
	@XmlElement(required = true)
	protected String driverName;
	protected String efsAmount;
	@XmlElement(required = true)
	protected List<FileUpload> fileUploads;
	@XmlElement(required = true)
	protected String pass;
	@XmlElement(required = true)
	protected String pathToInvoice;
	@XmlElement(required = true)
	protected String poWoNumber;
	protected int requestTypeId;
	@XmlElement(required = true)
	protected String requester;
	@XmlElement(required = true)
	protected String truckId;
	@XmlElement(required = true)
	protected String user;
	protected String vendorId;
	@XmlElement(required = true)
	protected String vendorName;

	/**
	 * Gets the value of the company property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCompany() {
		return company;
	}

	/**
	 * Sets the value of the company property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCompany(String value) {
		this.company = value;
	}

	/**
	 * Gets the value of the description property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * Sets the value of the description property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setDescription(String value) {
		this.description = value;
	}

	/**
	 * Gets the value of the driverId property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDriverId() {
		return driverId;
	}

	/**
	 * Sets the value of the driverId property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setDriverId(String value) {
		this.driverId = value;
	}

	/**
	 * Gets the value of the driverName property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDriverName() {
		return driverName;
	}

	/**
	 * Sets the value of the driverName property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setDriverName(String value) {
		this.driverName = value;
	}

	/**
	 * Gets the value of the efsAmount property.
	 * 
	 */
	public String getEfsAmount() {
		return efsAmount;
	}

	/**
	 * Sets the value of the efsAmount property.
	 * 
	 */
	public void setEfsAmount(String value) {
		this.efsAmount = value;
	}

	/**
	 * Gets the value of the fileUploads property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the fileUploads property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getFileUploads().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link FileUpload }
	 * 
	 * 
	 */
	public List<FileUpload> getFileUploads() {
		if (fileUploads == null) {
			fileUploads = new ArrayList<FileUpload>();
		}
		return this.fileUploads;
	}

	/**
	 * Gets the value of the pass property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getPass() {
		return pass;
	}

	/**
	 * Sets the value of the pass property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setPass(String value) {
		this.pass = value;
	}

	/**
	 * Gets the value of the pathToInvoice property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getPathToInvoice() {
		return pathToInvoice;
	}

	/**
	 * Sets the value of the pathToInvoice property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setPathToInvoice(String value) {
		this.pathToInvoice = value;
	}

	/**
	 * Gets the value of the poWoNumber property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getPoWoNumber() {
		return poWoNumber;
	}

	/**
	 * Sets the value of the poWoNumber property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setPoWoNumber(String value) {
		this.poWoNumber = value;
	}

	/**
	 * Gets the value of the requestTypeId property.
	 * 
	 */
	public int getRequestTypeId() {
		return requestTypeId;
	}

	/**
	 * Sets the value of the requestTypeId property.
	 * 
	 */
	public void setRequestTypeId(int value) {
		this.requestTypeId = value;
	}

	/**
	 * Gets the value of the requester property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getRequester() {
		return requester;
	}

	/**
	 * Sets the value of the requester property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setRequester(String value) {
		this.requester = value;
	}

	/**
	 * Gets the value of the truckId property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getTruckId() {
		return truckId;
	}

	/**
	 * Sets the value of the truckId property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setTruckId(String value) {
		this.truckId = value;
	}

	/**
	 * Gets the value of the user property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getUser() {
		return user;
	}

	/**
	 * Sets the value of the user property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setUser(String value) {
		this.user = value;
	}

	/**
	 * Gets the value of the vendorId property.
	 * 
	 */
	public String getVendorId() {
		return vendorId;
	}

	/**
	 * Sets the value of the vendorId property.
	 * 
	 */
	public void setVendorId(String value) {
		this.vendorId = value;
	}

	/**
	 * Gets the value of the vendorName property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getVendorName() {
		return vendorName;
	}

	/**
	 * Sets the value of the vendorName property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setVendorName(String value) {
		this.vendorName = value;
	}

}
