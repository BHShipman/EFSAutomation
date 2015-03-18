/**
 * WSCardHeader.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package service.cards.tch.com.types;

public class WSCardHeader  implements java.io.Serializable {
    private java.lang.String companyXRef;

    private java.lang.String handEnter;

    private java.lang.String infoSource;

    private java.lang.String limitSource;

    private int locationOverride;

    private java.lang.String locationSource;

    private boolean overrideAllLocations;

    private java.lang.String originalStatus;

    private java.lang.String payrollStatus;

    private int override;

    private int policyNumber;

    private java.lang.String status;

    private java.lang.String timeSource;

    private java.util.Calendar lastUsedDate;

    private java.lang.Integer lastTransaction;

    private java.lang.String payrollUse;

    private java.lang.String payrollAtm;

    private java.lang.String payrollChk;

    private java.lang.String payrollAch;

    private java.lang.String payrollWire;

    private java.lang.String payrollDebit;

    public WSCardHeader() {
    }

    public WSCardHeader(
           java.lang.String companyXRef,
           java.lang.String handEnter,
           java.lang.String infoSource,
           java.lang.String limitSource,
           int locationOverride,
           java.lang.String locationSource,
           boolean overrideAllLocations,
           java.lang.String originalStatus,
           java.lang.String payrollStatus,
           int override,
           int policyNumber,
           java.lang.String status,
           java.lang.String timeSource,
           java.util.Calendar lastUsedDate,
           java.lang.Integer lastTransaction,
           java.lang.String payrollUse,
           java.lang.String payrollAtm,
           java.lang.String payrollChk,
           java.lang.String payrollAch,
           java.lang.String payrollWire,
           java.lang.String payrollDebit) {
           this.companyXRef = companyXRef;
           this.handEnter = handEnter;
           this.infoSource = infoSource;
           this.limitSource = limitSource;
           this.locationOverride = locationOverride;
           this.locationSource = locationSource;
           this.overrideAllLocations = overrideAllLocations;
           this.originalStatus = originalStatus;
           this.payrollStatus = payrollStatus;
           this.override = override;
           this.policyNumber = policyNumber;
           this.status = status;
           this.timeSource = timeSource;
           this.lastUsedDate = lastUsedDate;
           this.lastTransaction = lastTransaction;
           this.payrollUse = payrollUse;
           this.payrollAtm = payrollAtm;
           this.payrollChk = payrollChk;
           this.payrollAch = payrollAch;
           this.payrollWire = payrollWire;
           this.payrollDebit = payrollDebit;
    }


    /**
     * Gets the companyXRef value for this WSCardHeader.
     * 
     * @return companyXRef
     */
    public java.lang.String getCompanyXRef() {
        return companyXRef;
    }


    /**
     * Sets the companyXRef value for this WSCardHeader.
     * 
     * @param companyXRef
     */
    public void setCompanyXRef(java.lang.String companyXRef) {
        this.companyXRef = companyXRef;
    }


    /**
     * Gets the handEnter value for this WSCardHeader.
     * 
     * @return handEnter
     */
    public java.lang.String getHandEnter() {
        return handEnter;
    }


    /**
     * Sets the handEnter value for this WSCardHeader.
     * 
     * @param handEnter
     */
    public void setHandEnter(java.lang.String handEnter) {
        this.handEnter = handEnter;
    }


    /**
     * Gets the infoSource value for this WSCardHeader.
     * 
     * @return infoSource
     */
    public java.lang.String getInfoSource() {
        return infoSource;
    }


    /**
     * Sets the infoSource value for this WSCardHeader.
     * 
     * @param infoSource
     */
    public void setInfoSource(java.lang.String infoSource) {
        this.infoSource = infoSource;
    }


    /**
     * Gets the limitSource value for this WSCardHeader.
     * 
     * @return limitSource
     */
    public java.lang.String getLimitSource() {
        return limitSource;
    }


    /**
     * Sets the limitSource value for this WSCardHeader.
     * 
     * @param limitSource
     */
    public void setLimitSource(java.lang.String limitSource) {
        this.limitSource = limitSource;
    }


    /**
     * Gets the locationOverride value for this WSCardHeader.
     * 
     * @return locationOverride
     */
    public int getLocationOverride() {
        return locationOverride;
    }


    /**
     * Sets the locationOverride value for this WSCardHeader.
     * 
     * @param locationOverride
     */
    public void setLocationOverride(int locationOverride) {
        this.locationOverride = locationOverride;
    }


    /**
     * Gets the locationSource value for this WSCardHeader.
     * 
     * @return locationSource
     */
    public java.lang.String getLocationSource() {
        return locationSource;
    }


    /**
     * Sets the locationSource value for this WSCardHeader.
     * 
     * @param locationSource
     */
    public void setLocationSource(java.lang.String locationSource) {
        this.locationSource = locationSource;
    }


    /**
     * Gets the overrideAllLocations value for this WSCardHeader.
     * 
     * @return overrideAllLocations
     */
    public boolean isOverrideAllLocations() {
        return overrideAllLocations;
    }


    /**
     * Sets the overrideAllLocations value for this WSCardHeader.
     * 
     * @param overrideAllLocations
     */
    public void setOverrideAllLocations(boolean overrideAllLocations) {
        this.overrideAllLocations = overrideAllLocations;
    }


    /**
     * Gets the originalStatus value for this WSCardHeader.
     * 
     * @return originalStatus
     */
    public java.lang.String getOriginalStatus() {
        return originalStatus;
    }


    /**
     * Sets the originalStatus value for this WSCardHeader.
     * 
     * @param originalStatus
     */
    public void setOriginalStatus(java.lang.String originalStatus) {
        this.originalStatus = originalStatus;
    }


    /**
     * Gets the payrollStatus value for this WSCardHeader.
     * 
     * @return payrollStatus
     */
    public java.lang.String getPayrollStatus() {
        return payrollStatus;
    }


    /**
     * Sets the payrollStatus value for this WSCardHeader.
     * 
     * @param payrollStatus
     */
    public void setPayrollStatus(java.lang.String payrollStatus) {
        this.payrollStatus = payrollStatus;
    }


    /**
     * Gets the override value for this WSCardHeader.
     * 
     * @return override
     */
    public int getOverride() {
        return override;
    }


    /**
     * Sets the override value for this WSCardHeader.
     * 
     * @param override
     */
    public void setOverride(int override) {
        this.override = override;
    }


    /**
     * Gets the policyNumber value for this WSCardHeader.
     * 
     * @return policyNumber
     */
    public int getPolicyNumber() {
        return policyNumber;
    }


    /**
     * Sets the policyNumber value for this WSCardHeader.
     * 
     * @param policyNumber
     */
    public void setPolicyNumber(int policyNumber) {
        this.policyNumber = policyNumber;
    }


    /**
     * Gets the status value for this WSCardHeader.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this WSCardHeader.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }


    /**
     * Gets the timeSource value for this WSCardHeader.
     * 
     * @return timeSource
     */
    public java.lang.String getTimeSource() {
        return timeSource;
    }


    /**
     * Sets the timeSource value for this WSCardHeader.
     * 
     * @param timeSource
     */
    public void setTimeSource(java.lang.String timeSource) {
        this.timeSource = timeSource;
    }


    /**
     * Gets the lastUsedDate value for this WSCardHeader.
     * 
     * @return lastUsedDate
     */
    public java.util.Calendar getLastUsedDate() {
        return lastUsedDate;
    }


    /**
     * Sets the lastUsedDate value for this WSCardHeader.
     * 
     * @param lastUsedDate
     */
    public void setLastUsedDate(java.util.Calendar lastUsedDate) {
        this.lastUsedDate = lastUsedDate;
    }


    /**
     * Gets the lastTransaction value for this WSCardHeader.
     * 
     * @return lastTransaction
     */
    public java.lang.Integer getLastTransaction() {
        return lastTransaction;
    }


    /**
     * Sets the lastTransaction value for this WSCardHeader.
     * 
     * @param lastTransaction
     */
    public void setLastTransaction(java.lang.Integer lastTransaction) {
        this.lastTransaction = lastTransaction;
    }


    /**
     * Gets the payrollUse value for this WSCardHeader.
     * 
     * @return payrollUse
     */
    public java.lang.String getPayrollUse() {
        return payrollUse;
    }


    /**
     * Sets the payrollUse value for this WSCardHeader.
     * 
     * @param payrollUse
     */
    public void setPayrollUse(java.lang.String payrollUse) {
        this.payrollUse = payrollUse;
    }


    /**
     * Gets the payrollAtm value for this WSCardHeader.
     * 
     * @return payrollAtm
     */
    public java.lang.String getPayrollAtm() {
        return payrollAtm;
    }


    /**
     * Sets the payrollAtm value for this WSCardHeader.
     * 
     * @param payrollAtm
     */
    public void setPayrollAtm(java.lang.String payrollAtm) {
        this.payrollAtm = payrollAtm;
    }


    /**
     * Gets the payrollChk value for this WSCardHeader.
     * 
     * @return payrollChk
     */
    public java.lang.String getPayrollChk() {
        return payrollChk;
    }


    /**
     * Sets the payrollChk value for this WSCardHeader.
     * 
     * @param payrollChk
     */
    public void setPayrollChk(java.lang.String payrollChk) {
        this.payrollChk = payrollChk;
    }


    /**
     * Gets the payrollAch value for this WSCardHeader.
     * 
     * @return payrollAch
     */
    public java.lang.String getPayrollAch() {
        return payrollAch;
    }


    /**
     * Sets the payrollAch value for this WSCardHeader.
     * 
     * @param payrollAch
     */
    public void setPayrollAch(java.lang.String payrollAch) {
        this.payrollAch = payrollAch;
    }


    /**
     * Gets the payrollWire value for this WSCardHeader.
     * 
     * @return payrollWire
     */
    public java.lang.String getPayrollWire() {
        return payrollWire;
    }


    /**
     * Sets the payrollWire value for this WSCardHeader.
     * 
     * @param payrollWire
     */
    public void setPayrollWire(java.lang.String payrollWire) {
        this.payrollWire = payrollWire;
    }


    /**
     * Gets the payrollDebit value for this WSCardHeader.
     * 
     * @return payrollDebit
     */
    public java.lang.String getPayrollDebit() {
        return payrollDebit;
    }


    /**
     * Sets the payrollDebit value for this WSCardHeader.
     * 
     * @param payrollDebit
     */
    public void setPayrollDebit(java.lang.String payrollDebit) {
        this.payrollDebit = payrollDebit;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WSCardHeader)) return false;
        WSCardHeader other = (WSCardHeader) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.companyXRef==null && other.getCompanyXRef()==null) || 
             (this.companyXRef!=null &&
              this.companyXRef.equals(other.getCompanyXRef()))) &&
            ((this.handEnter==null && other.getHandEnter()==null) || 
             (this.handEnter!=null &&
              this.handEnter.equals(other.getHandEnter()))) &&
            ((this.infoSource==null && other.getInfoSource()==null) || 
             (this.infoSource!=null &&
              this.infoSource.equals(other.getInfoSource()))) &&
            ((this.limitSource==null && other.getLimitSource()==null) || 
             (this.limitSource!=null &&
              this.limitSource.equals(other.getLimitSource()))) &&
            this.locationOverride == other.getLocationOverride() &&
            ((this.locationSource==null && other.getLocationSource()==null) || 
             (this.locationSource!=null &&
              this.locationSource.equals(other.getLocationSource()))) &&
            this.overrideAllLocations == other.isOverrideAllLocations() &&
            ((this.originalStatus==null && other.getOriginalStatus()==null) || 
             (this.originalStatus!=null &&
              this.originalStatus.equals(other.getOriginalStatus()))) &&
            ((this.payrollStatus==null && other.getPayrollStatus()==null) || 
             (this.payrollStatus!=null &&
              this.payrollStatus.equals(other.getPayrollStatus()))) &&
            this.override == other.getOverride() &&
            this.policyNumber == other.getPolicyNumber() &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.timeSource==null && other.getTimeSource()==null) || 
             (this.timeSource!=null &&
              this.timeSource.equals(other.getTimeSource()))) &&
            ((this.lastUsedDate==null && other.getLastUsedDate()==null) || 
             (this.lastUsedDate!=null &&
              this.lastUsedDate.equals(other.getLastUsedDate()))) &&
            ((this.lastTransaction==null && other.getLastTransaction()==null) || 
             (this.lastTransaction!=null &&
              this.lastTransaction.equals(other.getLastTransaction()))) &&
            ((this.payrollUse==null && other.getPayrollUse()==null) || 
             (this.payrollUse!=null &&
              this.payrollUse.equals(other.getPayrollUse()))) &&
            ((this.payrollAtm==null && other.getPayrollAtm()==null) || 
             (this.payrollAtm!=null &&
              this.payrollAtm.equals(other.getPayrollAtm()))) &&
            ((this.payrollChk==null && other.getPayrollChk()==null) || 
             (this.payrollChk!=null &&
              this.payrollChk.equals(other.getPayrollChk()))) &&
            ((this.payrollAch==null && other.getPayrollAch()==null) || 
             (this.payrollAch!=null &&
              this.payrollAch.equals(other.getPayrollAch()))) &&
            ((this.payrollWire==null && other.getPayrollWire()==null) || 
             (this.payrollWire!=null &&
              this.payrollWire.equals(other.getPayrollWire()))) &&
            ((this.payrollDebit==null && other.getPayrollDebit()==null) || 
             (this.payrollDebit!=null &&
              this.payrollDebit.equals(other.getPayrollDebit())));
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
        if (getCompanyXRef() != null) {
            _hashCode += getCompanyXRef().hashCode();
        }
        if (getHandEnter() != null) {
            _hashCode += getHandEnter().hashCode();
        }
        if (getInfoSource() != null) {
            _hashCode += getInfoSource().hashCode();
        }
        if (getLimitSource() != null) {
            _hashCode += getLimitSource().hashCode();
        }
        _hashCode += getLocationOverride();
        if (getLocationSource() != null) {
            _hashCode += getLocationSource().hashCode();
        }
        _hashCode += (isOverrideAllLocations() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getOriginalStatus() != null) {
            _hashCode += getOriginalStatus().hashCode();
        }
        if (getPayrollStatus() != null) {
            _hashCode += getPayrollStatus().hashCode();
        }
        _hashCode += getOverride();
        _hashCode += getPolicyNumber();
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getTimeSource() != null) {
            _hashCode += getTimeSource().hashCode();
        }
        if (getLastUsedDate() != null) {
            _hashCode += getLastUsedDate().hashCode();
        }
        if (getLastTransaction() != null) {
            _hashCode += getLastTransaction().hashCode();
        }
        if (getPayrollUse() != null) {
            _hashCode += getPayrollUse().hashCode();
        }
        if (getPayrollAtm() != null) {
            _hashCode += getPayrollAtm().hashCode();
        }
        if (getPayrollChk() != null) {
            _hashCode += getPayrollChk().hashCode();
        }
        if (getPayrollAch() != null) {
            _hashCode += getPayrollAch().hashCode();
        }
        if (getPayrollWire() != null) {
            _hashCode += getPayrollWire().hashCode();
        }
        if (getPayrollDebit() != null) {
            _hashCode += getPayrollDebit().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WSCardHeader.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://com.tch.cards.service/types", "WSCardHeader"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("companyXRef");
        elemField.setXmlName(new javax.xml.namespace.QName("", "companyXRef"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("handEnter");
        elemField.setXmlName(new javax.xml.namespace.QName("", "handEnter"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("infoSource");
        elemField.setXmlName(new javax.xml.namespace.QName("", "infoSource"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("limitSource");
        elemField.setXmlName(new javax.xml.namespace.QName("", "limitSource"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locationOverride");
        elemField.setXmlName(new javax.xml.namespace.QName("", "locationOverride"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locationSource");
        elemField.setXmlName(new javax.xml.namespace.QName("", "locationSource"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("overrideAllLocations");
        elemField.setXmlName(new javax.xml.namespace.QName("", "overrideAllLocations"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("originalStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "originalStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payrollStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "payrollStatus"));
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
        elemField.setFieldName("policyNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "policyNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeSource");
        elemField.setXmlName(new javax.xml.namespace.QName("", "timeSource"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastUsedDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lastUsedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastTransaction");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lastTransaction"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payrollUse");
        elemField.setXmlName(new javax.xml.namespace.QName("", "payrollUse"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payrollAtm");
        elemField.setXmlName(new javax.xml.namespace.QName("", "payrollAtm"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payrollChk");
        elemField.setXmlName(new javax.xml.namespace.QName("", "payrollChk"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payrollAch");
        elemField.setXmlName(new javax.xml.namespace.QName("", "payrollAch"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payrollWire");
        elemField.setXmlName(new javax.xml.namespace.QName("", "payrollWire"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payrollDebit");
        elemField.setXmlName(new javax.xml.namespace.QName("", "payrollDebit"));
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
