
package service.cards.tch.com.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WSMoneyCodeSummary complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WSMoneyCodeSummary">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="mcCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="mcTotal" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="mcUsedTotal" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSMoneyCodeSummary", propOrder = {
    "mcCount",
    "mcTotal",
    "mcUsedTotal"
})
public class WSMoneyCodeSummary {

    protected int mcCount;
    protected double mcTotal;
    protected double mcUsedTotal;

    /**
     * Gets the value of the mcCount property.
     * 
     */
    public int getMcCount() {
        return mcCount;
    }

    /**
     * Sets the value of the mcCount property.
     * 
     */
    public void setMcCount(int value) {
        this.mcCount = value;
    }

    /**
     * Gets the value of the mcTotal property.
     * 
     */
    public double getMcTotal() {
        return mcTotal;
    }

    /**
     * Sets the value of the mcTotal property.
     * 
     */
    public void setMcTotal(double value) {
        this.mcTotal = value;
    }

    /**
     * Gets the value of the mcUsedTotal property.
     * 
     */
    public double getMcUsedTotal() {
        return mcUsedTotal;
    }

    /**
     * Sets the value of the mcUsedTotal property.
     * 
     */
    public void setMcUsedTotal(double value) {
        this.mcUsedTotal = value;
    }

}
