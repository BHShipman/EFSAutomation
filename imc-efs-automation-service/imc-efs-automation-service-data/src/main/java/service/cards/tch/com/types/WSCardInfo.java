
package service.cards.tch.com.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WSCardInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WSCardInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="infoId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="lengthCheck" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="matchValue" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="maximum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="minimum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="reportValue" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="validationType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSCardInfo", propOrder = {
    "infoId",
    "lengthCheck",
    "matchValue",
    "maximum",
    "minimum",
    "reportValue",
    "validationType",
    "value"
})
public class WSCardInfo {

    @XmlElement(required = true, nillable = true)
    protected String infoId;
    protected boolean lengthCheck;
    @XmlElement(required = true, nillable = true)
    protected String matchValue;
    protected int maximum;
    protected int minimum;
    @XmlElement(required = true, nillable = true)
    protected String reportValue;
    @XmlElement(required = true, nillable = true)
    protected String validationType;
    protected int value;

    /**
     * Gets the value of the infoId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInfoId() {
        return infoId;
    }

    /**
     * Sets the value of the infoId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInfoId(String value) {
        this.infoId = value;
    }

    /**
     * Gets the value of the lengthCheck property.
     * 
     */
    public boolean isLengthCheck() {
        return lengthCheck;
    }

    /**
     * Sets the value of the lengthCheck property.
     * 
     */
    public void setLengthCheck(boolean value) {
        this.lengthCheck = value;
    }

    /**
     * Gets the value of the matchValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMatchValue() {
        return matchValue;
    }

    /**
     * Sets the value of the matchValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMatchValue(String value) {
        this.matchValue = value;
    }

    /**
     * Gets the value of the maximum property.
     * 
     */
    public int getMaximum() {
        return maximum;
    }

    /**
     * Sets the value of the maximum property.
     * 
     */
    public void setMaximum(int value) {
        this.maximum = value;
    }

    /**
     * Gets the value of the minimum property.
     * 
     */
    public int getMinimum() {
        return minimum;
    }

    /**
     * Sets the value of the minimum property.
     * 
     */
    public void setMinimum(int value) {
        this.minimum = value;
    }

    /**
     * Gets the value of the reportValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReportValue() {
        return reportValue;
    }

    /**
     * Sets the value of the reportValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReportValue(String value) {
        this.reportValue = value;
    }

    /**
     * Gets the value of the validationType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidationType() {
        return validationType;
    }

    /**
     * Sets the value of the validationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidationType(String value) {
        this.validationType = value;
    }

    /**
     * Gets the value of the value property.
     * 
     */
    public int getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     */
    public void setValue(int value) {
        this.value = value;
    }

}
