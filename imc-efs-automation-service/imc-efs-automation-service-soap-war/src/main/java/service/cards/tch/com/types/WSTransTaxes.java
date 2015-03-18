/**
 * WSTransTaxes.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package service.cards.tch.com.types;

public class WSTransTaxes  implements java.io.Serializable {
    private java.lang.String taxDescription;

    private java.lang.String grossNetFlag;

    private double amount;

    private java.lang.String taxClass;

    private java.util.Calendar deferralDate;

    private java.lang.String exemptFlag;

    private java.lang.String taxCode;

    public WSTransTaxes() {
    }

    public WSTransTaxes(
           java.lang.String taxDescription,
           java.lang.String grossNetFlag,
           double amount,
           java.lang.String taxClass,
           java.util.Calendar deferralDate,
           java.lang.String exemptFlag,
           java.lang.String taxCode) {
           this.taxDescription = taxDescription;
           this.grossNetFlag = grossNetFlag;
           this.amount = amount;
           this.taxClass = taxClass;
           this.deferralDate = deferralDate;
           this.exemptFlag = exemptFlag;
           this.taxCode = taxCode;
    }


    /**
     * Gets the taxDescription value for this WSTransTaxes.
     * 
     * @return taxDescription
     */
    public java.lang.String getTaxDescription() {
        return taxDescription;
    }


    /**
     * Sets the taxDescription value for this WSTransTaxes.
     * 
     * @param taxDescription
     */
    public void setTaxDescription(java.lang.String taxDescription) {
        this.taxDescription = taxDescription;
    }


    /**
     * Gets the grossNetFlag value for this WSTransTaxes.
     * 
     * @return grossNetFlag
     */
    public java.lang.String getGrossNetFlag() {
        return grossNetFlag;
    }


    /**
     * Sets the grossNetFlag value for this WSTransTaxes.
     * 
     * @param grossNetFlag
     */
    public void setGrossNetFlag(java.lang.String grossNetFlag) {
        this.grossNetFlag = grossNetFlag;
    }


    /**
     * Gets the amount value for this WSTransTaxes.
     * 
     * @return amount
     */
    public double getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this WSTransTaxes.
     * 
     * @param amount
     */
    public void setAmount(double amount) {
        this.amount = amount;
    }


    /**
     * Gets the taxClass value for this WSTransTaxes.
     * 
     * @return taxClass
     */
    public java.lang.String getTaxClass() {
        return taxClass;
    }


    /**
     * Sets the taxClass value for this WSTransTaxes.
     * 
     * @param taxClass
     */
    public void setTaxClass(java.lang.String taxClass) {
        this.taxClass = taxClass;
    }


    /**
     * Gets the deferralDate value for this WSTransTaxes.
     * 
     * @return deferralDate
     */
    public java.util.Calendar getDeferralDate() {
        return deferralDate;
    }


    /**
     * Sets the deferralDate value for this WSTransTaxes.
     * 
     * @param deferralDate
     */
    public void setDeferralDate(java.util.Calendar deferralDate) {
        this.deferralDate = deferralDate;
    }


    /**
     * Gets the exemptFlag value for this WSTransTaxes.
     * 
     * @return exemptFlag
     */
    public java.lang.String getExemptFlag() {
        return exemptFlag;
    }


    /**
     * Sets the exemptFlag value for this WSTransTaxes.
     * 
     * @param exemptFlag
     */
    public void setExemptFlag(java.lang.String exemptFlag) {
        this.exemptFlag = exemptFlag;
    }


    /**
     * Gets the taxCode value for this WSTransTaxes.
     * 
     * @return taxCode
     */
    public java.lang.String getTaxCode() {
        return taxCode;
    }


    /**
     * Sets the taxCode value for this WSTransTaxes.
     * 
     * @param taxCode
     */
    public void setTaxCode(java.lang.String taxCode) {
        this.taxCode = taxCode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WSTransTaxes)) return false;
        WSTransTaxes other = (WSTransTaxes) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.taxDescription==null && other.getTaxDescription()==null) || 
             (this.taxDescription!=null &&
              this.taxDescription.equals(other.getTaxDescription()))) &&
            ((this.grossNetFlag==null && other.getGrossNetFlag()==null) || 
             (this.grossNetFlag!=null &&
              this.grossNetFlag.equals(other.getGrossNetFlag()))) &&
            this.amount == other.getAmount() &&
            ((this.taxClass==null && other.getTaxClass()==null) || 
             (this.taxClass!=null &&
              this.taxClass.equals(other.getTaxClass()))) &&
            ((this.deferralDate==null && other.getDeferralDate()==null) || 
             (this.deferralDate!=null &&
              this.deferralDate.equals(other.getDeferralDate()))) &&
            ((this.exemptFlag==null && other.getExemptFlag()==null) || 
             (this.exemptFlag!=null &&
              this.exemptFlag.equals(other.getExemptFlag()))) &&
            ((this.taxCode==null && other.getTaxCode()==null) || 
             (this.taxCode!=null &&
              this.taxCode.equals(other.getTaxCode())));
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
        if (getTaxDescription() != null) {
            _hashCode += getTaxDescription().hashCode();
        }
        if (getGrossNetFlag() != null) {
            _hashCode += getGrossNetFlag().hashCode();
        }
        _hashCode += new Double(getAmount()).hashCode();
        if (getTaxClass() != null) {
            _hashCode += getTaxClass().hashCode();
        }
        if (getDeferralDate() != null) {
            _hashCode += getDeferralDate().hashCode();
        }
        if (getExemptFlag() != null) {
            _hashCode += getExemptFlag().hashCode();
        }
        if (getTaxCode() != null) {
            _hashCode += getTaxCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WSTransTaxes.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://com.tch.cards.service/types", "WSTransTaxes"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("", "taxDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("grossNetFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "grossNetFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxClass");
        elemField.setXmlName(new javax.xml.namespace.QName("", "taxClass"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deferralDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "deferralDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exemptFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "exemptFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "taxCode"));
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
