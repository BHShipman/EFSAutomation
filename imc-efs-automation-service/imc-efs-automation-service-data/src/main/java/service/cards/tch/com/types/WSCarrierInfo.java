
package service.cards.tch.com.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WSCarrierInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WSCarrierInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="carrierId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="locationGroups" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSCarrierInfo", propOrder = {
    "name",
    "carrierId",
    "locationGroups"
})
public class WSCarrierInfo {

    @XmlElement(required = true)
    protected String name;
    protected int carrierId;
    protected boolean locationGroups;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the carrierId property.
     * 
     */
    public int getCarrierId() {
        return carrierId;
    }

    /**
     * Sets the value of the carrierId property.
     * 
     */
    public void setCarrierId(int value) {
        this.carrierId = value;
    }

    /**
     * Gets the value of the locationGroups property.
     * 
     */
    public boolean isLocationGroups() {
        return locationGroups;
    }

    /**
     * Sets the value of the locationGroups property.
     * 
     */
    public void setLocationGroups(boolean value) {
        this.locationGroups = value;
    }

}
