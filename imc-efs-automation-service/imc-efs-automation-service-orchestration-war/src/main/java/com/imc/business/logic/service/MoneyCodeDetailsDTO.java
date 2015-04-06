
package com.imc.business.logic.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for moneyCodeDetailsDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="moneyCodeDetailsDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="amount" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="amountUsed" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="feeAmount" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="firstUse" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="voided" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="who" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "moneyCodeDetailsDTO", propOrder = {
    "amount",
    "amountUsed",
    "feeAmount",
    "firstUse",
    "voided",
    "who"
})
public class MoneyCodeDetailsDTO {

    protected double amount;
    protected double amountUsed;
    protected double feeAmount;
    protected String firstUse;
    protected boolean voided;
    protected String who;

    /**
     * Gets the value of the amount property.
     * 
     */
    public double getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     */
    public void setAmount(double value) {
        this.amount = value;
    }

    /**
     * Gets the value of the amountUsed property.
     * 
     */
    public double getAmountUsed() {
        return amountUsed;
    }

    /**
     * Sets the value of the amountUsed property.
     * 
     */
    public void setAmountUsed(double value) {
        this.amountUsed = value;
    }

    /**
     * Gets the value of the feeAmount property.
     * 
     */
    public double getFeeAmount() {
        return feeAmount;
    }

    /**
     * Sets the value of the feeAmount property.
     * 
     */
    public void setFeeAmount(double value) {
        this.feeAmount = value;
    }

    /**
     * Gets the value of the firstUse property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstUse() {
        return firstUse;
    }

    /**
     * Sets the value of the firstUse property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstUse(String value) {
        this.firstUse = value;
    }

    /**
     * Gets the value of the voided property.
     * 
     */
    public boolean isVoided() {
        return voided;
    }

    /**
     * Sets the value of the voided property.
     * 
     */
    public void setVoided(boolean value) {
        this.voided = value;
    }

    /**
     * Gets the value of the who property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWho() {
        return who;
    }

    /**
     * Sets the value of the who property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWho(String value) {
        this.who = value;
    }

}
