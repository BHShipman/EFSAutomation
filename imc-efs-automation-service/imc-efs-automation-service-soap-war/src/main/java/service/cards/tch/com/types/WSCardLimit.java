/**
 * WSCardLimit.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package service.cards.tch.com.types;

public class WSCardLimit  implements java.io.Serializable {
    private int hours;

    private int limit;

    private java.lang.String limitId;

    private int minHours;

    public WSCardLimit() {
    }

    public WSCardLimit(
           int hours,
           int limit,
           java.lang.String limitId,
           int minHours) {
           this.hours = hours;
           this.limit = limit;
           this.limitId = limitId;
           this.minHours = minHours;
    }


    /**
     * Gets the hours value for this WSCardLimit.
     * 
     * @return hours
     */
    public int getHours() {
        return hours;
    }


    /**
     * Sets the hours value for this WSCardLimit.
     * 
     * @param hours
     */
    public void setHours(int hours) {
        this.hours = hours;
    }


    /**
     * Gets the limit value for this WSCardLimit.
     * 
     * @return limit
     */
    public int getLimit() {
        return limit;
    }


    /**
     * Sets the limit value for this WSCardLimit.
     * 
     * @param limit
     */
    public void setLimit(int limit) {
        this.limit = limit;
    }


    /**
     * Gets the limitId value for this WSCardLimit.
     * 
     * @return limitId
     */
    public java.lang.String getLimitId() {
        return limitId;
    }


    /**
     * Sets the limitId value for this WSCardLimit.
     * 
     * @param limitId
     */
    public void setLimitId(java.lang.String limitId) {
        this.limitId = limitId;
    }


    /**
     * Gets the minHours value for this WSCardLimit.
     * 
     * @return minHours
     */
    public int getMinHours() {
        return minHours;
    }


    /**
     * Sets the minHours value for this WSCardLimit.
     * 
     * @param minHours
     */
    public void setMinHours(int minHours) {
        this.minHours = minHours;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WSCardLimit)) return false;
        WSCardLimit other = (WSCardLimit) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.hours == other.getHours() &&
            this.limit == other.getLimit() &&
            ((this.limitId==null && other.getLimitId()==null) || 
             (this.limitId!=null &&
              this.limitId.equals(other.getLimitId()))) &&
            this.minHours == other.getMinHours();
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
        _hashCode += getHours();
        _hashCode += getLimit();
        if (getLimitId() != null) {
            _hashCode += getLimitId().hashCode();
        }
        _hashCode += getMinHours();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WSCardLimit.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://com.tch.cards.service/types", "WSCardLimit"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hours");
        elemField.setXmlName(new javax.xml.namespace.QName("", "hours"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("limit");
        elemField.setXmlName(new javax.xml.namespace.QName("", "limit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("limitId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "limitId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minHours");
        elemField.setXmlName(new javax.xml.namespace.QName("", "minHours"));
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
