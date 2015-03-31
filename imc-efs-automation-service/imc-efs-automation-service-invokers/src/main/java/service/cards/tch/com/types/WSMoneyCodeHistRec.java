
package service.cards.tch.com.types;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for WSMoneyCodeHistRec complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WSMoneyCodeHistRec">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="activeDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="alphaCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="amount" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="amountUsed" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="codeType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="contractId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="created" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="deductFees" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="feeAmount" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="feeType" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="firstUse" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="issuedTo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="notes" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="numUses" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="payee" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="uses" type="{http://com.tch.cards.service/types}MoneyCodeHistUse" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="voidDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
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
@XmlType(name = "WSMoneyCodeHistRec", propOrder = {
    "activeDate",
    "alphaCode",
    "amount",
    "amountUsed",
    "code",
    "codeType",
    "contractId",
    "created",
    "deductFees",
    "feeAmount",
    "feeType",
    "firstUse",
    "id",
    "issuedTo",
    "notes",
    "numUses",
    "payee",
    "status",
    "uses",
    "voidDate",
    "voided",
    "who"
})
public class WSMoneyCodeHistRec {

    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar activeDate;
    @XmlElement(required = true, nillable = true)
    protected String alphaCode;
    protected double amount;
    protected double amountUsed;
    @XmlElement(required = true, nillable = true)
    protected String code;
    @XmlElement(required = true, nillable = true)
    protected String codeType;
    protected int contractId;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar created;
    protected boolean deductFees;
    protected double feeAmount;
    protected boolean feeType;
    @XmlElement(required = true, nillable = true)
    protected String firstUse;
    protected int id;
    @XmlElement(required = true, nillable = true)
    protected String issuedTo;
    @XmlElement(required = true, nillable = true)
    protected String notes;
    protected int numUses;
    @XmlElement(required = true, nillable = true)
    protected String payee;
    @XmlElement(required = true, nillable = true)
    protected String status;
    @XmlElement(nillable = true)
    protected List<MoneyCodeHistUse> uses;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar voidDate;
    protected boolean voided;
    @XmlElement(required = true, nillable = true)
    protected String who;

    /**
     * Gets the value of the activeDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getActiveDate() {
        return activeDate;
    }

    /**
     * Sets the value of the activeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setActiveDate(XMLGregorianCalendar value) {
        this.activeDate = value;
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
     * Gets the value of the created property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreated() {
        return created;
    }

    /**
     * Sets the value of the created property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreated(XMLGregorianCalendar value) {
        this.created = value;
    }

    /**
     * Gets the value of the deductFees property.
     * 
     */
    public boolean isDeductFees() {
        return deductFees;
    }

    /**
     * Sets the value of the deductFees property.
     * 
     */
    public void setDeductFees(boolean value) {
        this.deductFees = value;
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
     * Gets the value of the feeType property.
     * 
     */
    public boolean isFeeType() {
        return feeType;
    }

    /**
     * Sets the value of the feeType property.
     * 
     */
    public void setFeeType(boolean value) {
        this.feeType = value;
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
     * Gets the value of the issuedTo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssuedTo() {
        return issuedTo;
    }

    /**
     * Sets the value of the issuedTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssuedTo(String value) {
        this.issuedTo = value;
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
     * Gets the value of the numUses property.
     * 
     */
    public int getNumUses() {
        return numUses;
    }

    /**
     * Sets the value of the numUses property.
     * 
     */
    public void setNumUses(int value) {
        this.numUses = value;
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
     * Gets the value of the uses property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the uses property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUses().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MoneyCodeHistUse }
     * 
     * 
     */
    public List<MoneyCodeHistUse> getUses() {
        if (uses == null) {
            uses = new ArrayList<MoneyCodeHistUse>();
        }
        return this.uses;
    }

    /**
     * Gets the value of the voidDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getVoidDate() {
        return voidDate;
    }

    /**
     * Sets the value of the voidDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setVoidDate(XMLGregorianCalendar value) {
        this.voidDate = value;
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
