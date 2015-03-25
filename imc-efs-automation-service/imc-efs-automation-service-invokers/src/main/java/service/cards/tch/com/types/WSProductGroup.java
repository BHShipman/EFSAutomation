
package service.cards.tch.com.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WSProductGroup complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WSProductGroup">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="groupId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="groupNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="isFuel" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSProductGroup", propOrder = {
    "description",
    "groupId",
    "groupNumber",
    "isFuel"
})
public class WSProductGroup {

    @XmlElement(required = true, nillable = true)
    protected String description;
    @XmlElement(required = true, nillable = true)
    protected String groupId;
    protected int groupNumber;
    protected boolean isFuel;

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the groupId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupId() {
        return groupId;
    }

    /**
     * Sets the value of the groupId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupId(String value) {
        this.groupId = value;
    }

    /**
     * Gets the value of the groupNumber property.
     * 
     */
    public int getGroupNumber() {
        return groupNumber;
    }

    /**
     * Sets the value of the groupNumber property.
     * 
     */
    public void setGroupNumber(int value) {
        this.groupNumber = value;
    }

    /**
     * Gets the value of the isFuel property.
     * 
     */
    public boolean isIsFuel() {
        return isFuel;
    }

    /**
     * Sets the value of the isFuel property.
     * 
     */
    public void setIsFuel(boolean value) {
        this.isFuel = value;
    }

}
