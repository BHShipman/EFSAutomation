
package com.imc.efs.automation.email.service;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RecipientInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RecipientInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="toEmailAddresses" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *         &lt;element name="ccEmailAddresses" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="testEmailAddresses" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RecipientInfo", propOrder = {
    "toEmailAddresses",
    "ccEmailAddresses",
    "testEmailAddresses"
})
public class RecipientInfo {

    @XmlElement(required = true)
    protected List<String> toEmailAddresses;
    @XmlElement(nillable = true)
    protected List<String> ccEmailAddresses;
    @XmlElement(nillable = true)
    protected List<String> testEmailAddresses;

    /**
     * Gets the value of the toEmailAddresses property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the toEmailAddresses property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getToEmailAddresses().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getToEmailAddresses() {
        if (toEmailAddresses == null) {
            toEmailAddresses = new ArrayList<String>();
        }
        return this.toEmailAddresses;
    }
    
    public void setToEmailAddresses(List<String> toEmailAddresses){
    	this.toEmailAddresses = toEmailAddresses;
    }

    /**
     * Gets the value of the ccEmailAddresses property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ccEmailAddresses property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCcEmailAddresses().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCcEmailAddresses() {
        if (ccEmailAddresses == null) {
            ccEmailAddresses = new ArrayList<String>();
        }
        return this.ccEmailAddresses;
    }
    
    public void setCcEmailAddresses(List<String> ccEmailAddresses){
    	this.ccEmailAddresses = ccEmailAddresses;
    }

    /**
     * Gets the value of the testEmailAddresses property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the testEmailAddresses property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTestEmailAddresses().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getTestEmailAddresses() {
        if (testEmailAddresses == null) {
            testEmailAddresses = new ArrayList<String>();
        }
        return this.testEmailAddresses;
    }
    
    public void setTestEmailAddresses(List<String> testEmailAddresses){
    	this.testEmailAddresses = testEmailAddresses;
    }


}
