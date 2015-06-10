
package com.imc.driver.wait.data.access.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

import com.imc.driver.wait.service.entities.Drwait;


/**
 * <p>Java class for insertDrwait complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="insertDrwait">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="driverWait" type="{http://ws.access.data.wait.driver.imc.com/}drwait" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "insertDrwait", propOrder = {
    "driverWait"
})
public class InsertDrwait {

    protected Drwait driverWait;

    /**
     * Gets the value of the driverWait property.
     * 
     * @return
     *     possible object is
     *     {@link Drwait }
     *     
     */
    public Drwait getDriverWait() {
        return driverWait;
    }

    /**
     * Sets the value of the driverWait property.
     * 
     * @param value
     *     allowed object is
     *     {@link Drwait }
     *     
     */
    public void setDriverWait(Drwait value) {
        this.driverWait = value;
    }

}
