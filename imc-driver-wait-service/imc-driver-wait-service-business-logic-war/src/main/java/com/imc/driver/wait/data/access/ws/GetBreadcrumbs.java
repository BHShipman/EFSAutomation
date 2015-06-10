
package com.imc.driver.wait.data.access.ws;

import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for getBreadcrumbs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getBreadcrumbs">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cmpyNo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="startDatetime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="endDatetime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
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
@XmlType(name = "getBreadcrumbs", propOrder = {
    "cmpyNo",
    "startDatetime",
    "endDatetime",
    "drCode"
})
public class GetBreadcrumbs {

    protected int cmpyNo;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Date startDatetime;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Date endDatetime;
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
     * Gets the value of the startDatetime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getStartDatetime() {
        return startDatetime;
    }

    /**
     * Sets the value of the startDatetime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartDatetime(Date value) {
        this.startDatetime = value;
    }

    /**
     * Gets the value of the endDatetime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getEndDatetime() {
        return endDatetime;
    }

    /**
     * Sets the value of the endDatetime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndDatetime(Date value) {
        this.endDatetime = value;
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
