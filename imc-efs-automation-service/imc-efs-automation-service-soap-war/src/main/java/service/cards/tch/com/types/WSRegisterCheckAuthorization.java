/**
 * WSRegisterCheckAuthorization.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package service.cards.tch.com.types;

public class WSRegisterCheckAuthorization  implements java.io.Serializable {
    private java.lang.String cardNumber;

    private java.lang.String checkNumber;

    private java.lang.Double dollarAmount;

    private java.lang.Boolean fromUniversal;

    public WSRegisterCheckAuthorization() {
    }

    public WSRegisterCheckAuthorization(
           java.lang.String cardNumber,
           java.lang.String checkNumber,
           java.lang.Double dollarAmount,
           java.lang.Boolean fromUniversal) {
           this.cardNumber = cardNumber;
           this.checkNumber = checkNumber;
           this.dollarAmount = dollarAmount;
           this.fromUniversal = fromUniversal;
    }


    /**
     * Gets the cardNumber value for this WSRegisterCheckAuthorization.
     * 
     * @return cardNumber
     */
    public java.lang.String getCardNumber() {
        return cardNumber;
    }


    /**
     * Sets the cardNumber value for this WSRegisterCheckAuthorization.
     * 
     * @param cardNumber
     */
    public void setCardNumber(java.lang.String cardNumber) {
        this.cardNumber = cardNumber;
    }


    /**
     * Gets the checkNumber value for this WSRegisterCheckAuthorization.
     * 
     * @return checkNumber
     */
    public java.lang.String getCheckNumber() {
        return checkNumber;
    }


    /**
     * Sets the checkNumber value for this WSRegisterCheckAuthorization.
     * 
     * @param checkNumber
     */
    public void setCheckNumber(java.lang.String checkNumber) {
        this.checkNumber = checkNumber;
    }


    /**
     * Gets the dollarAmount value for this WSRegisterCheckAuthorization.
     * 
     * @return dollarAmount
     */
    public java.lang.Double getDollarAmount() {
        return dollarAmount;
    }


    /**
     * Sets the dollarAmount value for this WSRegisterCheckAuthorization.
     * 
     * @param dollarAmount
     */
    public void setDollarAmount(java.lang.Double dollarAmount) {
        this.dollarAmount = dollarAmount;
    }


    /**
     * Gets the fromUniversal value for this WSRegisterCheckAuthorization.
     * 
     * @return fromUniversal
     */
    public java.lang.Boolean getFromUniversal() {
        return fromUniversal;
    }


    /**
     * Sets the fromUniversal value for this WSRegisterCheckAuthorization.
     * 
     * @param fromUniversal
     */
    public void setFromUniversal(java.lang.Boolean fromUniversal) {
        this.fromUniversal = fromUniversal;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WSRegisterCheckAuthorization)) return false;
        WSRegisterCheckAuthorization other = (WSRegisterCheckAuthorization) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.cardNumber==null && other.getCardNumber()==null) || 
             (this.cardNumber!=null &&
              this.cardNumber.equals(other.getCardNumber()))) &&
            ((this.checkNumber==null && other.getCheckNumber()==null) || 
             (this.checkNumber!=null &&
              this.checkNumber.equals(other.getCheckNumber()))) &&
            ((this.dollarAmount==null && other.getDollarAmount()==null) || 
             (this.dollarAmount!=null &&
              this.dollarAmount.equals(other.getDollarAmount()))) &&
            ((this.fromUniversal==null && other.getFromUniversal()==null) || 
             (this.fromUniversal!=null &&
              this.fromUniversal.equals(other.getFromUniversal())));
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
        if (getCardNumber() != null) {
            _hashCode += getCardNumber().hashCode();
        }
        if (getCheckNumber() != null) {
            _hashCode += getCheckNumber().hashCode();
        }
        if (getDollarAmount() != null) {
            _hashCode += getDollarAmount().hashCode();
        }
        if (getFromUniversal() != null) {
            _hashCode += getFromUniversal().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WSRegisterCheckAuthorization.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://com.tch.cards.service/types", "WSRegisterCheckAuthorization"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cardNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cardNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("checkNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "checkNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dollarAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dollarAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fromUniversal");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fromUniversal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
