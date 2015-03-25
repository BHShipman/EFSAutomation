
package service.cards.tch.com.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WSRegisterCheckAuthorization complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WSRegisterCheckAuthorization">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cardNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="checkNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="dollarAmount" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="fromUniversal" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSRegisterCheckAuthorization", propOrder = {
    "cardNumber",
    "checkNumber",
    "dollarAmount",
    "fromUniversal"
})
public class WSRegisterCheckAuthorization {

    @XmlElement(required = true)
    protected String cardNumber;
    @XmlElement(required = true, nillable = true)
    protected String checkNumber;
    @XmlElement(required = true, type = Double.class, nillable = true)
    protected Double dollarAmount;
    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean fromUniversal;

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
     * Gets the value of the checkNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCheckNumber() {
        return checkNumber;
    }

    /**
     * Sets the value of the checkNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCheckNumber(String value) {
        this.checkNumber = value;
    }

    /**
     * Gets the value of the dollarAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDollarAmount() {
        return dollarAmount;
    }

    /**
     * Sets the value of the dollarAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDollarAmount(Double value) {
        this.dollarAmount = value;
    }

    /**
     * Gets the value of the fromUniversal property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFromUniversal() {
        return fromUniversal;
    }

    /**
     * Sets the value of the fromUniversal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFromUniversal(Boolean value) {
        this.fromUniversal = value;
    }

}
