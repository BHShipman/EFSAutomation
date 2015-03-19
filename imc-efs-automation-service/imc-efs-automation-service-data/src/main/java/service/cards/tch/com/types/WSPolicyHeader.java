
package service.cards.tch.com.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WSPolicyHeader complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WSPolicyHeader">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="contractId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="handEnter" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="payrollContractId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="payrollAtm" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="payrollChk" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="payrollAch" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="payrollWire" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="payrollDebit" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSPolicyHeader", propOrder = {
    "contractId",
    "description",
    "handEnter",
    "payrollContractId",
    "payrollAtm",
    "payrollChk",
    "payrollAch",
    "payrollWire",
    "payrollDebit"
})
public class WSPolicyHeader {

    protected int contractId;
    @XmlElement(required = true, nillable = true)
    protected String description;
    protected boolean handEnter;
    protected int payrollContractId;
    protected boolean payrollAtm;
    protected boolean payrollChk;
    protected boolean payrollAch;
    protected boolean payrollWire;
    protected boolean payrollDebit;

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
     * Gets the value of the handEnter property.
     * 
     */
    public boolean isHandEnter() {
        return handEnter;
    }

    /**
     * Sets the value of the handEnter property.
     * 
     */
    public void setHandEnter(boolean value) {
        this.handEnter = value;
    }

    /**
     * Gets the value of the payrollContractId property.
     * 
     */
    public int getPayrollContractId() {
        return payrollContractId;
    }

    /**
     * Sets the value of the payrollContractId property.
     * 
     */
    public void setPayrollContractId(int value) {
        this.payrollContractId = value;
    }

    /**
     * Gets the value of the payrollAtm property.
     * 
     */
    public boolean isPayrollAtm() {
        return payrollAtm;
    }

    /**
     * Sets the value of the payrollAtm property.
     * 
     */
    public void setPayrollAtm(boolean value) {
        this.payrollAtm = value;
    }

    /**
     * Gets the value of the payrollChk property.
     * 
     */
    public boolean isPayrollChk() {
        return payrollChk;
    }

    /**
     * Sets the value of the payrollChk property.
     * 
     */
    public void setPayrollChk(boolean value) {
        this.payrollChk = value;
    }

    /**
     * Gets the value of the payrollAch property.
     * 
     */
    public boolean isPayrollAch() {
        return payrollAch;
    }

    /**
     * Sets the value of the payrollAch property.
     * 
     */
    public void setPayrollAch(boolean value) {
        this.payrollAch = value;
    }

    /**
     * Gets the value of the payrollWire property.
     * 
     */
    public boolean isPayrollWire() {
        return payrollWire;
    }

    /**
     * Sets the value of the payrollWire property.
     * 
     */
    public void setPayrollWire(boolean value) {
        this.payrollWire = value;
    }

    /**
     * Gets the value of the payrollDebit property.
     * 
     */
    public boolean isPayrollDebit() {
        return payrollDebit;
    }

    /**
     * Sets the value of the payrollDebit property.
     * 
     */
    public void setPayrollDebit(boolean value) {
        this.payrollDebit = value;
    }

}
