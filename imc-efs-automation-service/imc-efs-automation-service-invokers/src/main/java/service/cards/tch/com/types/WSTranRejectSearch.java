
package service.cards.tch.com.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for WSTranRejectSearch complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WSTranRejectSearch">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="startDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="endDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="cardNum" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="invoice" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="locationId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSTranRejectSearch", propOrder = {
    "startDate",
    "endDate",
    "cardNum",
    "invoice",
    "locationId"
})
public class WSTranRejectSearch {

    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startDate;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endDate;
    @XmlElement(required = true, nillable = true)
    protected String cardNum;
    @XmlElement(required = true, nillable = true)
    protected String invoice;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer locationId;

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartDate(XMLGregorianCalendar value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndDate(XMLGregorianCalendar value) {
        this.endDate = value;
    }

    /**
     * Gets the value of the cardNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardNum() {
        return cardNum;
    }

    /**
     * Sets the value of the cardNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardNum(String value) {
        this.cardNum = value;
    }

    /**
     * Gets the value of the invoice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvoice() {
        return invoice;
    }

    /**
     * Sets the value of the invoice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvoice(String value) {
        this.invoice = value;
    }

    /**
     * Gets the value of the locationId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLocationId() {
        return locationId;
    }

    /**
     * Sets the value of the locationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLocationId(Integer value) {
        this.locationId = value;
    }

}
