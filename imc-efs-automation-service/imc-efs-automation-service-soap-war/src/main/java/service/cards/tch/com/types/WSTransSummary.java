/**
 * WSTransSummary.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package service.cards.tch.com.types;

public class WSTransSummary  implements java.io.Serializable {
    private int tranCount;

    private double tranTotal;

    public WSTransSummary() {
    }

    public WSTransSummary(
           int tranCount,
           double tranTotal) {
           this.tranCount = tranCount;
           this.tranTotal = tranTotal;
    }


    /**
     * Gets the tranCount value for this WSTransSummary.
     * 
     * @return tranCount
     */
    public int getTranCount() {
        return tranCount;
    }


    /**
     * Sets the tranCount value for this WSTransSummary.
     * 
     * @param tranCount
     */
    public void setTranCount(int tranCount) {
        this.tranCount = tranCount;
    }


    /**
     * Gets the tranTotal value for this WSTransSummary.
     * 
     * @return tranTotal
     */
    public double getTranTotal() {
        return tranTotal;
    }


    /**
     * Sets the tranTotal value for this WSTransSummary.
     * 
     * @param tranTotal
     */
    public void setTranTotal(double tranTotal) {
        this.tranTotal = tranTotal;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WSTransSummary)) return false;
        WSTransSummary other = (WSTransSummary) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.tranCount == other.getTranCount() &&
            this.tranTotal == other.getTranTotal();
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
        _hashCode += getTranCount();
        _hashCode += new Double(getTranTotal()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WSTransSummary.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://com.tch.cards.service/types", "WSTransSummary"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tranCount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tranCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tranTotal");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tranTotal"));
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
