/**
 * WSManagedFuel.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package service.cards.tch.com.types;

public class WSManagedFuel  implements java.io.Serializable {
    private java.lang.String tripNumber;

    private java.lang.Integer tripSeq;

    private java.lang.String cardNumber;

    private java.lang.String cardNumber2;

    private java.lang.Integer locationId;

    private java.lang.Integer fuelType;

    private java.lang.Integer fuelUse;

    private java.lang.Integer qtyAllowed;

    private java.util.Calendar effDt;

    private java.util.Calendar expDt;

    private java.lang.String action;

    public WSManagedFuel() {
    }

    public WSManagedFuel(
           java.lang.String tripNumber,
           java.lang.Integer tripSeq,
           java.lang.String cardNumber,
           java.lang.String cardNumber2,
           java.lang.Integer locationId,
           java.lang.Integer fuelType,
           java.lang.Integer fuelUse,
           java.lang.Integer qtyAllowed,
           java.util.Calendar effDt,
           java.util.Calendar expDt,
           java.lang.String action) {
           this.tripNumber = tripNumber;
           this.tripSeq = tripSeq;
           this.cardNumber = cardNumber;
           this.cardNumber2 = cardNumber2;
           this.locationId = locationId;
           this.fuelType = fuelType;
           this.fuelUse = fuelUse;
           this.qtyAllowed = qtyAllowed;
           this.effDt = effDt;
           this.expDt = expDt;
           this.action = action;
    }


    /**
     * Gets the tripNumber value for this WSManagedFuel.
     * 
     * @return tripNumber
     */
    public java.lang.String getTripNumber() {
        return tripNumber;
    }


    /**
     * Sets the tripNumber value for this WSManagedFuel.
     * 
     * @param tripNumber
     */
    public void setTripNumber(java.lang.String tripNumber) {
        this.tripNumber = tripNumber;
    }


    /**
     * Gets the tripSeq value for this WSManagedFuel.
     * 
     * @return tripSeq
     */
    public java.lang.Integer getTripSeq() {
        return tripSeq;
    }


    /**
     * Sets the tripSeq value for this WSManagedFuel.
     * 
     * @param tripSeq
     */
    public void setTripSeq(java.lang.Integer tripSeq) {
        this.tripSeq = tripSeq;
    }


    /**
     * Gets the cardNumber value for this WSManagedFuel.
     * 
     * @return cardNumber
     */
    public java.lang.String getCardNumber() {
        return cardNumber;
    }


    /**
     * Sets the cardNumber value for this WSManagedFuel.
     * 
     * @param cardNumber
     */
    public void setCardNumber(java.lang.String cardNumber) {
        this.cardNumber = cardNumber;
    }


    /**
     * Gets the cardNumber2 value for this WSManagedFuel.
     * 
     * @return cardNumber2
     */
    public java.lang.String getCardNumber2() {
        return cardNumber2;
    }


    /**
     * Sets the cardNumber2 value for this WSManagedFuel.
     * 
     * @param cardNumber2
     */
    public void setCardNumber2(java.lang.String cardNumber2) {
        this.cardNumber2 = cardNumber2;
    }


    /**
     * Gets the locationId value for this WSManagedFuel.
     * 
     * @return locationId
     */
    public java.lang.Integer getLocationId() {
        return locationId;
    }


    /**
     * Sets the locationId value for this WSManagedFuel.
     * 
     * @param locationId
     */
    public void setLocationId(java.lang.Integer locationId) {
        this.locationId = locationId;
    }


    /**
     * Gets the fuelType value for this WSManagedFuel.
     * 
     * @return fuelType
     */
    public java.lang.Integer getFuelType() {
        return fuelType;
    }


    /**
     * Sets the fuelType value for this WSManagedFuel.
     * 
     * @param fuelType
     */
    public void setFuelType(java.lang.Integer fuelType) {
        this.fuelType = fuelType;
    }


    /**
     * Gets the fuelUse value for this WSManagedFuel.
     * 
     * @return fuelUse
     */
    public java.lang.Integer getFuelUse() {
        return fuelUse;
    }


    /**
     * Sets the fuelUse value for this WSManagedFuel.
     * 
     * @param fuelUse
     */
    public void setFuelUse(java.lang.Integer fuelUse) {
        this.fuelUse = fuelUse;
    }


    /**
     * Gets the qtyAllowed value for this WSManagedFuel.
     * 
     * @return qtyAllowed
     */
    public java.lang.Integer getQtyAllowed() {
        return qtyAllowed;
    }


    /**
     * Sets the qtyAllowed value for this WSManagedFuel.
     * 
     * @param qtyAllowed
     */
    public void setQtyAllowed(java.lang.Integer qtyAllowed) {
        this.qtyAllowed = qtyAllowed;
    }


    /**
     * Gets the effDt value for this WSManagedFuel.
     * 
     * @return effDt
     */
    public java.util.Calendar getEffDt() {
        return effDt;
    }


    /**
     * Sets the effDt value for this WSManagedFuel.
     * 
     * @param effDt
     */
    public void setEffDt(java.util.Calendar effDt) {
        this.effDt = effDt;
    }


    /**
     * Gets the expDt value for this WSManagedFuel.
     * 
     * @return expDt
     */
    public java.util.Calendar getExpDt() {
        return expDt;
    }


    /**
     * Sets the expDt value for this WSManagedFuel.
     * 
     * @param expDt
     */
    public void setExpDt(java.util.Calendar expDt) {
        this.expDt = expDt;
    }


    /**
     * Gets the action value for this WSManagedFuel.
     * 
     * @return action
     */
    public java.lang.String getAction() {
        return action;
    }


    /**
     * Sets the action value for this WSManagedFuel.
     * 
     * @param action
     */
    public void setAction(java.lang.String action) {
        this.action = action;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WSManagedFuel)) return false;
        WSManagedFuel other = (WSManagedFuel) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.tripNumber==null && other.getTripNumber()==null) || 
             (this.tripNumber!=null &&
              this.tripNumber.equals(other.getTripNumber()))) &&
            ((this.tripSeq==null && other.getTripSeq()==null) || 
             (this.tripSeq!=null &&
              this.tripSeq.equals(other.getTripSeq()))) &&
            ((this.cardNumber==null && other.getCardNumber()==null) || 
             (this.cardNumber!=null &&
              this.cardNumber.equals(other.getCardNumber()))) &&
            ((this.cardNumber2==null && other.getCardNumber2()==null) || 
             (this.cardNumber2!=null &&
              this.cardNumber2.equals(other.getCardNumber2()))) &&
            ((this.locationId==null && other.getLocationId()==null) || 
             (this.locationId!=null &&
              this.locationId.equals(other.getLocationId()))) &&
            ((this.fuelType==null && other.getFuelType()==null) || 
             (this.fuelType!=null &&
              this.fuelType.equals(other.getFuelType()))) &&
            ((this.fuelUse==null && other.getFuelUse()==null) || 
             (this.fuelUse!=null &&
              this.fuelUse.equals(other.getFuelUse()))) &&
            ((this.qtyAllowed==null && other.getQtyAllowed()==null) || 
             (this.qtyAllowed!=null &&
              this.qtyAllowed.equals(other.getQtyAllowed()))) &&
            ((this.effDt==null && other.getEffDt()==null) || 
             (this.effDt!=null &&
              this.effDt.equals(other.getEffDt()))) &&
            ((this.expDt==null && other.getExpDt()==null) || 
             (this.expDt!=null &&
              this.expDt.equals(other.getExpDt()))) &&
            ((this.action==null && other.getAction()==null) || 
             (this.action!=null &&
              this.action.equals(other.getAction())));
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
        if (getTripNumber() != null) {
            _hashCode += getTripNumber().hashCode();
        }
        if (getTripSeq() != null) {
            _hashCode += getTripSeq().hashCode();
        }
        if (getCardNumber() != null) {
            _hashCode += getCardNumber().hashCode();
        }
        if (getCardNumber2() != null) {
            _hashCode += getCardNumber2().hashCode();
        }
        if (getLocationId() != null) {
            _hashCode += getLocationId().hashCode();
        }
        if (getFuelType() != null) {
            _hashCode += getFuelType().hashCode();
        }
        if (getFuelUse() != null) {
            _hashCode += getFuelUse().hashCode();
        }
        if (getQtyAllowed() != null) {
            _hashCode += getQtyAllowed().hashCode();
        }
        if (getEffDt() != null) {
            _hashCode += getEffDt().hashCode();
        }
        if (getExpDt() != null) {
            _hashCode += getExpDt().hashCode();
        }
        if (getAction() != null) {
            _hashCode += getAction().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WSManagedFuel.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://com.tch.cards.service/types", "WSManagedFuel"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tripNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tripNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tripSeq");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tripSeq"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cardNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cardNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cardNumber2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cardNumber2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locationId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "locationId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fuelType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fuelType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fuelUse");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fuelUse"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("qtyAllowed");
        elemField.setXmlName(new javax.xml.namespace.QName("", "qtyAllowed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("effDt");
        elemField.setXmlName(new javax.xml.namespace.QName("", "effDt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expDt");
        elemField.setXmlName(new javax.xml.namespace.QName("", "expDt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("action");
        elemField.setXmlName(new javax.xml.namespace.QName("", "action"));
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
