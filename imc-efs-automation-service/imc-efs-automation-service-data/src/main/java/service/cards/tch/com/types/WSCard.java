
package service.cards.tch.com.types;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WSCard complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WSCard">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cardNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="header" type="{http://com.tch.cards.service/types}WSCardHeader"/>
 *         &lt;element name="infos" type="{http://com.tch.cards.service/types}WSCardInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="limits" type="{http://com.tch.cards.service/types}WSCardLimit" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="locationGroups" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="locations" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="timeRestrictions" type="{http://com.tch.cards.service/types}WSCardTimeRestriction" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSCard", propOrder = {
    "cardNumber",
    "header",
    "infos",
    "limits",
    "locationGroups",
    "locations",
    "timeRestrictions"
})
public class WSCard {

    @XmlElement(required = true, nillable = true)
    protected String cardNumber;
    @XmlElement(required = true, nillable = true)
    protected WSCardHeader header;
    @XmlElement(nillable = true)
    protected List<WSCardInfo> infos;
    @XmlElement(nillable = true)
    protected List<WSCardLimit> limits;
    @XmlElement(type = Integer.class)
    protected List<Integer> locationGroups;
    @XmlElement(type = Integer.class)
    protected List<Integer> locations;
    @XmlElement(nillable = true)
    protected List<WSCardTimeRestriction> timeRestrictions;

    /**
     * Gets the value of the cardNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardNumber() {
        return cardNumber;
    }

    /**
     * Sets the value of the cardNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardNumber(String value) {
        this.cardNumber = value;
    }

    /**
     * Gets the value of the header property.
     * 
     * @return
     *     possible object is
     *     {@link WSCardHeader }
     *     
     */
    public WSCardHeader getHeader() {
        return header;
    }

    /**
     * Sets the value of the header property.
     * 
     * @param value
     *     allowed object is
     *     {@link WSCardHeader }
     *     
     */
    public void setHeader(WSCardHeader value) {
        this.header = value;
    }

    /**
     * Gets the value of the infos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the infos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInfos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WSCardInfo }
     * 
     * 
     */
    public List<WSCardInfo> getInfos() {
        if (infos == null) {
            infos = new ArrayList<WSCardInfo>();
        }
        return this.infos;
    }

    /**
     * Gets the value of the limits property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the limits property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLimits().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WSCardLimit }
     * 
     * 
     */
    public List<WSCardLimit> getLimits() {
        if (limits == null) {
            limits = new ArrayList<WSCardLimit>();
        }
        return this.limits;
    }

    /**
     * Gets the value of the locationGroups property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the locationGroups property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocationGroups().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getLocationGroups() {
        if (locationGroups == null) {
            locationGroups = new ArrayList<Integer>();
        }
        return this.locationGroups;
    }

    /**
     * Gets the value of the locations property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the locations property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocations().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getLocations() {
        if (locations == null) {
            locations = new ArrayList<Integer>();
        }
        return this.locations;
    }

    /**
     * Gets the value of the timeRestrictions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the timeRestrictions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTimeRestrictions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WSCardTimeRestriction }
     * 
     * 
     */
    public List<WSCardTimeRestriction> getTimeRestrictions() {
        if (timeRestrictions == null) {
            timeRestrictions = new ArrayList<WSCardTimeRestriction>();
        }
        return this.timeRestrictions;
    }

}
