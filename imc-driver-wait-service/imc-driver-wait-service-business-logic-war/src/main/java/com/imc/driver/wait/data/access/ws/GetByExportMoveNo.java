
package com.imc.driver.wait.data.access.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getByExportMoveNo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getByExportMoveNo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="exportMoveNo" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
@XmlType(name = "getByExportMoveNo", propOrder = {
    "exportMoveNo",
    "cmpyNo"
})
public class GetByExportMoveNo {

    protected int exportMoveNo;
    protected int cmpyNo;

    /**
     * Gets the value of the exportMoveNo property.
     * 
     */
    public int getExportMoveNo() {
        return exportMoveNo;
    }

    /**
     * Sets the value of the exportMoveNo property.
     * 
     */
    public void setExportMoveNo(int value) {
        this.exportMoveNo = value;
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
