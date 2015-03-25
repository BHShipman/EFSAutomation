
package service.cards.tch.com.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WSTransactionLineItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WSTransactionLineItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="amount" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="billingFlag" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="category" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="cmptAmount" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="cmptPPU" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="discAmount" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="fuelType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="groupCategory" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="groupNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="issuerDeal" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="issuerDealPPU" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="lineNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="number" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ppu" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="prodCD" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="quantity" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="retailPPU" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="serviceType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="useType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSTransactionLineItem", propOrder = {
    "amount",
    "billingFlag",
    "category",
    "cmptAmount",
    "cmptPPU",
    "discAmount",
    "fuelType",
    "groupCategory",
    "groupNumber",
    "issuerDeal",
    "issuerDealPPU",
    "lineNumber",
    "number",
    "ppu",
    "prodCD",
    "quantity",
    "retailPPU",
    "serviceType",
    "useType"
})
public class WSTransactionLineItem {

    protected double amount;
    protected int billingFlag;
    @XmlElement(required = true, nillable = true)
    protected String category;
    protected double cmptAmount;
    protected double cmptPPU;
    protected double discAmount;
    protected int fuelType;
    @XmlElement(required = true, nillable = true)
    protected String groupCategory;
    protected int groupNumber;
    protected double issuerDeal;
    protected double issuerDealPPU;
    protected int lineNumber;
    protected int number;
    protected double ppu;
    @XmlElement(required = true, nillable = true)
    protected String prodCD;
    protected double quantity;
    protected double retailPPU;
    protected int serviceType;
    protected int useType;

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
     * Gets the value of the billingFlag property.
     * 
     */
    public int getBillingFlag() {
        return billingFlag;
    }

    /**
     * Sets the value of the billingFlag property.
     * 
     */
    public void setBillingFlag(int value) {
        this.billingFlag = value;
    }

    /**
     * Gets the value of the category property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategory() {
        return category;
    }

    /**
     * Sets the value of the category property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategory(String value) {
        this.category = value;
    }

    /**
     * Gets the value of the cmptAmount property.
     * 
     */
    public double getCmptAmount() {
        return cmptAmount;
    }

    /**
     * Sets the value of the cmptAmount property.
     * 
     */
    public void setCmptAmount(double value) {
        this.cmptAmount = value;
    }

    /**
     * Gets the value of the cmptPPU property.
     * 
     */
    public double getCmptPPU() {
        return cmptPPU;
    }

    /**
     * Sets the value of the cmptPPU property.
     * 
     */
    public void setCmptPPU(double value) {
        this.cmptPPU = value;
    }

    /**
     * Gets the value of the discAmount property.
     * 
     */
    public double getDiscAmount() {
        return discAmount;
    }

    /**
     * Sets the value of the discAmount property.
     * 
     */
    public void setDiscAmount(double value) {
        this.discAmount = value;
    }

    /**
     * Gets the value of the fuelType property.
     * 
     */
    public int getFuelType() {
        return fuelType;
    }

    /**
     * Sets the value of the fuelType property.
     * 
     */
    public void setFuelType(int value) {
        this.fuelType = value;
    }

    /**
     * Gets the value of the groupCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupCategory() {
        return groupCategory;
    }

    /**
     * Sets the value of the groupCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupCategory(String value) {
        this.groupCategory = value;
    }

    /**
     * Gets the value of the groupNumber property.
     * 
     */
    public int getGroupNumber() {
        return groupNumber;
    }

    /**
     * Sets the value of the groupNumber property.
     * 
     */
    public void setGroupNumber(int value) {
        this.groupNumber = value;
    }

    /**
     * Gets the value of the issuerDeal property.
     * 
     */
    public double getIssuerDeal() {
        return issuerDeal;
    }

    /**
     * Sets the value of the issuerDeal property.
     * 
     */
    public void setIssuerDeal(double value) {
        this.issuerDeal = value;
    }

    /**
     * Gets the value of the issuerDealPPU property.
     * 
     */
    public double getIssuerDealPPU() {
        return issuerDealPPU;
    }

    /**
     * Sets the value of the issuerDealPPU property.
     * 
     */
    public void setIssuerDealPPU(double value) {
        this.issuerDealPPU = value;
    }

    /**
     * Gets the value of the lineNumber property.
     * 
     */
    public int getLineNumber() {
        return lineNumber;
    }

    /**
     * Sets the value of the lineNumber property.
     * 
     */
    public void setLineNumber(int value) {
        this.lineNumber = value;
    }

    /**
     * Gets the value of the number property.
     * 
     */
    public int getNumber() {
        return number;
    }

    /**
     * Sets the value of the number property.
     * 
     */
    public void setNumber(int value) {
        this.number = value;
    }

    /**
     * Gets the value of the ppu property.
     * 
     */
    public double getPpu() {
        return ppu;
    }

    /**
     * Sets the value of the ppu property.
     * 
     */
    public void setPpu(double value) {
        this.ppu = value;
    }

    /**
     * Gets the value of the prodCD property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProdCD() {
        return prodCD;
    }

    /**
     * Sets the value of the prodCD property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProdCD(String value) {
        this.prodCD = value;
    }

    /**
     * Gets the value of the quantity property.
     * 
     */
    public double getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     */
    public void setQuantity(double value) {
        this.quantity = value;
    }

    /**
     * Gets the value of the retailPPU property.
     * 
     */
    public double getRetailPPU() {
        return retailPPU;
    }

    /**
     * Sets the value of the retailPPU property.
     * 
     */
    public void setRetailPPU(double value) {
        this.retailPPU = value;
    }

    /**
     * Gets the value of the serviceType property.
     * 
     */
    public int getServiceType() {
        return serviceType;
    }

    /**
     * Sets the value of the serviceType property.
     * 
     */
    public void setServiceType(int value) {
        this.serviceType = value;
    }

    /**
     * Gets the value of the useType property.
     * 
     */
    public int getUseType() {
        return useType;
    }

    /**
     * Sets the value of the useType property.
     * 
     */
    public void setUseType(int value) {
        this.useType = value;
    }

}
