
package service.cards.tch.com.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WSTransSummary complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WSTransSummary">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tranCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="tranTotal" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSTransSummary", propOrder = {
    "tranCount",
    "tranTotal"
})
public class WSTransSummary {

    protected int tranCount;
    protected double tranTotal;

    /**
     * Gets the value of the tranCount property.
     * 
     */
    public int getTranCount() {
        return tranCount;
    }

    /**
     * Sets the value of the tranCount property.
     * 
     */
    public void setTranCount(int value) {
        this.tranCount = value;
    }

    /**
     * Gets the value of the tranTotal property.
     * 
     */
    public double getTranTotal() {
        return tranTotal;
    }

    /**
     * Sets the value of the tranTotal property.
     * 
     */
    public void setTranTotal(double value) {
        this.tranTotal = value;
    }

}
