/**
 * WSTranReject.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package service.cards.tch.com.types;

public class WSTranReject  implements java.io.Serializable {
    private java.util.Calendar tranDate;

    private java.lang.String cardNum;

    private java.lang.String invoice;

    private int locId;

    private java.lang.String locName;

    private java.lang.String locCity;

    private java.lang.String locState;

    private int errorCode;

    private java.lang.String errorDesc;

    private java.lang.String unit;

    public WSTranReject() {
    }

    public WSTranReject(
           java.util.Calendar tranDate,
           java.lang.String cardNum,
           java.lang.String invoice,
           int locId,
           java.lang.String locName,
           java.lang.String locCity,
           java.lang.String locState,
           int errorCode,
           java.lang.String errorDesc,
           java.lang.String unit) {
           this.tranDate = tranDate;
           this.cardNum = cardNum;
           this.invoice = invoice;
           this.locId = locId;
           this.locName = locName;
           this.locCity = locCity;
           this.locState = locState;
           this.errorCode = errorCode;
           this.errorDesc = errorDesc;
           this.unit = unit;
    }


    /**
     * Gets the tranDate value for this WSTranReject.
     * 
     * @return tranDate
     */
    public java.util.Calendar getTranDate() {
        return tranDate;
    }


    /**
     * Sets the tranDate value for this WSTranReject.
     * 
     * @param tranDate
     */
    public void setTranDate(java.util.Calendar tranDate) {
        this.tranDate = tranDate;
    }


    /**
     * Gets the cardNum value for this WSTranReject.
     * 
     * @return cardNum
     */
    public java.lang.String getCardNum() {
        return cardNum;
    }


    /**
     * Sets the cardNum value for this WSTranReject.
     * 
     * @param cardNum
     */
    public void setCardNum(java.lang.String cardNum) {
        this.cardNum = cardNum;
    }


    /**
     * Gets the invoice value for this WSTranReject.
     * 
     * @return invoice
     */
    public java.lang.String getInvoice() {
        return invoice;
    }


    /**
     * Sets the invoice value for this WSTranReject.
     * 
     * @param invoice
     */
    public void setInvoice(java.lang.String invoice) {
        this.invoice = invoice;
    }


    /**
     * Gets the locId value for this WSTranReject.
     * 
     * @return locId
     */
    public int getLocId() {
        return locId;
    }


    /**
     * Sets the locId value for this WSTranReject.
     * 
     * @param locId
     */
    public void setLocId(int locId) {
        this.locId = locId;
    }


    /**
     * Gets the locName value for this WSTranReject.
     * 
     * @return locName
     */
    public java.lang.String getLocName() {
        return locName;
    }


    /**
     * Sets the locName value for this WSTranReject.
     * 
     * @param locName
     */
    public void setLocName(java.lang.String locName) {
        this.locName = locName;
    }


    /**
     * Gets the locCity value for this WSTranReject.
     * 
     * @return locCity
     */
    public java.lang.String getLocCity() {
        return locCity;
    }


    /**
     * Sets the locCity value for this WSTranReject.
     * 
     * @param locCity
     */
    public void setLocCity(java.lang.String locCity) {
        this.locCity = locCity;
    }


    /**
     * Gets the locState value for this WSTranReject.
     * 
     * @return locState
     */
    public java.lang.String getLocState() {
        return locState;
    }


    /**
     * Sets the locState value for this WSTranReject.
     * 
     * @param locState
     */
    public void setLocState(java.lang.String locState) {
        this.locState = locState;
    }


    /**
     * Gets the errorCode value for this WSTranReject.
     * 
     * @return errorCode
     */
    public int getErrorCode() {
        return errorCode;
    }


    /**
     * Sets the errorCode value for this WSTranReject.
     * 
     * @param errorCode
     */
    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }


    /**
     * Gets the errorDesc value for this WSTranReject.
     * 
     * @return errorDesc
     */
    public java.lang.String getErrorDesc() {
        return errorDesc;
    }


    /**
     * Sets the errorDesc value for this WSTranReject.
     * 
     * @param errorDesc
     */
    public void setErrorDesc(java.lang.String errorDesc) {
        this.errorDesc = errorDesc;
    }


    /**
     * Gets the unit value for this WSTranReject.
     * 
     * @return unit
     */
    public java.lang.String getUnit() {
        return unit;
    }


    /**
     * Sets the unit value for this WSTranReject.
     * 
     * @param unit
     */
    public void setUnit(java.lang.String unit) {
        this.unit = unit;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WSTranReject)) return false;
        WSTranReject other = (WSTranReject) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.tranDate==null && other.getTranDate()==null) || 
             (this.tranDate!=null &&
              this.tranDate.equals(other.getTranDate()))) &&
            ((this.cardNum==null && other.getCardNum()==null) || 
             (this.cardNum!=null &&
              this.cardNum.equals(other.getCardNum()))) &&
            ((this.invoice==null && other.getInvoice()==null) || 
             (this.invoice!=null &&
              this.invoice.equals(other.getInvoice()))) &&
            this.locId == other.getLocId() &&
            ((this.locName==null && other.getLocName()==null) || 
             (this.locName!=null &&
              this.locName.equals(other.getLocName()))) &&
            ((this.locCity==null && other.getLocCity()==null) || 
             (this.locCity!=null &&
              this.locCity.equals(other.getLocCity()))) &&
            ((this.locState==null && other.getLocState()==null) || 
             (this.locState!=null &&
              this.locState.equals(other.getLocState()))) &&
            this.errorCode == other.getErrorCode() &&
            ((this.errorDesc==null && other.getErrorDesc()==null) || 
             (this.errorDesc!=null &&
              this.errorDesc.equals(other.getErrorDesc()))) &&
            ((this.unit==null && other.getUnit()==null) || 
             (this.unit!=null &&
              this.unit.equals(other.getUnit())));
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
        if (getTranDate() != null) {
            _hashCode += getTranDate().hashCode();
        }
        if (getCardNum() != null) {
            _hashCode += getCardNum().hashCode();
        }
        if (getInvoice() != null) {
            _hashCode += getInvoice().hashCode();
        }
        _hashCode += getLocId();
        if (getLocName() != null) {
            _hashCode += getLocName().hashCode();
        }
        if (getLocCity() != null) {
            _hashCode += getLocCity().hashCode();
        }
        if (getLocState() != null) {
            _hashCode += getLocState().hashCode();
        }
        _hashCode += getErrorCode();
        if (getErrorDesc() != null) {
            _hashCode += getErrorDesc().hashCode();
        }
        if (getUnit() != null) {
            _hashCode += getUnit().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WSTranReject.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://com.tch.cards.service/types", "WSTranReject"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tranDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tranDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cardNum");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cardNum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("invoice");
        elemField.setXmlName(new javax.xml.namespace.QName("", "invoice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "locId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "locName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locCity");
        elemField.setXmlName(new javax.xml.namespace.QName("", "locCity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locState");
        elemField.setXmlName(new javax.xml.namespace.QName("", "locState"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errorCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "errorCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errorDesc");
        elemField.setXmlName(new javax.xml.namespace.QName("", "errorDesc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unit");
        elemField.setXmlName(new javax.xml.namespace.QName("", "unit"));
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
