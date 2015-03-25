
package service.cards.tch.com.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WSTransactionCarmsStmt complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WSTransactionCarmsStmt">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="statementId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSTransactionCarmsStmt", propOrder = {
    "statementId"
})
public class WSTransactionCarmsStmt {

    @XmlElement(required = true)
    protected String statementId;

    /**
     * Gets the value of the statementId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatementId() {
        return statementId;
    }

    /**
     * Sets the value of the statementId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatementId(String value) {
        this.statementId = value;
    }

}
