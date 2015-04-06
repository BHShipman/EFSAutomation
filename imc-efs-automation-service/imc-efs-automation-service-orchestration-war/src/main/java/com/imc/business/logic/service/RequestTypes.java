
package com.imc.business.logic.service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for requestTypes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="requestTypes">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="chargedToCustomer" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="chassisNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="claimNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="claimType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="containerNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="driverId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="isDriverPay" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="isOpsPortalType" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="poWoNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="preventDuplicates" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="proNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="requestTypeCommentses" type="{http://ws.logic.business.automation.efs.imc.com/}requestTypeComments" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="requestTypeId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="requesterses" type="{http://ws.logic.business.automation.efs.imc.com/}requesters" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="requestses" type="{http://ws.logic.business.automation.efs.imc.com/}requests" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="requiresAuthorizedVendor" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="requiresInvoice" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="requiresManagementApproval" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="serviceCharge" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="tagEquipment" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="tagPurchType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="truckId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="vendorId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "requestTypes", propOrder = {
    "chargedToCustomer",
    "chassisNumber",
    "claimNumber",
    "claimType",
    "containerNumber",
    "driverId",
    "isDriverPay",
    "isOpsPortalType",
    "name",
    "poWoNumber",
    "preventDuplicates",
    "proNumber",
    "requestTypeCommentses",
    "requestTypeId",
    "requesterses",
    "requestses",
    "requiresAuthorizedVendor",
    "requiresInvoice",
    "requiresManagementApproval",
    "serviceCharge",
    "tagEquipment",
    "tagPurchType",
    "truckId",
    "vendorId"
})
public class RequestTypes {

    protected boolean chargedToCustomer;
    protected int chassisNumber;
    protected int claimNumber;
    protected int claimType;
    protected int containerNumber;
    protected int driverId;
    protected boolean isDriverPay;
    protected boolean isOpsPortalType;
    protected String name;
    protected int poWoNumber;
    protected boolean preventDuplicates;
    protected int proNumber;
    @XmlElement(nillable = true)
    protected List<RequestTypeComments> requestTypeCommentses;
    protected int requestTypeId;
    @XmlElement(nillable = true)
    protected List<Requesters> requesterses;
    @XmlElement(nillable = true)
    protected List<Requests> requestses;
    protected boolean requiresAuthorizedVendor;
    protected boolean requiresInvoice;
    protected boolean requiresManagementApproval;
    protected int serviceCharge;
    protected int tagEquipment;
    protected int tagPurchType;
    protected int truckId;
    protected int vendorId;

    /**
     * Gets the value of the chargedToCustomer property.
     * 
     */
    public boolean isChargedToCustomer() {
        return chargedToCustomer;
    }

    /**
     * Sets the value of the chargedToCustomer property.
     * 
     */
    public void setChargedToCustomer(boolean value) {
        this.chargedToCustomer = value;
    }

    /**
     * Gets the value of the chassisNumber property.
     * 
     */
    public int getChassisNumber() {
        return chassisNumber;
    }

    /**
     * Sets the value of the chassisNumber property.
     * 
     */
    public void setChassisNumber(int value) {
        this.chassisNumber = value;
    }

    /**
     * Gets the value of the claimNumber property.
     * 
     */
    public int getClaimNumber() {
        return claimNumber;
    }

    /**
     * Sets the value of the claimNumber property.
     * 
     */
    public void setClaimNumber(int value) {
        this.claimNumber = value;
    }

    /**
     * Gets the value of the claimType property.
     * 
     */
    public int getClaimType() {
        return claimType;
    }

    /**
     * Sets the value of the claimType property.
     * 
     */
    public void setClaimType(int value) {
        this.claimType = value;
    }

    /**
     * Gets the value of the containerNumber property.
     * 
     */
    public int getContainerNumber() {
        return containerNumber;
    }

    /**
     * Sets the value of the containerNumber property.
     * 
     */
    public void setContainerNumber(int value) {
        this.containerNumber = value;
    }

    /**
     * Gets the value of the driverId property.
     * 
     */
    public int getDriverId() {
        return driverId;
    }

    /**
     * Sets the value of the driverId property.
     * 
     */
    public void setDriverId(int value) {
        this.driverId = value;
    }

    /**
     * Gets the value of the isDriverPay property.
     * 
     */
    public boolean isIsDriverPay() {
        return isDriverPay;
    }

    /**
     * Sets the value of the isDriverPay property.
     * 
     */
    public void setIsDriverPay(boolean value) {
        this.isDriverPay = value;
    }

