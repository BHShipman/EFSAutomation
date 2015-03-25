
package service.cards.tch.com.types;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for WSTransactionExt complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WSTransactionExt">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ARBatchNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="CPNRDeliveryTP" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="MCMultiCurrency" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="OPDataSource" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="POSDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="accountType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="arNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="authCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="billingCountry" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="billingCurrency" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="cardNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="carmsStatements" type="{http://com.tch.cards.service/types}WSTransactionCarmsStmt" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="carrierFee" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="carrierId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="companyXRef" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="contractId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="conversionRate" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="country" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="discAmount" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="discType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="fleetMemo" type="{http://com.tch.cards.service/types}WSFleetMemo"/>
 *         &lt;element name="fundedTotal" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="handEntered" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="inAddress" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="infos" type="{http://com.tch.cards.service/types}WSTransactionInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="invoice" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="issuerDeal" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="issuerFee" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="issuerId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="language" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="lineItems" type="{http://com.tch.cards.service/types}WSTransactionLineItemExt" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="locationCountry" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="locationCurrency" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="locationId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="messageDLVD" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="metaData" type="{http://com.tch.cards.service/types}WSMetaData" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="netTotal" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="nonAreaFee" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="override" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="postDiscTax" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="preDiscTax" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="prefTotal" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="reportedCarrier" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="settleAmount" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="settleId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="splitBilling" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="statementId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="supplierId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="suprFee" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="taxExemptAmount" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="terminalId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="terminalType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="transReported" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="transactionDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="transactionId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="transactionType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="transTaxes" type="{http://com.tch.cards.service/types}WSTransTaxes" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSTransactionExt", propOrder = {
    "arBatchNumber",
    "cpnrDeliveryTP",
    "mcMultiCurrency",
    "opDataSource",
    "posDate",
    "accountType",
    "arNumber",
    "authCode",
    "billingCountry",
    "billingCurrency",
    "cardNumber",
    "carmsStatements",
    "carrierFee",
    "carrierId",
    "companyXRef",
    "contractId",
    "conversionRate",
    "country",
    "discAmount",
    "discType",
    "fleetMemo",
    "fundedTotal",
    "handEntered",
    "inAddress",
    "infos",
    "invoice",
    "issuerDeal",
    "issuerFee",
    "issuerId",
    "language",
    "lineItems",
    "locationCountry",
    "locationCurrency",
    "locationId",
    "messageDLVD",
    "metaData",
    "netTotal",
    "nonAreaFee",
    "override",
    "postDiscTax",
    "preDiscTax",
    "prefTotal",
    "reportedCarrier",
    "settleAmount",
    "settleId",
    "splitBilling",
    "statementId",
    "supplierId",
    "suprFee",
    "taxExemptAmount",
    "terminalId",
    "terminalType",
    "transReported",
    "transactionDate",
    "transactionId",
    "transactionType",
    "transTaxes"
})
public class WSTransactionExt {

