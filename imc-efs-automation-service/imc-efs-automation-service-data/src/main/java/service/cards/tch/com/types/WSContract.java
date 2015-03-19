
package service.cards.tch.com.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WSContract complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WSContract">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="checkFee" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="contractId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="country" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="currency" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="issuerId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="limitMethod" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="masterContract" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSContract", propOrder = {
    "checkFee",
    "contractId",
    "country",
    "currency",
    "description",
    "issuerId",
    "limitMethod",
    "masterContract",
    "status"
})
public class WSContract {

    protected double checkFee;
    protected int contractId;
    @XmlElement(required = true, nillable = true)
    protected String country;
    @XmlElement(required = true, nillable = true)
    protected String currency;
    @XmlElement(required = true, nillable = true)
    protected String description;
    protected int issuerId;
    protected int limitMethod;
    protected boolean masterContract;
    @XmlElement(required = true, nillable = true)
    protected String status;

    /**
     * Gets the value of the checkFee property.
     * 
     */
    public double getCheckFee() {
        return checkFee;
    }

    /**
     * Sets the value of the checkFee property.
     * 
     */
    public void setCheckFee(double value) {
        this.checkFee = value;
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
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountry(String value) {
        this.country = value;
    }

    /**
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrency(String value) {
        this.currency = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the issuerId property.
     * 
     */
    public int getIssuerId() {
        return issuerId;
    }

    /**
     * Sets the value of the issuerId property.
     * 
     */
    public void setIssuerId(int value) {
        this.issuerId = value;
    }

    /**
     * Gets the value of the limitMethod property.
     * 
     */
    public int getLimitMethod() {
        return limitMethod;
    }

    /**
     * Sets the value of the limitMethod property.
     * 
     */
    public void setLimitMethod(int value) {
        this.limitMethod = value;
    }

    /**
     * Gets the value of the masterContract property.
     * 
     */
    public boolean isMasterContract() {
        return masterContract;
    }

    /**
     * Sets the value of the masterContract property.
     * 
     */
    public void setMasterContract(boolean value) {
        this.masterContract = value;
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

}
