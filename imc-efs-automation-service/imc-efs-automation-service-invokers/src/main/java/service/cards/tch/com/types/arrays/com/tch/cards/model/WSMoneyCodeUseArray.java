
package service.cards.tch.com.types.arrays.com.tch.cards.model;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import service.cards.tch.com.types.WSMoneyCodeUse;


/**
 * <p>Java class for WSMoneyCodeUseArray complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WSMoneyCodeUseArray">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="value" type="{http://com.tch.cards.service/types}WSMoneyCodeUse" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSMoneyCodeUseArray", propOrder = {
    "value"
})
public class WSMoneyCodeUseArray {

    @XmlElement(nillable = true)
    protected List<WSMoneyCodeUse> value;

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
     * {@link WSMoneyCodeUse }
     * 
     * 
     */
    public List<WSMoneyCodeUse> getValue() {
        if (value == null) {
            value = new ArrayList<WSMoneyCodeUse>();
        }
        return this.value;
    }

}
