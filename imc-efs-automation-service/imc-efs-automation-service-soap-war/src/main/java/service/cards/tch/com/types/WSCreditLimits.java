/**
 * WSCreditLimits.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package service.cards.tch.com.types;

public class WSCreditLimits  implements java.io.Serializable {
    private java.lang.String contractStatus;

    private double transLimit;

    private double origLimit;

    private double creditAvailable;

    private double dailyLimit;

    private double dailyAvailable;

    private double totalAvailable;

    private int maxMoneyCode;

    private java.lang.String uom;

    public WSCreditLimits() {
    }

    public WSCreditLimits(
           java.lang.String contractStatus,
           double transLimit,
           double origLimit,
           double creditAvailable,
           double dailyLimit,
           double dailyAvailable,
           double totalAvailable,
           int maxMoneyCode,
           java.lang.String uom) {
           this.contractStatus = contractStatus;
           this.transLimit = transLimit;
           this.origLimit = origLimit;
           this.creditAvailable = creditAvailable;
           this.dailyLimit = dailyLimit;
           this.dailyAvailable = dailyAvailable;
           this.totalAvailable = totalAvailable;
           this.maxMoneyCode = maxMoneyCode;
           this.uom = uom;
    }


    /**
     * Gets the contractStatus value for this WSCreditLimits.
     * 
     * @return contractStatus
     */
    public java.lang.String getContractStatus() {
        return contractStatus;
    }


    /**
     * Sets the contractStatus value for this WSCreditLimits.
     * 
     * @param contractStatus
     */
    public void setContractStatus(java.lang.String contractStatus) {
        this.contractStatus = contractStatus;
    }


    /**
     * Gets the transLimit value for this WSCreditLimits.
     * 
     * @return transLimit
     */
    public double getTransLimit() {
        return transLimit;
    }


    /**
     * Sets the transLimit value for this WSCreditLimits.
     * 
     * @param transLimit
     */
    public void setTransLimit(double transLimit) {
        this.transLimit = transLimit;
    }


    /**
     * Gets the origLimit value for this WSCreditLimits.
     * 
     * @return origLimit
     */
    public double getOrigLimit() {
        return origLimit;
    }


    /**
     * Sets the origLimit value for this WSCreditLimits.
     * 
     * @param origLimit
     */
    public void setOrigLimit(double origLimit) {
        this.origLimit = origLimit;
    }


    /**
     * Gets the creditAvailable value for this WSCreditLimits.
     * 
     * @return creditAvailable
     */
    public double getCreditAvailable() {
        return creditAvailable;
    }


    /**
     * Sets the creditAvailable value for this WSCreditLimits.
     * 
     * @param creditAvailable
     */
    public void setCreditAvailable(double creditAvailable) {
        this.creditAvailable = creditAvailable;
    }


    /**
     * Gets the dailyLimit value for this WSCreditLimits.
     * 
     * @return dailyLimit
     */
    public double getDailyLimit() {
        return dailyLimit;
    }


    /**
     * Sets the dailyLimit value for this WSCreditLimits.
     * 
     * @param dailyLimit
     */
    public void setDailyLimit(double dailyLimit) {
        this.dailyLimit = dailyLimit;
    }


    /**
     * Gets the dailyAvailable value for this WSCreditLimits.
     * 
     * @return dailyAvailable
     */
    public double getDailyAvailable() {
        return dailyAvailable;
    }


    /**
     * Sets the dailyAvailable value for this WSCreditLimits.
     * 
     * @param dailyAvailable
     */
    public void setDailyAvailable(double dailyAvailable) {
        this.dailyAvailable = dailyAvailable;
    }


    /**
     * Gets the totalAvailable value for this WSCreditLimits.
     * 
     * @return totalAvailable
     */
    public double getTotalAvailable() {
        return totalAvailable;
    }


    /**
     * Sets the totalAvailable value for this WSCreditLimits.
     * 
     * @param totalAvailable
     */
    public void setTotalAvailable(double totalAvailable) {
        this.totalAvailable = totalAvailable;
    }


    /**
     * Gets the maxMoneyCode value for this WSCreditLimits.
     * 
     * @return maxMoneyCode
     */
    public int getMaxMoneyCode() {
        return maxMoneyCode;
    }


    /**
     * Sets the maxMoneyCode value for this WSCreditLimits.
     * 
     * @param maxMoneyCode
     */
    public void setMaxMoneyCode(int maxMoneyCode) {
        this.maxMoneyCode = maxMoneyCode;
    }


    /**
     * Gets the uom value for this WSCreditLimits.
     * 
     * @return uom
     */
    public java.lang.String getUom() {
        return uom;
    }


    /**
     * Sets the uom value for this WSCreditLimits.
     * 
     * @param uom
     */
    public void setUom(java.lang.String uom) {
        this.uom = uom;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WSCreditLimits)) return false;
        WSCreditLimits other = (WSCreditLimits) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.contractStatus==null && other.getContractStatus()==null) || 
             (this.contractStatus!=null &&
              this.contractStatus.equals(other.getContractStatus()))) &&
            this.transLimit == other.getTransLimit() &&
            this.origLimit == other.getOrigLimit() &&
            this.creditAvailable == other.getCreditAvailable() &&
            this.dailyLimit == other.getDailyLimit() &&
            this.dailyAvailable == other.getDailyAvailable() &&
            this.totalAvailable == other.getTotalAvailable() &&
            this.maxMoneyCode == other.getMaxMoneyCode() &&
            ((this.uom==null && other.getUom()==null) || 
             (this.uom!=null &&
              this.uom.equals(other.getUom())));
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
        if (getContractStatus() != null) {
            _hashCode += getContractStatus().hashCode();
        }
        _hashCode += new Double(getTransLimit()).hashCode();
        _hashCode += new Double(getOrigLimit()).hashCode();
        _hashCode += new Double(getCreditAvailable()).hashCode();
        _hashCode += new Double(getDailyLimit()).hashCode();
        _hashCode += new Double(getDailyAvailable()).hashCode();
        _hashCode += new Double(getTotalAvailable()).hashCode();
        _hashCode += getMaxMoneyCode();
        if (getUom() != null) {
            _hashCode += getUom().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WSCreditLimits.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://com.tch.cards.service/types", "WSCreditLimits"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contractStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "contractStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transLimit");
        elemField.setXmlName(new javax.xml.namespace.QName("", "transLimit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("origLimit");
        elemField.setXmlName(new javax.xml.namespace.QName("", "origLimit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creditAvailable");
        elemField.setXmlName(new javax.xml.namespace.QName("", "creditAvailable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dailyLimit");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dailyLimit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dailyAvailable");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dailyAvailable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalAvailable");
        elemField.setXmlName(new javax.xml.namespace.QName("", "totalAvailable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxMoneyCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "maxMoneyCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("uom");
        elemField.setXmlName(new javax.xml.namespace.QName("", "uom"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
