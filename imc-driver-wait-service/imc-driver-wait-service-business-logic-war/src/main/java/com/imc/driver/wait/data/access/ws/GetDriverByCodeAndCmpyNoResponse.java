
package com.imc.driver.wait.data.access.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.imc.driver.wait.service.entities.Driver;


/**
 * <p>Java class for getDriverByCodeAndCmpyNoResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getDriverByCodeAndCmpyNoResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://ws.access.data.wait.driver.imc.com/}driver" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getDriverByCodeAndCmpyNoResponse", propOrder = {
    "_return"
})
public class GetDriverByCodeAndCmpyNoResponse {

    @XmlElement(name = "return")
    protected Driver _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link Driver }
     *     
     */
    public Driver getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link Driver }
     *     
     */
    public void setReturn(Driver value) {
        this._return = value;
    }

}
