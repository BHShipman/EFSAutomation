/**
 * WSCardInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package service.cards.tch.com.types;

public class WSCardInfo  implements java.io.Serializable {
    private java.lang.String infoId;

    private boolean lengthCheck;

    private java.lang.String matchValue;

    private int maximum;

    private int minimum;

    private java.lang.String reportValue;

    private java.lang.String validationType;

    private int value;

    public WSCardInfo() {
    }

    public WSCardInfo(
           java.lang.String infoId,
           boolean lengthCheck,
           java.lang.String matchValue,
           int maximum,
           int minimum,
           java.lang.String reportValue,
           java.lang.String validationType,
           int value) {
           this.infoId = infoId;
           this.lengthCheck = lengthCheck;
           this.matchValue = matchValue;
           this.maximum = maximum;
           this.minimum = minimum;
           this.reportValue = reportValue;
           this.validationType = validationType;
           this.value = value;
    }


    /**
     * Gets the infoId value for this WSCardInfo.
     * 
     * @return infoId
     */
    public java.lang.String getInfoId() {
        return infoId;
    }


    /**
     * Sets the infoId value for this WSCardInfo.
     * 
     * @param infoId
     */
    public void setInfoId(java.lang.String infoId) {
        this.infoId = infoId;
    }


    /**
     * Gets the lengthCheck value for this WSCardInfo.
     * 
     * @return lengthCheck
     */
    public boolean isLengthCheck() {
        return lengthCheck;
    }


    /**
     * Sets the lengthCheck value for this WSCardInfo.
     * 
     * @param lengthCheck
     */
    public void setLengthCheck(boolean lengthCheck) {
        this.lengthCheck = lengthCheck;
    }


    /**
     * Gets the matchValue value for this WSCardInfo.
     * 
     * @return matchValue
     */
    public java.lang.String getMatchValue() {
        return matchValue;
    }


    /**
     * Sets the matchValue value for this WSCardInfo.
     * 
     * @param matchValue
     */
    public void setMatchValue(java.lang.String matchValue) {
        this.matchValue = matchValue;
    }


    /**
     * Gets the maximum value for this WSCardInfo.
     * 
     * @return maximum
     */
    public int getMaximum() {
        return maximum;
    }


    /**
     * Sets the maximum value for this WSCardInfo.
     * 
     * @param maximum
     */
    public void setMaximum(int maximum) {
        this.maximum = maximum;
    }


    /**
     * Gets the minimum value for this WSCardInfo.
     * 
     * @return minimum
     */
    public int getMinimum() {
        return minimum;
    }


    /**
     * Sets the minimum value for this WSCardInfo.
     * 
     * @param minimum
     */
    public void setMinimum(int minimum) {
        this.minimum = minimum;
    }


    /**
     * Gets the reportValue value for this WSCardInfo.
     * 
     * @return reportValue
     */
    public java.lang.String getReportValue() {
        return reportValue;
    }


    /**
     * Sets the reportValue value for this WSCardInfo.
     * 
     * @param reportValue
     */
    public void setReportValue(java.lang.String reportValue) {
        this.reportValue = reportValue;
    }


    /**
     * Gets the validationType value for this WSCardInfo.
     * 
     * @return validationType
     */
    public java.lang.String getValidationType() {
        return validationType;
    }


    /**
     * Sets the validationType value for this WSCardInfo.
     * 
     * @param validationType
     */
    public void setValidationType(java.lang.String validationType) {
        this.validationType = validationType;
    }


    /**
     * Gets the value value for this WSCardInfo.
     * 
     * @return value
     */
    public int getValue() {
        return value;
    }


    /**
     * Sets the value value for this WSCardInfo.
     * 
     * @param value
     */
    public void setValue(int value) {
        this.value = value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WSCardInfo)) return false;
        WSCardInfo other = (WSCardInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.infoId==null && other.getInfoId()==null) || 
             (this.infoId!=null &&
              this.infoId.equals(other.getInfoId()))) &&
            this.lengthCheck == other.isLengthCheck() &&
            ((this.matchValue==null && other.getMatchValue()==null) || 
             (this.matchValue!=null &&
              this.matchValue.equals(other.getMatchValue()))) &&
            this.maximum == other.getMaximum() &&
            this.minimum == other.getMinimum() &&
            ((this.reportValue==null && other.getReportValue()==null) || 
             (this.reportValue!=null &&
              this.reportValue.equals(other.getReportValue()))) &&
            ((this.validationType==null && other.getValidationType()==null) || 
             (this.validationType!=null &&
              this.validationType.equals(other.getValidationType()))) &&
            this.value == other.getValue();
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
        if (getInfoId() != null) {
            _hashCode += getInfoId().hashCode();
        }
        _hashCode += (isLengthCheck() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getMatchValue() != null) {
            _hashCode += getMatchValue().hashCode();
        }
        _hashCode += getMaximum();
        _hashCode += getMinimum();
        if (getReportValue() != null) {
            _hashCode += getReportValue().hashCode();
        }
        if (getValidationType() != null) {
            _hashCode += getValidationType().hashCode();
        }
        _hashCode += getValue();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WSCardInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://com.tch.cards.service/types", "WSCardInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("infoId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "infoId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lengthCheck");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lengthCheck"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("matchValue");
        elemField.setXmlName(new javax.xml.namespace.QName("", "matchValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maximum");
        elemField.setXmlName(new javax.xml.namespace.QName("", "maximum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minimum");
        elemField.setXmlName(new javax.xml.namespace.QName("", "minimum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reportValue");
        elemField.setXmlName(new javax.xml.namespace.QName("", "reportValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("validationType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "validationType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("value");
        elemField.setXmlName(new javax.xml.namespace.QName("", "value"));
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
