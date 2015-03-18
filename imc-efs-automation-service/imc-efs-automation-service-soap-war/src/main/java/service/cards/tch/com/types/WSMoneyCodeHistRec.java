/**
 * WSMoneyCodeHistRec.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package service.cards.tch.com.types;

public class WSMoneyCodeHistRec  implements java.io.Serializable {
    private java.util.Calendar activeDate;

    private java.lang.String alphaCode;

    private double amount;

    private double amountUsed;

    private java.lang.String code;

    private java.lang.String codeType;

    private int contractId;

    private java.util.Calendar created;

    private boolean deductFees;

    private double feeAmount;

    private boolean feeType;

    private java.lang.String firstUse;

    private int id;

    private java.lang.String issuedTo;

    private java.lang.String notes;

    private int numUses;

    private java.lang.String payee;

    private java.lang.String status;

    private service.cards.tch.com.types.MoneyCodeHistUse[] uses;

    private java.util.Calendar voidDate;

    private boolean voided;

    private java.lang.String who;

    public WSMoneyCodeHistRec() {
    }

    public WSMoneyCodeHistRec(
           java.util.Calendar activeDate,
           java.lang.String alphaCode,
           double amount,
           double amountUsed,
           java.lang.String code,
           java.lang.String codeType,
           int contractId,
           java.util.Calendar created,
           boolean deductFees,
           double feeAmount,
           boolean feeType,
           java.lang.String firstUse,
           int id,
           java.lang.String issuedTo,
           java.lang.String notes,
           int numUses,
           java.lang.String payee,
           java.lang.String status,
           service.cards.tch.com.types.MoneyCodeHistUse[] uses,
           java.util.Calendar voidDate,
           boolean voided,
           java.lang.String who) {
           this.activeDate = activeDate;
           this.alphaCode = alphaCode;
           this.amount = amount;
           this.amountUsed = amountUsed;
           this.code = code;
           this.codeType = codeType;
           this.contractId = contractId;
           this.created = created;
           this.deductFees = deductFees;
           this.feeAmount = feeAmount;
           this.feeType = feeType;
           this.firstUse = firstUse;
           this.id = id;
           this.issuedTo = issuedTo;
           this.notes = notes;
           this.numUses = numUses;
           this.payee = payee;
           this.status = status;
           this.uses = uses;
           this.voidDate = voidDate;
           this.voided = voided;
           this.who = who;
    }


    /**
     * Gets the activeDate value for this WSMoneyCodeHistRec.
     * 
     * @return activeDate
     */
    public java.util.Calendar getActiveDate() {
        return activeDate;
    }


    /**
     * Sets the activeDate value for this WSMoneyCodeHistRec.
     * 
     * @param activeDate
     */
    public void setActiveDate(java.util.Calendar activeDate) {
        this.activeDate = activeDate;
    }


    /**
     * Gets the alphaCode value for this WSMoneyCodeHistRec.
     * 
     * @return alphaCode
     */
    public java.lang.String getAlphaCode() {
        return alphaCode;
    }


    /**
     * Sets the alphaCode value for this WSMoneyCodeHistRec.
     * 
     * @param alphaCode
     */
    public void setAlphaCode(java.lang.String alphaCode) {
        this.alphaCode = alphaCode;
    }


    /**
     * Gets the amount value for this WSMoneyCodeHistRec.
     * 
     * @return amount
     */
    public double getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this WSMoneyCodeHistRec.
     * 
     * @param amount
     */
    public void setAmount(double amount) {
        this.amount = amount;
    }


    /**
     * Gets the amountUsed value for this WSMoneyCodeHistRec.
     * 
     * @return amountUsed
     */
    public double getAmountUsed() {
        return amountUsed;
    }


    /**
     * Sets the amountUsed value for this WSMoneyCodeHistRec.
     * 
     * @param amountUsed
     */
    public void setAmountUsed(double amountUsed) {
        this.amountUsed = amountUsed;
    }


    /**
     * Gets the code value for this WSMoneyCodeHistRec.
     * 
     * @return code
     */
    public java.lang.String getCode() {
        return code;
    }


    /**
     * Sets the code value for this WSMoneyCodeHistRec.
     * 
     * @param code
     */
    public void setCode(java.lang.String code) {
        this.code = code;
    }


    /**
     * Gets the codeType value for this WSMoneyCodeHistRec.
     * 
     * @return codeType
     */
    public java.lang.String getCodeType() {
        return codeType;
    }


    /**
     * Sets the codeType value for this WSMoneyCodeHistRec.
     * 
     * @param codeType
     */
    public void setCodeType(java.lang.String codeType) {
        this.codeType = codeType;
    }


    /**
     * Gets the contractId value for this WSMoneyCodeHistRec.
     * 
     * @return contractId
     */
    public int getContractId() {
        return contractId;
    }


    /**
     * Sets the contractId value for this WSMoneyCodeHistRec.
     * 
     * @param contractId
     */
    public void setContractId(int contractId) {
        this.contractId = contractId;
    }


    /**
     * Gets the created value for this WSMoneyCodeHistRec.
     * 
     * @return created
     */
    public java.util.Calendar getCreated() {
        return created;
    }


    /**
     * Sets the created value for this WSMoneyCodeHistRec.
     * 
     * @param created
     */
    public void setCreated(java.util.Calendar created) {
        this.created = created;
    }


    /**
     * Gets the deductFees value for this WSMoneyCodeHistRec.
     * 
     * @return deductFees
     */
    public boolean isDeductFees() {
        return deductFees;
    }


    /**
     * Sets the deductFees value for this WSMoneyCodeHistRec.
     * 
     * @param deductFees
     */
    public void setDeductFees(boolean deductFees) {
        this.deductFees = deductFees;
    }


    /**
     * Gets the feeAmount value for this WSMoneyCodeHistRec.
     * 
     * @return feeAmount
     */
    public double getFeeAmount() {
        return feeAmount;
    }


    /**
     * Sets the feeAmount value for this WSMoneyCodeHistRec.
     * 
     * @param feeAmount
     */
    public void setFeeAmount(double feeAmount) {
        this.feeAmount = feeAmount;
    }


    /**
     * Gets the feeType value for this WSMoneyCodeHistRec.
     * 
     * @return feeType
     */
    public boolean isFeeType() {
        return feeType;
    }


    /**
     * Sets the feeType value for this WSMoneyCodeHistRec.
     * 
     * @param feeType
     */
    public void setFeeType(boolean feeType) {
        this.feeType = feeType;
    }


    /**
     * Gets the firstUse value for this WSMoneyCodeHistRec.
     * 
     * @return firstUse
     */
    public java.lang.String getFirstUse() {
        return firstUse;
    }


    /**
     * Sets the firstUse value for this WSMoneyCodeHistRec.
     * 
     * @param firstUse
     */
    public void setFirstUse(java.lang.String firstUse) {
        this.firstUse = firstUse;
    }


    /**
     * Gets the id value for this WSMoneyCodeHistRec.
     * 
     * @return id
     */
    public int getId() {
        return id;
    }


    /**
     * Sets the id value for this WSMoneyCodeHistRec.
     * 
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }


    /**
     * Gets the issuedTo value for this WSMoneyCodeHistRec.
     * 
     * @return issuedTo
     */
    public java.lang.String getIssuedTo() {
        return issuedTo;
    }


    /**
     * Sets the issuedTo value for this WSMoneyCodeHistRec.
     * 
     * @param issuedTo
     */
    public void setIssuedTo(java.lang.String issuedTo) {
        this.issuedTo = issuedTo;
    }


    /**
     * Gets the notes value for this WSMoneyCodeHistRec.
     * 
     * @return notes
     */
    public java.lang.String getNotes() {
        return notes;
    }


    /**
     * Sets the notes value for this WSMoneyCodeHistRec.
     * 
     * @param notes
     */
    public void setNotes(java.lang.String notes) {
        this.notes = notes;
    }


    /**
     * Gets the numUses value for this WSMoneyCodeHistRec.
     * 
     * @return numUses
     */
    public int getNumUses() {
        return numUses;
    }


    /**
     * Sets the numUses value for this WSMoneyCodeHistRec.
     * 
     * @param numUses
     */
    public void setNumUses(int numUses) {
        this.numUses = numUses;
    }


    /**
     * Gets the payee value for this WSMoneyCodeHistRec.
     * 
     * @return payee
     */
    public java.lang.String getPayee() {
        return payee;
    }


    /**
     * Sets the payee value for this WSMoneyCodeHistRec.
     * 
     * @param payee
     */
    public void setPayee(java.lang.String payee) {
        this.payee = payee;
    }


    /**
     * Gets the status value for this WSMoneyCodeHistRec.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this WSMoneyCodeHistRec.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }


    /**
     * Gets the uses value for this WSMoneyCodeHistRec.
     * 
     * @return uses
     */
    public service.cards.tch.com.types.MoneyCodeHistUse[] getUses() {
        return uses;
    }


    /**
     * Sets the uses value for this WSMoneyCodeHistRec.
     * 
     * @param uses
     */
    public void setUses(service.cards.tch.com.types.MoneyCodeHistUse[] uses) {
        this.uses = uses;
    }

    public service.cards.tch.com.types.MoneyCodeHistUse getUses(int i) {
        return this.uses[i];
    }

    public void setUses(int i, service.cards.tch.com.types.MoneyCodeHistUse _value) {
        this.uses[i] = _value;
    }


    /**
     * Gets the voidDate value for this WSMoneyCodeHistRec.
     * 
     * @return voidDate
     */
    public java.util.Calendar getVoidDate() {
        return voidDate;
    }


    /**
     * Sets the voidDate value for this WSMoneyCodeHistRec.
     * 
     * @param voidDate
     */
    public void setVoidDate(java.util.Calendar voidDate) {
        this.voidDate = voidDate;
    }


    /**
     * Gets the voided value for this WSMoneyCodeHistRec.
     * 
     * @return voided
     */
    public boolean isVoided() {
        return voided;
    }


    /**
     * Sets the voided value for this WSMoneyCodeHistRec.
     * 
     * @param voided
     */
    public void setVoided(boolean voided) {
        this.voided = voided;
    }


    /**
     * Gets the who value for this WSMoneyCodeHistRec.
     * 
     * @return who
     */
    public java.lang.String getWho() {
        return who;
    }


    /**
     * Sets the who value for this WSMoneyCodeHistRec.
     * 
     * @param who
     */
    public void setWho(java.lang.String who) {
        this.who = who;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WSMoneyCodeHistRec)) return false;
        WSMoneyCodeHistRec other = (WSMoneyCodeHistRec) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.activeDate==null && other.getActiveDate()==null) || 
             (this.activeDate!=null &&
              this.activeDate.equals(other.getActiveDate()))) &&
            ((this.alphaCode==null && other.getAlphaCode()==null) || 
             (this.alphaCode!=null &&
              this.alphaCode.equals(other.getAlphaCode()))) &&
            this.amount == other.getAmount() &&
            this.amountUsed == other.getAmountUsed() &&
            ((this.code==null && other.getCode()==null) || 
             (this.code!=null &&
              this.code.equals(other.getCode()))) &&
            ((this.codeType==null && other.getCodeType()==null) || 
             (this.codeType!=null &&
              this.codeType.equals(other.getCodeType()))) &&
            this.contractId == other.getContractId() &&
            ((this.created==null && other.getCreated()==null) || 
             (this.created!=null &&
              this.created.equals(other.getCreated()))) &&
            this.deductFees == other.isDeductFees() &&
            this.feeAmount == other.getFeeAmount() &&
            this.feeType == other.isFeeType() &&
            ((this.firstUse==null && other.getFirstUse()==null) || 
             (this.firstUse!=null &&
              this.firstUse.equals(other.getFirstUse()))) &&
            this.id == other.getId() &&
            ((this.issuedTo==null && other.getIssuedTo()==null) || 
             (this.issuedTo!=null &&
              this.issuedTo.equals(other.getIssuedTo()))) &&
            ((this.notes==null && other.getNotes()==null) || 
             (this.notes!=null &&
              this.notes.equals(other.getNotes()))) &&
            this.numUses == other.getNumUses() &&
            ((this.payee==null && other.getPayee()==null) || 
             (this.payee!=null &&
              this.payee.equals(other.getPayee()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.uses==null && other.getUses()==null) || 
             (this.uses!=null &&
              java.util.Arrays.equals(this.uses, other.getUses()))) &&
            ((this.voidDate==null && other.getVoidDate()==null) || 
             (this.voidDate!=null &&
              this.voidDate.equals(other.getVoidDate()))) &&
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
        if (getActiveDate() != null) {
            _hashCode += getActiveDate().hashCode();
        }
        if (getAlphaCode() != null) {
            _hashCode += getAlphaCode().hashCode();
        }
        _hashCode += new Double(getAmount()).hashCode();
        _hashCode += new Double(getAmountUsed()).hashCode();
        if (getCode() != null) {
            _hashCode += getCode().hashCode();
        }
        if (getCodeType() != null) {
            _hashCode += getCodeType().hashCode();
        }
        _hashCode += getContractId();
        if (getCreated() != null) {
            _hashCode += getCreated().hashCode();
        }
        _hashCode += (isDeductFees() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += new Double(getFeeAmount()).hashCode();
        _hashCode += (isFeeType() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getFirstUse() != null) {
            _hashCode += getFirstUse().hashCode();
        }
        _hashCode += getId();
        if (getIssuedTo() != null) {
            _hashCode += getIssuedTo().hashCode();
        }
        if (getNotes() != null) {
            _hashCode += getNotes().hashCode();
        }
        _hashCode += getNumUses();
        if (getPayee() != null) {
            _hashCode += getPayee().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getUses() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getUses());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getUses(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getVoidDate() != null) {
            _hashCode += getVoidDate().hashCode();
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
        new org.apache.axis.description.TypeDesc(WSMoneyCodeHistRec.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://com.tch.cards.service/types", "WSMoneyCodeHistRec"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("activeDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "activeDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
        elemField.setFieldName("created");
        elemField.setXmlName(new javax.xml.namespace.QName("", "created"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deductFees");
        elemField.setXmlName(new javax.xml.namespace.QName("", "deductFees"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("feeAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "feeAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("feeType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "feeType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
        elemField.setFieldName("issuedTo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "issuedTo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "notes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numUses");
        elemField.setXmlName(new javax.xml.namespace.QName("", "numUses"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payee");
        elemField.setXmlName(new javax.xml.namespace.QName("", "payee"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("uses");
        elemField.setXmlName(new javax.xml.namespace.QName("", "uses"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://com.tch.cards.service/types", "MoneyCodeHistUse"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("voidDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "voidDate"));
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
