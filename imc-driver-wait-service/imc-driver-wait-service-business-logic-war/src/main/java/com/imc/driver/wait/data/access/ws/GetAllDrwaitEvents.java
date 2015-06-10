
package com.imc.driver.wait.data.access.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getAllDrwaitEvents complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getAllDrwaitEvents">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="usrCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="includeProcessed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getAllDrwaitEvents", propOrder = {
    "usrCode",
    "includeProcessed"
})
public class GetAllDrwaitEvents {

    protected String usrCode;
    protected boolean includeProcessed;

    /**
     * Gets the value of the usrCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsrCode() {
        return usrCode;
    }

    /**
     * Sets the value of the usrCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsrCode(String value) {
        this.usrCode = value;
    }

    /**
     * Gets the value of the includeProcessed property.
     * 
     */
    public boolean isIncludeProcessed() {
        return includeProcessed;
    }

    /**
     * Sets the value of the includeProcessed property.
     * 
     */
    public void setIncludeProcessed(boolean value) {
        this.includeProcessed = value;
    }

}
