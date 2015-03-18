/**
 * WSSmartPayScheduledTransferDefinition.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package service.cards.tch.com.types;

public class WSSmartPayScheduledTransferDefinition  implements java.io.Serializable {
    private int transferAccountId;

    private java.lang.String scheduleType;

    private java.lang.String scheduleValue;

    private java.lang.String transferType;

    private double transferValue;

    private boolean emailNotification;

    public WSSmartPayScheduledTransferDefinition() {
    }

    public WSSmartPayScheduledTransferDefinition(
           int transferAccountId,
           java.lang.String scheduleType,
           java.lang.String scheduleValue,
           java.lang.String transferType,
           double transferValue,
           boolean emailNotification) {
           this.transferAccountId = transferAccountId;
           this.scheduleType = scheduleType;
           this.scheduleValue = scheduleValue;
           this.transferType = transferType;
           this.transferValue = transferValue;
           this.emailNotification = emailNotification;
    }


    /**
     * Gets the transferAccountId value for this WSSmartPayScheduledTransferDefinition.
     * 
     * @return transferAccountId
     */
    public int getTransferAccountId() {
        return transferAccountId;
    }


    /**
     * Sets the transferAccountId value for this WSSmartPayScheduledTransferDefinition.
     * 
     * @param transferAccountId
     */
    public void setTransferAccountId(int transferAccountId) {
        this.transferAccountId = transferAccountId;
    }


    /**
     * Gets the scheduleType value for this WSSmartPayScheduledTransferDefinition.
     * 
     * @return scheduleType
     */
    public java.lang.String getScheduleType() {
        return scheduleType;
    }


    /**
     * Sets the scheduleType value for this WSSmartPayScheduledTransferDefinition.
     * 
     * @param scheduleType
     */
    public void setScheduleType(java.lang.String scheduleType) {
        this.scheduleType = scheduleType;
    }


    /**
     * Gets the scheduleValue value for this WSSmartPayScheduledTransferDefinition.
     * 
     * @return scheduleValue
     */
    public java.lang.String getScheduleValue() {
        return scheduleValue;
    }


    /**
     * Sets the scheduleValue value for this WSSmartPayScheduledTransferDefinition.
     * 
     * @param scheduleValue
     */
    public void setScheduleValue(java.lang.String scheduleValue) {
        this.scheduleValue = scheduleValue;
    }


    /**
     * Gets the transferType value for this WSSmartPayScheduledTransferDefinition.
     * 
     * @return transferType
     */
    public java.lang.String getTransferType() {
        return transferType;
    }


    /**
     * Sets the transferType value for this WSSmartPayScheduledTransferDefinition.
     * 
     * @param transferType
     */
    public void setTransferType(java.lang.String transferType) {
        this.transferType = transferType;
    }


    /**
     * Gets the transferValue value for this WSSmartPayScheduledTransferDefinition.
     * 
     * @return transferValue
     */
    public double getTransferValue() {
        return transferValue;
    }


    /**
     * Sets the transferValue value for this WSSmartPayScheduledTransferDefinition.
     * 
     * @param transferValue
     */
    public void setTransferValue(double transferValue) {
        this.transferValue = transferValue;
    }


    /**
     * Gets the emailNotification value for this WSSmartPayScheduledTransferDefinition.
     * 
     * @return emailNotification
     */
    public boolean isEmailNotification() {
        return emailNotification;
    }


    /**
     * Sets the emailNotification value for this WSSmartPayScheduledTransferDefinition.
     * 
     * @param emailNotification
     */
    public void setEmailNotification(boolean emailNotification) {
        this.emailNotification = emailNotification;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WSSmartPayScheduledTransferDefinition)) return false;
        WSSmartPayScheduledTransferDefinition other = (WSSmartPayScheduledTransferDefinition) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.transferAccountId == other.getTransferAccountId() &&
            ((this.scheduleType==null && other.getScheduleType()==null) || 
             (this.scheduleType!=null &&
              this.scheduleType.equals(other.getScheduleType()))) &&
            ((this.scheduleValue==null && other.getScheduleValue()==null) || 
             (this.scheduleValue!=null &&
              this.scheduleValue.equals(other.getScheduleValue()))) &&
            ((this.transferType==null && other.getTransferType()==null) || 
             (this.transferType!=null &&
              this.transferType.equals(other.getTransferType()))) &&
            this.transferValue == other.getTransferValue() &&
            this.emailNotification == other.isEmailNotification();
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
        if (getScheduleType() != null) {
            _hashCode += getScheduleType().hashCode();
        }
        if (getScheduleValue() != null) {
            _hashCode += getScheduleValue().hashCode();
        }
        if (getTransferType() != null) {
            _hashCode += getTransferType().hashCode();
        }
        _hashCode += new Double(getTransferValue()).hashCode();
        _hashCode += (isEmailNotification() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WSSmartPayScheduledTransferDefinition.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://com.tch.cards.service/types", "WSSmartPayScheduledTransferDefinition"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transferAccountId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "transferAccountId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scheduleType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "scheduleType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scheduleValue");
        elemField.setXmlName(new javax.xml.namespace.QName("", "scheduleValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transferType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "transferType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transferValue");
        elemField.setXmlName(new javax.xml.namespace.QName("", "transferValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emailNotification");
        elemField.setXmlName(new javax.xml.namespace.QName("", "emailNotification"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
