/**
 * WSContract.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package service.cards.tch.com.types;

public class WSContract  implements java.io.Serializable {
    private double checkFee;

    private int contractId;

    private java.lang.String country;

    private java.lang.String currency;

    private java.lang.String description;

    private int issuerId;

    private int limitMethod;

    private boolean masterContract;

    private java.lang.String status;

    public WSContract() {
    }

    public WSContract(
           double checkFee,
           int contractId,
           java.lang.String country,
           java.lang.String currency,
           java.lang.String description,
           int issuerId,
           int limitMethod,
           boolean masterContract,
           java.lang.String status) {
           this.checkFee = checkFee;
           this.contractId = contractId;
           this.country = country;
           this.currency = currency;
           this.description = description;
           this.issuerId = issuerId;
           this.limitMethod = limitMethod;
           this.masterContract = masterContract;
           this.status = status;
    }


    /**
     * Gets the checkFee value for this WSContract.
     * 
     * @return checkFee
     */
    public double getCheckFee() {
        return checkFee;
    }


    /**
     * Sets the checkFee value for this WSContract.
     * 
     * @param checkFee
     */
    public void setCheckFee(double checkFee) {
        this.checkFee = checkFee;
    }


    /**
     * Gets the contractId value for this WSContract.
     * 
     * @return contractId
     */
    public int getContractId() {
        return contractId;
    }


    /**
     * Sets the contractId value for this WSContract.
     * 
     * @param contractId
     */
    public void setContractId(int contractId) {
        this.contractId = contractId;
    }


    /**
     * Gets the country value for this WSContract.
     * 
     * @return country
     */
    public java.lang.String getCountry() {
        return country;
    }


    /**
     * Sets the country value for this WSContract.
     * 
     * @param country
     */
    public void setCountry(java.lang.String country) {
        this.country = country;
    }


    /**
     * Gets the currency value for this WSContract.
     * 
     * @return currency
     */
    public java.lang.String getCurrency() {
        return currency;
    }


    /**
     * Sets the currency value for this WSContract.
     * 
     * @param currency
     */
    public void setCurrency(java.lang.String currency) {
        this.currency = currency;
    }


    /**
     * Gets the description value for this WSContract.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this WSContract.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the issuerId value for this WSContract.
     * 
     * @return issuerId
     */
    public int getIssuerId() {
        return issuerId;
    }


    /**
     * Sets the issuerId value for this WSContract.
     * 
     * @param issuerId
     */
    public void setIssuerId(int issuerId) {
        this.issuerId = issuerId;
    }


    /**
     * Gets the limitMethod value for this WSContract.
     * 
     * @return limitMethod
     */
    public int getLimitMethod() {
        return limitMethod;
    }


    /**
     * Sets the limitMethod value for this WSContract.
     * 
     * @param limitMethod
     */
    public void setLimitMethod(int limitMethod) {
        this.limitMethod = limitMethod;
    }


    /**
     * Gets the masterContract value for this WSContract.
     * 
     * @return masterContract
     */
    public boolean isMasterContract() {
        return masterContract;
    }


    /**
     * Sets the masterContract value for this WSContract.
     * 
     * @param masterContract
     */
    public void setMasterContract(boolean masterContract) {
        this.masterContract = masterContract;
    }


    /**
     * Gets the status value for this WSContract.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this WSContract.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WSContract)) return false;
        WSContract other = (WSContract) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.checkFee == other.getCheckFee() &&
            this.contractId == other.getContractId() &&
            ((this.country==null && other.getCountry()==null) || 
             (this.country!=null &&
              this.country.equals(other.getCountry()))) &&
            ((this.currency==null && other.getCurrency()==null) || 
             (this.currency!=null &&
              this.currency.equals(other.getCurrency()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            this.issuerId == other.getIssuerId() &&
            this.limitMethod == other.getLimitMethod() &&
            this.masterContract == other.isMasterContract() &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus())));
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
        _hashCode += new Double(getCheckFee()).hashCode();
        _hashCode += getContractId();
        if (getCountry() != null) {
            _hashCode += getCountry().hashCode();
        }
        if (getCurrency() != null) {
            _hashCode += getCurrency().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        _hashCode += getIssuerId();
        _hashCode += getLimitMethod();
        _hashCode += (isMasterContract() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WSContract.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://com.tch.cards.service/types", "WSContract"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("checkFee");
        elemField.setXmlName(new javax.xml.namespace.QName("", "checkFee"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contractId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "contractId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("country");
        elemField.setXmlName(new javax.xml.namespace.QName("", "country"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currency");
        elemField.setXmlName(new javax.xml.namespace.QName("", "currency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("issuerId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "issuerId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("limitMethod");
        elemField.setXmlName(new javax.xml.namespace.QName("", "limitMethod"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("masterContract");
        elemField.setXmlName(new javax.xml.namespace.QName("", "masterContract"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
