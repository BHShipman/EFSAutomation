/**
 * WSMoneyCodeUse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package service.cards.tch.com.types;

public class WSMoneyCodeUse  implements java.io.Serializable {
    private java.lang.String activated;

    private java.lang.String alphaCode;

    private double amount;

    private double amountUsed;

    private int check;

    private java.lang.String code;

    private java.lang.String codeType;

    private int contractId;

    private double feeAmount;

    private java.lang.String firstUse;

    private int id;

    private java.lang.String notes;

    private java.lang.String payee;

    private java.lang.String to;

    private double useAmount;

    private java.util.Calendar useTime;

    private boolean voided;

    private java.lang.String who;

    public WSMoneyCodeUse() {
    }

    public WSMoneyCodeUse(
           java.lang.String activated,
           java.lang.String alphaCode,
           double amount,
           double amountUsed,
           int check,
           java.lang.String code,
           java.lang.String codeType,
           int contractId,
           double feeAmount,
           java.lang.String firstUse,
           int id,
           java.lang.String notes,
           java.lang.String payee,
           java.lang.String to,
           double useAmount,
           java.util.Calendar useTime,
           boolean voided,
           java.lang.String who) {
           this.activated = activated;
           this.alphaCode = alphaCode;
           this.amount = amount;
           this.amountUsed = amountUsed;
           this.check = check;
           this.code = code;
           this.codeType = codeType;
           this.contractId = contractId;
           this.feeAmount = feeAmount;
           this.firstUse = firstUse;
           this.id = id;
           this.notes = notes;
           this.payee = payee;
           this.to = to;
           this.useAmount = useAmount;
           this.useTime = useTime;
           this.voided = voided;
           this.who = who;
    }


    /**
     * Gets the activated value for this WSMoneyCodeUse.
     * 
     * @return activated
     */
    public java.lang.String getActivated() {
        return activated;
    }


    /**
     * Sets the activated value for this WSMoneyCodeUse.
     * 
     * @param activated
     */
    public void setActivated(java.lang.String activated) {
        this.activated = activated;
    }


    /**
     * Gets the alphaCode value for this WSMoneyCodeUse.
     * 
     * @return alphaCode
     */
    public java.lang.String getAlphaCode() {
        return alphaCode;
    }


    /**
     * Sets the alphaCode value for this WSMoneyCodeUse.
     * 
     * @param alphaCode
     */
    public void setAlphaCode(java.lang.String alphaCode) {
        this.alphaCode = alphaCode;
    }


    /**
     * Gets the amount value for this WSMoneyCodeUse.
     * 
     * @return amount
     */
    public double getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this WSMoneyCodeUse.
     * 
     * @param amount
     */
    public void setAmount(double amount) {
        this.amount = amount;
    }


    /**
     * Gets the amountUsed value for this WSMoneyCodeUse.
     * 
     * @return amountUsed
     */
    public double getAmountUsed() {
        return amountUsed;
    }


    /**
     * Sets the amountUsed value for this WSMoneyCodeUse.
     * 
     * @param amountUsed
     */
    public void setAmountUsed(double amountUsed) {
        this.amountUsed = amountUsed;
    }


    /**
     * Gets the check value for this WSMoneyCodeUse.
     * 
     * @return check
     */
    public int getCheck() {
        return check;
    }


    /**
     * Sets the check value for this WSMoneyCodeUse.
     * 
     * @param check
     */
    public void setCheck(int check) {
        this.check = check;
    }


    /**
     * Gets the code value for this WSMoneyCodeUse.
     * 
     * @return code
     */
    public java.lang.String getCode() {
        return code;
    }


    /**
     * Sets the code value for this WSMoneyCodeUse.
     * 
     * @param code
     */
    public void setCode(java.lang.String code) {
        this.code = code;
    }


    /**
     * Gets the codeType value for this WSMoneyCodeUse.
     * 
     * @return codeType
     */
    public java.lang.String getCodeType() {
        return codeType;
    }


    /**
     * Sets the codeType value for this WSMoneyCodeUse.
     * 
     * @param codeType
     */
    public void setCodeType(java.lang.String codeType) {
        this.codeType = codeType;
    }


    /**
     * Gets the contractId value for this WSMoneyCodeUse.
     * 
     * @return contractId
     */
    public int getContractId() {
        return contractId;
    }


    /**
     * Sets the contractId value for this WSMoneyCodeUse.
     * 
     * @param contractId
     */
    public void setContractId(int contractId) {
        this.contractId = contractId;
    }


    /**
     * Gets the feeAmount value for this WSMoneyCodeUse.
     * 
     * @return feeAmount
     */
    public double getFeeAmount() {
        return feeAmount;
    }


    /**
     * Sets the feeAmount value for this WSMoneyCodeUse.
     * 
     * @param feeAmount
     */
    public void setFeeAmount(double feeAmount) {
        this.feeAmount = feeAmount;
    }


    /**
     * Gets the firstUse value for this WSMoneyCodeUse.
     * 
     * @return firstUse
     */
    public java.lang.String getFirstUse() {
        return firstUse;
    }


    /**
     * Sets the firstUse value for this WSMoneyCodeUse.
     * 
     * @param firstUse
     */
    public void setFirstUse(java.lang.String firstUse) {
        this.firstUse = firstUse;
    }


    /**
     * Gets the id value for this WSMoneyCodeUse.
     * 
     * @return id
     */
    public int getId() {
        return id;
    }


    /**
     * Sets the id value for this WSMoneyCodeUse.
     * 
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }


    /**
     * Gets the notes value for this WSMoneyCodeUse.
     * 
     * @return notes
     */
    public java.lang.String getNotes() {
        return notes;
    }


    /**
     * Sets the notes value for this WSMoneyCodeUse.
     * 
     * @param notes
     */
    public void setNotes(java.lang.String notes) {
        this.notes = notes;
    }


    /**
     * Gets the payee value for this WSMoneyCodeUse.
     * 
     * @return payee
     */
    public java.lang.String getPayee() {
        return payee;
    }


    /**
     * Sets the payee value for this WSMoneyCodeUse.
     * 
     * @param payee
     */
    public void setPayee(java.lang.String payee) {
        this.payee = payee;
    }


    /**
     * Gets the to value for this WSMoneyCodeUse.
     * 
     * @return to
     */
    public java.lang.String getTo() {
        return to;
    }


    /**
     * Sets the to value for this WSMoneyCodeUse.
     * 
     * @param to
     */
    public void setTo(java.lang.String to) {
        this.to = to;
    }


    /**
     * Gets the useAmount value for this WSMoneyCodeUse.
     * 
     * @return useAmount
     */
    public double getUseAmount() {
        return useAmount;
    }


    /**
     * Sets the useAmount value for this WSMoneyCodeUse.
     * 
     * @param useAmount
     */
    public void setUseAmount(double useAmount) {
        this.useAmount = useAmount;
    }


    /**
     * Gets the useTime value for this WSMoneyCodeUse.
     * 
     * @return useTime
     */
    public java.util.Calendar getUseTime() {
        return useTime;
    }


    /**
     * Sets the useTime value for this WSMoneyCodeUse.
     * 
     * @param useTime
     */
    public void setUseTime(java.util.Calendar useTime) {
        this.useTime = useTime;
    }


    /**
     * Gets the voided value for this WSMoneyCodeUse.
     * 
     * @return voided
     */
    public boolean isVoided() {
        return voided;
    }


    /**
     * Sets the voided value for this WSMoneyCodeUse.
     * 
     * @param voided
     */
    public void setVoided(boolean voided) {
        this.voided = voided;
    }


    /**
     * Gets the who value for this WSMoneyCodeUse.
     * 
     * @return who
     */
    public java.lang.String getWho() {
        return who;
    }


    /**
     * Sets the who value for this WSMoneyCodeUse.
     * 
     * @param who
     */
    public void setWho(java.lang.String who) {
        this.who = who;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WSMoneyCodeUse)) return false;
        WSMoneyCodeUse other = (WSMoneyCodeUse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.activated==null && other.getActivated()==null) || 
             (this.activated!=null &&
              this.activated.equals(other.getActivated()))) &&
            ((this.alphaCode==null && other.getAlphaCode()==null) || 
             (this.alphaCode!=null &&
              this.alphaCode.equals(other.getAlphaCode()))) &&
            this.amount == other.getAmount() &&
            this.amountUsed == other.getAmountUsed() &&
            this.check == other.getCheck() &&
            ((this.code==null && other.getCode()==null) || 
             (this.code!=null &&
              this.code.equals(other.getCode()))) &&
            ((this.codeType==null && other.getCodeType()==null) || 
             (this.codeType!=null &&
              this.codeType.equals(other.getCodeType()))) &&
            this.contractId == other.getContractId() &&
            this.feeAmount == other.getFeeAmount() &&
            ((this.firstUse==null && other.getFirstUse()==null) || 
             (this.firstUse!=null &&
              this.firstUse.equals(other.getFirstUse()))) &&
            this.id == other.getId() &&
            ((this.notes==null && other.getNotes()==null) || 
             (this.notes!=null &&
              this.notes.equals(other.getNotes()))) &&
            ((this.payee==null && other.getPayee()==null) || 
             (this.payee!=null &&
              this.payee.equals(other.getPayee()))) &&
            ((this.to==null && other.getTo()==null) || 
             (this.to!=null &&
              this.to.equals(other.getTo()))) &&
            this.useAmount == other.getUseAmount() &&
            ((this.useTime==null && other.getUseTime()==null) || 
             (this.useTime!=null &&
              this.useTime.equals(other.getUseTime()))) &&
            this.voided == other.isVoided() &&
            ((this.who==null && other.getWho()==null) || 
             (this.who!=null &&
              this.who.equals(other.getWho())));
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
        if (getActivated() != null) {
            _hashCode += getActivated().hashCode();
        }
        if (getAlphaCode() != null) {
            _hashCode += getAlphaCode().hashCode();
        }
        _hashCode += new Double(getAmount()).hashCode();
        _hashCode += new Double(getAmountUsed()).hashCode();
        _hashCode += getCheck();
        if (getCode() != null) {
            _hashCode += getCode().hashCode();
        }
        if (getCodeType() != null) {
            _hashCode += getCodeType().hashCode();
        }
        _hashCode += getContractId();
        _hashCode += new Double(getFeeAmount()).hashCode();
        if (getFirstUse() != null) {
            _hashCode += getFirstUse().hashCode();
        }
        _hashCode += getId();
        if (getNotes() != null) {
            _hashCode += getNotes().hashCode();
        }
        if (getPayee() != null) {
            _hashCode += getPayee().hashCode();
        }
        if (getTo() != null) {
            _hashCode += getTo().hashCode();
        }
        _hashCode += new Double(getUseAmount()).hashCode();
        if (getUseTime() != null) {
            _hashCode += getUseTime().hashCode();
        }
        _hashCode += (isVoided() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getWho() != null) {
            _hashCode += getWho().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WSMoneyCodeUse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://com.tch.cards.service/types", "WSMoneyCodeUse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("activated");
        elemField.setXmlName(new javax.xml.namespace.QName("", "activated"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alphaCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "alphaCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amountUsed");
        elemField.setXmlName(new javax.xml.namespace.QName("", "amountUsed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("check");
        elemField.setXmlName(new javax.xml.namespace.QName("", "check"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("code");
        elemField.setXmlName(new javax.xml.namespace.QName("", "code"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codeType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codeType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contractId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "contractId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("feeAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "feeAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("firstUse");
        elemField.setXmlName(new javax.xml.namespace.QName("", "firstUse"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "notes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payee");
        elemField.setXmlName(new javax.xml.namespace.QName("", "payee"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("to");
        elemField.setXmlName(new javax.xml.namespace.QName("", "to"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("useAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "useAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("useTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "useTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("voided");
        elemField.setXmlName(new javax.xml.namespace.QName("", "voided"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("who");
        elemField.setXmlName(new javax.xml.namespace.QName("", "who"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
