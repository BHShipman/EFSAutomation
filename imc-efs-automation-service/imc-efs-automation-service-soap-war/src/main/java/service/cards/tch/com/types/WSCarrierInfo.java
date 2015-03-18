/**
 * WSCarrierInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package service.cards.tch.com.types;

public class WSCarrierInfo  implements java.io.Serializable {
    private java.lang.String name;

    private int carrierId;

    private boolean locationGroups;

    public WSCarrierInfo() {
    }

    public WSCarrierInfo(
           java.lang.String name,
           int carrierId,
           boolean locationGroups) {
           this.name = name;
           this.carrierId = carrierId;
           this.locationGroups = locationGroups;
    }


    /**
     * Gets the name value for this WSCarrierInfo.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this WSCarrierInfo.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the carrierId value for this WSCarrierInfo.
     * 
     * @return carrierId
     */
    public int getCarrierId() {
        return carrierId;
    }


    /**
     * Sets the carrierId value for this WSCarrierInfo.
     * 
     * @param carrierId
     */
    public void setCarrierId(int carrierId) {
        this.carrierId = carrierId;
    }


    /**
     * Gets the locationGroups value for this WSCarrierInfo.
     * 
     * @return locationGroups
     */
    public boolean isLocationGroups() {
        return locationGroups;
    }


    /**
     * Sets the locationGroups value for this WSCarrierInfo.
     * 
     * @param locationGroups
     */
    public void setLocationGroups(boolean locationGroups) {
        this.locationGroups = locationGroups;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WSCarrierInfo)) return false;
        WSCarrierInfo other = (WSCarrierInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            this.carrierId == other.getCarrierId() &&
            this.locationGroups == other.isLocationGroups();
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
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        _hashCode += getCarrierId();
        _hashCode += (isLocationGroups() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WSCarrierInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://com.tch.cards.service/types", "WSCarrierInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("carrierId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "carrierId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locationGroups");
        elemField.setXmlName(new javax.xml.namespace.QName("", "locationGroups"));
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
