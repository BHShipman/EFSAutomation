
package service.cards.tch.com.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for WSManagedFuel complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WSManagedFuel">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tripNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tripSeq" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="cardNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="cardNumber2" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="locationId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="fuelType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="fuelUse" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="qtyAllowed" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="effDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="expDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="action" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSManagedFuel", propOrder = {
    "tripNumber",
    "tripSeq",
    "cardNumber",
    "cardNumber2",
    "locationId",
    "fuelType",
    "fuelUse",
    "qtyAllowed",
    "effDt",
    "expDt",
    "action"
})
public class WSManagedFuel {

    @XmlElement(required = true)
    protected String tripNumber;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer tripSeq;
    @XmlElement(required = true, nillable = true)
    protected String cardNumber;
    @XmlElement(required = true, nillable = true)
    protected String cardNumber2;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer locationId;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer fuelType;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer fuelUse;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer qtyAllowed;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar effDt;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar expDt;
    @XmlElement(required = true)
    protected String action;

    /**
     * Gets the value of the tripNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTripNumber() {
        return tripNumber;
    }

    /**
     * Sets the value of the tripNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTripNumber(String value) {
        this.tripNumber = value;
    }

    /**
     * Gets the value of the tripSeq property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTripSeq() {
        return tripSeq;
    }

    /**
     * Sets the value of the tripSeq property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTripSeq(Integer value) {
        this.tripSeq = value;
    }

    /**
     * Gets the value of the cardNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardNumber() {
        return cardNumber;
    }

    /**
     * Sets the value of the cardNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardNumber(String value) {
        this.cardNumber = value;
    }

    /**
     * Gets the value of the cardNumber2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardNumber2() {
        return cardNumber2;
    }

    /**
     * Sets the value of the cardNumber2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardNumber2(String value) {
        this.cardNumber2 = value;
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

    /**
     * Gets the value of the fuelType property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFuelType() {
        return fuelType;
    }

    /**
     * Sets the value of the fuelType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFuelType(Integer value) {
        this.fuelType = value;
    }

    /**
     * Gets the value of the fuelUse property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFuelUse() {
        return fuelUse;
    }

    /**
     * Sets the value of the fuelUse property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFuelUse(Integer value) {
        this.fuelUse = value;
    }

    /**
     * Gets the value of the qtyAllowed property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getQtyAllowed() {
        return qtyAllowed;
    }

    /**
     * Sets the value of the qtyAllowed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setQtyAllowed(Integer value) {
        this.qtyAllowed = value;
    }

    /**
     * Gets the value of the effDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEffDt() {
        return effDt;
    }

    /**
     * Sets the value of the effDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEffDt(XMLGregorianCalendar value) {
        this.effDt = value;
    }

    /**
     * Gets the value of the expDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpDt() {
        return expDt;
    }

    /**
     * Sets the value of the expDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpDt(XMLGregorianCalendar value) {
        this.expDt = value;
    }

    /**
     * Gets the value of the action property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAction() {
        return action;
    }

    /**
     * Sets the value of the action property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAction(String value) {
        this.action = value;
    }

}
