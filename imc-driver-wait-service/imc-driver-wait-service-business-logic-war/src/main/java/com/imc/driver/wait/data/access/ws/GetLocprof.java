
package com.imc.driver.wait.data.access.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getLocprof complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getLocprof">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="lpCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cmpyNo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getLocprof", propOrder = {
    "lpCode",
    "cmpyNo"
})
public class GetLocprof {

    protected String lpCode;
    protected int cmpyNo;

    /**
     * Gets the value of the lpCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLpCode() {
        return lpCode;
    }

    /**
     * Sets the value of the lpCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLpCode(String value) {
        this.lpCode = value;
    }

    /**
     * Gets the value of the cmpyNo property.
     * 
     */
    public int getCmpyNo() {
        return cmpyNo;
    }

    /**
     * Sets the value of the cmpyNo property.
     * 
     */
    public void setCmpyNo(int value) {
        this.cmpyNo = value;
    }

}
