
package service.cards.tch.com.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WSCardSummary complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WSCardSummary">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cardNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="policyNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="companyXRef" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="unitNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="driverId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="driverName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="override" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="beingOverridden" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="payrollStatus" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="payrollUse" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="gpsid" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="vin" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="zid" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="infosrc" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="policySubfleet" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="cardSubfleet" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSCardSummary", propOrder = {
    "cardNumber",
    "policyNumber",
    "companyXRef",
    "unitNumber",
    "driverId",
    "driverName",
    "override",
    "beingOverridden",
    "status",
    "payrollStatus",
    "payrollUse",
    "gpsid",
    "vin",
    "zid",
    "infosrc",
    "policySubfleet",
    "cardSubfleet"
})
public class WSCardSummary {

    @XmlElement(required = true)
    protected String cardNumber;
    protected int policyNumber;
    @XmlElement(required = true, nillable = true)
    protected String companyXRef;
    @XmlElement(required = true, nillable = true)
    protected String unitNumber;
    @XmlElement(required = true, nillable = true)
    protected String driverId;
    @XmlElement(required = true, nillable = true)
    protected String driverName;
    protected int override;
    protected boolean beingOverridden;
    @XmlElement(required = true)
    protected String status;
    @XmlElement(required = true)
    protected String payrollStatus;
    @XmlElement(required = true, nillable = true)
    protected String payrollUse;
    @XmlElement(required = true, nillable = true)
    protected String gpsid;
    @XmlElement(required = true, nillable = true)
    protected String vin;
    @XmlElement(required = true, nillable = true)
    protected String zid;
    @XmlElement(required = true, nillable = true)
    protected String infosrc;
    @XmlElement(required = true, nillable = true)
    protected String policySubfleet;
    @XmlElement(required = true, nillable = true)
    protected String cardSubfleet;

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
     * Gets the value of the policyNumber property.
     * 
     */
    public int getPolicyNumber() {
        return policyNumber;
    }

    /**
     * Sets the value of the policyNumber property.
     * 
     */
    public void setPolicyNumber(int value) {
        this.policyNumber = value;
    }

    /**
     * Gets the value of the companyXRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyXRef() {
        return companyXRef;
    }

    /**
     * Sets the value of the companyXRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyXRef(String value) {
        this.companyXRef = value;
    }

    /**
     * Gets the value of the unitNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitNumber() {
        return unitNumber;
    }

    /**
     * Sets the value of the unitNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitNumber(String value) {
        this.unitNumber = value;
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
     * Gets the value of the driverName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDriverName() {
        return driverName;
    }

    /**
     * Sets the value of the driverName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDriverName(String value) {
        this.driverName = value;
    }

    /**
     * Gets the value of the override property.
     * 
     */
    public int getOverride() {
        return override;
    }

    /**
     * Sets the value of the override property.
     * 
     */
    public void setOverride(int value) {
        this.override = value;
    }

    /**
     * Gets the value of the beingOverridden property.
     * 
     */
    public boolean isBeingOverridden() {
        return beingOverridden;
    }

    /**
     * Sets the value of the beingOverridden property.
     * 
     */
    public void setBeingOverridden(boolean value) {
        this.beingOverridden = value;
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
     * Gets the value of the payrollStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayrollStatus() {
        return payrollStatus;
    }

    /**
     * Sets the value of the payrollStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayrollStatus(String value) {
        this.payrollStatus = value;
    }

    /**
     * Gets the value of the payrollUse property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayrollUse() {
        return payrollUse;
    }

    /**
     * Sets the value of the payrollUse property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayrollUse(String value) {
        this.payrollUse = value;
    }

    /**
     * Gets the value of the gpsid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGpsid() {
        return gpsid;
    }

    /**
     * Sets the value of the gpsid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGpsid(String value) {
        this.gpsid = value;
    }

    /**
     * Gets the value of the vin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVin() {
        return vin;
    }

    /**
     * Sets the value of the vin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVin(String value) {
        this.vin = value;
    }

    /**
     * Gets the value of the zid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZid() {
        return zid;
    }

    /**
     * Sets the value of the zid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZid(String value) {
        this.zid = value;
    }

    /**
     * Gets the value of the infosrc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInfosrc() {
        return infosrc;
    }

    /**
     * Sets the value of the infosrc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInfosrc(String value) {
        this.infosrc = value;
    }

    /**
     * Gets the value of the policySubfleet property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPolicySubfleet() {
        return policySubfleet;
    }

    /**
     * Sets the value of the policySubfleet property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPolicySubfleet(String value) {
        this.policySubfleet = value;
    }

    /**
     * Gets the value of the cardSubfleet property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardSubfleet() {
        return cardSubfleet;
    }

    /**
     * Sets the value of the cardSubfleet property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardSubfleet(String value) {
        this.cardSubfleet = value;
    }

}
