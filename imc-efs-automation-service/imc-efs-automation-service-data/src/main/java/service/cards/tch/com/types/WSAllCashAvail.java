
package service.cards.tch.com.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WSAllCashAvail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WSAllCashAvail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cardNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="oneTimeCash" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="recurringCash" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="contractLimit" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="cashAvailable" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSAllCashAvail", propOrder = {
    "cardNumber",
    "oneTimeCash",
    "recurringCash",
    "contractLimit",
    "cashAvailable"
})
public class WSAllCashAvail {

    @XmlElement(required = true)
    protected String cardNumber;
    protected double oneTimeCash;
    protected double recurringCash;
    protected double contractLimit;
    protected double cashAvailable;

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
     * Gets the value of the oneTimeCash property.
     * 
     */
    public double getOneTimeCash() {
        return oneTimeCash;
    }

    /**
     * Sets the value of the oneTimeCash property.
     * 
     */
    public void setOneTimeCash(double value) {
        this.oneTimeCash = value;
    }

    /**
     * Gets the value of the recurringCash property.
     * 
     */
    public double getRecurringCash() {
        return recurringCash;
    }

    /**
     * Sets the value of the recurringCash property.
     * 
     */
    public void setRecurringCash(double value) {
        this.recurringCash = value;
    }

    /**
     * Gets the value of the contractLimit property.
     * 
     */
    public double getContractLimit() {
        return contractLimit;
    }

    /**
     * Sets the value of the contractLimit property.
     * 
     */
    public void setContractLimit(double value) {
        this.contractLimit = value;
    }

    /**
     * Gets the value of the cashAvailable property.
     * 
     */
    public double getCashAvailable() {
        return cashAvailable;
    }

    /**
     * Sets the value of the cashAvailable property.
     * 
     */
    public void setCashAvailable(double value) {
        this.cashAvailable = value;
    }

}
