/**
 * WSFleetMemo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package service.cards.tch.com.types;

public class WSFleetMemo  implements java.io.Serializable {
    private java.lang.String cardNumber;

    private java.lang.String acceptorName;

    private java.lang.String authCode;

    private java.util.Calendar tchMemoDate;

    private int amount;

    private int contractId;

    private int msgNumType;

    private int type;

    private int bin;

    private java.lang.String mcCardNum;

    private int postedAmount;

    private int atmFee;

    private int pinSent;

    private java.lang.String atmId;

    private int merchType;

    private java.lang.Integer stan;

    private java.lang.Integer entryMode;

    private java.util.Calendar neverClearedDate;

    private java.lang.String mercName;

    private java.lang.String mercAddr;

    private java.lang.String mercZip;

    private java.lang.String mercPhone;

    private java.lang.String mercState;

    private java.lang.String mercCat;

    private java.lang.String mercCity;

    public WSFleetMemo() {
    }

    public WSFleetMemo(
           java.lang.String cardNumber,
           java.lang.String acceptorName,
           java.lang.String authCode,
           java.util.Calendar tchMemoDate,
           int amount,
           int contractId,
           int msgNumType,
           int type,
           int bin,
           java.lang.String mcCardNum,
           int postedAmount,
           int atmFee,
           int pinSent,
           java.lang.String atmId,
           int merchType,
           java.lang.Integer stan,
           java.lang.Integer entryMode,
           java.util.Calendar neverClearedDate,
           java.lang.String mercName,
           java.lang.String mercAddr,
           java.lang.String mercZip,
           java.lang.String mercPhone,
           java.lang.String mercState,
           java.lang.String mercCat,
           java.lang.String mercCity) {
           this.cardNumber = cardNumber;
           this.acceptorName = acceptorName;
           this.authCode = authCode;
           this.tchMemoDate = tchMemoDate;
           this.amount = amount;
           this.contractId = contractId;
           this.msgNumType = msgNumType;
           this.type = type;
           this.bin = bin;
           this.mcCardNum = mcCardNum;
           this.postedAmount = postedAmount;
           this.atmFee = atmFee;
           this.pinSent = pinSent;
           this.atmId = atmId;
           this.merchType = merchType;
           this.stan = stan;
           this.entryMode = entryMode;
           this.neverClearedDate = neverClearedDate;
           this.mercName = mercName;
           this.mercAddr = mercAddr;
           this.mercZip = mercZip;
           this.mercPhone = mercPhone;
           this.mercState = mercState;
           this.mercCat = mercCat;
           this.mercCity = mercCity;
    }


    /**
     * Gets the cardNumber value for this WSFleetMemo.
     * 
     * @return cardNumber
     */
    public java.lang.String getCardNumber() {
        return cardNumber;
    }


    /**
     * Sets the cardNumber value for this WSFleetMemo.
     * 
     * @param cardNumber
     */
    public void setCardNumber(java.lang.String cardNumber) {
        this.cardNumber = cardNumber;
    }


    /**
     * Gets the acceptorName value for this WSFleetMemo.
     * 
     * @return acceptorName
     */
    public java.lang.String getAcceptorName() {
        return acceptorName;
    }


    /**
     * Sets the acceptorName value for this WSFleetMemo.
     * 
     * @param acceptorName
     */
    public void setAcceptorName(java.lang.String acceptorName) {
        this.acceptorName = acceptorName;
    }


    /**
     * Gets the authCode value for this WSFleetMemo.
     * 
     * @return authCode
     */
    public java.lang.String getAuthCode() {
        return authCode;
    }


    /**
     * Sets the authCode value for this WSFleetMemo.
     * 
     * @param authCode
     */
    public void setAuthCode(java.lang.String authCode) {
        this.authCode = authCode;
    }


    /**
     * Gets the tchMemoDate value for this WSFleetMemo.
     * 
     * @return tchMemoDate
     */
    public java.util.Calendar getTchMemoDate() {
        return tchMemoDate;
    }


    /**
     * Sets the tchMemoDate value for this WSFleetMemo.
     * 
     * @param tchMemoDate
     */
    public void setTchMemoDate(java.util.Calendar tchMemoDate) {
        this.tchMemoDate = tchMemoDate;
    }


    /**
     * Gets the amount value for this WSFleetMemo.
     * 
     * @return amount
     */
    public int getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this WSFleetMemo.
     * 
     * @param amount
     */
    public void setAmount(int amount) {
        this.amount = amount;
    }


    /**
     * Gets the contractId value for this WSFleetMemo.
     * 
     * @return contractId
     */
    public int getContractId() {
        return contractId;
    }


    /**
     * Sets the contractId value for this WSFleetMemo.
     * 
     * @param contractId
     */
    public void setContractId(int contractId) {
        this.contractId = contractId;
    }


    /**
     * Gets the msgNumType value for this WSFleetMemo.
     * 
     * @return msgNumType
     */
    public int getMsgNumType() {
        return msgNumType;
    }


    /**
     * Sets the msgNumType value for this WSFleetMemo.
     * 
     * @param msgNumType
     */
    public void setMsgNumType(int msgNumType) {
        this.msgNumType = msgNumType;
    }


    /**
     * Gets the type value for this WSFleetMemo.
     * 
     * @return type
     */
    public int getType() {
        return type;
    }


    /**
     * Sets the type value for this WSFleetMemo.
     * 
     * @param type
     */
    public void setType(int type) {
        this.type = type;
    }


    /**
     * Gets the bin value for this WSFleetMemo.
     * 
     * @return bin
     */
    public int getBin() {
        return bin;
    }


    /**
     * Sets the bin value for this WSFleetMemo.
     * 
     * @param bin
     */
    public void setBin(int bin) {
        this.bin = bin;
    }


    /**
     * Gets the mcCardNum value for this WSFleetMemo.
     * 
     * @return mcCardNum
     */
    public java.lang.String getMcCardNum() {
        return mcCardNum;
    }


    /**
     * Sets the mcCardNum value for this WSFleetMemo.
     * 
     * @param mcCardNum
     */
    public void setMcCardNum(java.lang.String mcCardNum) {
        this.mcCardNum = mcCardNum;
    }


    /**
     * Gets the postedAmount value for this WSFleetMemo.
     * 
     * @return postedAmount
     */
    public int getPostedAmount() {
        return postedAmount;
    }


    /**
     * Sets the postedAmount value for this WSFleetMemo.
     * 
     * @param postedAmount
     */
    public void setPostedAmount(int postedAmount) {
        this.postedAmount = postedAmount;
    }


    /**
     * Gets the atmFee value for this WSFleetMemo.
     * 
     * @return atmFee
     */
    public int getAtmFee() {
        return atmFee;
    }


    /**
     * Sets the atmFee value for this WSFleetMemo.
     * 
     * @param atmFee
     */
    public void setAtmFee(int atmFee) {
        this.atmFee = atmFee;
    }


    /**
     * Gets the pinSent value for this WSFleetMemo.
     * 
     * @return pinSent
     */
    public int getPinSent() {
        return pinSent;
    }


    /**
     * Sets the pinSent value for this WSFleetMemo.
     * 
     * @param pinSent
     */
    public void setPinSent(int pinSent) {
        this.pinSent = pinSent;
    }


    /**
     * Gets the atmId value for this WSFleetMemo.
     * 
     * @return atmId
     */
    public java.lang.String getAtmId() {
        return atmId;
    }


    /**
     * Sets the atmId value for this WSFleetMemo.
     * 
     * @param atmId
     */
    public void setAtmId(java.lang.String atmId) {
        this.atmId = atmId;
    }


    /**
     * Gets the merchType value for this WSFleetMemo.
     * 
     * @return merchType
     */
    public int getMerchType() {
        return merchType;
    }


    /**
     * Sets the merchType value for this WSFleetMemo.
     * 
     * @param merchType
     */
    public void setMerchType(int merchType) {
        this.merchType = merchType;
    }


    /**
     * Gets the stan value for this WSFleetMemo.
     * 
     * @return stan
     */
    public java.lang.Integer getStan() {
        return stan;
    }


    /**
     * Sets the stan value for this WSFleetMemo.
     * 
     * @param stan
     */
    public void setStan(java.lang.Integer stan) {
        this.stan = stan;
    }


    /**
     * Gets the entryMode value for this WSFleetMemo.
     * 
     * @return entryMode
     */
    public java.lang.Integer getEntryMode() {
        return entryMode;
    }


    /**
     * Sets the entryMode value for this WSFleetMemo.
     * 
     * @param entryMode
     */
    public void setEntryMode(java.lang.Integer entryMode) {
        this.entryMode = entryMode;
    }


    /**
     * Gets the neverClearedDate value for this WSFleetMemo.
     * 
     * @return neverClearedDate
     */
    public java.util.Calendar getNeverClearedDate() {
        return neverClearedDate;
    }


    /**
     * Sets the neverClearedDate value for this WSFleetMemo.
     * 
     * @param neverClearedDate
     */
    public void setNeverClearedDate(java.util.Calendar neverClearedDate) {
        this.neverClearedDate = neverClearedDate;
    }


    /**
     * Gets the mercName value for this WSFleetMemo.
     * 
     * @return mercName
     */
    public java.lang.String getMercName() {
        return mercName;
    }


    /**
     * Sets the mercName value for this WSFleetMemo.
     * 
     * @param mercName
     */
    public void setMercName(java.lang.String mercName) {
        this.mercName = mercName;
    }


    /**
     * Gets the mercAddr value for this WSFleetMemo.
     * 
     * @return mercAddr
     */
    public java.lang.String getMercAddr() {
        return mercAddr;
    }


    /**
     * Sets the mercAddr value for this WSFleetMemo.
     * 
     * @param mercAddr
     */
    public void setMercAddr(java.lang.String mercAddr) {
        this.mercAddr = mercAddr;
    }


    /**
     * Gets the mercZip value for this WSFleetMemo.
     * 
     * @return mercZip
     */
    public java.lang.String getMercZip() {
        return mercZip;
    }


    /**
     * Sets the mercZip value for this WSFleetMemo.
     * 
     * @param mercZip
     */
    public void setMercZip(java.lang.String mercZip) {
        this.mercZip = mercZip;
    }


    /**
     * Gets the mercPhone value for this WSFleetMemo.
     * 
     * @return mercPhone
     */
    public java.lang.String getMercPhone() {
        return mercPhone;
    }


    /**
     * Sets the mercPhone value for this WSFleetMemo.
     * 
     * @param mercPhone
     */
    public void setMercPhone(java.lang.String mercPhone) {
        this.mercPhone = mercPhone;
    }


    /**
     * Gets the mercState value for this WSFleetMemo.
     * 
     * @return mercState
     */
    public java.lang.String getMercState() {
        return mercState;
    }


    /**
     * Sets the mercState value for this WSFleetMemo.
     * 
     * @param mercState
     */
    public void setMercState(java.lang.String mercState) {
        this.mercState = mercState;
    }


    /**
     * Gets the mercCat value for this WSFleetMemo.
     * 
     * @return mercCat
     */
    public java.lang.String getMercCat() {
        return mercCat;
    }


    /**
     * Sets the mercCat value for this WSFleetMemo.
     * 
     * @param mercCat
     */
    public void setMercCat(java.lang.String mercCat) {
        this.mercCat = mercCat;
    }


    /**
     * Gets the mercCity value for this WSFleetMemo.
     * 
     * @return mercCity
     */
    public java.lang.String getMercCity() {
        return mercCity;
    }


    /**
     * Sets the mercCity value for this WSFleetMemo.
     * 
     * @param mercCity
     */
    public void setMercCity(java.lang.String mercCity) {
        this.mercCity = mercCity;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WSFleetMemo)) return false;
        WSFleetMemo other = (WSFleetMemo) obj;
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
            ((this.acceptorName==null && other.getAcceptorName()==null) || 
             (this.acceptorName!=null &&
              this.acceptorName.equals(other.getAcceptorName()))) &&
            ((this.authCode==null && other.getAuthCode()==null) || 
             (this.authCode!=null &&
              this.authCode.equals(other.getAuthCode()))) &&
            ((this.tchMemoDate==null && other.getTchMemoDate()==null) || 
             (this.tchMemoDate!=null &&
              this.tchMemoDate.equals(other.getTchMemoDate()))) &&
            this.amount == other.getAmount() &&
            this.contractId == other.getContractId() &&
            this.msgNumType == other.getMsgNumType() &&
            this.type == other.getType() &&
            this.bin == other.getBin() &&
            ((this.mcCardNum==null && other.getMcCardNum()==null) || 
             (this.mcCardNum!=null &&
              this.mcCardNum.equals(other.getMcCardNum()))) &&
            this.postedAmount == other.getPostedAmount() &&
            this.atmFee == other.getAtmFee() &&
            this.pinSent == other.getPinSent() &&
            ((this.atmId==null && other.getAtmId()==null) || 
             (this.atmId!=null &&
              this.atmId.equals(other.getAtmId()))) &&
            this.merchType == other.getMerchType() &&
            ((this.stan==null && other.getStan()==null) || 
             (this.stan!=null &&
              this.stan.equals(other.getStan()))) &&
            ((this.entryMode==null && other.getEntryMode()==null) || 
             (this.entryMode!=null &&
              this.entryMode.equals(other.getEntryMode()))) &&
            ((this.neverClearedDate==null && other.getNeverClearedDate()==null) || 
             (this.neverClearedDate!=null &&
              this.neverClearedDate.equals(other.getNeverClearedDate()))) &&
            ((this.mercName==null && other.getMercName()==null) || 
             (this.mercName!=null &&
              this.mercName.equals(other.getMercName()))) &&
            ((this.mercAddr==null && other.getMercAddr()==null) || 
             (this.mercAddr!=null &&
              this.mercAddr.equals(other.getMercAddr()))) &&
            ((this.mercZip==null && other.getMercZip()==null) || 
             (this.mercZip!=null &&
              this.mercZip.equals(other.getMercZip()))) &&
            ((this.mercPhone==null && other.getMercPhone()==null) || 
             (this.mercPhone!=null &&
              this.mercPhone.equals(other.getMercPhone()))) &&
            ((this.mercState==null && other.getMercState()==null) || 
             (this.mercState!=null &&
              this.mercState.equals(other.getMercState()))) &&
            ((this.mercCat==null && other.getMercCat()==null) || 
             (this.mercCat!=null &&
              this.mercCat.equals(other.getMercCat()))) &&
            ((this.mercCity==null && other.getMercCity()==null) || 
             (this.mercCity!=null &&
              this.mercCity.equals(other.getMercCity())));
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
        if (getAcceptorName() != null) {
            _hashCode += getAcceptorName().hashCode();
        }
        if (getAuthCode() != null) {
            _hashCode += getAuthCode().hashCode();
        }
        if (getTchMemoDate() != null) {
            _hashCode += getTchMemoDate().hashCode();
        }
        _hashCode += getAmount();
        _hashCode += getContractId();
        _hashCode += getMsgNumType();
        _hashCode += getType();
        _hashCode += getBin();
        if (getMcCardNum() != null) {
            _hashCode += getMcCardNum().hashCode();
        }
        _hashCode += getPostedAmount();
        _hashCode += getAtmFee();
        _hashCode += getPinSent();
        if (getAtmId() != null) {
            _hashCode += getAtmId().hashCode();
        }
        _hashCode += getMerchType();
        if (getStan() != null) {
            _hashCode += getStan().hashCode();
        }
        if (getEntryMode() != null) {
            _hashCode += getEntryMode().hashCode();
        }
        if (getNeverClearedDate() != null) {
            _hashCode += getNeverClearedDate().hashCode();
        }
        if (getMercName() != null) {
            _hashCode += getMercName().hashCode();
        }
        if (getMercAddr() != null) {
            _hashCode += getMercAddr().hashCode();
        }
        if (getMercZip() != null) {
            _hashCode += getMercZip().hashCode();
        }
        if (getMercPhone() != null) {
            _hashCode += getMercPhone().hashCode();
        }
        if (getMercState() != null) {
            _hashCode += getMercState().hashCode();
        }
        if (getMercCat() != null) {
            _hashCode += getMercCat().hashCode();
        }
        if (getMercCity() != null) {
            _hashCode += getMercCity().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WSFleetMemo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://com.tch.cards.service/types", "WSFleetMemo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cardNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cardNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acceptorName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "acceptorName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "authCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tchMemoDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tchMemoDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contractId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "contractId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("msgNumType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "msgNumType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bin");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mcCardNum");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mcCardNum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postedAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "postedAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("atmFee");
        elemField.setXmlName(new javax.xml.namespace.QName("", "atmFee"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pinSent");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pinSent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("atmId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "atmId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("merchType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "merchType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stan");
        elemField.setXmlName(new javax.xml.namespace.QName("", "stan"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entryMode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "entryMode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("neverClearedDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "neverClearedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mercName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mercName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mercAddr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mercAddr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mercZip");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mercZip"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mercPhone");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mercPhone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mercState");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mercState"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mercCat");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mercCat"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mercCity");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mercCity"));
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
