/**
 * WSTransLineTax.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package service.cards.tch.com.types;

public class WSTransLineTax  implements java.io.Serializable {
    private java.lang.String taxDescription;

    private java.lang.String grossNetFlag;

    private double amount;

    private java.lang.String taxClass;

    private java.util.Calendar deferralDate;

    private java.lang.String taxCode;

    private java.lang.String exemptFlag;

    private double pstExemptAdjust;

    private double gstExemptAdjust;

    public WSTransLineTax() {
    }

    public WSTransLineTax(
           java.lang.String taxDescription,
           java.lang.String grossNetFlag,
           double amount,
           java.lang.String taxClass,
           java.util.Calendar deferralDate,
           java.lang.String taxCode,
           java.lang.String exemptFlag,
           double pstExemptAdjust,
           double gstExemptAdjust) {
           this.taxDescription = taxDescription;
           this.grossNetFlag = grossNetFlag;
           this.amount = amount;
           this.taxClass = taxClass;
           this.deferralDate = deferralDate;
           this.taxCode = taxCode;
           this.exemptFlag = exemptFlag;
           this.pstExemptAdjust = pstExemptAdjust;
           this.gstExemptAdjust = gstExemptAdjust;
    }


    /**
     * Gets the taxDescription value for this WSTransLineTax.
     * 
     * @return taxDescription
     */
    public java.lang.String getTaxDescription() {
        return taxDescription;
    }


    /**
     * Sets the taxDescription value for this WSTransLineTax.
     * 
     * @param taxDescription
     */
    public void setTaxDescription(java.lang.String taxDescription) {
        this.taxDescription = taxDescription;
    }


    /**
     * Gets the grossNetFlag value for this WSTransLineTax.
     * 
     * @return grossNetFlag
     */
    public java.lang.String getGrossNetFlag() {
        return grossNetFlag;
    }


    /**
     * Sets the grossNetFlag value for this WSTransLineTax.
     * 
     * @param grossNetFlag
     */
    public void setGrossNetFlag(java.lang.String grossNetFlag) {
        this.grossNetFlag = grossNetFlag;
    }


    /**
     * Gets the amount value for this WSTransLineTax.
     * 
     * @return amount
     */
    public double getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this WSTransLineTax.
     * 
     * @param amount
     */
    public void setAmount(double amount) {
        this.amount = amount;
    }


    /**
     * Gets the taxClass value for this WSTransLineTax.
     * 
     * @return taxClass
     */
    public java.lang.String getTaxClass() {
        return taxClass;
    }


    /**
     * Sets the taxClass value for this WSTransLineTax.
     * 
     * @param taxClass
     */
    public void setTaxClass(java.lang.String taxClass) {
        this.taxClass = taxClass;
    }


    /**
     * Gets the deferralDate value for this WSTransLineTax.
     * 
     * @return deferralDate
     */
    public java.util.Calendar getDeferralDate() {
        return deferralDate;
    }


    /**
     * Sets the deferralDate value for this WSTransLineTax.
     * 
     * @param deferralDate
     */
    public void setDeferralDate(java.util.Calendar deferralDate) {
        this.deferralDate = deferralDate;
    }


    /**
     * Gets the taxCode value for this WSTransLineTax.
     * 
     * @return taxCode
     */
    public java.lang.String getTaxCode() {
        return taxCode;
    }


    /**
     * Sets the taxCode value for this WSTransLineTax.
     * 
     * @param taxCode
     */
    public void setTaxCode(java.lang.String taxCode) {
        this.taxCode = taxCode;
    }


    /**
     * Gets the exemptFlag value for this WSTransLineTax.
     * 
     * @return exemptFlag
     */
    public java.lang.String getExemptFlag() {
        return exemptFlag;
    }


    /**
     * Sets the exemptFlag value for this WSTransLineTax.
     * 
     * @param exemptFlag
     */
    public void setExemptFlag(java.lang.String exemptFlag) {
        this.exemptFlag = exemptFlag;
    }


    /**
     * Gets the pstExemptAdjust value for this WSTransLineTax.
     * 
     * @return pstExemptAdjust
     */
    public double getPstExemptAdjust() {
        return pstExemptAdjust;
    }


    /**
     * Sets the pstExemptAdjust value for this WSTransLineTax.
     * 
     * @param pstExemptAdjust
     */
    public void setPstExemptAdjust(double pstExemptAdjust) {
        this.pstExemptAdjust = pstExemptAdjust;
    }


    /**
     * Gets the gstExemptAdjust value for this WSTransLineTax.
     * 
     * @return gstExemptAdjust
     */
    public double getGstExemptAdjust() {
        return gstExemptAdjust;
    }


    /**
     * Sets the gstExemptAdjust value for this WSTransLineTax.
     * 
     * @param gstExemptAdjust
     */
    public void setGstExemptAdjust(double gstExemptAdjust) {
        this.gstExemptAdjust = gstExemptAdjust;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WSTransLineTax)) return false;
        WSTransLineTax other = (WSTransLineTax) obj;
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
            ((this.taxCode==null && other.getTaxCode()==null) || 
             (this.taxCode!=null &&
              this.taxCode.equals(other.getTaxCode()))) &&
            ((this.exemptFlag==null && other.getExemptFlag()==null) || 
             (this.exemptFlag!=null &&
              this.exemptFlag.equals(other.getExemptFlag()))) &&
            this.pstExemptAdjust == other.getPstExemptAdjust() &&
            this.gstExemptAdjust == other.getGstExemptAdjust();
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
        if (getTaxCode() != null) {
            _hashCode += getTaxCode().hashCode();
        }
        if (getExemptFlag() != null) {
            _hashCode += getExemptFlag().hashCode();
        }
        _hashCode += new Double(getPstExemptAdjust()).hashCode();
        _hashCode += new Double(getGstExemptAdjust()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WSTransLineTax.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://com.tch.cards.service/types", "WSTransLineTax"));
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
        elemField.setFieldName("taxCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "taxCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exemptFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "exemptFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pstExemptAdjust");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pstExemptAdjust"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gstExemptAdjust");
        elemField.setXmlName(new javax.xml.namespace.QName("", "gstExemptAdjust"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
