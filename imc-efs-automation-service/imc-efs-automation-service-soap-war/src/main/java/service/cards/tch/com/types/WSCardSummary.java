/**
 * WSCardSummary.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package service.cards.tch.com.types;

public class WSCardSummary  implements java.io.Serializable {
    private java.lang.String cardNumber;

    private int policyNumber;

    private java.lang.String companyXRef;

    private java.lang.String unitNumber;

    private java.lang.String driverId;

    private java.lang.String driverName;

    private int override;

    private boolean beingOverridden;

    private java.lang.String status;

    private java.lang.String payrollStatus;

    private java.lang.String payrollUse;

    private java.lang.String gpsid;

    private java.lang.String vin;

    private java.lang.String zid;

    private java.lang.String infosrc;

    private java.lang.String policySubfleet;

    private java.lang.String cardSubfleet;

    public WSCardSummary() {
    }

    public WSCardSummary(
           java.lang.String cardNumber,
           int policyNumber,
           java.lang.String companyXRef,
           java.lang.String unitNumber,
           java.lang.String driverId,
           java.lang.String driverName,
           int override,
           boolean beingOverridden,
           java.lang.String status,
           java.lang.String payrollStatus,
           java.lang.String payrollUse,
           java.lang.String gpsid,
           java.lang.String vin,
           java.lang.String zid,
           java.lang.String infosrc,
           java.lang.String policySubfleet,
           java.lang.String cardSubfleet) {
           this.cardNumber = cardNumber;
           this.policyNumber = policyNumber;
           this.companyXRef = companyXRef;
           this.unitNumber = unitNumber;
           this.driverId = driverId;
           this.driverName = driverName;
           this.override = override;
           this.beingOverridden = beingOverridden;
           this.status = status;
           this.payrollStatus = payrollStatus;
           this.payrollUse = payrollUse;
           this.gpsid = gpsid;
           this.vin = vin;
           this.zid = zid;
           this.infosrc = infosrc;
           this.policySubfleet = policySubfleet;
           this.cardSubfleet = cardSubfleet;
    }


    /**
     * Gets the cardNumber value for this WSCardSummary.
     * 
     * @return cardNumber
     */
    public java.lang.String getCardNumber() {
        return cardNumber;
    }


    /**
     * Sets the cardNumber value for this WSCardSummary.
     * 
     * @param cardNumber
     */
    public void setCardNumber(java.lang.String cardNumber) {
        this.cardNumber = cardNumber;
    }


    /**
     * Gets the policyNumber value for this WSCardSummary.
     * 
     * @return policyNumber
     */
    public int getPolicyNumber() {
        return policyNumber;
    }


    /**
     * Sets the policyNumber value for this WSCardSummary.
     * 
     * @param policyNumber
     */
    public void setPolicyNumber(int policyNumber) {
        this.policyNumber = policyNumber;
    }


    /**
     * Gets the companyXRef value for this WSCardSummary.
     * 
     * @return companyXRef
     */
    public java.lang.String getCompanyXRef() {
        return companyXRef;
    }


    /**
     * Sets the companyXRef value for this WSCardSummary.
     * 
     * @param companyXRef
     */
    public void setCompanyXRef(java.lang.String companyXRef) {
        this.companyXRef = companyXRef;
    }


    /**
     * Gets the unitNumber value for this WSCardSummary.
     * 
     * @return unitNumber
     */
    public java.lang.String getUnitNumber() {
        return unitNumber;
    }


    /**
     * Sets the unitNumber value for this WSCardSummary.
     * 
     * @param unitNumber
     */
    public void setUnitNumber(java.lang.String unitNumber) {
        this.unitNumber = unitNumber;
    }


    /**
     * Gets the driverId value for this WSCardSummary.
     * 
     * @return driverId
     */
    public java.lang.String getDriverId() {
        return driverId;
    }


    /**
     * Sets the driverId value for this WSCardSummary.
     * 
     * @param driverId
     */
    public void setDriverId(java.lang.String driverId) {
        this.driverId = driverId;
    }


    /**
     * Gets the driverName value for this WSCardSummary.
     * 
     * @return driverName
     */
    public java.lang.String getDriverName() {
        return driverName;
    }


    /**
     * Sets the driverName value for this WSCardSummary.
     * 
     * @param driverName
     */
    public void setDriverName(java.lang.String driverName) {
        this.driverName = driverName;
    }


    /**
     * Gets the override value for this WSCardSummary.
     * 
     * @return override
     */
    public int getOverride() {
        return override;
    }


    /**
     * Sets the override value for this WSCardSummary.
     * 
     * @param override
     */
    public void setOverride(int override) {
        this.override = override;
    }


    /**
     * Gets the beingOverridden value for this WSCardSummary.
     * 
     * @return beingOverridden
     */
    public boolean isBeingOverridden() {
        return beingOverridden;
    }


    /**
     * Sets the beingOverridden value for this WSCardSummary.
     * 
     * @param beingOverridden
     */
    public void setBeingOverridden(boolean beingOverridden) {
        this.beingOverridden = beingOverridden;
    }


    /**
     * Gets the status value for this WSCardSummary.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this WSCardSummary.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }


    /**
     * Gets the payrollStatus value for this WSCardSummary.
     * 
     * @return payrollStatus
     */
    public java.lang.String getPayrollStatus() {
        return payrollStatus;
    }


    /**
     * Sets the payrollStatus value for this WSCardSummary.
     * 
     * @param payrollStatus
     */
    public void setPayrollStatus(java.lang.String payrollStatus) {
        this.payrollStatus = payrollStatus;
    }


    /**
     * Gets the payrollUse value for this WSCardSummary.
     * 
     * @return payrollUse
     */
    public java.lang.String getPayrollUse() {
        return payrollUse;
    }


    /**
     * Sets the payrollUse value for this WSCardSummary.
     * 
     * @param payrollUse
     */
    public void setPayrollUse(java.lang.String payrollUse) {
        this.payrollUse = payrollUse;
    }


    /**
     * Gets the gpsid value for this WSCardSummary.
     * 
     * @return gpsid
     */
    public java.lang.String getGpsid() {
        return gpsid;
    }


    /**
     * Sets the gpsid value for this WSCardSummary.
     * 
     * @param gpsid
     */
    public void setGpsid(java.lang.String gpsid) {
        this.gpsid = gpsid;
    }


    /**
     * Gets the vin value for this WSCardSummary.
     * 
     * @return vin
     */
    public java.lang.String getVin() {
        return vin;
    }


    /**
     * Sets the vin value for this WSCardSummary.
     * 
     * @param vin
     */
    public void setVin(java.lang.String vin) {
        this.vin = vin;
    }


    /**
     * Gets the zid value for this WSCardSummary.
     * 
     * @return zid
     */
    public java.lang.String getZid() {
        return zid;
    }


    /**
     * Sets the zid value for this WSCardSummary.
     * 
     * @param zid
     */
    public void setZid(java.lang.String zid) {
        this.zid = zid;
    }


    /**
     * Gets the infosrc value for this WSCardSummary.
     * 
     * @return infosrc
     */
    public java.lang.String getInfosrc() {
        return infosrc;
    }


    /**
     * Sets the infosrc value for this WSCardSummary.
     * 
     * @param infosrc
     */
    public void setInfosrc(java.lang.String infosrc) {
        this.infosrc = infosrc;
    }


    /**
     * Gets the policySubfleet value for this WSCardSummary.
     * 
     * @return policySubfleet
     */
    public java.lang.String getPolicySubfleet() {
        return policySubfleet;
    }


    /**
     * Sets the policySubfleet value for this WSCardSummary.
     * 
     * @param policySubfleet
     */
    public void setPolicySubfleet(java.lang.String policySubfleet) {
        this.policySubfleet = policySubfleet;
    }


    /**
     * Gets the cardSubfleet value for this WSCardSummary.
     * 
     * @return cardSubfleet
     */
    public java.lang.String getCardSubfleet() {
        return cardSubfleet;
    }


    /**
     * Sets the cardSubfleet value for this WSCardSummary.
     * 
     * @param cardSubfleet
     */
    public void setCardSubfleet(java.lang.String cardSubfleet) {
        this.cardSubfleet = cardSubfleet;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WSCardSummary)) return false;
        WSCardSummary other = (WSCardSummary) obj;
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
            this.policyNumber == other.getPolicyNumber() &&
            ((this.companyXRef==null && other.getCompanyXRef()==null) || 
             (this.companyXRef!=null &&
              this.companyXRef.equals(other.getCompanyXRef()))) &&
            ((this.unitNumber==null && other.getUnitNumber()==null) || 
             (this.unitNumber!=null &&
              this.unitNumber.equals(other.getUnitNumber()))) &&
            ((this.driverId==null && other.getDriverId()==null) || 
             (this.driverId!=null &&
              this.driverId.equals(other.getDriverId()))) &&
            ((this.driverName==null && other.getDriverName()==null) || 
             (this.driverName!=null &&
              this.driverName.equals(other.getDriverName()))) &&
            this.override == other.getOverride() &&
            this.beingOverridden == other.isBeingOverridden() &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.payrollStatus==null && other.getPayrollStatus()==null) || 
             (this.payrollStatus!=null &&
              this.payrollStatus.equals(other.getPayrollStatus()))) &&
            ((this.payrollUse==null && other.getPayrollUse()==null) || 
             (this.payrollUse!=null &&
              this.payrollUse.equals(other.getPayrollUse()))) &&
            ((this.gpsid==null && other.getGpsid()==null) || 
             (this.gpsid!=null &&
              this.gpsid.equals(other.getGpsid()))) &&
            ((this.vin==null && other.getVin()==null) || 
             (this.vin!=null &&
              this.vin.equals(other.getVin()))) &&
            ((this.zid==null && other.getZid()==null) || 
             (this.zid!=null &&
              this.zid.equals(other.getZid()))) &&
            ((this.infosrc==null && other.getInfosrc()==null) || 
             (this.infosrc!=null &&
              this.infosrc.equals(other.getInfosrc()))) &&
            ((this.policySubfleet==null && other.getPolicySubfleet()==null) || 
             (this.policySubfleet!=null &&
              this.policySubfleet.equals(other.getPolicySubfleet()))) &&
            ((this.cardSubfleet==null && other.getCardSubfleet()==null) || 
             (this.cardSubfleet!=null &&
              this.cardSubfleet.equals(other.getCardSubfleet())));
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
        _hashCode += getPolicyNumber();
        if (getCompanyXRef() != null) {
            _hashCode += getCompanyXRef().hashCode();
        }
        if (getUnitNumber() != null) {
            _hashCode += getUnitNumber().hashCode();
        }
        if (getDriverId() != null) {
            _hashCode += getDriverId().hashCode();
        }
        if (getDriverName() != null) {
            _hashCode += getDriverName().hashCode();
        }
        _hashCode += getOverride();
        _hashCode += (isBeingOverridden() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getPayrollStatus() != null) {
            _hashCode += getPayrollStatus().hashCode();
        }
        if (getPayrollUse() != null) {
            _hashCode += getPayrollUse().hashCode();
        }
        if (getGpsid() != null) {
            _hashCode += getGpsid().hashCode();
        }
        if (getVin() != null) {
            _hashCode += getVin().hashCode();
        }
        if (getZid() != null) {
            _hashCode += getZid().hashCode();
        }
        if (getInfosrc() != null) {
            _hashCode += getInfosrc().hashCode();
        }
        if (getPolicySubfleet() != null) {
            _hashCode += getPolicySubfleet().hashCode();
        }
        if (getCardSubfleet() != null) {
            _hashCode += getCardSubfleet().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WSCardSummary.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://com.tch.cards.service/types", "WSCardSummary"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cardNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cardNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("policyNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "policyNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("companyXRef");
        elemField.setXmlName(new javax.xml.namespace.QName("", "companyXRef"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unitNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "unitNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("driverId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "driverId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("driverName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "driverName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("override");
        elemField.setXmlName(new javax.xml.namespace.QName("", "override"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("beingOverridden");
        elemField.setXmlName(new javax.xml.namespace.QName("", "beingOverridden"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payrollStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "payrollStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payrollUse");
        elemField.setXmlName(new javax.xml.namespace.QName("", "payrollUse"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gpsid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "gpsid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vin");
        elemField.setXmlName(new javax.xml.namespace.QName("", "vin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "zid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("infosrc");
        elemField.setXmlName(new javax.xml.namespace.QName("", "infosrc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("policySubfleet");
        elemField.setXmlName(new javax.xml.namespace.QName("", "policySubfleet"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cardSubfleet");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cardSubfleet"));
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
