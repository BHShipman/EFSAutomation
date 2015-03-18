/**
 * WSTransactionLineItem.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package service.cards.tch.com.types;

public class WSTransactionLineItem  implements java.io.Serializable {
    private double amount;

    private int billingFlag;

    private java.lang.String category;

    private double cmptAmount;

    private double cmptPPU;

    private double discAmount;

    private int fuelType;

    private java.lang.String groupCategory;

    private int groupNumber;

    private double issuerDeal;

    private double issuerDealPPU;

    private int lineNumber;

    private int number;

    private double ppu;

    private java.lang.String prodCD;

    private double quantity;

    private double retailPPU;

    private int serviceType;

    private int useType;

    public WSTransactionLineItem() {
    }

    public WSTransactionLineItem(
           double amount,
           int billingFlag,
           java.lang.String category,
           double cmptAmount,
           double cmptPPU,
           double discAmount,
           int fuelType,
           java.lang.String groupCategory,
           int groupNumber,
           double issuerDeal,
           double issuerDealPPU,
           int lineNumber,
           int number,
           double ppu,
           java.lang.String prodCD,
           double quantity,
           double retailPPU,
           int serviceType,
           int useType) {
           this.amount = amount;
           this.billingFlag = billingFlag;
           this.category = category;
           this.cmptAmount = cmptAmount;
           this.cmptPPU = cmptPPU;
           this.discAmount = discAmount;
           this.fuelType = fuelType;
           this.groupCategory = groupCategory;
           this.groupNumber = groupNumber;
           this.issuerDeal = issuerDeal;
           this.issuerDealPPU = issuerDealPPU;
           this.lineNumber = lineNumber;
           this.number = number;
           this.ppu = ppu;
           this.prodCD = prodCD;
           this.quantity = quantity;
           this.retailPPU = retailPPU;
           this.serviceType = serviceType;
           this.useType = useType;
    }


    /**
     * Gets the amount value for this WSTransactionLineItem.
     * 
     * @return amount
     */
    public double getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this WSTransactionLineItem.
     * 
     * @param amount
     */
    public void setAmount(double amount) {
        this.amount = amount;
    }


    /**
     * Gets the billingFlag value for this WSTransactionLineItem.
     * 
     * @return billingFlag
     */
    public int getBillingFlag() {
        return billingFlag;
    }


    /**
     * Sets the billingFlag value for this WSTransactionLineItem.
     * 
     * @param billingFlag
     */
    public void setBillingFlag(int billingFlag) {
        this.billingFlag = billingFlag;
    }


    /**
     * Gets the category value for this WSTransactionLineItem.
     * 
     * @return category
     */
    public java.lang.String getCategory() {
        return category;
    }


    /**
     * Sets the category value for this WSTransactionLineItem.
     * 
     * @param category
     */
    public void setCategory(java.lang.String category) {
        this.category = category;
    }


    /**
     * Gets the cmptAmount value for this WSTransactionLineItem.
     * 
     * @return cmptAmount
     */
    public double getCmptAmount() {
        return cmptAmount;
    }


    /**
     * Sets the cmptAmount value for this WSTransactionLineItem.
     * 
     * @param cmptAmount
     */
    public void setCmptAmount(double cmptAmount) {
        this.cmptAmount = cmptAmount;
    }


    /**
     * Gets the cmptPPU value for this WSTransactionLineItem.
     * 
     * @return cmptPPU
     */
    public double getCmptPPU() {
        return cmptPPU;
    }


    /**
     * Sets the cmptPPU value for this WSTransactionLineItem.
     * 
     * @param cmptPPU
     */
    public void setCmptPPU(double cmptPPU) {
        this.cmptPPU = cmptPPU;
    }


    /**
     * Gets the discAmount value for this WSTransactionLineItem.
     * 
     * @return discAmount
     */
    public double getDiscAmount() {
        return discAmount;
    }


    /**
     * Sets the discAmount value for this WSTransactionLineItem.
     * 
     * @param discAmount
     */
    public void setDiscAmount(double discAmount) {
        this.discAmount = discAmount;
    }


    /**
     * Gets the fuelType value for this WSTransactionLineItem.
     * 
     * @return fuelType
     */
    public int getFuelType() {
        return fuelType;
    }


    /**
     * Sets the fuelType value for this WSTransactionLineItem.
     * 
     * @param fuelType
     */
    public void setFuelType(int fuelType) {
        this.fuelType = fuelType;
    }


    /**
     * Gets the groupCategory value for this WSTransactionLineItem.
     * 
     * @return groupCategory
     */
    public java.lang.String getGroupCategory() {
        return groupCategory;
    }


    /**
     * Sets the groupCategory value for this WSTransactionLineItem.
     * 
     * @param groupCategory
     */
    public void setGroupCategory(java.lang.String groupCategory) {
        this.groupCategory = groupCategory;
    }


    /**
     * Gets the groupNumber value for this WSTransactionLineItem.
     * 
     * @return groupNumber
     */
    public int getGroupNumber() {
        return groupNumber;
    }


    /**
     * Sets the groupNumber value for this WSTransactionLineItem.
     * 
     * @param groupNumber
     */
    public void setGroupNumber(int groupNumber) {
        this.groupNumber = groupNumber;
    }


    /**
     * Gets the issuerDeal value for this WSTransactionLineItem.
     * 
     * @return issuerDeal
     */
    public double getIssuerDeal() {
        return issuerDeal;
    }


    /**
     * Sets the issuerDeal value for this WSTransactionLineItem.
     * 
     * @param issuerDeal
     */
    public void setIssuerDeal(double issuerDeal) {
        this.issuerDeal = issuerDeal;
    }


    /**
     * Gets the issuerDealPPU value for this WSTransactionLineItem.
     * 
     * @return issuerDealPPU
     */
    public double getIssuerDealPPU() {
        return issuerDealPPU;
    }


    /**
     * Sets the issuerDealPPU value for this WSTransactionLineItem.
     * 
     * @param issuerDealPPU
     */
    public void setIssuerDealPPU(double issuerDealPPU) {
        this.issuerDealPPU = issuerDealPPU;
    }


    /**
     * Gets the lineNumber value for this WSTransactionLineItem.
     * 
     * @return lineNumber
     */
    public int getLineNumber() {
        return lineNumber;
    }


    /**
     * Sets the lineNumber value for this WSTransactionLineItem.
     * 
     * @param lineNumber
     */
    public void setLineNumber(int lineNumber) {
        this.lineNumber = lineNumber;
    }


    /**
     * Gets the number value for this WSTransactionLineItem.
     * 
     * @return number
     */
    public int getNumber() {
        return number;
    }


    /**
     * Sets the number value for this WSTransactionLineItem.
     * 
     * @param number
     */
    public void setNumber(int number) {
        this.number = number;
    }


    /**
     * Gets the ppu value for this WSTransactionLineItem.
     * 
     * @return ppu
     */
    public double getPpu() {
        return ppu;
    }


    /**
     * Sets the ppu value for this WSTransactionLineItem.
     * 
     * @param ppu
     */
    public void setPpu(double ppu) {
        this.ppu = ppu;
    }


    /**
     * Gets the prodCD value for this WSTransactionLineItem.
     * 
     * @return prodCD
     */
    public java.lang.String getProdCD() {
        return prodCD;
    }


    /**
     * Sets the prodCD value for this WSTransactionLineItem.
     * 
     * @param prodCD
     */
    public void setProdCD(java.lang.String prodCD) {
        this.prodCD = prodCD;
    }


    /**
     * Gets the quantity value for this WSTransactionLineItem.
     * 
     * @return quantity
     */
    public double getQuantity() {
        return quantity;
    }


    /**
     * Sets the quantity value for this WSTransactionLineItem.
     * 
     * @param quantity
     */
    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }


    /**
     * Gets the retailPPU value for this WSTransactionLineItem.
     * 
     * @return retailPPU
     */
    public double getRetailPPU() {
        return retailPPU;
    }


    /**
     * Sets the retailPPU value for this WSTransactionLineItem.
     * 
     * @param retailPPU
     */
    public void setRetailPPU(double retailPPU) {
        this.retailPPU = retailPPU;
    }


    /**
     * Gets the serviceType value for this WSTransactionLineItem.
     * 
     * @return serviceType
     */
    public int getServiceType() {
        return serviceType;
    }


    /**
     * Sets the serviceType value for this WSTransactionLineItem.
     * 
     * @param serviceType
     */
    public void setServiceType(int serviceType) {
        this.serviceType = serviceType;
    }


    /**
     * Gets the useType value for this WSTransactionLineItem.
     * 
     * @return useType
     */
    public int getUseType() {
        return useType;
    }


    /**
     * Sets the useType value for this WSTransactionLineItem.
     * 
     * @param useType
     */
    public void setUseType(int useType) {
        this.useType = useType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WSTransactionLineItem)) return false;
        WSTransactionLineItem other = (WSTransactionLineItem) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.amount == other.getAmount() &&
            this.billingFlag == other.getBillingFlag() &&
            ((this.category==null && other.getCategory()==null) || 
             (this.category!=null &&
              this.category.equals(other.getCategory()))) &&
            this.cmptAmount == other.getCmptAmount() &&
            this.cmptPPU == other.getCmptPPU() &&
            this.discAmount == other.getDiscAmount() &&
            this.fuelType == other.getFuelType() &&
            ((this.groupCategory==null && other.getGroupCategory()==null) || 
             (this.groupCategory!=null &&
              this.groupCategory.equals(other.getGroupCategory()))) &&
            this.groupNumber == other.getGroupNumber() &&
            this.issuerDeal == other.getIssuerDeal() &&
            this.issuerDealPPU == other.getIssuerDealPPU() &&
            this.lineNumber == other.getLineNumber() &&
            this.number == other.getNumber() &&
            this.ppu == other.getPpu() &&
            ((this.prodCD==null && other.getProdCD()==null) || 
             (this.prodCD!=null &&
              this.prodCD.equals(other.getProdCD()))) &&
            this.quantity == other.getQuantity() &&
            this.retailPPU == other.getRetailPPU() &&
            this.serviceType == other.getServiceType() &&
            this.useType == other.getUseType();
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
        _hashCode += new Double(getAmount()).hashCode();
        _hashCode += getBillingFlag();
        if (getCategory() != null) {
            _hashCode += getCategory().hashCode();
        }
        _hashCode += new Double(getCmptAmount()).hashCode();
        _hashCode += new Double(getCmptPPU()).hashCode();
        _hashCode += new Double(getDiscAmount()).hashCode();
        _hashCode += getFuelType();
        if (getGroupCategory() != null) {
            _hashCode += getGroupCategory().hashCode();
        }
        _hashCode += getGroupNumber();
        _hashCode += new Double(getIssuerDeal()).hashCode();
        _hashCode += new Double(getIssuerDealPPU()).hashCode();
        _hashCode += getLineNumber();
        _hashCode += getNumber();
        _hashCode += new Double(getPpu()).hashCode();
        if (getProdCD() != null) {
            _hashCode += getProdCD().hashCode();
        }
        _hashCode += new Double(getQuantity()).hashCode();
        _hashCode += new Double(getRetailPPU()).hashCode();
        _hashCode += getServiceType();
        _hashCode += getUseType();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WSTransactionLineItem.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://com.tch.cards.service/types", "WSTransactionLineItem"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billingFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "billingFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("category");
        elemField.setXmlName(new javax.xml.namespace.QName("", "category"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cmptAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cmptAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cmptPPU");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cmptPPU"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("discAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "discAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fuelType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fuelType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("groupCategory");
        elemField.setXmlName(new javax.xml.namespace.QName("", "groupCategory"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("groupNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "groupNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("issuerDeal");
        elemField.setXmlName(new javax.xml.namespace.QName("", "issuerDeal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("issuerDealPPU");
        elemField.setXmlName(new javax.xml.namespace.QName("", "issuerDealPPU"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lineNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lineNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("number");
        elemField.setXmlName(new javax.xml.namespace.QName("", "number"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ppu");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ppu"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prodCD");
        elemField.setXmlName(new javax.xml.namespace.QName("", "prodCD"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantity");
        elemField.setXmlName(new javax.xml.namespace.QName("", "quantity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("retailPPU");
        elemField.setXmlName(new javax.xml.namespace.QName("", "retailPPU"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "serviceType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("useType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "useType"));
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
