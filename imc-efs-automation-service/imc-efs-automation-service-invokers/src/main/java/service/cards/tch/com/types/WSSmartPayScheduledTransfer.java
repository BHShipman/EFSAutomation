
package service.cards.tch.com.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for WSSmartPayScheduledTransfer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WSSmartPayScheduledTransfer">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="scheduledTransferId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="transferAccountId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="scheduleType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="scheduleValue" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="transferType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="transferValue" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="emailNotification" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="effDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="expDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSSmartPayScheduledTransfer", propOrder = {
    "scheduledTransferId",
    "transferAccountId",
    "scheduleType",
    "scheduleValue",
    "transferType",
    "transferValue",
    "emailNotification",
    "effDate",
    "expDate"
})
public class WSSmartPayScheduledTransfer {

    protected int scheduledTransferId;
    protected int transferAccountId;
    @XmlElement(required = true, nillable = true)
    protected String scheduleType;
    @XmlElement(required = true, nillable = true)
    protected String scheduleValue;
    @XmlElement(required = true, nillable = true)
    protected String transferType;
    protected double transferValue;
    protected boolean emailNotification;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar effDate;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar expDate;

    /**
     * Gets the value of the scheduledTransferId property.
     * 
     */
    public int getScheduledTransferId() {
        return scheduledTransferId;
    }

    /**
     * Sets the value of the scheduledTransferId property.
     * 
     */
    public void setScheduledTransferId(int value) {
        this.scheduledTransferId = value;
    }

    /**
     * Gets the value of the transferAccountId property.
     * 
     */
    public int getTransferAccountId() {
        return transferAccountId;
    }

    /**
     * Sets the value of the transferAccountId property.
     * 
     */
    public void setTransferAccountId(int value) {
        this.transferAccountId = value;
    }

    /**
     * Gets the value of the scheduleType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScheduleType() {
        return scheduleType;
    }

    /**
     * Sets the value of the scheduleType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScheduleType(String value) {
        this.scheduleType = value;
    }

    /**
     * Gets the value of the scheduleValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScheduleValue() {
        return scheduleValue;
    }

    /**
     * Sets the value of the scheduleValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScheduleValue(String value) {
        this.scheduleValue = value;
    }

    /**
     * Gets the value of the transferType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransferType() {
        return transferType;
    }

    /**
     * Sets the value of the transferType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransferType(String value) {
        this.transferType = value;
    }

    /**
     * Gets the value of the transferValue property.
     * 
     */
    public double getTransferValue() {
        return transferValue;
    }

    /**
     * Sets the value of the transferValue property.
     * 
     */
    public void setTransferValue(double value) {
        this.transferValue = value;
    }

    /**
     * Gets the value of the emailNotification property.
     * 
     */
    public boolean isEmailNotification() {
        return emailNotification;
    }

    /**
     * Sets the value of the emailNotification property.
     * 
     */
    public void setEmailNotification(boolean value) {
        this.emailNotification = value;
    }

    /**
     * Gets the value of the effDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEffDate() {
        return effDate;
    }

    /**
     * Sets the value of the effDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEffDate(XMLGregorianCalendar value) {
        this.effDate = value;
    }

    /**
     * Gets the value of the expDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpDate() {
        return expDate;
    }

    /**
     * Sets the value of the expDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpDate(XMLGregorianCalendar value) {
        this.expDate = value;
    }

}
