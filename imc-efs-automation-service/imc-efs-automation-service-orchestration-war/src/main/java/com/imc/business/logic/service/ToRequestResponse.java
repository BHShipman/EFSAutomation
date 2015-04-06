
package com.imc.business.logic.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.imc.efs.automation.entities.Requests;


/**
 * <p>Java class for toRequestResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="toRequestResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://ws.logic.business.automation.efs.imc.com/}requests" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "toRequestResponse", propOrder = {
    "_return"
})
public class ToRequestResponse {

    @XmlElement(name = "return")
    protected Requests _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link Requests }
     *     
     */
    public Requests getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link Requests }
     *     
     */
    public void setReturn(Requests value) {
        this._return = value;
    }

}
