
package service.cards.tch.com.types;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WSPolicy complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WSPolicy">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="header" type="{http://com.tch.cards.service/types}WSPolicyHeader"/>
 *         &lt;element name="infos" type="{http://com.tch.cards.service/types}WSCardInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="limits" type="{http://com.tch.cards.service/types}WSPolicyLimit" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="locationGroups" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="locations" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="policyNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
@XmlType(name = "WSPolicy", propOrder = {
    "header",
    "infos",
    "limits",
    "locationGroups",
    "locations",
    "policyNumber",
    "timeRestrictions"
})
public class WSPolicy {

    @XmlElement(required = true, nillable = true)
    protected WSPolicyHeader header;
    @XmlElement(nillable = true)
    protected List<WSCardInfo> infos;
    @XmlElement(nillable = true)
    protected List<WSPolicyLimit> limits;
    @XmlElement(type = Integer.class)
    protected List<Integer> locationGroups;
    @XmlElement(type = Integer.class)
    protected List<Integer> locations;
    protected int policyNumber;
    @XmlElement(nillable = true)
    protected List<WSCardTimeRestriction> timeRestrictions;

    /**
     * Gets the value of the header property.
     * 
     * @return
     *     possible object is
     *     {@link WSPolicyHeader }
     *     
     */
    public WSPolicyHeader getHeader() {
        return header;
    }

    /**
     * Sets the value of the header property.
     * 
     * @param value
     *     allowed object is
     *     {@link WSPolicyHeader }
     *     
     */
    public void setHeader(WSPolicyHeader value) {
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
     * {@link WSPolicyLimit }
     * 
     * 
     */
    public List<WSPolicyLimit> getLimits() {
        if (limits == null) {
            limits = new ArrayList<WSPolicyLimit>();
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
     * Gets the value of the policyNumber property.
     * 
     */
    public int getPolicyNumber() {
        return policyNumber;
    }

    /**
     * Sets the value of the policyNumber property.
     * 
     */
    public void setPolicyNumber(int value) {
        this.policyNumber = value;
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
