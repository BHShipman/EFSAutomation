/**
 * WSCard.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package service.cards.tch.com.types;

public class WSCard  implements java.io.Serializable {
    private java.lang.String cardNumber;

    private service.cards.tch.com.types.WSCardHeader header;

    private service.cards.tch.com.types.WSCardInfo[] infos;

    private service.cards.tch.com.types.WSCardLimit[] limits;

    private int[] locationGroups;

    private int[] locations;

    private service.cards.tch.com.types.WSCardTimeRestriction[] timeRestrictions;

    public WSCard() {
    }

    public WSCard(
           java.lang.String cardNumber,
           service.cards.tch.com.types.WSCardHeader header,
           service.cards.tch.com.types.WSCardInfo[] infos,
           service.cards.tch.com.types.WSCardLimit[] limits,
           int[] locationGroups,
           int[] locations,
           service.cards.tch.com.types.WSCardTimeRestriction[] timeRestrictions) {
           this.cardNumber = cardNumber;
           this.header = header;
           this.infos = infos;
           this.limits = limits;
           this.locationGroups = locationGroups;
           this.locations = locations;
           this.timeRestrictions = timeRestrictions;
    }


    /**
     * Gets the cardNumber value for this WSCard.
     * 
     * @return cardNumber
     */
    public java.lang.String getCardNumber() {
        return cardNumber;
    }


    /**
     * Sets the cardNumber value for this WSCard.
     * 
     * @param cardNumber
     */
    public void setCardNumber(java.lang.String cardNumber) {
        this.cardNumber = cardNumber;
    }


    /**
     * Gets the header value for this WSCard.
     * 
     * @return header
     */
    public service.cards.tch.com.types.WSCardHeader getHeader() {
        return header;
    }


    /**
     * Sets the header value for this WSCard.
     * 
     * @param header
     */
    public void setHeader(service.cards.tch.com.types.WSCardHeader header) {
        this.header = header;
    }


    /**
     * Gets the infos value for this WSCard.
     * 
     * @return infos
     */
    public service.cards.tch.com.types.WSCardInfo[] getInfos() {
        return infos;
    }


    /**
     * Sets the infos value for this WSCard.
     * 
     * @param infos
     */
    public void setInfos(service.cards.tch.com.types.WSCardInfo[] infos) {
        this.infos = infos;
    }

    public service.cards.tch.com.types.WSCardInfo getInfos(int i) {
        return this.infos[i];
    }

    public void setInfos(int i, service.cards.tch.com.types.WSCardInfo _value) {
        this.infos[i] = _value;
    }


    /**
     * Gets the limits value for this WSCard.
     * 
     * @return limits
     */
    public service.cards.tch.com.types.WSCardLimit[] getLimits() {
        return limits;
    }


    /**
     * Sets the limits value for this WSCard.
     * 
     * @param limits
     */
    public void setLimits(service.cards.tch.com.types.WSCardLimit[] limits) {
        this.limits = limits;
    }

    public service.cards.tch.com.types.WSCardLimit getLimits(int i) {
        return this.limits[i];
    }

    public void setLimits(int i, service.cards.tch.com.types.WSCardLimit _value) {
        this.limits[i] = _value;
    }


    /**
     * Gets the locationGroups value for this WSCard.
     * 
     * @return locationGroups
     */
    public int[] getLocationGroups() {
        return locationGroups;
    }


    /**
     * Sets the locationGroups value for this WSCard.
     * 
     * @param locationGroups
     */
    public void setLocationGroups(int[] locationGroups) {
        this.locationGroups = locationGroups;
    }

    public int getLocationGroups(int i) {
        return this.locationGroups[i];
    }

    public void setLocationGroups(int i, int _value) {
        this.locationGroups[i] = _value;
    }


    /**
     * Gets the locations value for this WSCard.
     * 
     * @return locations
     */
    public int[] getLocations() {
        return locations;
    }


    /**
     * Sets the locations value for this WSCard.
     * 
     * @param locations
     */
    public void setLocations(int[] locations) {
        this.locations = locations;
    }

    public int getLocations(int i) {
        return this.locations[i];
    }

    public void setLocations(int i, int _value) {
        this.locations[i] = _value;
    }


    /**
     * Gets the timeRestrictions value for this WSCard.
     * 
     * @return timeRestrictions
     */
    public service.cards.tch.com.types.WSCardTimeRestriction[] getTimeRestrictions() {
        return timeRestrictions;
    }


    /**
     * Sets the timeRestrictions value for this WSCard.
     * 
     * @param timeRestrictions
     */
    public void setTimeRestrictions(service.cards.tch.com.types.WSCardTimeRestriction[] timeRestrictions) {
        this.timeRestrictions = timeRestrictions;
    }

    public service.cards.tch.com.types.WSCardTimeRestriction getTimeRestrictions(int i) {
        return this.timeRestrictions[i];
    }

    public void setTimeRestrictions(int i, service.cards.tch.com.types.WSCardTimeRestriction _value) {
        this.timeRestrictions[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WSCard)) return false;
        WSCard other = (WSCard) obj;
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
            ((this.header==null && other.getHeader()==null) || 
             (this.header!=null &&
              this.header.equals(other.getHeader()))) &&
            ((this.infos==null && other.getInfos()==null) || 
             (this.infos!=null &&
              java.util.Arrays.equals(this.infos, other.getInfos()))) &&
            ((this.limits==null && other.getLimits()==null) || 
             (this.limits!=null &&
              java.util.Arrays.equals(this.limits, other.getLimits()))) &&
            ((this.locationGroups==null && other.getLocationGroups()==null) || 
             (this.locationGroups!=null &&
              java.util.Arrays.equals(this.locationGroups, other.getLocationGroups()))) &&
            ((this.locations==null && other.getLocations()==null) || 
             (this.locations!=null &&
              java.util.Arrays.equals(this.locations, other.getLocations()))) &&
            ((this.timeRestrictions==null && other.getTimeRestrictions()==null) || 
             (this.timeRestrictions!=null &&
              java.util.Arrays.equals(this.timeRestrictions, other.getTimeRestrictions())));
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
        if (getHeader() != null) {
            _hashCode += getHeader().hashCode();
        }
        if (getInfos() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getInfos());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getInfos(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLimits() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLimits());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLimits(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLocationGroups() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLocationGroups());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLocationGroups(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLocations() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLocations());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLocations(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTimeRestrictions() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTimeRestrictions());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTimeRestrictions(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WSCard.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://com.tch.cards.service/types", "WSCard"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cardNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cardNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("header");
        elemField.setXmlName(new javax.xml.namespace.QName("", "header"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://com.tch.cards.service/types", "WSCardHeader"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("infos");
        elemField.setXmlName(new javax.xml.namespace.QName("", "infos"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://com.tch.cards.service/types", "WSCardInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("limits");
        elemField.setXmlName(new javax.xml.namespace.QName("", "limits"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://com.tch.cards.service/types", "WSCardLimit"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locationGroups");
        elemField.setXmlName(new javax.xml.namespace.QName("", "locationGroups"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locations");
        elemField.setXmlName(new javax.xml.namespace.QName("", "locations"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeRestrictions");
        elemField.setXmlName(new javax.xml.namespace.QName("", "timeRestrictions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://com.tch.cards.service/types", "WSCardTimeRestriction"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
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
