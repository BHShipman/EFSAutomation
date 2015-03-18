/**
 * WSCardSummaryReq.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package service.cards.tch.com.types;

public class WSCardSummaryReq  implements java.io.Serializable {
    private java.lang.String type;

    private java.lang.String searchParam;

    private java.lang.String payrUse;

    public WSCardSummaryReq() {
    }

    public WSCardSummaryReq(
           java.lang.String type,
           java.lang.String searchParam,
           java.lang.String payrUse) {
           this.type = type;
           this.searchParam = searchParam;
           this.payrUse = payrUse;
    }


    /**
     * Gets the type value for this WSCardSummaryReq.
     * 
     * @return type
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this WSCardSummaryReq.
     * 
     * @param type
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }


    /**
     * Gets the searchParam value for this WSCardSummaryReq.
     * 
     * @return searchParam
     */
    public java.lang.String getSearchParam() {
        return searchParam;
    }


    /**
     * Sets the searchParam value for this WSCardSummaryReq.
     * 
     * @param searchParam
     */
    public void setSearchParam(java.lang.String searchParam) {
        this.searchParam = searchParam;
    }


    /**
     * Gets the payrUse value for this WSCardSummaryReq.
     * 
     * @return payrUse
     */
    public java.lang.String getPayrUse() {
        return payrUse;
    }


    /**
     * Sets the payrUse value for this WSCardSummaryReq.
     * 
     * @param payrUse
     */
    public void setPayrUse(java.lang.String payrUse) {
        this.payrUse = payrUse;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WSCardSummaryReq)) return false;
        WSCardSummaryReq other = (WSCardSummaryReq) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.searchParam==null && other.getSearchParam()==null) || 
             (this.searchParam!=null &&
              this.searchParam.equals(other.getSearchParam()))) &&
            ((this.payrUse==null && other.getPayrUse()==null) || 
             (this.payrUse!=null &&
              this.payrUse.equals(other.getPayrUse())));
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
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getSearchParam() != null) {
            _hashCode += getSearchParam().hashCode();
        }
        if (getPayrUse() != null) {
            _hashCode += getPayrUse().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WSCardSummaryReq.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://com.tch.cards.service/types", "WSCardSummaryReq"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("searchParam");
        elemField.setXmlName(new javax.xml.namespace.QName("", "searchParam"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payrUse");
        elemField.setXmlName(new javax.xml.namespace.QName("", "payrUse"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
