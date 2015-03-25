
package service.cards.tch.com.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for WSCashRecord complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WSCashRecord">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="amount" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="cardNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="cashId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="date" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="refNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="transactionId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSCashRecord", propOrder = {
    "amount",
    "cardNumber",
    "cashId",
    "date",
    "name",
    "refNumber",
    "transactionId"
})
public class WSCashRecord {

    protected double amount;
    @XmlElement(required = true, nillable = true)
    protected String cardNumber;
    @XmlElement(required = true, nillable = true)
    protected String cashId;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar date;
    @XmlElement(required = true, nillable = true)
    protected String name;
    @XmlElement(required = true, nillable = true)
    protected String refNumber;
    protected int transactionId;

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
     * Gets the value of the cashId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCashId() {
        return cashId;
    }

    /**
     * Sets the value of the cashId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCashId(String value) {
        this.cashId = value;
    }

    /**
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDate(XMLGregorianCalendar value) {
        this.date = value;
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
     * Gets the value of the refNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefNumber() {
        return refNumber;
    }

    /**
     * Sets the value of the refNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefNumber(String value) {
        this.refNumber = value;
    }

    /**
     * Gets the value of the transactionId property.
     * 
     */
    public int getTransactionId() {
        return transactionId;
    }

    /**
     * Sets the value of the transactionId property.
     * 
     */
    public void setTransactionId(int value) {
        this.transactionId = value;
    }

}