    @XmlElement(name = "ARBatchNumber")
    protected int arBatchNumber;
    @XmlElement(name = "CPNRDeliveryTP", required = true, nillable = true)
    protected String cpnrDeliveryTP;
    @XmlElement(name = "MCMultiCurrency")
    protected boolean mcMultiCurrency;
    @XmlElement(name = "OPDataSource", required = true, nillable = true)
    protected String opDataSource;
    @XmlElement(name = "POSDate", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar posDate;
    @XmlElement(required = true, nillable = true)
    protected String accountType;
    @XmlElement(required = true, nillable = true)
    protected String arNumber;
    @XmlElement(required = true, nillable = true)
    protected String authCode;
    protected int billingCountry;
    @XmlElement(required = true, nillable = true)
    protected String billingCurrency;
    @XmlElement(required = true, nillable = true)
    protected String cardNumber;
    @XmlElement(nillable = true)
    protected List<WSTransactionCarmsStmt> carmsStatements;
    protected double carrierFee;
    protected int carrierId;
    @XmlElement(required = true, nillable = true)
    protected String companyXRef;
    protected int contractId;
    protected double conversionRate;
    protected int country;
    protected double discAmount;
    protected int discType;
    @XmlElement(required = true, nillable = true)
    protected WSFleetMemo fleetMemo;
    protected double fundedTotal;
    protected boolean handEntered;
    @XmlElement(required = true, nillable = true)
    protected String inAddress;
    @XmlElement(nillable = true)
    protected List<WSTransactionInfo> infos;
    @XmlElement(required = true, nillable = true)
    protected String invoice;
    protected double issuerDeal;
    protected double issuerFee;
    protected int issuerId;
    protected int language;
    @XmlElement(nillable = true)
    protected List<WSTransactionLineItemExt> lineItems;
    protected int locationCountry;
    @XmlElement(required = true, nillable = true)
    protected String locationCurrency;
    protected int locationId;
    @XmlElement(required = true, nillable = true)
    protected String messageDLVD;
    @XmlElement(nillable = true)
    protected List<WSMetaData> metaData;
    protected double netTotal;
    protected double nonAreaFee;
    protected boolean override;
    protected double postDiscTax;
    protected double preDiscTax;
    protected double prefTotal;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar reportedCarrier;
    protected double settleAmount;
    protected int settleId;
    protected boolean splitBilling;
    protected int statementId;
    protected int supplierId;
    protected double suprFee;
    protected double taxExemptAmount;
    @XmlElement(required = true, nillable = true)
    protected String terminalId;
    @XmlElement(required = true, nillable = true)
    protected String terminalType;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar transReported;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar transactionDate;
    protected int transactionId;
    protected int transactionType;
    @XmlElement(nillable = true)
    protected List<WSTransTaxes> transTaxes;

    /**
     * Gets the value of the arBatchNumber property.
     * 
     */
    public int getARBatchNumber() {
        return arBatchNumber;
    }

    /**
     * Sets the value of the arBatchNumber property.
     * 
     */
    public void setARBatchNumber(int value) {
        this.arBatchNumber = value;
    }

    /**
     * Gets the value of the cpnrDeliveryTP property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCPNRDeliveryTP() {
        return cpnrDeliveryTP;
    }

    /**
     * Sets the value of the cpnrDeliveryTP property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCPNRDeliveryTP(String value) {
        this.cpnrDeliveryTP = value;
    }

    /**
     * Gets the value of the mcMultiCurrency property.
     * 
     */
    public boolean isMCMultiCurrency() {
        return mcMultiCurrency;
    }

    /**
     * Sets the value of the mcMultiCurrency property.
     * 
     */
    public void setMCMultiCurrency(boolean value) {
        this.mcMultiCurrency = value;
    }

    /**
     * Gets the value of the opDataSource property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOPDataSource() {
        return opDataSource;
    }

    /**
     * Sets the value of the opDataSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOPDataSource(String value) {
        this.opDataSource = value;
    }

    /**
     * Gets the value of the posDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPOSDate() {
        return posDate;
    }

    /**
     * Sets the value of the posDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPOSDate(XMLGregorianCalendar value) {
        this.posDate = value;
    }

    /**
     * Gets the value of the accountType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountType() {
        return accountType;
    }

    /**
     * Sets the value of the accountType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountType(String value) {
        this.accountType = value;
    }

    /**
     * Gets the value of the arNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArNumber() {
        return arNumber;
    }

    /**
     * Sets the value of the arNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArNumber(String value) {
        this.arNumber = value;
    }

    /**
     * Gets the value of the authCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthCode() {
        return authCode;
    }

    /**
     * Sets the value of the authCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthCode(String value) {
        this.authCode = value;
    }

    /**
     * Gets the value of the billingCountry property.
     * 
     */
    public int getBillingCountry() {
        return billingCountry;
    }

    /**
     * Sets the value of the billingCountry property.
     * 
     */
    public void setBillingCountry(int value) {
        this.billingCountry = value;
    }

    /**
     * Gets the value of the billingCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillingCurrency() {
        return billingCurrency;
    }

    /**
     * Sets the value of the billingCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillingCurrency(String value) {
        this.billingCurrency = value;
    }

    /**
     * Gets the value of the cardNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardNumber() {
        return cardNumber;
    }

    /**
     * Sets the value of the cardNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardNumber(String value) {
        this.cardNumber = value;
    }

    /**
     * Gets the value of the carmsStatements property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the carmsStatements property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCarmsStatements().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WSTransactionCarmsStmt }
     * 
     * 
     */
    public List<WSTransactionCarmsStmt> getCarmsStatements() {
        if (carmsStatements == null) {
            carmsStatements = new ArrayList<WSTransactionCarmsStmt>();
        }
        return this.carmsStatements;
    }

    /**
     * Gets the value of the carrierFee property.
     * 
     */
    public double getCarrierFee() {
        return carrierFee;
    }

    /**
     * Sets the value of the carrierFee property.
     * 
     */
    public void setCarrierFee(double value) {
        this.carrierFee = value;
    }

    /**
     * Gets the value of the carrierId property.
     * 
     */
    public int getCarrierId() {
        return carrierId;
    }

    /**
     * Sets the value of the carrierId property.
     * 
     */
    public void setCarrierId(int value) {
        this.carrierId = value;
    }

    /**
     * Gets the value of the companyXRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyXRef() {
        return companyXRef;
    }

    /**
     * Sets the value of the companyXRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyXRef(String value) {
        this.companyXRef = value;
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
     * Gets the value of the conversionRate property.
     * 
     */
    public double getConversionRate() {
        return conversionRate;
    }

    /**
     * Sets the value of the conversionRate property.
     * 
     */
    public void setConversionRate(double value) {
        this.conversionRate = value;
    }

    /**
     * Gets the value of the country property.
     * 
     */
    public int getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     */
    public void setCountry(int value) {
        this.country = value;
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
     * Gets the value of the discType property.
     * 
     */
    public int getDiscType() {
        return discType;
    }

    /**
     * Sets the value of the discType property.
     * 
     */
    public void setDiscType(int value) {
        this.discType = value;
    }

    /**
     * Gets the value of the fleetMemo property.
     * 
     * @return
     *     possible object is
     *     {@link WSFleetMemo }
     *     
     */
    public WSFleetMemo getFleetMemo() {
        return fleetMemo;
    }

    /**
     * Sets the value of the fleetMemo property.
     * 
     * @param value
     *     allowed object is
     *     {@link WSFleetMemo }
     *     
     */
    public void setFleetMemo(WSFleetMemo value) {
        this.fleetMemo = value;
    }

    /**
     * Gets the value of the fundedTotal property.
     * 
     */
    public double getFundedTotal() {
        return fundedTotal;
    }

    /**
     * Sets the value of the fundedTotal property.
     * 
     */
    public void setFundedTotal(double value) {
        this.fundedTotal = value;
    }

    /**
     * Gets the value of the handEntered property.
     * 
     */
    public boolean isHandEntered() {
        return handEntered;
    }

    /**
     * Sets the value of the handEntered property.
     * 
     */
    public void setHandEntered(boolean value) {
        this.handEntered = value;
    }

    /**
     * Gets the value of the inAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInAddress() {
        return inAddress;
    }

    /**
     * Sets the value of the inAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInAddress(String value) {
        this.inAddress = value;
    }

    /**
     * Gets the value of the infos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the infos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInfos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WSTransactionInfo }
     * 
     * 
     */
    public List<WSTransactionInfo> getInfos() {
        if (infos == null) {
            infos = new ArrayList<WSTransactionInfo>();
        }
        return this.infos;
    }

    /**
     * Gets the value of the invoice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvoice() {
        return invoice;
    }

    /**
     * Sets the value of the invoice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvoice(String value) {
        this.invoice = value;
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
     * Gets the value of the issuerFee property.
     * 
     */
    public double getIssuerFee() {
        return issuerFee;
    }

    /**
     * Sets the value of the issuerFee property.
     * 
     */
    public void setIssuerFee(double value) {
        this.issuerFee = value;
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
     * Gets the value of the language property.
     * 
     */
    public int getLanguage() {
        return language;
    }

    /**
     * Sets the value of the language property.
     * 
     */
    public void setLanguage(int value) {
        this.language = value;
    }

    /**
     * Gets the value of the lineItems property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lineItems property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLineItems().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WSTransactionLineItemExt }
     * 
     * 
     */
    public List<WSTransactionLineItemExt> getLineItems() {
        if (lineItems == null) {
            lineItems = new ArrayList<WSTransactionLineItemExt>();
        }
        return this.lineItems;
    }

    /**
     * Gets the value of the locationCountry property.
     * 
     */
    public int getLocationCountry() {
        return locationCountry;
    }

    /**
     * Sets the value of the locationCountry property.
     * 
     */
    public void setLocationCountry(int value) {
        this.locationCountry = value;
    }

    /**
     * Gets the value of the locationCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationCurrency() {
        return locationCurrency;
    }

    /**
     * Sets the value of the locationCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationCurrency(String value) {
        this.locationCurrency = value;
    }

    /**
     * Gets the value of the locationId property.
     * 
     */
    public int getLocationId() {
        return locationId;
    }

    /**
     * Sets the value of the locationId property.
     * 
     */
    public void setLocationId(int value) {
        this.locationId = value;
    }

    /**
     * Gets the value of the messageDLVD property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageDLVD() {
        return messageDLVD;
    }

    /**
     * Sets the value of the messageDLVD property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageDLVD(String value) {
        this.messageDLVD = value;
    }

    /**
     * Gets the value of the metaData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the metaData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMetaData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WSMetaData }
     * 
     * 
     */
    public List<WSMetaData> getMetaData() {
        if (metaData == null) {
            metaData = new ArrayList<WSMetaData>();
        }
        return this.metaData;
    }

    /**
     * Gets the value of the netTotal property.
     * 
     */
    public double getNetTotal() {
        return netTotal;
    }

    /**
     * Sets the value of the netTotal property.
     * 
     */
    public void setNetTotal(double value) {
        this.netTotal = value;
    }

    /**
     * Gets the value of the nonAreaFee property.
     * 
     */
    public double getNonAreaFee() {
        return nonAreaFee;
    }

    /**
     * Sets the value of the nonAreaFee property.
     * 
     */
    public void setNonAreaFee(double value) {
        this.nonAreaFee = value;
    }

    /**
     * Gets the value of the override property.
     * 
     */
    public boolean isOverride() {
        return override;
    }

    /**
     * Sets the value of the override property.
     * 
     */
    public void setOverride(boolean value) {
        this.override = value;
    }

    /**
     * Gets the value of the postDiscTax property.
     * 
     */
    public double getPostDiscTax() {
        return postDiscTax;
    }

    /**
     * Sets the value of the postDiscTax property.
     * 
     */
    public void setPostDiscTax(double value) {
        this.postDiscTax = value;
    }

    /**
     * Gets the value of the preDiscTax property.
     * 
     */
    public double getPreDiscTax() {
        return preDiscTax;
    }

    /**
     * Sets the value of the preDiscTax property.
     * 
     */
    public void setPreDiscTax(double value) {
        this.preDiscTax = value;
    }

    /**
     * Gets the value of the prefTotal property.
     * 
     */
    public double getPrefTotal() {
        return prefTotal;
    }

    /**
     * Sets the value of the prefTotal property.
     * 
     */
    public void setPrefTotal(double value) {
        this.prefTotal = value;
    }

    /**
     * Gets the value of the reportedCarrier property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReportedCarrier() {
        return reportedCarrier;
    }

    /**
     * Sets the value of the reportedCarrier property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReportedCarrier(XMLGregorianCalendar value) {
        this.reportedCarrier = value;
    }

    /**
     * Gets the value of the settleAmount property.
     * 
     */
    public double getSettleAmount() {
        return settleAmount;
    }

    /**
     * Sets the value of the settleAmount property.
     * 
     */
    public void setSettleAmount(double value) {
        this.settleAmount = value;
    }

    /**
     * Gets the value of the settleId property.
     * 
     */
    public int getSettleId() {
        return settleId;
    }

    /**
     * Sets the value of the settleId property.
     * 
     */
    public void setSettleId(int value) {
        this.settleId = value;
    }

    /**
     * Gets the value of the splitBilling property.
     * 
     */
    public boolean isSplitBilling() {
        return splitBilling;
    }

    /**
     * Sets the value of the splitBilling property.
     * 
     */
    public void setSplitBilling(boolean value) {
        this.splitBilling = value;
    }

    /**
     * Gets the value of the statementId property.
     * 
     */
    public int getStatementId() {
        return statementId;
    }

    /**
     * Sets the value of the statementId property.
     * 
     */
    public void setStatementId(int value) {
        this.statementId = value;
    }

    /**
     * Gets the value of the supplierId property.
     * 
     */
    public int getSupplierId() {
        return supplierId;
    }

    /**
     * Sets the value of the supplierId property.
     * 
     */
    public void setSupplierId(int value) {
        this.supplierId = value;
    }

    /**
     * Gets the value of the suprFee property.
     * 
     */
    public double getSuprFee() {
        return suprFee;
    }

    /**
     * Sets the value of the suprFee property.
     * 
     */
    public void setSuprFee(double value) {
        this.suprFee = value;
    }

    /**
     * Gets the value of the taxExemptAmount property.
     * 
     */
    public double getTaxExemptAmount() {
        return taxExemptAmount;
    }

    /**
     * Sets the value of the taxExemptAmount property.
     * 
     */
    public void setTaxExemptAmount(double value) {
        this.taxExemptAmount = value;
    }

    /**
     * Gets the value of the terminalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTerminalId() {
        return terminalId;
    }

    /**
     * Sets the value of the terminalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTerminalId(String value) {
        this.terminalId = value;
    }

    /**
     * Gets the value of the terminalType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTerminalType() {
        return terminalType;
    }

    /**
     * Sets the value of the terminalType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTerminalType(String value) {
        this.terminalType = value;
    }

    /**
     * Gets the value of the transReported property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTransReported() {
        return transReported;
    }

    /**
     * Sets the value of the transReported property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTransReported(XMLGregorianCalendar value) {
        this.transReported = value;
    }

    /**
     * Gets the value of the transactionDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTransactionDate() {
        return transactionDate;
    }

    /**
     * Sets the value of the transactionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTransactionDate(XMLGregorianCalendar value) {
        this.transactionDate = value;
    }

    /**
     * Gets the value of the transactionId property.
     * 
     */
    public int getTransactionId() {
        return transactionId;
    }

    /**
     * Sets the value of the transactionId property.
     * 
     */
    public void setTransactionId(int value) {
        this.transactionId = value;
    }

    /**
     * Gets the value of the transactionType property.
     * 
     */
    public int getTransactionType() {
        return transactionType;
    }

    /**
     * Sets the value of the transactionType property.
     * 
     */
    public void setTransactionType(int value) {
        this.transactionType = value;
    }

    /**
     * Gets the value of the transTaxes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the transTaxes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransTaxes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WSTransTaxes }
     * 
     * 
     */
    public List<WSTransTaxes> getTransTaxes() {
        if (transTaxes == null) {
            transTaxes = new ArrayList<WSTransTaxes>();
        }
        return this.transTaxes;
    }

}
