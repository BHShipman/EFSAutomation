/**
 * WSPolicyHeader.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package service.cards.tch.com.types;

public class WSPolicyHeader  implements java.io.Serializable {
    private int contractId;

    private java.lang.String description;

    private boolean handEnter;

    private int payrollContractId;

    private boolean payrollAtm;

    private boolean payrollChk;

    private boolean payrollAch;

    private boolean payrollWire;

    private boolean payrollDebit;

    public WSPolicyHeader() {
    }

    public WSPolicyHeader(
           int contractId,
           java.lang.String description,
           boolean handEnter,
           int payrollContractId,
           boolean payrollAtm,
           boolean payrollChk,
           boolean payrollAch,
           boolean payrollWire,
           boolean payrollDebit) {
           this.contractId = contractId;
           this.description = description;
           this.handEnter = handEnter;
           this.payrollContractId = payrollContractId;
           this.payrollAtm = payrollAtm;
           this.payrollChk = payrollChk;
           this.payrollAch = payrollAch;
           this.payrollWire = payrollWire;
           this.payrollDebit = payrollDebit;
    }


    /**
     * Gets the contractId value for this WSPolicyHeader.
     * 
     * @return contractId
     */
    public int getContractId() {
        return contractId;
    }


    /**
     * Sets the contractId value for this WSPolicyHeader.
     * 
     * @param contractId
     */
    public void setContractId(int contractId) {
        this.contractId = contractId;
    }


    /**
     * Gets the description value for this WSPolicyHeader.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this WSPolicyHeader.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the handEnter value for this WSPolicyHeader.
     * 
     * @return handEnter
     */
    public boolean isHandEnter() {
        return handEnter;
    }


    /**
     * Sets the handEnter value for this WSPolicyHeader.
     * 
     * @param handEnter
     */
    public void setHandEnter(boolean handEnter) {
        this.handEnter = handEnter;
    }


    /**
     * Gets the payrollContractId value for this WSPolicyHeader.
     * 
     * @return payrollContractId
     */
    public int getPayrollContractId() {
        return payrollContractId;
    }


    /**
     * Sets the payrollContractId value for this WSPolicyHeader.
     * 
     * @param payrollContractId
     */
    public void setPayrollContractId(int payrollContractId) {
        this.payrollContractId = payrollContractId;
    }


    /**
     * Gets the payrollAtm value for this WSPolicyHeader.
     * 
     * @return payrollAtm
     */
    public boolean isPayrollAtm() {
        return payrollAtm;
    }


    /**
     * Sets the payrollAtm value for this WSPolicyHeader.
     * 
     * @param payrollAtm
     */
    public void setPayrollAtm(boolean payrollAtm) {
        this.payrollAtm = payrollAtm;
    }


    /**
     * Gets the payrollChk value for this WSPolicyHeader.
     * 
     * @return payrollChk
     */
    public boolean isPayrollChk() {
        return payrollChk;
    }


    /**
     * Sets the payrollChk value for this WSPolicyHeader.
     * 
     * @param payrollChk
     */
    public void setPayrollChk(boolean payrollChk) {
        this.payrollChk = payrollChk;
    }


    /**
     * Gets the payrollAch value for this WSPolicyHeader.
     * 
     * @return payrollAch
     */
    public boolean isPayrollAch() {
        return payrollAch;
    }


    /**
     * Sets the payrollAch value for this WSPolicyHeader.
     * 
     * @param payrollAch
     */
    public void setPayrollAch(boolean payrollAch) {
        this.payrollAch = payrollAch;
    }


    /**
     * Gets the payrollWire value for this WSPolicyHeader.
     * 
     * @return payrollWire
     */
    public boolean isPayrollWire() {
        return payrollWire;
    }


    /**
     * Sets the payrollWire value for this WSPolicyHeader.
     * 
     * @param payrollWire
     */
    public void setPayrollWire(boolean payrollWire) {
        this.payrollWire = payrollWire;
    }


    /**
     * Gets the payrollDebit value for this WSPolicyHeader.
     * 
     * @return payrollDebit
     */
    public boolean isPayrollDebit() {
        return payrollDebit;
    }


    /**
     * Sets the payrollDebit value for this WSPolicyHeader.
     * 
     * @param payrollDebit
     */
    public void setPayrollDebit(boolean payrollDebit) {
        this.payrollDebit = payrollDebit;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WSPolicyHeader)) return false;
        WSPolicyHeader other = (WSPolicyHeader) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.contractId == other.getContractId() &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            this.handEnter == other.isHandEnter() &&
            this.payrollContractId == other.getPayrollContractId() &&
            this.payrollAtm == other.isPayrollAtm() &&
            this.payrollChk == other.isPayrollChk() &&
            this.payrollAch == other.isPayrollAch() &&
            this.payrollWire == other.isPayrollWire() &&
            this.payrollDebit == other.isPayrollDebit();
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
        _hashCode += getContractId();
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        _hashCode += (isHandEnter() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += getPayrollContractId();
        _hashCode += (isPayrollAtm() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isPayrollChk() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isPayrollAch() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isPayrollWire() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isPayrollDebit() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WSPolicyHeader.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://com.tch.cards.service/types", "WSPolicyHeader"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contractId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "contractId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("handEnter");
        elemField.setXmlName(new javax.xml.namespace.QName("", "handEnter"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payrollContractId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "payrollContractId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payrollAtm");
        elemField.setXmlName(new javax.xml.namespace.QName("", "payrollAtm"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payrollChk");
        elemField.setXmlName(new javax.xml.namespace.QName("", "payrollChk"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payrollAch");
        elemField.setXmlName(new javax.xml.namespace.QName("", "payrollAch"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payrollWire");
        elemField.setXmlName(new javax.xml.namespace.QName("", "payrollWire"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payrollDebit");
        elemField.setXmlName(new javax.xml.namespace.QName("", "payrollDebit"));
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
