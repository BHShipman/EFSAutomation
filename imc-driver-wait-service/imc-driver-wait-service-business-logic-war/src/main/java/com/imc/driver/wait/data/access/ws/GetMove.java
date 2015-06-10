
package com.imc.driver.wait.data.access.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getMove complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getMove">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="moveNo" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
@XmlType(name = "getMove", propOrder = {
    "moveNo",
    "cmpyNo"
})
public class GetMove {

    protected int moveNo;
    protected int cmpyNo;

    /**
     * Gets the value of the moveNo property.
     * 
     */
    public int getMoveNo() {
        return moveNo;
    }

    /**
     * Sets the value of the moveNo property.
     * 
     */
    public void setMoveNo(int value) {
        this.moveNo = value;
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
