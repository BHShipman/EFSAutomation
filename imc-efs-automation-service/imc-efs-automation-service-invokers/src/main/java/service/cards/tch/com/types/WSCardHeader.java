
package service.cards.tch.com.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for WSCardHeader complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WSCardHeader">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="companyXRef" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="handEnter" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="infoSource" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="limitSource" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="locationOverride" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="locationSource" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="overrideAllLocations" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="originalStatus" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="payrollStatus" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="override" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="policyNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="timeSource" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="lastUsedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="lastTransaction" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="payrollUse" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="payrollAtm" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="payrollChk" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="payrollAch" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="payrollWire" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="payrollDebit" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSCardHeader", propOrder = {
    "companyXRef",
    "handEnter",
    "infoSource",
    "limitSource",
    "locationOverride",
    "locationSource",
    "overrideAllLocations",
    "originalStatus",
    "payrollStatus",
    "override",
    "policyNumber",
    "status",
    "timeSource",
    "lastUsedDate",
    "lastTransaction",
    "payrollUse",
    "payrollAtm",
    "payrollChk",
    "payrollAch",
    "payrollWire",
    "payrollDebit"
})
public class WSCardHeader {

    @XmlElement(required = true, nillable = true)
    protected String companyXRef;
    @XmlElement(required = true, nillable = true)
    protected String handEnter;
    @XmlElement(required = true, nillable = true)
    protected String infoSource;
    @XmlElement(required = true, nillable = true)
    protected String limitSource;
    protected int locationOverride;
    @XmlElement(required = true, nillable = true)
    protected String locationSource;
    protected boolean overrideAllLocations;
    @XmlElement(required = true, nillable = true)
    protected String originalStatus;
    @XmlElement(required = true, nillable = true)
    protected String payrollStatus;
    protected int override;
    protected int policyNumber;
    @XmlElement(required = true, nillable = true)
    protected String status;
    @XmlElement(required = true, nillable = true)
    protected String timeSource;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastUsedDate;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer lastTransaction;
    @XmlElement(required = true, nillable = true)
    protected String payrollUse;
    @XmlElement(required = true, nillable = true)
    protected String payrollAtm;
    @XmlElement(required = true, nillable = true)
    protected String payrollChk;
    @XmlElement(required = true, nillable = true)
    protected String payrollAch;
    @XmlElement(required = true, nillable = true)
    protected String payrollWire;
    @XmlElement(required = true, nillable = true)
    protected String payrollDebit;

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
     * Gets the value of the handEnter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHandEnter() {
        return handEnter;
    }

    /**
     * Sets the value of the handEnter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHandEnter(String value) {
        this.handEnter = value;
    }

    /**
     * Gets the value of the infoSource property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInfoSource() {
        return infoSource;
    }

    /**
     * Sets the value of the infoSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInfoSource(String value) {
        this.infoSource = value;
    }

    /**
     * Gets the value of the limitSource property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLimitSource() {
        return limitSource;
    }

    /**
     * Sets the value of the limitSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLimitSource(String value) {
        this.limitSource = value;
    }

    /**
     * Gets the value of the locationOverride property.
     * 
     */
    public int getLocationOverride() {
        return locationOverride;
    }

    /**
     * Sets the value of the locationOverride property.
     * 
     */
    public void setLocationOverride(int value) {
        this.locationOverride = value;
    }

    /**
     * Gets the value of the locationSource property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationSource() {
        return locationSource;
    }

    /**
     * Sets the value of the locationSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationSource(String value) {
        this.locationSource = value;
    }

    /**
     * Gets the value of the overrideAllLocations property.
     * 
     */
    public boolean isOverrideAllLocations() {
        return overrideAllLocations;
    }

    /**
     * Sets the value of the overrideAllLocations property.
     * 
     */
    public void setOverrideAllLocations(boolean value) {
        this.overrideAllLocations = value;
    }

    /**
     * Gets the value of the originalStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginalStatus() {
        return originalStatus;
    }

    /**
     * Sets the value of the originalStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginalStatus(String value) {
        this.originalStatus = value;
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
     * Gets the value of the timeSource property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeSource() {
        return timeSource;
    }

    /**
     * Sets the value of the timeSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeSource(String value) {
        this.timeSource = value;
    }

    /**
     * Gets the value of the lastUsedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastUsedDate() {
        return lastUsedDate;
    }

    /**
     * Sets the value of the lastUsedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastUsedDate(XMLGregorianCalendar value) {
        this.lastUsedDate = value;
    }

    /**
     * Gets the value of the lastTransaction property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLastTransaction() {
        return lastTransaction;
    }

    /**
     * Sets the value of the lastTransaction property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLastTransaction(Integer value) {
        this.lastTransaction = value;
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
     * Gets the value of the payrollAtm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayrollAtm() {
        return payrollAtm;
    }

    /**
     * Sets the value of the payrollAtm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayrollAtm(String value) {
        this.payrollAtm = value;
    }

    /**
     * Gets the value of the payrollChk property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayrollChk() {
        return payrollChk;
    }

    /**
     * Sets the value of the payrollChk property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayrollChk(String value) {
        this.payrollChk = value;
    }

    /**
     * Gets the value of the payrollAch property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayrollAch() {
        return payrollAch;
    }

    /**
     * Sets the value of the payrollAch property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayrollAch(String value) {
        this.payrollAch = value;
    }

    /**
     * Gets the value of the payrollWire property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayrollWire() {
        return payrollWire;
    }

    /**
     * Sets the value of the payrollWire property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayrollWire(String value) {
        this.payrollWire = value;
    }

    /**
     * Gets the value of the payrollDebit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayrollDebit() {
        return payrollDebit;
    }

    /**
     * Sets the value of the payrollDebit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayrollDebit(String value) {
        this.payrollDebit = value;
    }

}
