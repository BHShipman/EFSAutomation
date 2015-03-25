
package service.cards.tch.com.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WSCreditLimits complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WSCreditLimits">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="contractStatus" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="transLimit" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="origLimit" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="creditAvailable" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="dailyLimit" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="dailyAvailable" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="totalAvailable" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="maxMoneyCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="uom" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSCreditLimits", propOrder = {
    "contractStatus",
    "transLimit",
    "origLimit",
    "creditAvailable",
    "dailyLimit",
    "dailyAvailable",
    "totalAvailable",
    "maxMoneyCode",
    "uom"
})
public class WSCreditLimits {

    @XmlElement(required = true)
    protected String contractStatus;
    protected double transLimit;
    protected double origLimit;
    protected double creditAvailable;
    protected double dailyLimit;
    protected double dailyAvailable;
    protected double totalAvailable;
    protected int maxMoneyCode;
    @XmlElement(required = true)
    protected String uom;

    /**
     * Gets the value of the contractStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContractStatus() {
        return contractStatus;
    }

    /**
     * Sets the value of the contractStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContractStatus(String value) {
        this.contractStatus = value;
    }

    /**
     * Gets the value of the transLimit property.
     * 
     */
    public double getTransLimit() {
        return transLimit;
    }

    /**
     * Sets the value of the transLimit property.
     * 
     */
    public void setTransLimit(double value) {
        this.transLimit = value;
    }

    /**
     * Gets the value of the origLimit property.
     * 
     */
    public double getOrigLimit() {
        return origLimit;
    }

    /**
     * Sets the value of the origLimit property.
     * 
     */
    public void setOrigLimit(double value) {
        this.origLimit = value;
    }

    /**
     * Gets the value of the creditAvailable property.
     * 
     */
    public double getCreditAvailable() {
        return creditAvailable;
    }

    /**
     * Sets the value of the creditAvailable property.
     * 
     */
    public void setCreditAvailable(double value) {
        this.creditAvailable = value;
    }

    /**
     * Gets the value of the dailyLimit property.
     * 
     */
    public double getDailyLimit() {
        return dailyLimit;
    }

    /**
     * Sets the value of the dailyLimit property.
     * 
     */
    public void setDailyLimit(double value) {
        this.dailyLimit = value;
    }

    /**
     * Gets the value of the dailyAvailable property.
     * 
     */
    public double getDailyAvailable() {
        return dailyAvailable;
    }

    /**
     * Sets the value of the dailyAvailable property.
     * 
     */
    public void setDailyAvailable(double value) {
        this.dailyAvailable = value;
    }

    /**
     * Gets the value of the totalAvailable property.
     * 
     */
    public double getTotalAvailable() {
        return totalAvailable;
    }

    /**
     * Sets the value of the totalAvailable property.
     * 
     */
    public void setTotalAvailable(double value) {
        this.totalAvailable = value;
    }

    /**
     * Gets the value of the maxMoneyCode property.
     * 
     */
    public int getMaxMoneyCode() {
        return maxMoneyCode;
    }

    /**
     * Sets the value of the maxMoneyCode property.
     * 
     */
    public void setMaxMoneyCode(int value) {
        this.maxMoneyCode = value;
    }

    /**
     * Gets the value of the uom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUom() {
        return uom;
    }

    /**
     * Sets the value of the uom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUom(String value) {
        this.uom = value;
    }

}
