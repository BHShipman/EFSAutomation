
package service.cards.tch.com.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for WSTransLocation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WSTransLocation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="address1" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="address2" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="apartmentNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="businessType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="businessUnit" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="chainId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="city" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="country" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="dataSource" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="entity" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="gstTaxId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="latitude" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="locType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="longitude" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="opisId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pemexId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="phone" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pricesUpdated" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="qstTaxId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="rfcNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="site" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="state" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="streetNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="supplier" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="supplierLocCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="zip" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="zone" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="zoneName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSTransLocation", propOrder = {
    "address1",
    "address2",
    "apartmentNumber",
    "businessType",
    "businessUnit",
    "chainId",
    "city",
    "country",
    "dataSource",
    "entity",
    "gstTaxId",
    "id",
    "latitude",
    "locType",
    "longitude",
    "name",
    "opisId",
    "pemexId",
    "phone",
    "pricesUpdated",
    "qstTaxId",
    "rfcNumber",
    "site",
    "state",
    "status",
    "streetNumber",
    "supplier",
    "supplierLocCode",
    "zip",
    "zone",
    "zoneName"
})
public class WSTransLocation {

    @XmlElement(required = true, nillable = true)
    protected String address1;
    @XmlElement(required = true, nillable = true)
    protected String address2;
    @XmlElement(required = true, nillable = true)
    protected String apartmentNumber;
    @XmlElement(required = true, nillable = true)
    protected String businessType;
    @XmlElement(required = true, nillable = true)
    protected String businessUnit;
    @XmlElement(required = true, nillable = true)
    protected String chainId;
    @XmlElement(required = true, nillable = true)
    protected String city;
    @XmlElement(required = true, nillable = true)
    protected String country;
    @XmlElement(required = true, nillable = true)
    protected String dataSource;
    @XmlElement(required = true, nillable = true)
    protected String entity;
    @XmlElement(required = true, nillable = true)
    protected String gstTaxId;
    protected int id;
    protected double latitude;
    @XmlElement(required = true, nillable = true)
    protected String locType;
    protected double longitude;
    @XmlElement(required = true, nillable = true)
    protected String name;
    @XmlElement(required = true, nillable = true)
    protected String opisId;
    @XmlElement(required = true, nillable = true)
    protected String pemexId;
    @XmlElement(required = true, nillable = true)
    protected String phone;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar pricesUpdated;
    @XmlElement(required = true, nillable = true)
    protected String qstTaxId;
    @XmlElement(required = true, nillable = true)
    protected String rfcNumber;
    @XmlElement(required = true, nillable = true)
    protected String site;
    @XmlElement(required = true, nillable = true)
    protected String state;
    @XmlElement(required = true, nillable = true)
    protected String status;
    @XmlElement(required = true, nillable = true)
    protected String streetNumber;
    @XmlElement(required = true, nillable = true)
    protected String supplier;
    @XmlElement(required = true, nillable = true)
    protected String supplierLocCode;
    @XmlElement(required = true, nillable = true)
    protected String zip;
    @XmlElement(required = true, nillable = true)
    protected String zone;
    @XmlElement(required = true, nillable = true)
    protected String zoneName;

