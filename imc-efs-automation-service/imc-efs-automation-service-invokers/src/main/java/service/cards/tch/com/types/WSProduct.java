
package service.cards.tch.com.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WSProduct complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WSProduct">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fuelType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="fuelUse" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="group" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="phraseId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="shellClProduct" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="shellFuelType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="shellPriceGroup" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSProduct", propOrder = {
    "code",
    "description",
    "fuelType",
    "fuelUse",
    "group",
    "phraseId",
    "shellClProduct",
    "shellFuelType",
    "shellPriceGroup"
})
public class WSProduct {

    @XmlElement(required = true, nillable = true)
    protected String code;
    @XmlElement(required = true, nillable = true)
    protected String description;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer fuelType;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer fuelUse;
    @XmlElement(required = true, nillable = true)
    protected String group;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer phraseId;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer shellClProduct;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer shellFuelType;
    @XmlElement(required = true, nillable = true)
    protected String shellPriceGroup;

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode(String value) {
        this.code = value;
    }

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
     * Gets the value of the fuelType property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFuelType() {
        return fuelType;
    }

    /**
     * Sets the value of the fuelType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFuelType(Integer value) {
        this.fuelType = value;
    }

    /**
     * Gets the value of the fuelUse property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFuelUse() {
        return fuelUse;
    }

    /**
     * Sets the value of the fuelUse property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFuelUse(Integer value) {
        this.fuelUse = value;
    }

    /**
     * Gets the value of the group property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroup() {
        return group;
    }

    /**
     * Sets the value of the group property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroup(String value) {
        this.group = value;
    }

    /**
     * Gets the value of the phraseId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPhraseId() {
        return phraseId;
    }

    /**
     * Sets the value of the phraseId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPhraseId(Integer value) {
        this.phraseId = value;
    }

    /**
     * Gets the value of the shellClProduct property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getShellClProduct() {
        return shellClProduct;
    }

    /**
     * Sets the value of the shellClProduct property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setShellClProduct(Integer value) {
        this.shellClProduct = value;
    }

    /**
     * Gets the value of the shellFuelType property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getShellFuelType() {
        return shellFuelType;
    }

    /**
     * Sets the value of the shellFuelType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setShellFuelType(Integer value) {
        this.shellFuelType = value;
    }

    /**
     * Gets the value of the shellPriceGroup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShellPriceGroup() {
        return shellPriceGroup;
    }

    /**
     * Sets the value of the shellPriceGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShellPriceGroup(String value) {
        this.shellPriceGroup = value;
    }

}
