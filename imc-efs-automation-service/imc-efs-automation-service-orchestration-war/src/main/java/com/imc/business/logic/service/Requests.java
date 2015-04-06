
package com.imc.business.logic.service;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for requests complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="requests">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="approver" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="chassisNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="claimNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="claimType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="company" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="containerNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="contractId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="driverId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="driverName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="efsAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="glAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="glDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isChargedToCustomer" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *         &lt;element name="issueDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="issuer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="moneyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="moneyCodeReferenceNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="pathToInvoice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="poWoNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="postDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="proNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rejectionReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="requestDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="requestId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="requestTypeId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="requestTypes" type="{http://ws.logic.business.automation.efs.imc.com/}requestTypes" minOccurs="0"/>
 *         &lt;element name="requester" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="serviceCharge" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="status" type="{http://ws.logic.business.automation.efs.imc.com/}status" minOccurs="0"/>
 *         &lt;element name="statusId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="tagEquipment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tagPurchType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="truckId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="vendorId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="vendorName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "requests", propOrder = {
    "approver",
    "chassisNumber",
    "claimNumber",
    "claimType",
    "company",
    "containerNumber",
    "contractId",
    "description",
    "driverId",
    "driverName",
    "efsAmount",
    "glAccount",
    "glDescription",
    "isChargedToCustomer",
    "issueDate",
    "issuer",
    "moneyCode",
    "moneyCodeReferenceNumber",
    "pathToInvoice",
    "poWoNumber",
    "postDate",
    "proNumber",
    "rejectionReason",
    "requestDate",
    "requestId",
    "requestTypeId",
    "requestTypes",
    "requester",
    "serviceCharge",
    "status",
    "statusId",
    "tagEquipment",
    "tagPurchType",
    "truckId",
    "vendorId",
    "vendorName"
})
public class Requests {

    protected String approver;
    protected String chassisNumber;
    protected String claimNumber;
    protected String claimType;
    protected String company;
    protected String containerNumber;
    protected int contractId;
    protected String description;
    protected String driverId;
    protected String driverName;
    protected BigDecimal efsAmount;
    protected String glAccount;
    protected String glDescription;
    protected byte isChargedToCustomer;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar issueDate;
    protected String issuer;
    protected String moneyCode;
    protected Integer moneyCodeReferenceNumber;
    protected String pathToInvoice;
    protected String poWoNumber;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar postDate;
    protected String proNumber;
    protected String rejectionReason;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar requestDate;
    protected int requestId;
    protected int requestTypeId;
    protected RequestTypes requestTypes;
    protected String requester;
    protected BigDecimal serviceCharge;
    protected Status status;
    protected int statusId;
    protected String tagEquipment;
    protected String tagPurchType;
    protected String truckId;
    protected Integer vendorId;
    protected String vendorName;

    /**
     * Gets the value of the approver property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApprover() {
        return approver;
    }

    /**
     * Sets the value of the approver property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApprover(String value) {
        this.approver = value;
    }

    /**
     * Gets the value of the chassisNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChassisNumber() {
        return chassisNumber;
    }

    /**
     * Sets the value of the chassisNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChassisNumber(String value) {
        this.chassisNumber = value;
    }

    /**
     * Gets the value of the claimNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClaimNumber() {
        return claimNumber;
    }

    /**
     * Sets the value of the claimNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClaimNumber(String value) {
        this.claimNumber = value;
    }

    /**
     * Gets the value of the claimType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClaimType() {
        return claimType;
    }

    /**
     * Sets the value of the claimType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClaimType(String value) {
        this.claimType = value;
    }

    /**
     * Gets the value of the company property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompany() {
        return company;
    }

    /**
     * Sets the value of the company property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompany(String value) {
        this.company = value;
    }

    /**
     * Gets the value of the containerNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContainerNumber() {
        return containerNumber;
    }

    /**
     * Sets the value of the containerNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContainerNumber(String value) {
        this.containerNumber = value;
    }

    /**
     * Gets the value of the contractId property.
     * 
     */
    public int getContractId() {
        return contractId;
    }

