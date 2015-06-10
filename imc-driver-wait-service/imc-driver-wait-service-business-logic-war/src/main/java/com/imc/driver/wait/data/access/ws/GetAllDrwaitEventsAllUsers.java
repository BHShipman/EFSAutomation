
package com.imc.driver.wait.data.access.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getAllDrwaitEventsAllUsers complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getAllDrwaitEventsAllUsers">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="includeProcessed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getAllDrwaitEventsAllUsers", propOrder = {
    "includeProcessed"
})
public class GetAllDrwaitEventsAllUsers {

    protected boolean includeProcessed;

    /**
     * Gets the value of the includeProcessed property.
     * 
     */
    public boolean isIncludeProcessed() {
        return includeProcessed;
    }

    /**
     * Sets the value of the includeProcessed property.
     * 
     */
    public void setIncludeProcessed(boolean value) {
        this.includeProcessed = value;
    }

}
