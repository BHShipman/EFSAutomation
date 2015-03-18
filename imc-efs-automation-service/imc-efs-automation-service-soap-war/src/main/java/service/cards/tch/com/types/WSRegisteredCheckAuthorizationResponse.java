/**
 * WSRegisteredCheckAuthorizationResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package service.cards.tch.com.types;

public class WSRegisteredCheckAuthorizationResponse  implements java.io.Serializable {
    private service.cards.tch.com.types.WSRequestStatus requestStatus;

    private service.cards.tch.com.types.WSRegisteredCheckAuthorizationResults[] loadResults;

    public WSRegisteredCheckAuthorizationResponse() {
    }

    public WSRegisteredCheckAuthorizationResponse(
           service.cards.tch.com.types.WSRequestStatus requestStatus,
           service.cards.tch.com.types.WSRegisteredCheckAuthorizationResults[] loadResults) {
           this.requestStatus = requestStatus;
           this.loadResults = loadResults;
    }


    /**
     * Gets the requestStatus value for this WSRegisteredCheckAuthorizationResponse.
     * 
     * @return requestStatus
     */
    public service.cards.tch.com.types.WSRequestStatus getRequestStatus() {
        return requestStatus;
    }


    /**
     * Sets the requestStatus value for this WSRegisteredCheckAuthorizationResponse.
     * 
     * @param requestStatus
     */
    public void setRequestStatus(service.cards.tch.com.types.WSRequestStatus requestStatus) {
        this.requestStatus = requestStatus;
    }


    /**
     * Gets the loadResults value for this WSRegisteredCheckAuthorizationResponse.
     * 
     * @return loadResults
     */
    public service.cards.tch.com.types.WSRegisteredCheckAuthorizationResults[] getLoadResults() {
        return loadResults;
    }


    /**
     * Sets the loadResults value for this WSRegisteredCheckAuthorizationResponse.
     * 
     * @param loadResults
     */
    public void setLoadResults(service.cards.tch.com.types.WSRegisteredCheckAuthorizationResults[] loadResults) {
        this.loadResults = loadResults;
    }

    public service.cards.tch.com.types.WSRegisteredCheckAuthorizationResults getLoadResults(int i) {
        return this.loadResults[i];
    }

    public void setLoadResults(int i, service.cards.tch.com.types.WSRegisteredCheckAuthorizationResults _value) {
        this.loadResults[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WSRegisteredCheckAuthorizationResponse)) return false;
        WSRegisteredCheckAuthorizationResponse other = (WSRegisteredCheckAuthorizationResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.requestStatus==null && other.getRequestStatus()==null) || 
             (this.requestStatus!=null &&
              this.requestStatus.equals(other.getRequestStatus()))) &&
            ((this.loadResults==null && other.getLoadResults()==null) || 
             (this.loadResults!=null &&
              java.util.Arrays.equals(this.loadResults, other.getLoadResults())));
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
        if (getRequestStatus() != null) {
            _hashCode += getRequestStatus().hashCode();
        }
        if (getLoadResults() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLoadResults());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLoadResults(), i);
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
        new org.apache.axis.description.TypeDesc(WSRegisteredCheckAuthorizationResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://com.tch.cards.service/types", "WSRegisteredCheckAuthorizationResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "requestStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://com.tch.cards.service/types", "WSRequestStatus"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("loadResults");
        elemField.setXmlName(new javax.xml.namespace.QName("", "loadResults"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://com.tch.cards.service/types", "WSRegisteredCheckAuthorizationResults"));
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
