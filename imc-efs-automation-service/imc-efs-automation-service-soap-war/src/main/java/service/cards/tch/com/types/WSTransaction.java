/**
 * WSTransaction.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package service.cards.tch.com.types;

public class WSTransaction  implements java.io.Serializable {
    private int ARBatchNumber;

    private java.lang.String CPNRDeliveryTP;

    private boolean MCMultiCurrency;

    private java.lang.String OPDataSource;

    private java.util.Calendar POSDate;

    private java.lang.String accountType;

    private java.lang.String arNumber;

    private java.lang.String authCode;

    private int billingCountry;

    private java.lang.String billingCurrency;

    private java.lang.String cardNumber;

    private double carrierFee;

    private int carrierId;

    private java.lang.String companyXRef;

    private int contractId;

    private double conversionRate;

    private int country;

    private double discAmount;

    private int discType;

    private double fundedTotal;

    private boolean handEntered;

    private java.lang.String inAddress;

    private service.cards.tch.com.types.WSTransactionInfo[] infos;

    private java.lang.String invoice;

    private double issuerDeal;

    private double issuerFee;

    private int issuerId;

    private int language;

    private service.cards.tch.com.types.WSTransactionLineItem[] lineItems;

    private int locationCountry;

    private java.lang.String locationCurrency;

    private int locationId;

    private java.lang.String messageDLVD;

    private double netTotal;

    private double nonAreaFee;

    private boolean override;

    private double postDiscTax;

    private double preDiscTax;

    private double prefTotal;

    private java.util.Calendar reportedCarrier;

    private double settleAmount;

    private int settleId;

    private boolean splitBilling;

    private int statementId;

    private int supplierId;

    private double suprFee;

    private double taxExemptAmount;

    private java.lang.String terminalId;

    private java.lang.String terminalType;

    private java.util.Calendar transReported;

    private java.util.Calendar transactionDate;

    private int transactionId;

    private int transactionType;

    public WSTransaction() {
    }

    public WSTransaction(
           int ARBatchNumber,
           java.lang.String CPNRDeliveryTP,
           boolean MCMultiCurrency,
           java.lang.String OPDataSource,
           java.util.Calendar POSDate,
           java.lang.String accountType,
           java.lang.String arNumber,
           java.lang.String authCode,
           int billingCountry,
           java.lang.String billingCurrency,
           java.lang.String cardNumber,
           double carrierFee,
           int carrierId,
           java.lang.String companyXRef,
           int contractId,
           double conversionRate,
           int country,
           double discAmount,
           int discType,
           double fundedTotal,
           boolean handEntered,
           java.lang.String inAddress,
           service.cards.tch.com.types.WSTransactionInfo[] infos,
           java.lang.String invoice,
           double issuerDeal,
           double issuerFee,
           int issuerId,
           int language,
           service.cards.tch.com.types.WSTransactionLineItem[] lineItems,
           int locationCountry,
           java.lang.String locationCurrency,
           int locationId,
           java.lang.String messageDLVD,
           double netTotal,
           double nonAreaFee,
           boolean override,
           double postDiscTax,
           double preDiscTax,
           double prefTotal,
           java.util.Calendar reportedCarrier,
           double settleAmount,
           int settleId,
           boolean splitBilling,
           int statementId,
           int supplierId,
           double suprFee,
           double taxExemptAmount,
           java.lang.String terminalId,
           java.lang.String terminalType,
           java.util.Calendar transReported,
           java.util.Calendar transactionDate,
           int transactionId,
           int transactionType) {
           this.ARBatchNumber = ARBatchNumber;
           this.CPNRDeliveryTP = CPNRDeliveryTP;
           this.MCMultiCurrency = MCMultiCurrency;
           this.OPDataSource = OPDataSource;
           this.POSDate = POSDate;
           this.accountType = accountType;
           this.arNumber = arNumber;
           this.authCode = authCode;
           this.billingCountry = billingCountry;
           this.billingCurrency = billingCurrency;
           this.cardNumber = cardNumber;
           this.carrierFee = carrierFee;
           this.carrierId = carrierId;
           this.companyXRef = companyXRef;
           this.contractId = contractId;
           this.conversionRate = conversionRate;
           this.country = country;
           this.discAmount = discAmount;
           this.discType = discType;
           this.fundedTotal = fundedTotal;
           this.handEntered = handEntered;
           this.inAddress = inAddress;
           this.infos = infos;
           this.invoice = invoice;
           this.issuerDeal = issuerDeal;
           this.issuerFee = issuerFee;
           this.issuerId = issuerId;
           this.language = language;
           this.lineItems = lineItems;
           this.locationCountry = locationCountry;
           this.locationCurrency = locationCurrency;
           this.locationId = locationId;
           this.messageDLVD = messageDLVD;
           this.netTotal = netTotal;
           this.nonAreaFee = nonAreaFee;
           this.override = override;
           this.postDiscTax = postDiscTax;
           this.preDiscTax = preDiscTax;
           this.prefTotal = prefTotal;
           this.reportedCarrier = reportedCarrier;
           this.settleAmount = settleAmount;
           this.settleId = settleId;
           this.splitBilling = splitBilling;
           this.statementId = statementId;
           this.supplierId = supplierId;
           this.suprFee = suprFee;
           this.taxExemptAmount = taxExemptAmount;
           this.terminalId = terminalId;
           this.terminalType = terminalType;
           this.transReported = transReported;
           this.transactionDate = transactionDate;
           this.transactionId = transactionId;
           this.transactionType = transactionType;
    }


    /**
     * Gets the ARBatchNumber value for this WSTransaction.
     * 
     * @return ARBatchNumber
     */
    public int getARBatchNumber() {
        return ARBatchNumber;
    }


    /**
     * Sets the ARBatchNumber value for this WSTransaction.
     * 
     * @param ARBatchNumber
     */
    public void setARBatchNumber(int ARBatchNumber) {
        this.ARBatchNumber = ARBatchNumber;
    }


    /**
     * Gets the CPNRDeliveryTP value for this WSTransaction.
     * 
     * @return CPNRDeliveryTP
     */
    public java.lang.String getCPNRDeliveryTP() {
        return CPNRDeliveryTP;
    }


    /**
     * Sets the CPNRDeliveryTP value for this WSTransaction.
     * 
     * @param CPNRDeliveryTP
     */
    public void setCPNRDeliveryTP(java.lang.String CPNRDeliveryTP) {
        this.CPNRDeliveryTP = CPNRDeliveryTP;
    }


    /**
     * Gets the MCMultiCurrency value for this WSTransaction.
     * 
     * @return MCMultiCurrency
     */
    public boolean isMCMultiCurrency() {
        return MCMultiCurrency;
    }


    /**
     * Sets the MCMultiCurrency value for this WSTransaction.
     * 
     * @param MCMultiCurrency
     */
    public void setMCMultiCurrency(boolean MCMultiCurrency) {
        this.MCMultiCurrency = MCMultiCurrency;
    }


    /**
     * Gets the OPDataSource value for this WSTransaction.
     * 
     * @return OPDataSource
     */
    public java.lang.String getOPDataSource() {
        return OPDataSource;
    }


    /**
     * Sets the OPDataSource value for this WSTransaction.
     * 
     * @param OPDataSource
     */
    public void setOPDataSource(java.lang.String OPDataSource) {
        this.OPDataSource = OPDataSource;
    }


    /**
     * Gets the POSDate value for this WSTransaction.
     * 
     * @return POSDate
     */
    public java.util.Calendar getPOSDate() {
        return POSDate;
    }


    /**
     * Sets the POSDate value for this WSTransaction.
     * 
     * @param POSDate
     */
    public void setPOSDate(java.util.Calendar POSDate) {
        this.POSDate = POSDate;
    }


    /**
     * Gets the accountType value for this WSTransaction.
     * 
     * @return accountType
     */
    public java.lang.String getAccountType() {
        return accountType;
    }


    /**
     * Sets the accountType value for this WSTransaction.
     * 
     * @param accountType
     */
    public void setAccountType(java.lang.String accountType) {
        this.accountType = accountType;
    }


    /**
     * Gets the arNumber value for this WSTransaction.
     * 
     * @return arNumber
     */
    public java.lang.String getArNumber() {
        return arNumber;
    }


    /**
     * Sets the arNumber value for this WSTransaction.
     * 
     * @param arNumber
     */
    public void setArNumber(java.lang.String arNumber) {
        this.arNumber = arNumber;
    }


    /**
     * Gets the authCode value for this WSTransaction.
     * 
     * @return authCode
     */
    public java.lang.String getAuthCode() {
        return authCode;
    }


    /**
     * Sets the authCode value for this WSTransaction.
     * 
     * @param authCode
     */
    public void setAuthCode(java.lang.String authCode) {
        this.authCode = authCode;
    }


    /**
     * Gets the billingCountry value for this WSTransaction.
     * 
     * @return billingCountry
     */
    public int getBillingCountry() {
        return billingCountry;
    }


    /**
     * Sets the billingCountry value for this WSTransaction.
     * 
     * @param billingCountry
     */
    public void setBillingCountry(int billingCountry) {
        this.billingCountry = billingCountry;
    }


    /**
     * Gets the billingCurrency value for this WSTransaction.
     * 
     * @return billingCurrency
     */
    public java.lang.String getBillingCurrency() {
        return billingCurrency;
    }


    /**
     * Sets the billingCurrency value for this WSTransaction.
     * 
     * @param billingCurrency
     */
    public void setBillingCurrency(java.lang.String billingCurrency) {
        this.billingCurrency = billingCurrency;
    }


    /**
     * Gets the cardNumber value for this WSTransaction.
     * 
     * @return cardNumber
     */
    public java.lang.String getCardNumber() {
        return cardNumber;
    }


    /**
     * Sets the cardNumber value for this WSTransaction.
     * 
     * @param cardNumber
     */
    public void setCardNumber(java.lang.String cardNumber) {
        this.cardNumber = cardNumber;
    }


    /**
     * Gets the carrierFee value for this WSTransaction.
     * 
     * @return carrierFee
     */
    public double getCarrierFee() {
        return carrierFee;
    }


    /**
     * Sets the carrierFee value for this WSTransaction.
     * 
     * @param carrierFee
     */
    public void setCarrierFee(double carrierFee) {
        this.carrierFee = carrierFee;
    }


    /**
     * Gets the carrierId value for this WSTransaction.
     * 
     * @return carrierId
     */
    public int getCarrierId() {
        return carrierId;
    }


    /**
     * Sets the carrierId value for this WSTransaction.
     * 
     * @param carrierId
     */
    public void setCarrierId(int carrierId) {
        this.carrierId = carrierId;
    }


    /**
     * Gets the companyXRef value for this WSTransaction.
     * 
     * @return companyXRef
     */
    public java.lang.String getCompanyXRef() {
        return companyXRef;
    }


    /**
     * Sets the companyXRef value for this WSTransaction.
     * 
     * @param companyXRef
     */
    public void setCompanyXRef(java.lang.String companyXRef) {
        this.companyXRef = companyXRef;
    }


    /**
     * Gets the contractId value for this WSTransaction.
     * 
     * @return contractId
     */
    public int getContractId() {
        return contractId;
    }


    /**
     * Sets the contractId value for this WSTransaction.
     * 
     * @param contractId
     */
    public void setContractId(int contractId) {
        this.contractId = contractId;
    }


    /**
     * Gets the conversionRate value for this WSTransaction.
     * 
     * @return conversionRate
     */
    public double getConversionRate() {
        return conversionRate;
    }


    /**
     * Sets the conversionRate value for this WSTransaction.
     * 
     * @param conversionRate
     */
    public void setConversionRate(double conversionRate) {
        this.conversionRate = conversionRate;
    }


    /**
     * Gets the country value for this WSTransaction.
     * 
     * @return country
     */
    public int getCountry() {
        return country;
    }


    /**
     * Sets the country value for this WSTransaction.
     * 
     * @param country
     */
    public void setCountry(int country) {
        this.country = country;
    }


    /**
     * Gets the discAmount value for this WSTransaction.
     * 
     * @return discAmount
     */
    public double getDiscAmount() {
        return discAmount;
    }


    /**
     * Sets the discAmount value for this WSTransaction.
     * 
     * @param discAmount
     */
    public void setDiscAmount(double discAmount) {
        this.discAmount = discAmount;
    }


    /**
     * Gets the discType value for this WSTransaction.
     * 
     * @return discType
     */
    public int getDiscType() {
        return discType;
    }


    /**
     * Sets the discType value for this WSTransaction.
     * 
     * @param discType
     */
    public void setDiscType(int discType) {
        this.discType = discType;
    }


    /**
     * Gets the fundedTotal value for this WSTransaction.
     * 
     * @return fundedTotal
     */
    public double getFundedTotal() {
        return fundedTotal;
    }


    /**
     * Sets the fundedTotal value for this WSTransaction.
     * 
     * @param fundedTotal
     */
    public void setFundedTotal(double fundedTotal) {
        this.fundedTotal = fundedTotal;
    }


    /**
     * Gets the handEntered value for this WSTransaction.
     * 
     * @return handEntered
     */
    public boolean isHandEntered() {
        return handEntered;
    }


    /**
     * Sets the handEntered value for this WSTransaction.
     * 
     * @param handEntered
     */
    public void setHandEntered(boolean handEntered) {
        this.handEntered = handEntered;
    }


    /**
     * Gets the inAddress value for this WSTransaction.
     * 
     * @return inAddress
     */
    public java.lang.String getInAddress() {
        return inAddress;
    }


    /**
     * Sets the inAddress value for this WSTransaction.
     * 
     * @param inAddress
     */
    public void setInAddress(java.lang.String inAddress) {
        this.inAddress = inAddress;
    }


    /**
     * Gets the infos value for this WSTransaction.
     * 
     * @return infos
     */
    public service.cards.tch.com.types.WSTransactionInfo[] getInfos() {
        return infos;
    }


    /**
     * Sets the infos value for this WSTransaction.
     * 
     * @param infos
     */
    public void setInfos(service.cards.tch.com.types.WSTransactionInfo[] infos) {
        this.infos = infos;
    }

    public service.cards.tch.com.types.WSTransactionInfo getInfos(int i) {
        return this.infos[i];
    }

    public void setInfos(int i, service.cards.tch.com.types.WSTransactionInfo _value) {
        this.infos[i] = _value;
    }


    /**
     * Gets the invoice value for this WSTransaction.
     * 
     * @return invoice
     */
    public java.lang.String getInvoice() {
        return invoice;
    }


    /**
     * Sets the invoice value for this WSTransaction.
     * 
     * @param invoice
     */
    public void setInvoice(java.lang.String invoice) {
        this.invoice = invoice;
    }


    /**
     * Gets the issuerDeal value for this WSTransaction.
     * 
     * @return issuerDeal
     */
    public double getIssuerDeal() {
        return issuerDeal;
    }


    /**
     * Sets the issuerDeal value for this WSTransaction.
     * 
     * @param issuerDeal
     */
    public void setIssuerDeal(double issuerDeal) {
        this.issuerDeal = issuerDeal;
    }


    /**
     * Gets the issuerFee value for this WSTransaction.
     * 
     * @return issuerFee
     */
    public double getIssuerFee() {
        return issuerFee;
    }


    /**
     * Sets the issuerFee value for this WSTransaction.
     * 
     * @param issuerFee
     */
    public void setIssuerFee(double issuerFee) {
        this.issuerFee = issuerFee;
    }


    /**
     * Gets the issuerId value for this WSTransaction.
     * 
     * @return issuerId
     */
    public int getIssuerId() {
        return issuerId;
    }


    /**
     * Sets the issuerId value for this WSTransaction.
     * 
     * @param issuerId
     */
    public void setIssuerId(int issuerId) {
        this.issuerId = issuerId;
    }


    /**
     * Gets the language value for this WSTransaction.
     * 
     * @return language
     */
    public int getLanguage() {
        return language;
    }


    /**
     * Sets the language value for this WSTransaction.
     * 
     * @param language
     */
    public void setLanguage(int language) {
        this.language = language;
    }


    /**
     * Gets the lineItems value for this WSTransaction.
     * 
     * @return lineItems
     */
    public service.cards.tch.com.types.WSTransactionLineItem[] getLineItems() {
        return lineItems;
    }


    /**
     * Sets the lineItems value for this WSTransaction.
     * 
     * @param lineItems
     */
    public void setLineItems(service.cards.tch.com.types.WSTransactionLineItem[] lineItems) {
        this.lineItems = lineItems;
    }

    public service.cards.tch.com.types.WSTransactionLineItem getLineItems(int i) {
        return this.lineItems[i];
    }

    public void setLineItems(int i, service.cards.tch.com.types.WSTransactionLineItem _value) {
        this.lineItems[i] = _value;
    }


    /**
     * Gets the locationCountry value for this WSTransaction.
     * 
     * @return locationCountry
     */
    public int getLocationCountry() {
        return locationCountry;
    }


    /**
     * Sets the locationCountry value for this WSTransaction.
     * 
     * @param locationCountry
     */
    public void setLocationCountry(int locationCountry) {
        this.locationCountry = locationCountry;
    }


    /**
     * Gets the locationCurrency value for this WSTransaction.
     * 
     * @return locationCurrency
     */
    public java.lang.String getLocationCurrency() {
        return locationCurrency;
    }


    /**
     * Sets the locationCurrency value for this WSTransaction.
     * 
     * @param locationCurrency
     */
    public void setLocationCurrency(java.lang.String locationCurrency) {
        this.locationCurrency = locationCurrency;
    }


    /**
     * Gets the locationId value for this WSTransaction.
     * 
     * @return locationId
     */
    public int getLocationId() {
        return locationId;
    }


    /**
     * Sets the locationId value for this WSTransaction.
     * 
     * @param locationId
     */
    public void setLocationId(int locationId) {
        this.locationId = locationId;
    }


    /**
     * Gets the messageDLVD value for this WSTransaction.
     * 
     * @return messageDLVD
     */
    public java.lang.String getMessageDLVD() {
        return messageDLVD;
    }


    /**
     * Sets the messageDLVD value for this WSTransaction.
     * 
     * @param messageDLVD
     */
    public void setMessageDLVD(java.lang.String messageDLVD) {
        this.messageDLVD = messageDLVD;
    }


    /**
     * Gets the netTotal value for this WSTransaction.
     * 
     * @return netTotal
     */
    public double getNetTotal() {
        return netTotal;
    }


    /**
     * Sets the netTotal value for this WSTransaction.
     * 
     * @param netTotal
     */
    public void setNetTotal(double netTotal) {
        this.netTotal = netTotal;
    }


    /**
     * Gets the nonAreaFee value for this WSTransaction.
     * 
     * @return nonAreaFee
     */
    public double getNonAreaFee() {
        return nonAreaFee;
    }


    /**
     * Sets the nonAreaFee value for this WSTransaction.
     * 
     * @param nonAreaFee
     */
    public void setNonAreaFee(double nonAreaFee) {
        this.nonAreaFee = nonAreaFee;
    }


    /**
     * Gets the override value for this WSTransaction.
     * 
     * @return override
     */
    public boolean isOverride() {
        return override;
    }


    /**
     * Sets the override value for this WSTransaction.
     * 
     * @param override
     */
    public void setOverride(boolean override) {
        this.override = override;
    }


    /**
     * Gets the postDiscTax value for this WSTransaction.
     * 
     * @return postDiscTax
     */
    public double getPostDiscTax() {
        return postDiscTax;
    }


    /**
     * Sets the postDiscTax value for this WSTransaction.
     * 
     * @param postDiscTax
     */
    public void setPostDiscTax(double postDiscTax) {
        this.postDiscTax = postDiscTax;
    }


    /**
     * Gets the preDiscTax value for this WSTransaction.
     * 
     * @return preDiscTax
     */
    public double getPreDiscTax() {
        return preDiscTax;
    }


    /**
     * Sets the preDiscTax value for this WSTransaction.
     * 
     * @param preDiscTax
     */
    public void setPreDiscTax(double preDiscTax) {
        this.preDiscTax = preDiscTax;
    }


    /**
     * Gets the prefTotal value for this WSTransaction.
     * 
     * @return prefTotal
     */
    public double getPrefTotal() {
        return prefTotal;
    }


    /**
     * Sets the prefTotal value for this WSTransaction.
     * 
     * @param prefTotal
     */
    public void setPrefTotal(double prefTotal) {
        this.prefTotal = prefTotal;
    }


    /**
     * Gets the reportedCarrier value for this WSTransaction.
     * 
     * @return reportedCarrier
     */
    public java.util.Calendar getReportedCarrier() {
        return reportedCarrier;
    }


    /**
     * Sets the reportedCarrier value for this WSTransaction.
     * 
     * @param reportedCarrier
     */
    public void setReportedCarrier(java.util.Calendar reportedCarrier) {
        this.reportedCarrier = reportedCarrier;
    }


    /**
     * Gets the settleAmount value for this WSTransaction.
     * 
     * @return settleAmount
     */
    public double getSettleAmount() {
        return settleAmount;
    }


    /**
     * Sets the settleAmount value for this WSTransaction.
     * 
     * @param settleAmount
     */
    public void setSettleAmount(double settleAmount) {
        this.settleAmount = settleAmount;
    }


    /**
     * Gets the settleId value for this WSTransaction.
     * 
     * @return settleId
     */
    public int getSettleId() {
        return settleId;
    }


    /**
     * Sets the settleId value for this WSTransaction.
     * 
     * @param settleId
     */
    public void setSettleId(int settleId) {
        this.settleId = settleId;
    }


    /**
     * Gets the splitBilling value for this WSTransaction.
     * 
     * @return splitBilling
     */
    public boolean isSplitBilling() {
        return splitBilling;
    }


    /**
     * Sets the splitBilling value for this WSTransaction.
     * 
     * @param splitBilling
     */
    public void setSplitBilling(boolean splitBilling) {
        this.splitBilling = splitBilling;
    }


    /**
     * Gets the statementId value for this WSTransaction.
     * 
     * @return statementId
     */
    public int getStatementId() {
        return statementId;
    }


    /**
     * Sets the statementId value for this WSTransaction.
     * 
     * @param statementId
     */
    public void setStatementId(int statementId) {
        this.statementId = statementId;
    }


    /**
     * Gets the supplierId value for this WSTransaction.
     * 
     * @return supplierId
     */
    public int getSupplierId() {
        return supplierId;
    }


    /**
     * Sets the supplierId value for this WSTransaction.
     * 
     * @param supplierId
     */
    public void setSupplierId(int supplierId) {
        this.supplierId = supplierId;
    }


    /**
     * Gets the suprFee value for this WSTransaction.
     * 
     * @return suprFee
     */
    public double getSuprFee() {
        return suprFee;
    }


    /**
     * Sets the suprFee value for this WSTransaction.
     * 
     * @param suprFee
     */
    public void setSuprFee(double suprFee) {
        this.suprFee = suprFee;
    }


    /**
     * Gets the taxExemptAmount value for this WSTransaction.
     * 
     * @return taxExemptAmount
     */
    public double getTaxExemptAmount() {
        return taxExemptAmount;
    }


    /**
     * Sets the taxExemptAmount value for this WSTransaction.
     * 
     * @param taxExemptAmount
     */
    public void setTaxExemptAmount(double taxExemptAmount) {
        this.taxExemptAmount = taxExemptAmount;
    }


    /**
     * Gets the terminalId value for this WSTransaction.
     * 
     * @return terminalId
     */
    public java.lang.String getTerminalId() {
        return terminalId;
    }


    /**
     * Sets the terminalId value for this WSTransaction.
     * 
     * @param terminalId
     */
    public void setTerminalId(java.lang.String terminalId) {
        this.terminalId = terminalId;
    }


    /**
     * Gets the terminalType value for this WSTransaction.
     * 
     * @return terminalType
     */
    public java.lang.String getTerminalType() {
        return terminalType;
    }


    /**
     * Sets the terminalType value for this WSTransaction.
     * 
     * @param terminalType
     */
    public void setTerminalType(java.lang.String terminalType) {
        this.terminalType = terminalType;
    }


    /**
     * Gets the transReported value for this WSTransaction.
     * 
     * @return transReported
     */
    public java.util.Calendar getTransReported() {
        return transReported;
    }


    /**
     * Sets the transReported value for this WSTransaction.
     * 
     * @param transReported
     */
    public void setTransReported(java.util.Calendar transReported) {
        this.transReported = transReported;
    }


    /**
     * Gets the transactionDate value for this WSTransaction.
     * 
     * @return transactionDate
     */
    public java.util.Calendar getTransactionDate() {
        return transactionDate;
    }


    /**
     * Sets the transactionDate value for this WSTransaction.
     * 
     * @param transactionDate
     */
    public void setTransactionDate(java.util.Calendar transactionDate) {
        this.transactionDate = transactionDate;
    }


    /**
     * Gets the transactionId value for this WSTransaction.
     * 
     * @return transactionId
     */
    public int getTransactionId() {
        return transactionId;
    }


    /**
     * Sets the transactionId value for this WSTransaction.
     * 
     * @param transactionId
     */
    public void setTransactionId(int transactionId) {
        this.transactionId = transactionId;
    }


    /**
     * Gets the transactionType value for this WSTransaction.
     * 
     * @return transactionType
     */
    public int getTransactionType() {
        return transactionType;
    }


    /**
     * Sets the transactionType value for this WSTransaction.
     * 
     * @param transactionType
     */
    public void setTransactionType(int transactionType) {
        this.transactionType = transactionType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WSTransaction)) return false;
        WSTransaction other = (WSTransaction) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.ARBatchNumber == other.getARBatchNumber() &&
            ((this.CPNRDeliveryTP==null && other.getCPNRDeliveryTP()==null) || 
             (this.CPNRDeliveryTP!=null &&
              this.CPNRDeliveryTP.equals(other.getCPNRDeliveryTP()))) &&
            this.MCMultiCurrency == other.isMCMultiCurrency() &&
            ((this.OPDataSource==null && other.getOPDataSource()==null) || 
             (this.OPDataSource!=null &&
              this.OPDataSource.equals(other.getOPDataSource()))) &&
            ((this.POSDate==null && other.getPOSDate()==null) || 
             (this.POSDate!=null &&
              this.POSDate.equals(other.getPOSDate()))) &&
            ((this.accountType==null && other.getAccountType()==null) || 
             (this.accountType!=null &&
              this.accountType.equals(other.getAccountType()))) &&
            ((this.arNumber==null && other.getArNumber()==null) || 
             (this.arNumber!=null &&
              this.arNumber.equals(other.getArNumber()))) &&
            ((this.authCode==null && other.getAuthCode()==null) || 
             (this.authCode!=null &&
              this.authCode.equals(other.getAuthCode()))) &&
            this.billingCountry == other.getBillingCountry() &&
            ((this.billingCurrency==null && other.getBillingCurrency()==null) || 
             (this.billingCurrency!=null &&
              this.billingCurrency.equals(other.getBillingCurrency()))) &&
            ((this.cardNumber==null && other.getCardNumber()==null) || 
             (this.cardNumber!=null &&
              this.cardNumber.equals(other.getCardNumber()))) &&
            this.carrierFee == other.getCarrierFee() &&
            this.carrierId == other.getCarrierId() &&
            ((this.companyXRef==null && other.getCompanyXRef()==null) || 
             (this.companyXRef!=null &&
              this.companyXRef.equals(other.getCompanyXRef()))) &&
            this.contractId == other.getContractId() &&
            this.conversionRate == other.getConversionRate() &&
            this.country == other.getCountry() &&
            this.discAmount == other.getDiscAmount() &&
            this.discType == other.getDiscType() &&
            this.fundedTotal == other.getFundedTotal() &&
            this.handEntered == other.isHandEntered() &&
            ((this.inAddress==null && other.getInAddress()==null) || 
             (this.inAddress!=null &&
              this.inAddress.equals(other.getInAddress()))) &&
            ((this.infos==null && other.getInfos()==null) || 
             (this.infos!=null &&
              java.util.Arrays.equals(this.infos, other.getInfos()))) &&
            ((this.invoice==null && other.getInvoice()==null) || 
             (this.invoice!=null &&
              this.invoice.equals(other.getInvoice()))) &&
            this.issuerDeal == other.getIssuerDeal() &&
            this.issuerFee == other.getIssuerFee() &&
            this.issuerId == other.getIssuerId() &&
            this.language == other.getLanguage() &&
            ((this.lineItems==null && other.getLineItems()==null) || 
             (this.lineItems!=null &&
              java.util.Arrays.equals(this.lineItems, other.getLineItems()))) &&
            this.locationCountry == other.getLocationCountry() &&
            ((this.locationCurrency==null && other.getLocationCurrency()==null) || 
             (this.locationCurrency!=null &&
              this.locationCurrency.equals(other.getLocationCurrency()))) &&
            this.locationId == other.getLocationId() &&
            ((this.messageDLVD==null && other.getMessageDLVD()==null) || 
             (this.messageDLVD!=null &&
              this.messageDLVD.equals(other.getMessageDLVD()))) &&
            this.netTotal == other.getNetTotal() &&
            this.nonAreaFee == other.getNonAreaFee() &&
            this.override == other.isOverride() &&
            this.postDiscTax == other.getPostDiscTax() &&
            this.preDiscTax == other.getPreDiscTax() &&
            this.prefTotal == other.getPrefTotal() &&
            ((this.reportedCarrier==null && other.getReportedCarrier()==null) || 
             (this.reportedCarrier!=null &&
              this.reportedCarrier.equals(other.getReportedCarrier()))) &&
            this.settleAmount == other.getSettleAmount() &&
            this.settleId == other.getSettleId() &&
            this.splitBilling == other.isSplitBilling() &&
            this.statementId == other.getStatementId() &&
            this.supplierId == other.getSupplierId() &&
            this.suprFee == other.getSuprFee() &&
            this.taxExemptAmount == other.getTaxExemptAmount() &&
            ((this.terminalId==null && other.getTerminalId()==null) || 
             (this.terminalId!=null &&
              this.terminalId.equals(other.getTerminalId()))) &&
            ((this.terminalType==null && other.getTerminalType()==null) || 
             (this.terminalType!=null &&
              this.terminalType.equals(other.getTerminalType()))) &&
            ((this.transReported==null && other.getTransReported()==null) || 
             (this.transReported!=null &&
              this.transReported.equals(other.getTransReported()))) &&
            ((this.transactionDate==null && other.getTransactionDate()==null) || 
             (this.transactionDate!=null &&
              this.transactionDate.equals(other.getTransactionDate()))) &&
            this.transactionId == other.getTransactionId() &&
            this.transactionType == other.getTransactionType();
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        _hashCode += getARBatchNumber();
        if (getCPNRDeliveryTP() != null) {
            _hashCode += getCPNRDeliveryTP().hashCode();
        }
        _hashCode += (isMCMultiCurrency() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getOPDataSource() != null) {
            _hashCode += getOPDataSource().hashCode();
        }
        if (getPOSDate() != null) {
            _hashCode += getPOSDate().hashCode();
        }
        if (getAccountType() != null) {
            _hashCode += getAccountType().hashCode();
        }
        if (getArNumber() != null) {
            _hashCode += getArNumber().hashCode();
        }
        if (getAuthCode() != null) {
            _hashCode += getAuthCode().hashCode();
        }
        _hashCode += getBillingCountry();
        if (getBillingCurrency() != null) {
            _hashCode += getBillingCurrency().hashCode();
        }
        if (getCardNumber() != null) {
            _hashCode += getCardNumber().hashCode();
        }
        _hashCode += new Double(getCarrierFee()).hashCode();
        _hashCode += getCarrierId();
        if (getCompanyXRef() != null) {
            _hashCode += getCompanyXRef().hashCode();
        }
        _hashCode += getContractId();
        _hashCode += new Double(getConversionRate()).hashCode();
        _hashCode += getCountry();
        _hashCode += new Double(getDiscAmount()).hashCode();
        _hashCode += getDiscType();
        _hashCode += new Double(getFundedTotal()).hashCode();
        _hashCode += (isHandEntered() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getInAddress() != null) {
            _hashCode += getInAddress().hashCode();
        }
        if (getInfos() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getInfos());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getInfos(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getInvoice() != null) {
            _hashCode += getInvoice().hashCode();
        }
        _hashCode += new Double(getIssuerDeal()).hashCode();
        _hashCode += new Double(getIssuerFee()).hashCode();
        _hashCode += getIssuerId();
        _hashCode += getLanguage();
        if (getLineItems() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLineItems());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLineItems(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += getLocationCountry();
        if (getLocationCurrency() != null) {
            _hashCode += getLocationCurrency().hashCode();
        }
        _hashCode += getLocationId();
        if (getMessageDLVD() != null) {
            _hashCode += getMessageDLVD().hashCode();
        }
        _hashCode += new Double(getNetTotal()).hashCode();
        _hashCode += new Double(getNonAreaFee()).hashCode();
        _hashCode += (isOverride() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += new Double(getPostDiscTax()).hashCode();
        _hashCode += new Double(getPreDiscTax()).hashCode();
        _hashCode += new Double(getPrefTotal()).hashCode();
        if (getReportedCarrier() != null) {
            _hashCode += getReportedCarrier().hashCode();
        }
        _hashCode += new Double(getSettleAmount()).hashCode();
        _hashCode += getSettleId();
        _hashCode += (isSplitBilling() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += getStatementId();
        _hashCode += getSupplierId();
        _hashCode += new Double(getSuprFee()).hashCode();
        _hashCode += new Double(getTaxExemptAmount()).hashCode();
        if (getTerminalId() != null) {
            _hashCode += getTerminalId().hashCode();
        }
        if (getTerminalType() != null) {
            _hashCode += getTerminalType().hashCode();
        }
        if (getTransReported() != null) {
            _hashCode += getTransReported().hashCode();
        }
        if (getTransactionDate() != null) {
            _hashCode += getTransactionDate().hashCode();
        }
        _hashCode += getTransactionId();
        _hashCode += getTransactionType();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WSTransaction.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://com.tch.cards.service/types", "WSTransaction"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ARBatchNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ARBatchNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CPNRDeliveryTP");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CPNRDeliveryTP"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MCMultiCurrency");
        elemField.setXmlName(new javax.xml.namespace.QName("", "MCMultiCurrency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("OPDataSource");
        elemField.setXmlName(new javax.xml.namespace.QName("", "OPDataSource"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("POSDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "POSDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "accountType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("arNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "arNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "authCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billingCountry");
        elemField.setXmlName(new javax.xml.namespace.QName("", "billingCountry"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billingCurrency");
        elemField.setXmlName(new javax.xml.namespace.QName("", "billingCurrency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cardNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cardNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("carrierFee");
        elemField.setXmlName(new javax.xml.namespace.QName("", "carrierFee"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("carrierId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "carrierId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("companyXRef");
        elemField.setXmlName(new javax.xml.namespace.QName("", "companyXRef"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contractId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "contractId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("conversionRate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "conversionRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("country");
        elemField.setXmlName(new javax.xml.namespace.QName("", "country"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("discAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "discAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("discType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "discType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fundedTotal");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fundedTotal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("handEntered");
        elemField.setXmlName(new javax.xml.namespace.QName("", "handEntered"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("", "inAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("infos");
        elemField.setXmlName(new javax.xml.namespace.QName("", "infos"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://com.tch.cards.service/types", "WSTransactionInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("invoice");
        elemField.setXmlName(new javax.xml.namespace.QName("", "invoice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("issuerDeal");
        elemField.setXmlName(new javax.xml.namespace.QName("", "issuerDeal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("issuerFee");
        elemField.setXmlName(new javax.xml.namespace.QName("", "issuerFee"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("issuerId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "issuerId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("language");
        elemField.setXmlName(new javax.xml.namespace.QName("", "language"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lineItems");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lineItems"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://com.tch.cards.service/types", "WSTransactionLineItem"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locationCountry");
        elemField.setXmlName(new javax.xml.namespace.QName("", "locationCountry"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locationCurrency");
        elemField.setXmlName(new javax.xml.namespace.QName("", "locationCurrency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locationId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "locationId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("messageDLVD");
        elemField.setXmlName(new javax.xml.namespace.QName("", "messageDLVD"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("netTotal");
        elemField.setXmlName(new javax.xml.namespace.QName("", "netTotal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nonAreaFee");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nonAreaFee"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("override");
        elemField.setXmlName(new javax.xml.namespace.QName("", "override"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postDiscTax");
        elemField.setXmlName(new javax.xml.namespace.QName("", "postDiscTax"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("preDiscTax");
        elemField.setXmlName(new javax.xml.namespace.QName("", "preDiscTax"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prefTotal");
        elemField.setXmlName(new javax.xml.namespace.QName("", "prefTotal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reportedCarrier");
        elemField.setXmlName(new javax.xml.namespace.QName("", "reportedCarrier"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("settleAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "settleAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("settleId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "settleId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("splitBilling");
        elemField.setXmlName(new javax.xml.namespace.QName("", "splitBilling"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statementId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "statementId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("supplierId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "supplierId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("suprFee");
        elemField.setXmlName(new javax.xml.namespace.QName("", "suprFee"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxExemptAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "taxExemptAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("terminalId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "terminalId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("terminalType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "terminalType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transReported");
        elemField.setXmlName(new javax.xml.namespace.QName("", "transReported"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "transactionDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "transactionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "transactionType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
