
package com.imc.efs.automation.email.service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SenderInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SenderInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fromEmailAddress" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="replyToEmailAddresses" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SenderInfo", propOrder = {
    "fromEmailAddress",
    "replyToEmailAddresses"
})
public class SenderInfo {

    @XmlElement(required = true)
    protected String fromEmailAddress;
    @XmlElement(nillable = true)
    protected List<String> replyToEmailAddresses;

    /**
     * Gets the value of the fromEmailAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFromEmailAddress() {
        return fromEmailAddress;
    }

    /**
     * Sets the value of the fromEmailAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromEmailAddress(String value) {
        this.fromEmailAddress = value;
    }

    /**
     * Gets the value of the replyToEmailAddresses property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the replyToEmailAddresses property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReplyToEmailAddresses().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getReplyToEmailAddresses() {
        if (replyToEmailAddresses == null) {
            replyToEmailAddresses = new ArrayList<String>();
        }
        return this.replyToEmailAddresses;
    }

}
