
package service.cards.tch.com.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for WSFleetMemo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WSFleetMemo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cardNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="acceptorName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="authCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tchMemoDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="amount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="contractId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="msgNumType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="bin" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="mcCardNum" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="postedAmount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="atmFee" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="pinSent" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="atmId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="merchType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="stan" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="entryMode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="neverClearedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="mercName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="mercAddr" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="mercZip" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="mercPhone" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="mercState" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="mercCat" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="mercCity" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSFleetMemo", propOrder = {
    "cardNumber",
    "acceptorName",
    "authCode",
    "tchMemoDate",
    "amount",
    "contractId",
    "msgNumType",
    "type",
    "bin",
    "mcCardNum",
    "postedAmount",
    "atmFee",
    "pinSent",
    "atmId",
    "merchType",
    "stan",
    "entryMode",
    "neverClearedDate",
    "mercName",
    "mercAddr",
    "mercZip",
    "mercPhone",
    "mercState",
    "mercCat",
    "mercCity"
})
public class WSFleetMemo {

    @XmlElement(required = true)
    protected String cardNumber;
    @XmlElement(required = true, nillable = true)
    protected String acceptorName;
    @XmlElement(required = true, nillable = true)
    protected String authCode;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar tchMemoDate;
    protected int amount;
    protected int contractId;
    protected int msgNumType;
    protected int type;
    protected int bin;
    @XmlElement(required = true, nillable = true)
    protected String mcCardNum;
    protected int postedAmount;
    protected int atmFee;
    protected int pinSent;
    @XmlElement(required = true, nillable = true)
    protected String atmId;
    protected int merchType;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer stan;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer entryMode;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar neverClearedDate;
    @XmlElement(required = true, nillable = true)
    protected String mercName;
    @XmlElement(required = true, nillable = true)
    protected String mercAddr;
    @XmlElement(required = true, nillable = true)
    protected String mercZip;
    @XmlElement(required = true, nillable = true)
    protected String mercPhone;
    @XmlElement(required = true, nillable = true)
    protected String mercState;
    @XmlElement(required = true, nillable = true)
    protected String mercCat;
    @XmlElement(required = true, nillable = true)
    protected String mercCity;

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
     * Gets the value of the acceptorName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcceptorName() {
        return acceptorName;
    }

    /**
     * Sets the value of the acceptorName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcceptorName(String value) {
        this.acceptorName = value;
    }

    /**
     * Gets the value of the authCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthCode() {
        return authCode;
    }

    /**
     * Sets the value of the authCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthCode(String value) {
        this.authCode = value;
    }

    /**
     * Gets the value of the tchMemoDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTchMemoDate() {
        return tchMemoDate;
    }

    /**
     * Sets the value of the tchMemoDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTchMemoDate(XMLGregorianCalendar value) {
        this.tchMemoDate = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     */
    public int getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     */
    public void setAmount(int value) {
        this.amount = value;
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
     * Gets the value of the msgNumType property.
     * 
     */
    public int getMsgNumType() {
        return msgNumType;
    }

    /**
     * Sets the value of the msgNumType property.
     * 
     */
    public void setMsgNumType(int value) {
        this.msgNumType = value;
    }

    /**
     * Gets the value of the type property.
     * 
     */
    public int getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     */
    public void setType(int value) {
        this.type = value;
    }

    /**
     * Gets the value of the bin property.
     * 
     */
    public int getBin() {
        return bin;
    }

    /**
     * Sets the value of the bin property.
     * 
     */
    public void setBin(int value) {
        this.bin = value;
    }

    /**
     * Gets the value of the mcCardNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMcCardNum() {
        return mcCardNum;
    }

    /**
     * Sets the value of the mcCardNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMcCardNum(String value) {
        this.mcCardNum = value;
    }

    /**
     * Gets the value of the postedAmount property.
     * 
     */
    public int getPostedAmount() {
        return postedAmount;
    }

    /**
     * Sets the value of the postedAmount property.
     * 
     */
    public void setPostedAmount(int value) {
        this.postedAmount = value;
    }

    /**
     * Gets the value of the atmFee property.
     * 
     */
    public int getAtmFee() {
        return atmFee;
    }

    /**
     * Sets the value of the atmFee property.
     * 
     */
    public void setAtmFee(int value) {
        this.atmFee = value;
    }

    /**
     * Gets the value of the pinSent property.
     * 
     */
    public int getPinSent() {
        return pinSent;
    }

    /**
     * Sets the value of the pinSent property.
     * 
     */
    public void setPinSent(int value) {
        this.pinSent = value;
    }

    /**
     * Gets the value of the atmId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAtmId() {
        return atmId;
    }

    /**
     * Sets the value of the atmId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAtmId(String value) {
        this.atmId = value;
    }

    /**
     * Gets the value of the merchType property.
     * 
     */
    public int getMerchType() {
        return merchType;
    }

    /**
     * Sets the value of the merchType property.
     * 
     */
    public void setMerchType(int value) {
        this.merchType = value;
    }

    /**
     * Gets the value of the stan property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getStan() {
        return stan;
    }

    /**
     * Sets the value of the stan property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setStan(Integer value) {
        this.stan = value;
    }

    /**
     * Gets the value of the entryMode property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEntryMode() {
        return entryMode;
    }

    /**
     * Sets the value of the entryMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEntryMode(Integer value) {
        this.entryMode = value;
    }

    /**
     * Gets the value of the neverClearedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getNeverClearedDate() {
        return neverClearedDate;
    }

    /**
     * Sets the value of the neverClearedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setNeverClearedDate(XMLGregorianCalendar value) {
        this.neverClearedDate = value;
    }

    /**
     * Gets the value of the mercName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMercName() {
        return mercName;
    }

    /**
     * Sets the value of the mercName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMercName(String value) {
        this.mercName = value;
    }

    /**
     * Gets the value of the mercAddr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMercAddr() {
        return mercAddr;
    }

    /**
     * Sets the value of the mercAddr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMercAddr(String value) {
        this.mercAddr = value;
    }

    /**
     * Gets the value of the mercZip property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMercZip() {
        return mercZip;
    }

    /**
     * Sets the value of the mercZip property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMercZip(String value) {
        this.mercZip = value;
    }

    /**
     * Gets the value of the mercPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMercPhone() {
        return mercPhone;
    }

    /**
     * Sets the value of the mercPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMercPhone(String value) {
        this.mercPhone = value;
    }

    /**
     * Gets the value of the mercState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMercState() {
        return mercState;
    }

    /**
     * Sets the value of the mercState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMercState(String value) {
        this.mercState = value;
    }

    /**
     * Gets the value of the mercCat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMercCat() {
        return mercCat;
    }

    /**
     * Sets the value of the mercCat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMercCat(String value) {
        this.mercCat = value;
    }

    /**
     * Gets the value of the mercCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMercCity() {
        return mercCity;
    }

    /**
     * Sets the value of the mercCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMercCity(String value) {
        this.mercCity = value;
    }

}
