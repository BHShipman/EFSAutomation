
package service.cards.tch.com.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WSPolicyLimit complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WSPolicyLimit">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="hours" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="limit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="limitId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="minHours" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="autoRollMap" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="autoRollMax" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSPolicyLimit", propOrder = {
    "hours",
    "limit",
    "limitId",
    "minHours",
    "autoRollMap",
    "autoRollMax"
})
public class WSPolicyLimit {

    protected int hours;
    protected int limit;
    @XmlElement(required = true, nillable = true)
    protected String limitId;
    protected int minHours;
    protected int autoRollMap;
    protected int autoRollMax;

    /**
     * Gets the value of the hours property.
     * 
     */
    public int getHours() {
        return hours;
    }

    /**
     * Sets the value of the hours property.
     * 
     */
    public void setHours(int value) {
        this.hours = value;
    }

    /**
     * Gets the value of the limit property.
     * 
     */
    public int getLimit() {
        return limit;
    }

    /**
     * Sets the value of the limit property.
     * 
     */
    public void setLimit(int value) {
        this.limit = value;
    }

    /**
     * Gets the value of the limitId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLimitId() {
        return limitId;
    }

    /**
     * Sets the value of the limitId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLimitId(String value) {
        this.limitId = value;
    }

    /**
     * Gets the value of the minHours property.
     * 
     */
    public int getMinHours() {
        return minHours;
    }

    /**
     * Sets the value of the minHours property.
     * 
     */
    public void setMinHours(int value) {
        this.minHours = value;
    }

    /**
     * Gets the value of the autoRollMap property.
     * 
     */
    public int getAutoRollMap() {
        return autoRollMap;
    }

    /**
     * Sets the value of the autoRollMap property.
     * 
     */
    public void setAutoRollMap(int value) {
        this.autoRollMap = value;
    }

    /**
     * Gets the value of the autoRollMax property.
     * 
     */
    public int getAutoRollMax() {
        return autoRollMax;
    }

    /**
     * Sets the value of the autoRollMax property.
     * 
     */
    public void setAutoRollMax(int value) {
        this.autoRollMax = value;
    }

}
