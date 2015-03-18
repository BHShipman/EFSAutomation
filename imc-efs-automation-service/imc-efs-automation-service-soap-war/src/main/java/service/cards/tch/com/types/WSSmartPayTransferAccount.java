/**
 * WSSmartPayTransferAccount.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package service.cards.tch.com.types;

public class WSSmartPayTransferAccount  implements java.io.Serializable {
    private int transferAccountId;

    private java.lang.String cardNumber;

    private java.lang.String bankName;

    private java.lang.String routingNumber;

    private java.lang.String accountNumber;

    private java.lang.String accountOwnerName;

    private int accountType;

    private java.lang.String accountNickname;

    private java.util.Calendar effectiveDate;

    private int batchHeaderId;

    private java.lang.String createdBy;

    private java.util.Calendar verifyDate;

    private double verifyAmountOne;

    private double verifyAmountTwo;

    private int verifyTryCount;

    private java.util.Calendar expireDate;

    public WSSmartPayTransferAccount() {
    }

    public WSSmartPayTransferAccount(
           int transferAccountId,
           java.lang.String cardNumber,
           java.lang.String bankName,
           java.lang.String routingNumber,
           java.lang.String accountNumber,
           java.lang.String accountOwnerName,
           int accountType,
           java.lang.String accountNickname,
           java.util.Calendar effectiveDate,
           int batchHeaderId,
           java.lang.String createdBy,
           java.util.Calendar verifyDate,
           double verifyAmountOne,
           double verifyAmountTwo,
           int verifyTryCount,
           java.util.Calendar expireDate) {
           this.transferAccountId = transferAccountId;
           this.cardNumber = cardNumber;
           this.bankName = bankName;
           this.routingNumber = routingNumber;
           this.accountNumber = accountNumber;
           this.accountOwnerName = accountOwnerName;
           this.accountType = accountType;
           this.accountNickname = accountNickname;
           this.effectiveDate = effectiveDate;
           this.batchHeaderId = batchHeaderId;
           this.createdBy = createdBy;
           this.verifyDate = verifyDate;
           this.verifyAmountOne = verifyAmountOne;
           this.verifyAmountTwo = verifyAmountTwo;
           this.verifyTryCount = verifyTryCount;
           this.expireDate = expireDate;
    }


    /**
     * Gets the transferAccountId value for this WSSmartPayTransferAccount.
     * 
     * @return transferAccountId
     */
    public int getTransferAccountId() {
        return transferAccountId;
    }


    /**
     * Sets the transferAccountId value for this WSSmartPayTransferAccount.
     * 
     * @param transferAccountId
     */
    public void setTransferAccountId(int transferAccountId) {
        this.transferAccountId = transferAccountId;
    }


    /**
     * Gets the cardNumber value for this WSSmartPayTransferAccount.
     * 
     * @return cardNumber
     */
    public java.lang.String getCardNumber() {
        return cardNumber;
    }


    /**
     * Sets the cardNumber value for this WSSmartPayTransferAccount.
     * 
     * @param cardNumber
     */
    public void setCardNumber(java.lang.String cardNumber) {
        this.cardNumber = cardNumber;
    }


    /**
     * Gets the bankName value for this WSSmartPayTransferAccount.
     * 
     * @return bankName
     */
    public java.lang.String getBankName() {
        return bankName;
    }


    /**
     * Sets the bankName value for this WSSmartPayTransferAccount.
     * 
     * @param bankName
     */
    public void setBankName(java.lang.String bankName) {
        this.bankName = bankName;
    }


    /**
     * Gets the routingNumber value for this WSSmartPayTransferAccount.
     * 
     * @return routingNumber
     */
    public java.lang.String getRoutingNumber() {
        return routingNumber;
    }


    /**
     * Sets the routingNumber value for this WSSmartPayTransferAccount.
     * 
     * @param routingNumber
     */
    public void setRoutingNumber(java.lang.String routingNumber) {
        this.routingNumber = routingNumber;
    }


    /**
     * Gets the accountNumber value for this WSSmartPayTransferAccount.
     * 
     * @return accountNumber
     */
    public java.lang.String getAccountNumber() {
        return accountNumber;
    }


    /**
     * Sets the accountNumber value for this WSSmartPayTransferAccount.
     * 
     * @param accountNumber
     */
    public void setAccountNumber(java.lang.String accountNumber) {
        this.accountNumber = accountNumber;
    }


    /**
     * Gets the accountOwnerName value for this WSSmartPayTransferAccount.
     * 
     * @return accountOwnerName
     */
    public java.lang.String getAccountOwnerName() {
        return accountOwnerName;
    }


    /**
     * Sets the accountOwnerName value for this WSSmartPayTransferAccount.
     * 
     * @param accountOwnerName
     */
    public void setAccountOwnerName(java.lang.String accountOwnerName) {
        this.accountOwnerName = accountOwnerName;
    }


    /**
     * Gets the accountType value for this WSSmartPayTransferAccount.
     * 
     * @return accountType
     */
    public int getAccountType() {
        return accountType;
    }


    /**
     * Sets the accountType value for this WSSmartPayTransferAccount.
     * 
     * @param accountType
     */
    public void setAccountType(int accountType) {
        this.accountType = accountType;
    }


    /**
     * Gets the accountNickname value for this WSSmartPayTransferAccount.
     * 
     * @return accountNickname
     */
    public java.lang.String getAccountNickname() {
        return accountNickname;
    }


    /**
     * Sets the accountNickname value for this WSSmartPayTransferAccount.
     * 
     * @param accountNickname
     */
    public void setAccountNickname(java.lang.String accountNickname) {
        this.accountNickname = accountNickname;
    }


    /**
     * Gets the effectiveDate value for this WSSmartPayTransferAccount.
     * 
     * @return effectiveDate
     */
    public java.util.Calendar getEffectiveDate() {
        return effectiveDate;
    }


    /**
     * Sets the effectiveDate value for this WSSmartPayTransferAccount.
     * 
     * @param effectiveDate
     */
    public void setEffectiveDate(java.util.Calendar effectiveDate) {
        this.effectiveDate = effectiveDate;
    }


    /**
     * Gets the batchHeaderId value for this WSSmartPayTransferAccount.
     * 
     * @return batchHeaderId
     */
    public int getBatchHeaderId() {
        return batchHeaderId;
    }


    /**
     * Sets the batchHeaderId value for this WSSmartPayTransferAccount.
     * 
     * @param batchHeaderId
     */
    public void setBatchHeaderId(int batchHeaderId) {
        this.batchHeaderId = batchHeaderId;
    }


    /**
     * Gets the createdBy value for this WSSmartPayTransferAccount.
     * 
     * @return createdBy
     */
    public java.lang.String getCreatedBy() {
        return createdBy;
    }


    /**
     * Sets the createdBy value for this WSSmartPayTransferAccount.
     * 
     * @param createdBy
     */
    public void setCreatedBy(java.lang.String createdBy) {
        this.createdBy = createdBy;
    }


    /**
     * Gets the verifyDate value for this WSSmartPayTransferAccount.
     * 
     * @return verifyDate
     */
    public java.util.Calendar getVerifyDate() {
        return verifyDate;
    }


    /**
     * Sets the verifyDate value for this WSSmartPayTransferAccount.
     * 
     * @param verifyDate
     */
    public void setVerifyDate(java.util.Calendar verifyDate) {
        this.verifyDate = verifyDate;
    }


    /**
     * Gets the verifyAmountOne value for this WSSmartPayTransferAccount.
     * 
     * @return verifyAmountOne
     */
    public double getVerifyAmountOne() {
        return verifyAmountOne;
    }


    /**
     * Sets the verifyAmountOne value for this WSSmartPayTransferAccount.
     * 
     * @param verifyAmountOne
     */
    public void setVerifyAmountOne(double verifyAmountOne) {
        this.verifyAmountOne = verifyAmountOne;
    }


    /**
     * Gets the verifyAmountTwo value for this WSSmartPayTransferAccount.
     * 
     * @return verifyAmountTwo
     */
    public double getVerifyAmountTwo() {
        return verifyAmountTwo;
    }


    /**
     * Sets the verifyAmountTwo value for this WSSmartPayTransferAccount.
     * 
     * @param verifyAmountTwo
     */
    public void setVerifyAmountTwo(double verifyAmountTwo) {
        this.verifyAmountTwo = verifyAmountTwo;
    }


    /**
     * Gets the verifyTryCount value for this WSSmartPayTransferAccount.
     * 
     * @return verifyTryCount
     */
    public int getVerifyTryCount() {
        return verifyTryCount;
    }


    /**
     * Sets the verifyTryCount value for this WSSmartPayTransferAccount.
     * 
     * @param verifyTryCount
     */
    public void setVerifyTryCount(int verifyTryCount) {
        this.verifyTryCount = verifyTryCount;
    }


    /**
     * Gets the expireDate value for this WSSmartPayTransferAccount.
     * 
     * @return expireDate
     */
    public java.util.Calendar getExpireDate() {
        return expireDate;
    }


    /**
     * Sets the expireDate value for this WSSmartPayTransferAccount.
     * 
     * @param expireDate
     */
    public void setExpireDate(java.util.Calendar expireDate) {
        this.expireDate = expireDate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WSSmartPayTransferAccount)) return false;
        WSSmartPayTransferAccount other = (WSSmartPayTransferAccount) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.transferAccountId == other.getTransferAccountId() &&
            ((this.cardNumber==null && other.getCardNumber()==null) || 
             (this.cardNumber!=null &&
              this.cardNumber.equals(other.getCardNumber()))) &&
            ((this.bankName==null && other.getBankName()==null) || 
             (this.bankName!=null &&
              this.bankName.equals(other.getBankName()))) &&
            ((this.routingNumber==null && other.getRoutingNumber()==null) || 
             (this.routingNumber!=null &&
              this.routingNumber.equals(other.getRoutingNumber()))) &&
            ((this.accountNumber==null && other.getAccountNumber()==null) || 
             (this.accountNumber!=null &&
              this.accountNumber.equals(other.getAccountNumber()))) &&
            ((this.accountOwnerName==null && other.getAccountOwnerName()==null) || 
             (this.accountOwnerName!=null &&
              this.accountOwnerName.equals(other.getAccountOwnerName()))) &&
            this.accountType == other.getAccountType() &&
            ((this.accountNickname==null && other.getAccountNickname()==null) || 
             (this.accountNickname!=null &&
              this.accountNickname.equals(other.getAccountNickname()))) &&
            ((this.effectiveDate==null && other.getEffectiveDate()==null) || 
             (this.effectiveDate!=null &&
              this.effectiveDate.equals(other.getEffectiveDate()))) &&
            this.batchHeaderId == other.getBatchHeaderId() &&
            ((this.createdBy==null && other.getCreatedBy()==null) || 
             (this.createdBy!=null &&
              this.createdBy.equals(other.getCreatedBy()))) &&
            ((this.verifyDate==null && other.getVerifyDate()==null) || 
             (this.verifyDate!=null &&
              this.verifyDate.equals(other.getVerifyDate()))) &&
            this.verifyAmountOne == other.getVerifyAmountOne() &&
            this.verifyAmountTwo == other.getVerifyAmountTwo() &&
            this.verifyTryCount == other.getVerifyTryCount() &&
            ((this.expireDate==null && other.getExpireDate()==null) || 
             (this.expireDate!=null &&
              this.expireDate.equals(other.getExpireDate())));
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
        _hashCode += getTransferAccountId();
        if (getCardNumber() != null) {
            _hashCode += getCardNumber().hashCode();
        }
        if (getBankName() != null) {
            _hashCode += getBankName().hashCode();
        }
        if (getRoutingNumber() != null) {
            _hashCode += getRoutingNumber().hashCode();
        }
        if (getAccountNumber() != null) {
            _hashCode += getAccountNumber().hashCode();
        }
        if (getAccountOwnerName() != null) {
            _hashCode += getAccountOwnerName().hashCode();
        }
        _hashCode += getAccountType();
        if (getAccountNickname() != null) {
            _hashCode += getAccountNickname().hashCode();
        }
        if (getEffectiveDate() != null) {
            _hashCode += getEffectiveDate().hashCode();
        }
        _hashCode += getBatchHeaderId();
        if (getCreatedBy() != null) {
            _hashCode += getCreatedBy().hashCode();
        }
        if (getVerifyDate() != null) {
            _hashCode += getVerifyDate().hashCode();
        }
        _hashCode += new Double(getVerifyAmountOne()).hashCode();
        _hashCode += new Double(getVerifyAmountTwo()).hashCode();
        _hashCode += getVerifyTryCount();
        if (getExpireDate() != null) {
            _hashCode += getExpireDate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WSSmartPayTransferAccount.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://com.tch.cards.service/types", "WSSmartPayTransferAccount"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transferAccountId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "transferAccountId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cardNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cardNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bankName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bankName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("routingNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "routingNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "accountNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountOwnerName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "accountOwnerName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "accountType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountNickname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "accountNickname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("effectiveDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "effectiveDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("batchHeaderId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "batchHeaderId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createdBy");
        elemField.setXmlName(new javax.xml.namespace.QName("", "createdBy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("verifyDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "verifyDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("verifyAmountOne");
        elemField.setXmlName(new javax.xml.namespace.QName("", "verifyAmountOne"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("verifyAmountTwo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "verifyAmountTwo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("verifyTryCount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "verifyTryCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expireDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "expireDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
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
