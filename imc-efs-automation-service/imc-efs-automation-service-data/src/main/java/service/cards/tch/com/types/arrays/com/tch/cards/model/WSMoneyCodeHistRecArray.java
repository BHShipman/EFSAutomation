
package service.cards.tch.com.types.arrays.com.tch.cards.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import service.cards.tch.com.types.WSMoneyCodeHistRec;


/**
 * <p>Java class for WSMoneyCodeHistRecArray complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WSMoneyCodeHistRecArray">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="value" type="{http://com.tch.cards.service/types}WSMoneyCodeHistRec" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSMoneyCodeHistRecArray", propOrder = {
    "value"
})
public class WSMoneyCodeHistRecArray {

    @XmlElement(nillable = true)
    protected List<WSMoneyCodeHistRec> value;

    /**
     * Gets the value of the value property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the value property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WSMoneyCodeHistRec }
     * 
     * 
     */
    public List<WSMoneyCodeHistRec> getValue() {
        if (value == null) {
            value = new ArrayList<WSMoneyCodeHistRec>();
        }
        return this.value;
    }

}
