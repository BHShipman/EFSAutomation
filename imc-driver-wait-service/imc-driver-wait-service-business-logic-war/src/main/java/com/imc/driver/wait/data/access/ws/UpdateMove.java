
package com.imc.driver.wait.data.access.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

import com.imc.driver.wait.service.entities.Move;


/**
 * <p>Java class for updateMove complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="updateMove">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="move" type="{http://ws.access.data.wait.driver.imc.com/}move" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updateMove", propOrder = {
    "move"
})
public class UpdateMove {

    protected Move move;

    /**
     * Gets the value of the move property.
     * 
     * @return
     *     possible object is
     *     {@link Move }
     *     
     */
    public Move getMove() {
        return move;
    }

    /**
     * Sets the value of the move property.
     * 
     * @param value
     *     allowed object is
     *     {@link Move }
     *     
     */
    public void setMove(Move value) {
        this.move = value;
    }

}