    /**
     * Gets the value of the address1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress1() {
        return address1;
    }

    /**
     * Sets the value of the address1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress1(String value) {
        this.address1 = value;
    }

    /**
     * Gets the value of the address2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress2() {
        return address2;
    }

    /**
     * Sets the value of the address2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress2(String value) {
        this.address2 = value;
    }

    /**
     * Gets the value of the apartmentNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApartmentNumber() {
        return apartmentNumber;
    }

    /**
     * Sets the value of the apartmentNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApartmentNumber(String value) {
        this.apartmentNumber = value;
    }

    /**
     * Gets the value of the businessType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessType() {
        return businessType;
    }

    /**
     * Sets the value of the businessType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessType(String value) {
        this.businessType = value;
    }

    /**
     * Gets the value of the businessUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessUnit() {
        return businessUnit;
    }

    /**
     * Sets the value of the businessUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessUnit(String value) {
        this.businessUnit = value;
    }

    /**
     * Gets the value of the chainId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChainId() {
        return chainId;
    }

    /**
     * Sets the value of the chainId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChainId(String value) {
        this.chainId = value;
    }

    /**
     * Gets the value of the city property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCity(String value) {
        this.city = value;
    }

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountry(String value) {
        this.country = value;
    }

    /**
     * Gets the value of the dataSource property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataSource() {
        return dataSource;
    }

    /**
     * Sets the value of the dataSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataSource(String value) {
        this.dataSource = value;
    }

    /**
     * Gets the value of the entity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntity() {
        return entity;
    }

    /**
     * Sets the value of the entity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntity(String value) {
        this.entity = value;
    }

    /**
     * Gets the value of the gstTaxId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGstTaxId() {
        return gstTaxId;
    }

    /**
     * Sets the value of the gstTaxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGstTaxId(String value) {
        this.gstTaxId = value;
    }

    /**
     * Gets the value of the id property.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(int value) {
        this.id = value;
    }

    /**
     * Gets the value of the latitude property.
     * 
     */
    public double getLatitude() {
        return latitude;
    }

    /**
     * Sets the value of the latitude property.
     * 
     */
    public void setLatitude(double value) {
        this.latitude = value;
    }

    /**
     * Gets the value of the locType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocType() {
        return locType;
    }

    /**
     * Sets the value of the locType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocType(String value) {
        this.locType = value;
    }

    /**
     * Gets the value of the longitude property.
     * 
     */
    public double getLongitude() {
        return longitude;
    }

    /**
     * Sets the value of the longitude property.
     * 
     */
    public void setLongitude(double value) {
        this.longitude = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the opisId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpisId() {
        return opisId;
    }

    /**
     * Sets the value of the opisId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpisId(String value) {
        this.opisId = value;
    }

    /**
     * Gets the value of the pemexId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPemexId() {
        return pemexId;
    }

    /**
     * Sets the value of the pemexId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPemexId(String value) {
        this.pemexId = value;
    }

    /**
     * Gets the value of the phone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Sets the value of the phone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhone(String value) {
        this.phone = value;
    }

    /**
     * Gets the value of the pricesUpdated property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPricesUpdated() {
        return pricesUpdated;
    }

    /**
     * Sets the value of the pricesUpdated property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPricesUpdated(XMLGregorianCalendar value) {
        this.pricesUpdated = value;
    }

    /**
     * Gets the value of the qstTaxId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQstTaxId() {
        return qstTaxId;
    }

    /**
     * Sets the value of the qstTaxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQstTaxId(String value) {
        this.qstTaxId = value;
    }

    /**
     * Gets the value of the rfcNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRfcNumber() {
        return rfcNumber;
    }

    /**
     * Sets the value of the rfcNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRfcNumber(String value) {
        this.rfcNumber = value;
    }

    /**
     * Gets the value of the site property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSite() {
        return site;
    }

    /**
     * Sets the value of the site property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSite(String value) {
        this.site = value;
    }

    /**
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setState(String value) {
        this.state = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the streetNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreetNumber() {
        return streetNumber;
    }

    /**
     * Sets the value of the streetNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreetNumber(String value) {
        this.streetNumber = value;
    }

    /**
     * Gets the value of the supplier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupplier() {
        return supplier;
    }

    /**
     * Sets the value of the supplier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupplier(String value) {
        this.supplier = value;
    }

    /**
     * Gets the value of the supplierLocCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupplierLocCode() {
        return supplierLocCode;
    }

    /**
     * Sets the value of the supplierLocCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupplierLocCode(String value) {
        this.supplierLocCode = value;
    }

    /**
     * Gets the value of the zip property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZip() {
        return zip;
    }

    /**
     * Sets the value of the zip property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZip(String value) {
        this.zip = value;
    }

    /**
     * Gets the value of the zone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZone() {
        return zone;
    }

    /**
     * Sets the value of the zone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZone(String value) {
        this.zone = value;
    }

    /**
     * Gets the value of the zoneName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZoneName() {
        return zoneName;
    }

    /**
     * Sets the value of the zoneName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZoneName(String value) {
        this.zoneName = value;
    }

}
