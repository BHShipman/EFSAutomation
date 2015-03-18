/**
 * WSManagedFuelDriver.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package service.cards.tch.com.types;

public class WSManagedFuelDriver  implements java.io.Serializable {
    private java.lang.String tripNumber;

    private int tripSeq;

    private java.lang.String driverId;

    private java.lang.String driverId2;

    private int locationId;

    private int fuelType;

    private int fuelUse;

    private int qtyAllowed;

    private java.util.Calendar effDt;

    private java.util.Calendar expDt;

    private java.lang.String action;

    public WSManagedFuelDriver() {
    }

    public WSManagedFuelDriver(
           java.lang.String tripNumber,
           int tripSeq,
           java.lang.String driverId,
           java.lang.String driverId2,
           int locationId,
           int fuelType,
           int fuelUse,
           int qtyAllowed,
           java.util.Calendar effDt,
           java.util.Calendar expDt,
           java.lang.String action) {
           this.tripNumber = tripNumber;
           this.tripSeq = tripSeq;
           this.driverId = driverId;
           this.driverId2 = driverId2;
           this.locationId = locationId;
           this.fuelType = fuelType;
           this.fuelUse = fuelUse;
           this.qtyAllowed = qtyAllowed;
           this.effDt = effDt;
           this.expDt = expDt;
           this.action = action;
    }


    /**
     * Gets the tripNumber value for this WSManagedFuelDriver.
     * 
     * @return tripNumber
     */
    public java.lang.String getTripNumber() {
        return tripNumber;
    }


    /**
     * Sets the tripNumber value for this WSManagedFuelDriver.
     * 
     * @param tripNumber
     */
    public void setTripNumber(java.lang.String tripNumber) {
        this.tripNumber = tripNumber;
    }


    /**
     * Gets the tripSeq value for this WSManagedFuelDriver.
     * 
     * @return tripSeq
     */
    public int getTripSeq() {
        return tripSeq;
    }


    /**
     * Sets the tripSeq value for this WSManagedFuelDriver.
     * 
     * @param tripSeq
     */
    public void setTripSeq(int tripSeq) {
        this.tripSeq = tripSeq;
    }


    /**
     * Gets the driverId value for this WSManagedFuelDriver.
     * 
     * @return driverId
     */
    public java.lang.String getDriverId() {
        return driverId;
    }


    /**
     * Sets the driverId value for this WSManagedFuelDriver.
     * 
     * @param driverId
     */
    public void setDriverId(java.lang.String driverId) {
        this.driverId = driverId;
    }


    /**
     * Gets the driverId2 value for this WSManagedFuelDriver.
     * 
     * @return driverId2
     */
    public java.lang.String getDriverId2() {
        return driverId2;
    }


    /**
     * Sets the driverId2 value for this WSManagedFuelDriver.
     * 
     * @param driverId2
     */
    public void setDriverId2(java.lang.String driverId2) {
        this.driverId2 = driverId2;
    }


    /**
     * Gets the locationId value for this WSManagedFuelDriver.
     * 
     * @return locationId
     */
    public int getLocationId() {
        return locationId;
    }


    /**
     * Sets the locationId value for this WSManagedFuelDriver.
     * 
     * @param locationId
     */
    public void setLocationId(int locationId) {
        this.locationId = locationId;
    }


    /**
     * Gets the fuelType value for this WSManagedFuelDriver.
     * 
     * @return fuelType
     */
    public int getFuelType() {
        return fuelType;
    }


    /**
     * Sets the fuelType value for this WSManagedFuelDriver.
     * 
     * @param fuelType
     */
    public void setFuelType(int fuelType) {
        this.fuelType = fuelType;
    }


    /**
     * Gets the fuelUse value for this WSManagedFuelDriver.
     * 
     * @return fuelUse
     */
    public int getFuelUse() {
        return fuelUse;
    }


    /**
     * Sets the fuelUse value for this WSManagedFuelDriver.
     * 
     * @param fuelUse
     */
    public void setFuelUse(int fuelUse) {
        this.fuelUse = fuelUse;
    }


    /**
     * Gets the qtyAllowed value for this WSManagedFuelDriver.
     * 
     * @return qtyAllowed
     */
    public int getQtyAllowed() {
        return qtyAllowed;
    }


    /**
     * Sets the qtyAllowed value for this WSManagedFuelDriver.
     * 
     * @param qtyAllowed
     */
    public void setQtyAllowed(int qtyAllowed) {
        this.qtyAllowed = qtyAllowed;
    }


    /**
     * Gets the effDt value for this WSManagedFuelDriver.
     * 
     * @return effDt
     */
    public java.util.Calendar getEffDt() {
        return effDt;
    }


    /**
     * Sets the effDt value for this WSManagedFuelDriver.
     * 
     * @param effDt
     */
    public void setEffDt(java.util.Calendar effDt) {
        this.effDt = effDt;
    }


    /**
     * Gets the expDt value for this WSManagedFuelDriver.
     * 
     * @return expDt
     */
    public java.util.Calendar getExpDt() {
        return expDt;
    }


    /**
     * Sets the expDt value for this WSManagedFuelDriver.
     * 
     * @param expDt
     */
    public void setExpDt(java.util.Calendar expDt) {
        this.expDt = expDt;
    }


    /**
     * Gets the action value for this WSManagedFuelDriver.
     * 
     * @return action
     */
    public java.lang.String getAction() {
        return action;
    }


    /**
     * Sets the action value for this WSManagedFuelDriver.
     * 
     * @param action
     */
    public void setAction(java.lang.String action) {
        this.action = action;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WSManagedFuelDriver)) return false;
        WSManagedFuelDriver other = (WSManagedFuelDriver) obj;
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
            this.tripSeq == other.getTripSeq() &&
            ((this.driverId==null && other.getDriverId()==null) || 
             (this.driverId!=null &&
              this.driverId.equals(other.getDriverId()))) &&
            ((this.driverId2==null && other.getDriverId2()==null) || 
             (this.driverId2!=null &&
              this.driverId2.equals(other.getDriverId2()))) &&
            this.locationId == other.getLocationId() &&
            this.fuelType == other.getFuelType() &&
            this.fuelUse == other.getFuelUse() &&
            this.qtyAllowed == other.getQtyAllowed() &&
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
        _hashCode += getTripSeq();
        if (getDriverId() != null) {
            _hashCode += getDriverId().hashCode();
        }
        if (getDriverId2() != null) {
            _hashCode += getDriverId2().hashCode();
        }
        _hashCode += getLocationId();
        _hashCode += getFuelType();
        _hashCode += getFuelUse();
        _hashCode += getQtyAllowed();
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
        new org.apache.axis.description.TypeDesc(WSManagedFuelDriver.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://com.tch.cards.service/types", "WSManagedFuelDriver"));
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
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("driverId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "driverId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("driverId2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "driverId2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locationId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "locationId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fuelType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fuelType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fuelUse");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fuelUse"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("qtyAllowed");
        elemField.setXmlName(new javax.xml.namespace.QName("", "qtyAllowed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("effDt");
        elemField.setXmlName(new javax.xml.namespace.QName("", "effDt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
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
