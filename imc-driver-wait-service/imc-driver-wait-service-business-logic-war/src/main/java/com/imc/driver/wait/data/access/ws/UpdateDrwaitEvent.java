
package com.imc.driver.wait.data.access.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

import com.imc.driver.wait.service.entities.DrwaitEventQueue;


/**
 * <p>Java class for updateDrwaitEvent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="updateDrwaitEvent">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="drwaitEvent" type="{http://ws.access.data.wait.driver.imc.com/}drwaitEventQueue" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updateDrwaitEvent", propOrder = {
    "drwaitEvent"
})
public class UpdateDrwaitEvent {

    protected DrwaitEventQueue drwaitEvent;

    /**
     * Gets the value of the drwaitEvent property.
     * 
     * @return
     *     possible object is
     *     {@link DrwaitEventQueue }
     *     
     */
    public DrwaitEventQueue getDrwaitEvent() {
        return drwaitEvent;
    }

    /**
     * Sets the value of the drwaitEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link DrwaitEventQueue }
     *     
     */
    public void setDrwaitEvent(DrwaitEventQueue value) {
        this.drwaitEvent = value;
    }

}