    /**
     * Sets the value of the contractId property.
     * 
     */
    public void setContractId(int value) {
        this.contractId = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the driverId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDriverId() {
        return driverId;
    }

    /**
     * Sets the value of the driverId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDriverId(String value) {
        this.driverId = value;
    }

    /**
     * Gets the value of the driverName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDriverName() {
        return driverName;
    }

    /**
     * Sets the value of the driverName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDriverName(String value) {
        this.driverName = value;
    }

    /**
     * Gets the value of the efsAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEfsAmount() {
        return efsAmount;
    }

    /**
     * Sets the value of the efsAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEfsAmount(BigDecimal value) {
        this.efsAmount = value;
    }

    /**
     * Gets the value of the glAccount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGlAccount() {
        return glAccount;
    }

    /**
     * Sets the value of the glAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGlAccount(String value) {
        this.glAccount = value;
    }

    /**
     * Gets the value of the glDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGlDescription() {
        return glDescription;
    }

    /**
     * Sets the value of the glDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGlDescription(String value) {
        this.glDescription = value;
    }

    /**
     * Gets the value of the isChargedToCustomer property.
     * 
     */
    public byte getIsChargedToCustomer() {
        return isChargedToCustomer;
    }

    /**
     * Sets the value of the isChargedToCustomer property.
     * 
     */
    public void setIsChargedToCustomer(byte value) {
        this.isChargedToCustomer = value;
    }

    /**
     * Gets the value of the issueDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getIssueDate() {
        return issueDate;
    }

    /**
     * Sets the value of the issueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setIssueDate(XMLGregorianCalendar value) {
        this.issueDate = value;
    }

    /**
     * Gets the value of the issuer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssuer() {
        return issuer;
    }

    /**
     * Sets the value of the issuer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssuer(String value) {
        this.issuer = value;
    }

    /**
     * Gets the value of the moneyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMoneyCode() {
        return moneyCode;
    }

    /**
     * Sets the value of the moneyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMoneyCode(String value) {
        this.moneyCode = value;
    }

    /**
     * Gets the value of the moneyCodeReferenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMoneyCodeReferenceNumber() {
        return moneyCodeReferenceNumber;
    }

    /**
     * Sets the value of the moneyCodeReferenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMoneyCodeReferenceNumber(Integer value) {
        this.moneyCodeReferenceNumber = value;
    }

    /**
     * Gets the value of the pathToInvoice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPathToInvoice() {
        return pathToInvoice;
    }

    /**
     * Sets the value of the pathToInvoice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPathToInvoice(String value) {
        this.pathToInvoice = value;
    }

    /**
     * Gets the value of the poWoNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPoWoNumber() {
        return poWoNumber;
    }

    /**
     * Sets the value of the poWoNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPoWoNumber(String value) {
        this.poWoNumber = value;
    }

    /**
     * Gets the value of the postDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPostDate() {
        return postDate;
    }

    /**
     * Sets the value of the postDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPostDate(XMLGregorianCalendar value) {
        this.postDate = value;
    }

    /**
     * Gets the value of the proNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProNumber() {
        return proNumber;
    }

    /**
     * Sets the value of the proNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProNumber(String value) {
        this.proNumber = value;
    }

    /**
     * Gets the value of the rejectionReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRejectionReason() {
        return rejectionReason;
    }

    /**
     * Sets the value of the rejectionReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRejectionReason(String value) {
        this.rejectionReason = value;
    }

    /**
     * Gets the value of the requestDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRequestDate() {
        return requestDate;
    }

    /**
     * Sets the value of the requestDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRequestDate(XMLGregorianCalendar value) {
        this.requestDate = value;
    }

    /**
     * Gets the value of the requestId property.
     * 
     */
    public int getRequestId() {
        return requestId;
    }

    /**
     * Sets the value of the requestId property.
     * 
     */
    public void setRequestId(int value) {
        this.requestId = value;
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
     * Gets the value of the requestTypes property.
     * 
     * @return
     *     possible object is
     *     {@link RequestTypes }
     *     
     */
    public RequestTypes getRequestTypes() {
        return requestTypes;
    }

    /**
     * Sets the value of the requestTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestTypes }
     *     
     */
    public void setRequestTypes(RequestTypes value) {
        this.requestTypes = value;
    }

    /**
     * Gets the value of the requester property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequester() {
        return requester;
    }

    /**
     * Sets the value of the requester property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequester(String value) {
        this.requester = value;
    }

    /**
     * Gets the value of the serviceCharge property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getServiceCharge() {
        return serviceCharge;
    }

    /**
     * Sets the value of the serviceCharge property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setServiceCharge(BigDecimal value) {
        this.serviceCharge = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link Status }
     *     
     */
    public Status getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link Status }
     *     
     */
    public void setStatus(Status value) {
        this.status = value;
    }

    /**
     * Gets the value of the statusId property.
     * 
     */
    public int getStatusId() {
        return statusId;
    }

    /**
     * Sets the value of the statusId property.
     * 
     */
    public void setStatusId(int value) {
        this.statusId = value;
    }

    /**
     * Gets the value of the tagEquipment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTagEquipment() {
        return tagEquipment;
    }

    /**
     * Sets the value of the tagEquipment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTagEquipment(String value) {
        this.tagEquipment = value;
    }

    /**
     * Gets the value of the tagPurchType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTagPurchType() {
        return tagPurchType;
    }

    /**
     * Sets the value of the tagPurchType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTagPurchType(String value) {
        this.tagPurchType = value;
    }

    /**
     * Gets the value of the truckId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTruckId() {
        return truckId;
    }

    /**
     * Sets the value of the truckId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTruckId(String value) {
        this.truckId = value;
    }

    /**
     * Gets the value of the vendorId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getVendorId() {
        return vendorId;
    }

    /**
     * Sets the value of the vendorId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setVendorId(Integer value) {
        this.vendorId = value;
    }

    /**
     * Gets the value of the vendorName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVendorName() {
        return vendorName;
    }

    /**
     * Sets the value of the vendorName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVendorName(String value) {
        this.vendorName = value;
    }

}
