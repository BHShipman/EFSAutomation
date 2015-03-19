
package service.cards.tch.com.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for WSSmartPayTransferAccount complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WSSmartPayTransferAccount">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="transferAccountId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="cardNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="bankName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="routingNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="accountNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="accountOwnerName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="accountType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="accountNickname" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="effectiveDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="batchHeaderId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="createdBy" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="verifyDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="verifyAmountOne" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="verifyAmountTwo" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="verifyTryCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="expireDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSSmartPayTransferAccount", propOrder = {
    "transferAccountId",
    "cardNumber",
    "bankName",
    "routingNumber",
    "accountNumber",
    "accountOwnerName",
    "accountType",
    "accountNickname",
    "effectiveDate",
    "batchHeaderId",
    "createdBy",
    "verifyDate",
    "verifyAmountOne",
    "verifyAmountTwo",
    "verifyTryCount",
    "expireDate"
})
public class WSSmartPayTransferAccount {

    protected int transferAccountId;
    @XmlElement(required = true, nillable = true)
    protected String cardNumber;
    @XmlElement(required = true, nillable = true)
    protected String bankName;
    @XmlElement(required = true, nillable = true)
    protected String routingNumber;
    @XmlElement(required = true, nillable = true)
    protected String accountNumber;
    @XmlElement(required = true, nillable = true)
    protected String accountOwnerName;
    protected int accountType;
    @XmlElement(required = true, nillable = true)
    protected String accountNickname;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar effectiveDate;
    protected int batchHeaderId;
    @XmlElement(required = true, nillable = true)
    protected String createdBy;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar verifyDate;
    protected double verifyAmountOne;
    protected double verifyAmountTwo;
    protected int verifyTryCount;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar expireDate;

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
     * Gets the value of the bankName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankName() {
        return bankName;
    }

    /**
     * Sets the value of the bankName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankName(String value) {
        this.bankName = value;
    }

    /**
     * Gets the value of the routingNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoutingNumber() {
        return routingNumber;
    }

    /**
     * Sets the value of the routingNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoutingNumber(String value) {
        this.routingNumber = value;
    }

    /**
     * Gets the value of the accountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountNumber() {
        return accountNumber;
    }

    /**
     * Sets the value of the accountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountNumber(String value) {
        this.accountNumber = value;
    }

    /**
     * Gets the value of the accountOwnerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountOwnerName() {
        return accountOwnerName;
    }

    /**
     * Sets the value of the accountOwnerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountOwnerName(String value) {
        this.accountOwnerName = value;
    }

    /**
     * Gets the value of the accountType property.
     * 
     */
    public int getAccountType() {
        return accountType;
    }

    /**
     * Sets the value of the accountType property.
     * 
     */
    public void setAccountType(int value) {
        this.accountType = value;
    }

    /**
     * Gets the value of the accountNickname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountNickname() {
        return accountNickname;
    }

    /**
     * Sets the value of the accountNickname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountNickname(String value) {
        this.accountNickname = value;
    }

    /**
     * Gets the value of the effectiveDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEffectiveDate() {
        return effectiveDate;
    }

    /**
     * Sets the value of the effectiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEffectiveDate(XMLGregorianCalendar value) {
        this.effectiveDate = value;
    }

    /**
     * Gets the value of the batchHeaderId property.
     * 
     */
    public int getBatchHeaderId() {
        return batchHeaderId;
    }

    /**
     * Sets the value of the batchHeaderId property.
     * 
     */
    public void setBatchHeaderId(int value) {
        this.batchHeaderId = value;
    }

    /**
     * Gets the value of the createdBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreatedBy() {
        return createdBy;
    }

    /**
     * Sets the value of the createdBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreatedBy(String value) {
        this.createdBy = value;
    }

    /**
     * Gets the value of the verifyDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getVerifyDate() {
        return verifyDate;
    }

    /**
     * Sets the value of the verifyDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setVerifyDate(XMLGregorianCalendar value) {
        this.verifyDate = value;
    }

    /**
     * Gets the value of the verifyAmountOne property.
     * 
     */
    public double getVerifyAmountOne() {
        return verifyAmountOne;
    }

    /**
     * Sets the value of the verifyAmountOne property.
     * 
     */
    public void setVerifyAmountOne(double value) {
        this.verifyAmountOne = value;
    }

    /**
     * Gets the value of the verifyAmountTwo property.
     * 
     */
    public double getVerifyAmountTwo() {
        return verifyAmountTwo;
    }

    /**
     * Sets the value of the verifyAmountTwo property.
     * 
     */
    public void setVerifyAmountTwo(double value) {
        this.verifyAmountTwo = value;
    }

    /**
     * Gets the value of the verifyTryCount property.
     * 
     */
    public int getVerifyTryCount() {
        return verifyTryCount;
    }

    /**
     * Sets the value of the verifyTryCount property.
     * 
     */
    public void setVerifyTryCount(int value) {
        this.verifyTryCount = value;
    }

    /**
     * Gets the value of the expireDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpireDate() {
        return expireDate;
    }

    /**
     * Sets the value of the expireDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpireDate(XMLGregorianCalendar value) {
        this.expireDate = value;
    }

}
