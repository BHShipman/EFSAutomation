
package service.cards.tch.com.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for WSManagedFuelDriver complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WSManagedFuelDriver">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tripNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tripSeq" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="driverId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="driverId2" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
@XmlType(name = "WSManagedFuelDriver", propOrder = {
    "tripNumber",
    "tripSeq",
    "driverId",
    "driverId2",
    "locationId",
    "fuelType",
    "fuelUse",
    "qtyAllowed",
    "effDt",
    "expDt",
    "action"
})
public class WSManagedFuelDriver {

    @XmlElement(required = true)
    protected String tripNumber;
    protected int tripSeq;
    @XmlElement(required = true)
    protected String driverId;
    @XmlElement(required = true, nillable = true)
    protected String driverId2;
    protected int locationId;
    protected int fuelType;
    protected int fuelUse;
    protected int qtyAllowed;
    @XmlElement(required = true)
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
     */
    public int getTripSeq() {
        return tripSeq;
    }

    /**
     * Sets the value of the tripSeq property.
     * 
     */
    public void setTripSeq(int value) {
        this.tripSeq = value;
    }

    /**
     * Gets the value of the driverId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDriverId() {
        return driverId;
    }

    /**
     * Sets the value of the driverId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDriverId(String value) {
        this.driverId = value;
    }

    /**
     * Gets the value of the driverId2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDriverId2() {
        return driverId2;
    }

    /**
     * Sets the value of the driverId2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDriverId2(String value) {
        this.driverId2 = value;
    }

    /**
     * Gets the value of the locationId property.
     * 
     */
    public int getLocationId() {
        return locationId;
    }

    /**
     * Sets the value of the locationId property.
     * 
     */
    public void setLocationId(int value) {
        this.locationId = value;
    }

    /**
     * Gets the value of the fuelType property.
     * 
     */
    public int getFuelType() {
        return fuelType;
    }

    /**
     * Sets the value of the fuelType property.
     * 
     */
    public void setFuelType(int value) {
        this.fuelType = value;
    }

    /**
     * Gets the value of the fuelUse property.
     * 
     */
    public int getFuelUse() {
        return fuelUse;
    }

    /**
     * Sets the value of the fuelUse property.
     * 
     */
    public void setFuelUse(int value) {
        this.fuelUse = value;
    }

    /**
     * Gets the value of the qtyAllowed property.
     * 
     */
    public int getQtyAllowed() {
        return qtyAllowed;
    }

    /**
     * Sets the value of the qtyAllowed property.
     * 
     */
    public void setQtyAllowed(int value) {
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
