/**
 * WSProduct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package service.cards.tch.com.types;

public class WSProduct  implements java.io.Serializable {
    private java.lang.String code;

    private java.lang.String description;

    private java.lang.Integer fuelType;

    private java.lang.Integer fuelUse;

    private java.lang.String group;

    private java.lang.Integer phraseId;

    private java.lang.Integer shellClProduct;

    private java.lang.Integer shellFuelType;

    private java.lang.String shellPriceGroup;

    public WSProduct() {
    }

    public WSProduct(
           java.lang.String code,
           java.lang.String description,
           java.lang.Integer fuelType,
           java.lang.Integer fuelUse,
           java.lang.String group,
           java.lang.Integer phraseId,
           java.lang.Integer shellClProduct,
           java.lang.Integer shellFuelType,
           java.lang.String shellPriceGroup) {
           this.code = code;
           this.description = description;
           this.fuelType = fuelType;
           this.fuelUse = fuelUse;
           this.group = group;
           this.phraseId = phraseId;
           this.shellClProduct = shellClProduct;
           this.shellFuelType = shellFuelType;
           this.shellPriceGroup = shellPriceGroup;
    }


    /**
     * Gets the code value for this WSProduct.
     * 
     * @return code
     */
    public java.lang.String getCode() {
        return code;
    }


    /**
     * Sets the code value for this WSProduct.
     * 
     * @param code
     */
    public void setCode(java.lang.String code) {
        this.code = code;
    }


    /**
     * Gets the description value for this WSProduct.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this WSProduct.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the fuelType value for this WSProduct.
     * 
     * @return fuelType
     */
    public java.lang.Integer getFuelType() {
        return fuelType;
    }


    /**
     * Sets the fuelType value for this WSProduct.
     * 
     * @param fuelType
     */
    public void setFuelType(java.lang.Integer fuelType) {
        this.fuelType = fuelType;
    }


    /**
     * Gets the fuelUse value for this WSProduct.
     * 
     * @return fuelUse
     */
    public java.lang.Integer getFuelUse() {
        return fuelUse;
    }


    /**
     * Sets the fuelUse value for this WSProduct.
     * 
     * @param fuelUse
     */
    public void setFuelUse(java.lang.Integer fuelUse) {
        this.fuelUse = fuelUse;
    }


    /**
     * Gets the group value for this WSProduct.
     * 
     * @return group
     */
    public java.lang.String getGroup() {
        return group;
    }


    /**
     * Sets the group value for this WSProduct.
     * 
     * @param group
     */
    public void setGroup(java.lang.String group) {
        this.group = group;
    }


    /**
     * Gets the phraseId value for this WSProduct.
     * 
     * @return phraseId
     */
    public java.lang.Integer getPhraseId() {
        return phraseId;
    }


    /**
     * Sets the phraseId value for this WSProduct.
     * 
     * @param phraseId
     */
    public void setPhraseId(java.lang.Integer phraseId) {
        this.phraseId = phraseId;
    }


    /**
     * Gets the shellClProduct value for this WSProduct.
     * 
     * @return shellClProduct
     */
    public java.lang.Integer getShellClProduct() {
        return shellClProduct;
    }


    /**
     * Sets the shellClProduct value for this WSProduct.
     * 
     * @param shellClProduct
     */
    public void setShellClProduct(java.lang.Integer shellClProduct) {
        this.shellClProduct = shellClProduct;
    }


    /**
     * Gets the shellFuelType value for this WSProduct.
     * 
     * @return shellFuelType
     */
    public java.lang.Integer getShellFuelType() {
        return shellFuelType;
    }


    /**
     * Sets the shellFuelType value for this WSProduct.
     * 
     * @param shellFuelType
     */
    public void setShellFuelType(java.lang.Integer shellFuelType) {
        this.shellFuelType = shellFuelType;
    }


    /**
     * Gets the shellPriceGroup value for this WSProduct.
     * 
     * @return shellPriceGroup
     */
    public java.lang.String getShellPriceGroup() {
        return shellPriceGroup;
    }


    /**
     * Sets the shellPriceGroup value for this WSProduct.
     * 
     * @param shellPriceGroup
     */
    public void setShellPriceGroup(java.lang.String shellPriceGroup) {
        this.shellPriceGroup = shellPriceGroup;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WSProduct)) return false;
        WSProduct other = (WSProduct) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.code==null && other.getCode()==null) || 
             (this.code!=null &&
              this.code.equals(other.getCode()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.fuelType==null && other.getFuelType()==null) || 
             (this.fuelType!=null &&
              this.fuelType.equals(other.getFuelType()))) &&
            ((this.fuelUse==null && other.getFuelUse()==null) || 
             (this.fuelUse!=null &&
              this.fuelUse.equals(other.getFuelUse()))) &&
            ((this.group==null && other.getGroup()==null) || 
             (this.group!=null &&
              this.group.equals(other.getGroup()))) &&
            ((this.phraseId==null && other.getPhraseId()==null) || 
             (this.phraseId!=null &&
              this.phraseId.equals(other.getPhraseId()))) &&
            ((this.shellClProduct==null && other.getShellClProduct()==null) || 
             (this.shellClProduct!=null &&
              this.shellClProduct.equals(other.getShellClProduct()))) &&
            ((this.shellFuelType==null && other.getShellFuelType()==null) || 
             (this.shellFuelType!=null &&
              this.shellFuelType.equals(other.getShellFuelType()))) &&
            ((this.shellPriceGroup==null && other.getShellPriceGroup()==null) || 
             (this.shellPriceGroup!=null &&
              this.shellPriceGroup.equals(other.getShellPriceGroup())));
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
        if (getCode() != null) {
            _hashCode += getCode().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getFuelType() != null) {
            _hashCode += getFuelType().hashCode();
        }
        if (getFuelUse() != null) {
            _hashCode += getFuelUse().hashCode();
        }
        if (getGroup() != null) {
            _hashCode += getGroup().hashCode();
        }
        if (getPhraseId() != null) {
            _hashCode += getPhraseId().hashCode();
        }
        if (getShellClProduct() != null) {
            _hashCode += getShellClProduct().hashCode();
        }
        if (getShellFuelType() != null) {
            _hashCode += getShellFuelType().hashCode();
        }
        if (getShellPriceGroup() != null) {
            _hashCode += getShellPriceGroup().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WSProduct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://com.tch.cards.service/types", "WSProduct"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("code");
        elemField.setXmlName(new javax.xml.namespace.QName("", "code"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("group");
        elemField.setXmlName(new javax.xml.namespace.QName("", "group"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phraseId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "phraseId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shellClProduct");
        elemField.setXmlName(new javax.xml.namespace.QName("", "shellClProduct"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shellFuelType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "shellFuelType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shellPriceGroup");
        elemField.setXmlName(new javax.xml.namespace.QName("", "shellPriceGroup"));
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
