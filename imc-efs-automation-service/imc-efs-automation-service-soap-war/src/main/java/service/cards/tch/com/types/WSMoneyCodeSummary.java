/**
 * WSMoneyCodeSummary.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package service.cards.tch.com.types;

public class WSMoneyCodeSummary  implements java.io.Serializable {
    private int mcCount;

    private double mcTotal;

    private double mcUsedTotal;

    public WSMoneyCodeSummary() {
    }

    public WSMoneyCodeSummary(
           int mcCount,
           double mcTotal,
           double mcUsedTotal) {
           this.mcCount = mcCount;
           this.mcTotal = mcTotal;
           this.mcUsedTotal = mcUsedTotal;
    }


    /**
     * Gets the mcCount value for this WSMoneyCodeSummary.
     * 
     * @return mcCount
     */
    public int getMcCount() {
        return mcCount;
    }


    /**
     * Sets the mcCount value for this WSMoneyCodeSummary.
     * 
     * @param mcCount
     */
    public void setMcCount(int mcCount) {
        this.mcCount = mcCount;
    }


    /**
     * Gets the mcTotal value for this WSMoneyCodeSummary.
     * 
     * @return mcTotal
     */
    public double getMcTotal() {
        return mcTotal;
    }


    /**
     * Sets the mcTotal value for this WSMoneyCodeSummary.
     * 
     * @param mcTotal
     */
    public void setMcTotal(double mcTotal) {
        this.mcTotal = mcTotal;
    }


    /**
     * Gets the mcUsedTotal value for this WSMoneyCodeSummary.
     * 
     * @return mcUsedTotal
     */
    public double getMcUsedTotal() {
        return mcUsedTotal;
    }


    /**
     * Sets the mcUsedTotal value for this WSMoneyCodeSummary.
     * 
     * @param mcUsedTotal
     */
    public void setMcUsedTotal(double mcUsedTotal) {
        this.mcUsedTotal = mcUsedTotal;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WSMoneyCodeSummary)) return false;
        WSMoneyCodeSummary other = (WSMoneyCodeSummary) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.mcCount == other.getMcCount() &&
            this.mcTotal == other.getMcTotal() &&
            this.mcUsedTotal == other.getMcUsedTotal();
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
        _hashCode += getMcCount();
        _hashCode += new Double(getMcTotal()).hashCode();
        _hashCode += new Double(getMcUsedTotal()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WSMoneyCodeSummary.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://com.tch.cards.service/types", "WSMoneyCodeSummary"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mcCount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mcCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mcTotal");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mcTotal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mcUsedTotal");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mcUsedTotal"));
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
