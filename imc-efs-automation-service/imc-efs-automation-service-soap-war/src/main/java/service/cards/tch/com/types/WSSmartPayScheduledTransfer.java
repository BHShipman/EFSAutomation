/**
 * WSSmartPayScheduledTransfer.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package service.cards.tch.com.types;

public class WSSmartPayScheduledTransfer  implements java.io.Serializable {
    private int scheduledTransferId;

    private int transferAccountId;

    private java.lang.String scheduleType;

    private java.lang.String scheduleValue;

    private java.lang.String transferType;

    private double transferValue;

    private boolean emailNotification;

    private java.util.Calendar effDate;

    private java.util.Calendar expDate;

    public WSSmartPayScheduledTransfer() {
    }

    public WSSmartPayScheduledTransfer(
           int scheduledTransferId,
           int transferAccountId,
           java.lang.String scheduleType,
           java.lang.String scheduleValue,
           java.lang.String transferType,
           double transferValue,
           boolean emailNotification,
           java.util.Calendar effDate,
           java.util.Calendar expDate) {
           this.scheduledTransferId = scheduledTransferId;
           this.transferAccountId = transferAccountId;
           this.scheduleType = scheduleType;
           this.scheduleValue = scheduleValue;
           this.transferType = transferType;
           this.transferValue = transferValue;
           this.emailNotification = emailNotification;
           this.effDate = effDate;
           this.expDate = expDate;
    }


    /**
     * Gets the scheduledTransferId value for this WSSmartPayScheduledTransfer.
     * 
     * @return scheduledTransferId
     */
    public int getScheduledTransferId() {
        return scheduledTransferId;
    }


    /**
     * Sets the scheduledTransferId value for this WSSmartPayScheduledTransfer.
     * 
     * @param scheduledTransferId
     */
    public void setScheduledTransferId(int scheduledTransferId) {
        this.scheduledTransferId = scheduledTransferId;
    }


    /**
     * Gets the transferAccountId value for this WSSmartPayScheduledTransfer.
     * 
     * @return transferAccountId
     */
    public int getTransferAccountId() {
        return transferAccountId;
    }


    /**
     * Sets the transferAccountId value for this WSSmartPayScheduledTransfer.
     * 
     * @param transferAccountId
     */
    public void setTransferAccountId(int transferAccountId) {
        this.transferAccountId = transferAccountId;
    }


    /**
     * Gets the scheduleType value for this WSSmartPayScheduledTransfer.
     * 
     * @return scheduleType
     */
    public java.lang.String getScheduleType() {
        return scheduleType;
    }


    /**
     * Sets the scheduleType value for this WSSmartPayScheduledTransfer.
     * 
     * @param scheduleType
     */
    public void setScheduleType(java.lang.String scheduleType) {
        this.scheduleType = scheduleType;
    }


    /**
     * Gets the scheduleValue value for this WSSmartPayScheduledTransfer.
     * 
     * @return scheduleValue
     */
    public java.lang.String getScheduleValue() {
        return scheduleValue;
    }


    /**
     * Sets the scheduleValue value for this WSSmartPayScheduledTransfer.
     * 
     * @param scheduleValue
     */
    public void setScheduleValue(java.lang.String scheduleValue) {
        this.scheduleValue = scheduleValue;
    }


    /**
     * Gets the transferType value for this WSSmartPayScheduledTransfer.
     * 
     * @return transferType
     */
    public java.lang.String getTransferType() {
        return transferType;
    }


    /**
     * Sets the transferType value for this WSSmartPayScheduledTransfer.
     * 
     * @param transferType
     */
    public void setTransferType(java.lang.String transferType) {
        this.transferType = transferType;
    }


    /**
     * Gets the transferValue value for this WSSmartPayScheduledTransfer.
     * 
     * @return transferValue
     */
    public double getTransferValue() {
        return transferValue;
    }


    /**
     * Sets the transferValue value for this WSSmartPayScheduledTransfer.
     * 
     * @param transferValue
     */
    public void setTransferValue(double transferValue) {
        this.transferValue = transferValue;
    }


    /**
     * Gets the emailNotification value for this WSSmartPayScheduledTransfer.
     * 
     * @return emailNotification
     */
    public boolean isEmailNotification() {
        return emailNotification;
    }


    /**
     * Sets the emailNotification value for this WSSmartPayScheduledTransfer.
     * 
     * @param emailNotification
     */
    public void setEmailNotification(boolean emailNotification) {
        this.emailNotification = emailNotification;
    }


    /**
     * Gets the effDate value for this WSSmartPayScheduledTransfer.
     * 
     * @return effDate
     */
    public java.util.Calendar getEffDate() {
        return effDate;
    }


    /**
     * Sets the effDate value for this WSSmartPayScheduledTransfer.
     * 
     * @param effDate
     */
    public void setEffDate(java.util.Calendar effDate) {
        this.effDate = effDate;
    }


    /**
     * Gets the expDate value for this WSSmartPayScheduledTransfer.
     * 
     * @return expDate
     */
    public java.util.Calendar getExpDate() {
        return expDate;
    }


    /**
     * Sets the expDate value for this WSSmartPayScheduledTransfer.
     * 
     * @param expDate
     */
    public void setExpDate(java.util.Calendar expDate) {
        this.expDate = expDate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WSSmartPayScheduledTransfer)) return false;
        WSSmartPayScheduledTransfer other = (WSSmartPayScheduledTransfer) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.scheduledTransferId == other.getScheduledTransferId() &&
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
            this.emailNotification == other.isEmailNotification() &&
            ((this.effDate==null && other.getEffDate()==null) || 
             (this.effDate!=null &&
              this.effDate.equals(other.getEffDate()))) &&
            ((this.expDate==null && other.getExpDate()==null) || 
             (this.expDate!=null &&
              this.expDate.equals(other.getExpDate())));
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
        _hashCode += getScheduledTransferId();
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
        if (getEffDate() != null) {
            _hashCode += getEffDate().hashCode();
        }
        if (getExpDate() != null) {
            _hashCode += getExpDate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WSSmartPayScheduledTransfer.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://com.tch.cards.service/types", "WSSmartPayScheduledTransfer"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scheduledTransferId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "scheduledTransferId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("effDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "effDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "expDate"));
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
