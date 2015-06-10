
package com.imc.driver.wait.data.access.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

import com.imc.driver.wait.service.entities.Orchrg;


/**
 * <p>Java class for insertOrchrg complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="insertOrchrg">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="orchrg" type="{http://ws.access.data.wait.driver.imc.com/}orchrg" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "insertOrchrg", propOrder = {
    "orchrg"
})
public class InsertOrchrg {

    protected Orchrg orchrg;

    /**
     * Gets the value of the orchrg property.
     * 
     * @return
     *     possible object is
     *     {@link Orchrg }
     *     
     */
    public Orchrg getOrchrg() {
        return orchrg;
    }

    /**
     * Sets the value of the orchrg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Orchrg }
     *     
     */
    public void setOrchrg(Orchrg value) {
        this.orchrg = value;
    }

}
