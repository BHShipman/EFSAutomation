
package com.imc.business.logic.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for efsMoneyCode complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="efsMoneyCode">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="issued" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="message" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="moneyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="referenceNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "efsMoneyCode", propOrder = {
    "issued",
    "message",
    "moneyCode",
    "referenceNumber"
})
public class EfsMoneyCode {

    protected boolean issued;
    protected String message;
    protected String moneyCode;
    protected int referenceNumber;

    /**
     * Gets the value of the issued property.
     * 
     */
    public boolean isIssued() {
        return issued;
    }

    /**
     * Sets the value of the issued property.
     * 
     */
    public void setIssued(boolean value) {
        this.issued = value;
    }

    /**
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessage(String value) {
        this.message = value;
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
     * Gets the value of the referenceNumber property.
     * 
     */
    public int getReferenceNumber() {
        return referenceNumber;
    }

    /**
     * Sets the value of the referenceNumber property.
     * 
     */
    public void setReferenceNumber(int value) {
        this.referenceNumber = value;
    }

}
