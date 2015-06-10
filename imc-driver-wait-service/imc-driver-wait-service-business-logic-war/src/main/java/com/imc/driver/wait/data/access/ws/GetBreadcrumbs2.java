
package com.imc.driver.wait.data.access.ws;

import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for getBreadcrumbs2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getBreadcrumbs2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cmpyNo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="targetDatetime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="toleranceInMinutes" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="drCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getBreadcrumbs2", propOrder = {
    "cmpyNo",
    "targetDatetime",
    "toleranceInMinutes",
    "drCode"
})
public class GetBreadcrumbs2 {

    protected int cmpyNo;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Date targetDatetime;
    protected int toleranceInMinutes;
    protected String drCode;

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

    /**
     * Gets the value of the targetDatetime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getTargetDatetime() {
        return targetDatetime;
    }

    /**
     * Sets the value of the targetDatetime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetDatetime(Date value) {
        this.targetDatetime = value;
    }

    /**
     * Gets the value of the toleranceInMinutes property.
     * 
     */
    public int getToleranceInMinutes() {
        return toleranceInMinutes;
    }

    /**
     * Sets the value of the toleranceInMinutes property.
     * 
     */
    public void setToleranceInMinutes(int value) {
        this.toleranceInMinutes = value;
    }

    /**
     * Gets the value of the drCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDrCode() {
        return drCode;
    }

    /**
     * Sets the value of the drCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDrCode(String value) {
        this.drCode = value;
    }

}
