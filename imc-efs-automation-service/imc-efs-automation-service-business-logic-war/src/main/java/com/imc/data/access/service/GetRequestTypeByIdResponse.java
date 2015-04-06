
package com.imc.data.access.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.imc.efs.automation.entities.RequestTypes;


/**
 * <p>Java class for getRequestTypeByIdResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getRequestTypeByIdResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://ws.access.data.automation.efs.imc.com/}requestTypes" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getRequestTypeByIdResponse", propOrder = {
    "_return"
})
public class GetRequestTypeByIdResponse {

    @XmlElement(name = "return")
    protected RequestTypes _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link RequestTypes }
     *     
     */
    public RequestTypes getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestTypes }
     *     
     */
    public void setReturn(RequestTypes value) {
        this._return = value;
    }

}
