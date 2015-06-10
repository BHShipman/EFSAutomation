
package com.imc.driver.wait.data.access.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getByImportMoveNo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getByImportMoveNo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="importMoveNo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="cmpyNo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getByImportMoveNo", propOrder = {
    "importMoveNo",
    "cmpyNo"
})
public class GetByImportMoveNo {

    protected int importMoveNo;
    protected int cmpyNo;

    /**
     * Gets the value of the importMoveNo property.
     * 
     */
    public int getImportMoveNo() {
        return importMoveNo;
    }

    /**
     * Sets the value of the importMoveNo property.
     * 
     */
    public void setImportMoveNo(int value) {
        this.importMoveNo = value;
    }

    /**
     * Gets the value of the cmpyNo property.
     * 
     */
    public int getCmpyNo() {
        return cmpyNo;
    }

    /**
     * Sets the value of the cmpyNo property.
     * 
     */
    public void setCmpyNo(int value) {
        this.cmpyNo = value;
    }

}
