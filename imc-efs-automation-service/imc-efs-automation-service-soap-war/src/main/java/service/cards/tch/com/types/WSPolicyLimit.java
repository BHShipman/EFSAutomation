/**
 * WSPolicyLimit.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package service.cards.tch.com.types;

public class WSPolicyLimit  implements java.io.Serializable {
    private int hours;

    private int limit;

    private java.lang.String limitId;

    private int minHours;

    private int autoRollMap;

    private int autoRollMax;

    public WSPolicyLimit() {
    }

    public WSPolicyLimit(
           int hours,
           int limit,
           java.lang.String limitId,
           int minHours,
           int autoRollMap,
           int autoRollMax) {
           this.hours = hours;
           this.limit = limit;
           this.limitId = limitId;
           this.minHours = minHours;
           this.autoRollMap = autoRollMap;
           this.autoRollMax = autoRollMax;
    }


    /**
     * Gets the hours value for this WSPolicyLimit.
     * 
     * @return hours
     */
    public int getHours() {
        return hours;
    }


    /**
     * Sets the hours value for this WSPolicyLimit.
     * 
     * @param hours
     */
    public void setHours(int hours) {
        this.hours = hours;
    }


    /**
     * Gets the limit value for this WSPolicyLimit.
     * 
     * @return limit
     */
    public int getLimit() {
        return limit;
    }


    /**
     * Sets the limit value for this WSPolicyLimit.
     * 
     * @param limit
     */
    public void setLimit(int limit) {
        this.limit = limit;
    }


    /**
     * Gets the limitId value for this WSPolicyLimit.
     * 
     * @return limitId
     */
    public java.lang.String getLimitId() {
        return limitId;
    }


    /**
     * Sets the limitId value for this WSPolicyLimit.
     * 
     * @param limitId
     */
    public void setLimitId(java.lang.String limitId) {
        this.limitId = limitId;
    }


    /**
     * Gets the minHours value for this WSPolicyLimit.
     * 
     * @return minHours
     */
    public int getMinHours() {
        return minHours;
    }


    /**
     * Sets the minHours value for this WSPolicyLimit.
     * 
     * @param minHours
     */
    public void setMinHours(int minHours) {
        this.minHours = minHours;
    }


    /**
     * Gets the autoRollMap value for this WSPolicyLimit.
     * 
     * @return autoRollMap
     */
    public int getAutoRollMap() {
        return autoRollMap;
    }


    /**
     * Sets the autoRollMap value for this WSPolicyLimit.
     * 
     * @param autoRollMap
     */
    public void setAutoRollMap(int autoRollMap) {
        this.autoRollMap = autoRollMap;
    }


    /**
     * Gets the autoRollMax value for this WSPolicyLimit.
     * 
     * @return autoRollMax
     */
    public int getAutoRollMax() {
        return autoRollMax;
    }


    /**
     * Sets the autoRollMax value for this WSPolicyLimit.
     * 
     * @param autoRollMax
     */
    public void setAutoRollMax(int autoRollMax) {
        this.autoRollMax = autoRollMax;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WSPolicyLimit)) return false;
        WSPolicyLimit other = (WSPolicyLimit) obj;
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
            this.minHours == other.getMinHours() &&
            this.autoRollMap == other.getAutoRollMap() &&
            this.autoRollMax == other.getAutoRollMax();
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
        _hashCode += getAutoRollMap();
        _hashCode += getAutoRollMax();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WSPolicyLimit.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://com.tch.cards.service/types", "WSPolicyLimit"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("autoRollMap");
        elemField.setXmlName(new javax.xml.namespace.QName("", "autoRollMap"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("autoRollMax");
        elemField.setXmlName(new javax.xml.namespace.QName("", "autoRollMax"));
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