    /**
     * Gets the value of the isOpsPortalType property.
     * 
     */
    public boolean isIsOpsPortalType() {
        return isOpsPortalType;
    }

    /**
     * Sets the value of the isOpsPortalType property.
     * 
     */
    public void setIsOpsPortalType(boolean value) {
        this.isOpsPortalType = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the poWoNumber property.
     * 
     */
    public int getPoWoNumber() {
        return poWoNumber;
    }

    /**
     * Sets the value of the poWoNumber property.
     * 
     */
    public void setPoWoNumber(int value) {
        this.poWoNumber = value;
    }

    /**
     * Gets the value of the preventDuplicates property.
     * 
     */
    public boolean isPreventDuplicates() {
        return preventDuplicates;
    }

    /**
     * Sets the value of the preventDuplicates property.
     * 
     */
    public void setPreventDuplicates(boolean value) {
        this.preventDuplicates = value;
    }

    /**
     * Gets the value of the proNumber property.
     * 
     */
    public int getProNumber() {
        return proNumber;
    }

    /**
     * Sets the value of the proNumber property.
     * 
     */
    public void setProNumber(int value) {
        this.proNumber = value;
    }

    /**
     * Gets the value of the requestTypeCommentses property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the requestTypeCommentses property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRequestTypeCommentses().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RequestTypeComments }
     * 
     * 
     */
    public List<RequestTypeComments> getRequestTypeCommentses() {
        if (requestTypeCommentses == null) {
            requestTypeCommentses = new ArrayList<RequestTypeComments>();
        }
        return this.requestTypeCommentses;
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
     * Gets the value of the requesterses property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the requesterses property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRequesterses().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Requesters }
     * 
     * 
     */
    public List<Requesters> getRequesterses() {
        if (requesterses == null) {
            requesterses = new ArrayList<Requesters>();
        }
        return this.requesterses;
    }

    /**
     * Gets the value of the requestses property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the requestses property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRequestses().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Requests }
     * 
     * 
     */
    public List<Requests> getRequestses() {
        if (requestses == null) {
            requestses = new ArrayList<Requests>();
        }
        return this.requestses;
    }

    /**
     * Gets the value of the requiresAuthorizedVendor property.
     * 
     */
    public boolean isRequiresAuthorizedVendor() {
        return requiresAuthorizedVendor;
    }

    /**
     * Sets the value of the requiresAuthorizedVendor property.
     * 
     */
    public void setRequiresAuthorizedVendor(boolean value) {
        this.requiresAuthorizedVendor = value;
    }

    /**
     * Gets the value of the requiresInvoice property.
     * 
     */
    public boolean isRequiresInvoice() {
        return requiresInvoice;
    }

    /**
     * Sets the value of the requiresInvoice property.
     * 
     */
    public void setRequiresInvoice(boolean value) {
        this.requiresInvoice = value;
    }

    /**
     * Gets the value of the requiresManagementApproval property.
     * 
     */
    public boolean isRequiresManagementApproval() {
        return requiresManagementApproval;
    }

    /**
     * Sets the value of the requiresManagementApproval property.
     * 
     */
    public void setRequiresManagementApproval(boolean value) {
        this.requiresManagementApproval = value;
    }

    /**
     * Gets the value of the serviceCharge property.
     * 
     */
    public int getServiceCharge() {
        return serviceCharge;
    }

    /**
     * Sets the value of the serviceCharge property.
     * 
     */
    public void setServiceCharge(int value) {
        this.serviceCharge = value;
    }

    /**
     * Gets the value of the tagEquipment property.
     * 
     */
    public int getTagEquipment() {
        return tagEquipment;
    }

    /**
     * Sets the value of the tagEquipment property.
     * 
     */
    public void setTagEquipment(int value) {
        this.tagEquipment = value;
    }

    /**
     * Gets the value of the tagPurchType property.
     * 
     */
    public int getTagPurchType() {
        return tagPurchType;
    }

    /**
     * Sets the value of the tagPurchType property.
     * 
     */
    public void setTagPurchType(int value) {
        this.tagPurchType = value;
    }

    /**
     * Gets the value of the truckId property.
     * 
     */
    public int getTruckId() {
        return truckId;
    }

    /**
     * Sets the value of the truckId property.
     * 
     */
    public void setTruckId(int value) {
        this.truckId = value;
    }

    /**
     * Gets the value of the vendorId property.
     * 
     */
    public int getVendorId() {
        return vendorId;
    }

    /**
     * Sets the value of the vendorId property.
     * 
     */
    public void setVendorId(int value) {
        this.vendorId = value;
    }

}
