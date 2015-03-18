/**
 * WSVerifySmartPayTransfer.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package service.cards.tch.com.types;

public class WSVerifySmartPayTransfer  implements java.io.Serializable {
    private int transferAccountId;

    private double verifyAmt1;

    private double verifyAmt2;

    public WSVerifySmartPayTransfer() {
    }

    public WSVerifySmartPayTransfer(
           int transferAccountId,
           double verifyAmt1,
           double verifyAmt2) {
           this.transferAccountId = transferAccountId;
           this.verifyAmt1 = verifyAmt1;
           this.verifyAmt2 = verifyAmt2;
    }


    /**
     * Gets the transferAccountId value for this WSVerifySmartPayTransfer.
     * 
     * @return transferAccountId
     */
    public int getTransferAccountId() {
        return transferAccountId;
    }


    /**
     * Sets the transferAccountId value for this WSVerifySmartPayTransfer.
     * 
     * @param transferAccountId
     */
    public void setTransferAccountId(int transferAccountId) {
        this.transferAccountId = transferAccountId;
    }


    /**
     * Gets the verifyAmt1 value for this WSVerifySmartPayTransfer.
     * 
     * @return verifyAmt1
     */
    public double getVerifyAmt1() {
        return verifyAmt1;
    }


    /**
     * Sets the verifyAmt1 value for this WSVerifySmartPayTransfer.
     * 
     * @param verifyAmt1
     */
    public void setVerifyAmt1(double verifyAmt1) {
        this.verifyAmt1 = verifyAmt1;
    }


    /**
     * Gets the verifyAmt2 value for this WSVerifySmartPayTransfer.
     * 
     * @return verifyAmt2
     */
    public double getVerifyAmt2() {
        return verifyAmt2;
    }


    /**
     * Sets the verifyAmt2 value for this WSVerifySmartPayTransfer.
     * 
     * @param verifyAmt2
     */
    public void setVerifyAmt2(double verifyAmt2) {
        this.verifyAmt2 = verifyAmt2;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WSVerifySmartPayTransfer)) return false;
        WSVerifySmartPayTransfer other = (WSVerifySmartPayTransfer) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.transferAccountId == other.getTransferAccountId() &&
            this.verifyAmt1 == other.getVerifyAmt1() &&
            this.verifyAmt2 == other.getVerifyAmt2();
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
        _hashCode += new Double(getVerifyAmt1()).hashCode();
        _hashCode += new Double(getVerifyAmt2()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WSVerifySmartPayTransfer.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://com.tch.cards.service/types", "WSVerifySmartPayTransfer"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transferAccountId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "transferAccountId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("verifyAmt1");
        elemField.setXmlName(new javax.xml.namespace.QName("", "verifyAmt1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("verifyAmt2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "verifyAmt2"));
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
