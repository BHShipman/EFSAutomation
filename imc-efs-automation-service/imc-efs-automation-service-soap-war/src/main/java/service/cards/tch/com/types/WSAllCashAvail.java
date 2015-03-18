/**
 * WSAllCashAvail.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package service.cards.tch.com.types;

public class WSAllCashAvail  implements java.io.Serializable {
    private java.lang.String cardNumber;

    private double oneTimeCash;

    private double recurringCash;

    private double contractLimit;

    private double cashAvailable;

    public WSAllCashAvail() {
    }

    public WSAllCashAvail(
           java.lang.String cardNumber,
           double oneTimeCash,
           double recurringCash,
           double contractLimit,
           double cashAvailable) {
           this.cardNumber = cardNumber;
           this.oneTimeCash = oneTimeCash;
           this.recurringCash = recurringCash;
           this.contractLimit = contractLimit;
           this.cashAvailable = cashAvailable;
    }


    /**
     * Gets the cardNumber value for this WSAllCashAvail.
     * 
     * @return cardNumber
     */
    public java.lang.String getCardNumber() {
        return cardNumber;
    }


    /**
     * Sets the cardNumber value for this WSAllCashAvail.
     * 
     * @param cardNumber
     */
    public void setCardNumber(java.lang.String cardNumber) {
        this.cardNumber = cardNumber;
    }


    /**
     * Gets the oneTimeCash value for this WSAllCashAvail.
     * 
     * @return oneTimeCash
     */
    public double getOneTimeCash() {
        return oneTimeCash;
    }


    /**
     * Sets the oneTimeCash value for this WSAllCashAvail.
     * 
     * @param oneTimeCash
     */
    public void setOneTimeCash(double oneTimeCash) {
        this.oneTimeCash = oneTimeCash;
    }


    /**
     * Gets the recurringCash value for this WSAllCashAvail.
     * 
     * @return recurringCash
     */
    public double getRecurringCash() {
        return recurringCash;
    }


    /**
     * Sets the recurringCash value for this WSAllCashAvail.
     * 
     * @param recurringCash
     */
    public void setRecurringCash(double recurringCash) {
        this.recurringCash = recurringCash;
    }


    /**
     * Gets the contractLimit value for this WSAllCashAvail.
     * 
     * @return contractLimit
     */
    public double getContractLimit() {
        return contractLimit;
    }


    /**
     * Sets the contractLimit value for this WSAllCashAvail.
     * 
     * @param contractLimit
     */
    public void setContractLimit(double contractLimit) {
        this.contractLimit = contractLimit;
    }


    /**
     * Gets the cashAvailable value for this WSAllCashAvail.
     * 
     * @return cashAvailable
     */
    public double getCashAvailable() {
        return cashAvailable;
    }


    /**
     * Sets the cashAvailable value for this WSAllCashAvail.
     * 
     * @param cashAvailable
     */
    public void setCashAvailable(double cashAvailable) {
        this.cashAvailable = cashAvailable;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WSAllCashAvail)) return false;
        WSAllCashAvail other = (WSAllCashAvail) obj;
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
            this.oneTimeCash == other.getOneTimeCash() &&
            this.recurringCash == other.getRecurringCash() &&
            this.contractLimit == other.getContractLimit() &&
            this.cashAvailable == other.getCashAvailable();
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
        _hashCode += new Double(getOneTimeCash()).hashCode();
        _hashCode += new Double(getRecurringCash()).hashCode();
        _hashCode += new Double(getContractLimit()).hashCode();
        _hashCode += new Double(getCashAvailable()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WSAllCashAvail.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://com.tch.cards.service/types", "WSAllCashAvail"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cardNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cardNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oneTimeCash");
        elemField.setXmlName(new javax.xml.namespace.QName("", "oneTimeCash"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recurringCash");
        elemField.setXmlName(new javax.xml.namespace.QName("", "recurringCash"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contractLimit");
        elemField.setXmlName(new javax.xml.namespace.QName("", "contractLimit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cashAvailable");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cashAvailable"));
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
