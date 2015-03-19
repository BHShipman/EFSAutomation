
package service.cards.tch.com.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for WSTransTaxes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WSTransTaxes">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="taxDescription" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="grossNetFlag" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="amount" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="taxClass" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="deferralDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="exemptFlag" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="taxCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSTransTaxes", propOrder = {
    "taxDescription",
    "grossNetFlag",
    "amount",
    "taxClass",
    "deferralDate",
    "exemptFlag",
    "taxCode"
})
public class WSTransTaxes {

    @XmlElement(required = true)
    protected String taxDescription;
    @XmlElement(required = true)
    protected String grossNetFlag;
    protected double amount;
    @XmlElement(required = true, nillable = true)
    protected String taxClass;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar deferralDate;
    @XmlElement(required = true, nillable = true)
    protected String exemptFlag;
    @XmlElement(required = true, nillable = true)
    protected String taxCode;

    /**
     * Gets the value of the taxDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxDescription() {
        return taxDescription;
    }

    /**
     * Sets the value of the taxDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxDescription(String value) {
        this.taxDescription = value;
    }

    /**
     * Gets the value of the grossNetFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGrossNetFlag() {
        return grossNetFlag;
    }

    /**
     * Sets the value of the grossNetFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGrossNetFlag(String value) {
        this.grossNetFlag = value;
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
     * Gets the value of the taxClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxClass() {
        return taxClass;
    }

    /**
     * Sets the value of the taxClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxClass(String value) {
        this.taxClass = value;
    }

    /**
     * Gets the value of the deferralDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDeferralDate() {
        return deferralDate;
    }

    /**
     * Sets the value of the deferralDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDeferralDate(XMLGregorianCalendar value) {
        this.deferralDate = value;
    }

    /**
     * Gets the value of the exemptFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExemptFlag() {
        return exemptFlag;
    }

    /**
     * Sets the value of the exemptFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExemptFlag(String value) {
        this.exemptFlag = value;
    }

    /**
     * Gets the value of the taxCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxCode() {
        return taxCode;
    }

    /**
     * Sets the value of the taxCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxCode(String value) {
        this.taxCode = value;
    }

}
