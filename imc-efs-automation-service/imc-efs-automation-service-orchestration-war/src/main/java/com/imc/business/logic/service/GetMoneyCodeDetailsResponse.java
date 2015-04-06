
package com.imc.business.logic.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetMoneyCodeDetailsResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetMoneyCodeDetailsResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://ws.logic.business.automation.efs.imc.com/}moneyCodeDetailsDTO" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetMoneyCodeDetailsResponse", propOrder = {
    "_return"
})
public class GetMoneyCodeDetailsResponse {

    @XmlElement(name = "return")
    protected MoneyCodeDetailsDTO _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link MoneyCodeDetailsDTO }
     *     
     */
    public MoneyCodeDetailsDTO getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link MoneyCodeDetailsDTO }
     *     
     */
    public void setReturn(MoneyCodeDetailsDTO value) {
        this._return = value;
    }

}
