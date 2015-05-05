
package com.imc.efs.web.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.imc.efs.automation.data.EfsMoneyCode;


/**
 * <p>Java class for requestEfsCheckResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="requestEfsCheckResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://webservice.automation.efs.imc.com/}efsMoneyCode" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "requestEfsCheckResponse", propOrder = {
    "_return"
})
public class RequestEfsCheckResponse {

    @XmlElement(name = "return")
    protected EfsMoneyCode _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link EfsMoneyCode }
     *     
     */
    public EfsMoneyCode getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link EfsMoneyCode }
     *     
     */
    public void setReturn(EfsMoneyCode value) {
        this._return = value;
    }

}
