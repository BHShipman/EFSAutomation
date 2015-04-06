
package com.imc.data.access.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

import com.imc.efs.automation.dto.GpIntegrationDTO;


/**
 * <p>Java class for integrateIssuance complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="integrateIssuance">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="arg0" type="{http://ws.access.data.automation.efs.imc.com/}gpIntegrationDTO" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "integrateIssuance", propOrder = {
    "arg0"
})
public class IntegrateIssuance {

    protected GpIntegrationDTO arg0;

    /**
     * Gets the value of the arg0 property.
     * 
     * @return
     *     possible object is
     *     {@link GpIntegrationDTO }
     *     
     */
    public GpIntegrationDTO getArg0() {
        return arg0;
    }

    /**
     * Sets the value of the arg0 property.
     * 
     * @param value
     *     allowed object is
     *     {@link GpIntegrationDTO }
     *     
     */
    public void setArg0(GpIntegrationDTO value) {
        this.arg0 = value;
    }

}
