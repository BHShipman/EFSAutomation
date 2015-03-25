
package service.cards.tch.com.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WSCardDescription complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WSCardDescription">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cardNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="companyXRef" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSCardDescription", propOrder = {
    "cardNumber",
    "companyXRef"
})
public class WSCardDescription {

    @XmlElement(required = true, nillable = true)
    protected String cardNumber;
    @XmlElement(required = true, nillable = true)
    protected String companyXRef;

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

}
