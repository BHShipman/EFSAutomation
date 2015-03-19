
package service.cards.tch.com.types;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WSRegisteredCheckAuthorizationResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WSRegisteredCheckAuthorizationResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="requestStatus" type="{http://com.tch.cards.service/types}WSRequestStatus"/>
 *         &lt;element name="loadResults" type="{http://com.tch.cards.service/types}WSRegisteredCheckAuthorizationResults" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSRegisteredCheckAuthorizationResponse", propOrder = {
    "requestStatus",
    "loadResults"
})
public class WSRegisteredCheckAuthorizationResponse {

    @XmlElement(required = true)
    protected WSRequestStatus requestStatus;
    @XmlElement(nillable = true)
    protected List<WSRegisteredCheckAuthorizationResults> loadResults;

    /**
     * Gets the value of the requestStatus property.
     * 
     * @return
     *     possible object is
     *     {@link WSRequestStatus }
     *     
     */
    public WSRequestStatus getRequestStatus() {
        return requestStatus;
    }

    /**
     * Sets the value of the requestStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link WSRequestStatus }
     *     
     */
    public void setRequestStatus(WSRequestStatus value) {
        this.requestStatus = value;
    }

    /**
     * Gets the value of the loadResults property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the loadResults property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLoadResults().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WSRegisteredCheckAuthorizationResults }
     * 
     * 
     */
    public List<WSRegisteredCheckAuthorizationResults> getLoadResults() {
        if (loadResults == null) {
            loadResults = new ArrayList<WSRegisteredCheckAuthorizationResults>();
        }
        return this.loadResults;
    }

}
