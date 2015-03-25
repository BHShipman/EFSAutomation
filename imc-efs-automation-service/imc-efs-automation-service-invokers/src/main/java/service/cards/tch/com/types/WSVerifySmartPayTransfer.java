
package service.cards.tch.com.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WSVerifySmartPayTransfer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WSVerifySmartPayTransfer">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="transferAccountId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="verifyAmt1" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="verifyAmt2" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSVerifySmartPayTransfer", propOrder = {
    "transferAccountId",
    "verifyAmt1",
    "verifyAmt2"
})
public class WSVerifySmartPayTransfer {

    protected int transferAccountId;
    protected double verifyAmt1;
    protected double verifyAmt2;

    /**
     * Gets the value of the transferAccountId property.
     * 
     */
    public int getTransferAccountId() {
        return transferAccountId;
    }

    /**
     * Sets the value of the transferAccountId property.
     * 
     */
    public void setTransferAccountId(int value) {
        this.transferAccountId = value;
    }

    /**
     * Gets the value of the verifyAmt1 property.
     * 
     */
    public double getVerifyAmt1() {
        return verifyAmt1;
    }

    /**
     * Sets the value of the verifyAmt1 property.
     * 
     */
    public void setVerifyAmt1(double value) {
        this.verifyAmt1 = value;
    }

    /**
     * Gets the value of the verifyAmt2 property.
     * 
     */
    public double getVerifyAmt2() {
        return verifyAmt2;
    }

    /**
     * Sets the value of the verifyAmt2 property.
     * 
     */
    public void setVerifyAmt2(double value) {
        this.verifyAmt2 = value;
    }

}
