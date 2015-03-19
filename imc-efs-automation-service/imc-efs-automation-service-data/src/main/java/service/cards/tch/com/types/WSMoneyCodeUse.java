
package service.cards.tch.com.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for WSMoneyCodeUse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WSMoneyCodeUse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="activated" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="alphaCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="amount" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="amountUsed" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="check" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="codeType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="contractId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="feeAmount" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="firstUse" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="notes" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="payee" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="to" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="useAmount" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="useTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="voided" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="who" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSMoneyCodeUse", propOrder = {
    "activated",
    "alphaCode",
    "amount",
    "amountUsed",
    "check",
    "code",
    "codeType",
    "contractId",
    "feeAmount",
    "firstUse",
    "id",
    "notes",
    "payee",
    "to",
    "useAmount",
    "useTime",
    "voided",
    "who"
})
public class WSMoneyCodeUse {

    @XmlElement(required = true, nillable = true)
    protected String activated;
    @XmlElement(required = true, nillable = true)
    protected String alphaCode;
    protected double amount;
    protected double amountUsed;
    protected int check;
    @XmlElement(required = true, nillable = true)
    protected String code;
    @XmlElement(required = true, nillable = true)
    protected String codeType;
    protected int contractId;
    protected double feeAmount;
    @XmlElement(required = true, nillable = true)
    protected String firstUse;
    protected int id;
    @XmlElement(required = true, nillable = true)
    protected String notes;
    @XmlElement(required = true, nillable = true)
    protected String payee;
    @XmlElement(required = true, nillable = true)
    protected String to;
    protected double useAmount;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar useTime;
    protected boolean voided;
    @XmlElement(required = true, nillable = true)
    protected String who;

    /**
     * Gets the value of the activated property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActivated() {
        return activated;
    }

    /**
     * Sets the value of the activated property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActivated(String value) {
        this.activated = value;
    }

    /**
     * Gets the value of the alphaCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlphaCode() {
        return alphaCode;
    }

    /**
     * Sets the value of the alphaCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlphaCode(String value) {
        this.alphaCode = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     */
    public double getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     */
    public void setAmount(double value) {
        this.amount = value;
    }

    /**
     * Gets the value of the amountUsed property.
     * 
     */
    public double getAmountUsed() {
        return amountUsed;
    }

    /**
     * Sets the value of the amountUsed property.
     * 
     */
    public void setAmountUsed(double value) {
        this.amountUsed = value;
    }

    /**
     * Gets the value of the check property.
     * 
     */
    public int getCheck() {
        return check;
    }

    /**
     * Sets the value of the check property.
     * 
     */
    public void setCheck(int value) {
        this.check = value;
    }

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode(String value) {
        this.code = value;
    }

    /**
     * Gets the value of the codeType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeType() {
        return codeType;
    }

    /**
     * Sets the value of the codeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeType(String value) {
        this.codeType = value;
    }

    /**
     * Gets the value of the contractId property.
     * 
     */
    public int getContractId() {
        return contractId;
    }

    /**
     * Sets the value of the contractId property.
     * 
     */
    public void setContractId(int value) {
        this.contractId = value;
    }

    /**
     * Gets the value of the feeAmount property.
     * 
     */
    public double getFeeAmount() {
        return feeAmount;
    }

    /**
     * Sets the value of the feeAmount property.
     * 
     */
    public void setFeeAmount(double value) {
        this.feeAmount = value;
    }

    /**
     * Gets the value of the firstUse property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstUse() {
        return firstUse;
    }

    /**
     * Sets the value of the firstUse property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstUse(String value) {
        this.firstUse = value;
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
     * Gets the value of the notes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotes() {
        return notes;
    }

    /**
     * Sets the value of the notes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotes(String value) {
        this.notes = value;
    }

    /**
     * Gets the value of the payee property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayee() {
        return payee;
    }

    /**
     * Sets the value of the payee property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayee(String value) {
        this.payee = value;
    }

    /**
     * Gets the value of the to property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTo() {
        return to;
    }

    /**
     * Sets the value of the to property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTo(String value) {
        this.to = value;
    }

    /**
     * Gets the value of the useAmount property.
     * 
     */
    public double getUseAmount() {
        return useAmount;
    }

    /**
     * Sets the value of the useAmount property.
     * 
     */
    public void setUseAmount(double value) {
        this.useAmount = value;
    }

    /**
     * Gets the value of the useTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUseTime() {
        return useTime;
    }

    /**
     * Sets the value of the useTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUseTime(XMLGregorianCalendar value) {
        this.useTime = value;
    }

    /**
     * Gets the value of the voided property.
     * 
     */
    public boolean isVoided() {
        return voided;
    }

    /**
     * Sets the value of the voided property.
     * 
     */
    public void setVoided(boolean value) {
        this.voided = value;
    }

    /**
     * Gets the value of the who property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWho() {
        return who;
    }

    /**
     * Sets the value of the who property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWho(String value) {
        this.who = value;
    }

}
