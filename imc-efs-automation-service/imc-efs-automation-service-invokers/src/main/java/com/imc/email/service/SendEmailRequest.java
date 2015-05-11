
package com.imc.email.service;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="senderInfo" type="{http://service.imc.com/email/data}SenderInfo"/>
 *         &lt;element name="recipientInfo" type="{http://service.imc.com/email/data}RecipientInfo"/>
 *         &lt;element name="emailSubject" type="{http://service.imc.com/email/data}EmailSubject"/>
 *         &lt;element name="nonTemplateEmailContent" type="{http://service.imc.com/email/data}EmailContent" minOccurs="0"/>
 *         &lt;element name="emailTemplateId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="keyValues" type="{http://service.imc.com/email/data}KeyValueDataType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="tableValues" type="{http://service.imc.com/email/data}TableDataType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="emailAttachments" type="{http://service.imc.com/email/data}EmailAttachment" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "senderInfo",
    "recipientInfo",
    "emailSubject",
    "nonTemplateEmailContent",
    "emailTemplateId",
    "keyValues",
    "tableValues",
    "emailAttachments"
})
@XmlRootElement(name = "SendEmailRequest")
public class SendEmailRequest {

    @XmlElement(required = true)
    protected SenderInfo senderInfo;
    @XmlElement(required = true)
    protected RecipientInfo recipientInfo;
    @XmlElement(required = true)
    protected EmailSubject emailSubject;
    protected EmailContent nonTemplateEmailContent;
    protected String emailTemplateId;
    @XmlElement(nillable = true)
    protected List<KeyValueDataType> keyValues;
    @XmlElement(nillable = true)
    protected List<TableDataType> tableValues;
    @XmlElement(nillable = true)
    protected List<EmailAttachment> emailAttachments;

    /**
     * Gets the value of the senderInfo property.
     * 
     * @return
     *     possible object is
     *     {@link SenderInfo }
     *     
     */
    public SenderInfo getSenderInfo() {
        return senderInfo;
    }

    /**
     * Sets the value of the senderInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link SenderInfo }
     *     
     */
    public void setSenderInfo(SenderInfo value) {
        this.senderInfo = value;
    }

    /**
     * Gets the value of the recipientInfo property.
     * 
     * @return
     *     possible object is
     *     {@link RecipientInfo }
     *     
     */
    public RecipientInfo getRecipientInfo() {
        return recipientInfo;
    }

    /**
     * Sets the value of the recipientInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecipientInfo }
     *     
     */
    public void setRecipientInfo(RecipientInfo value) {
        this.recipientInfo = value;
    }

    /**
     * Gets the value of the emailSubject property.
     * 
     * @return
     *     possible object is
     *     {@link EmailSubject }
     *     
     */
    public EmailSubject getEmailSubject() {
        return emailSubject;
    }

    /**
     * Sets the value of the emailSubject property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmailSubject }
     *     
     */
    public void setEmailSubject(EmailSubject value) {
        this.emailSubject = value;
    }

    /**
     * Gets the value of the nonTemplateEmailContent property.
     * 
     * @return
     *     possible object is
     *     {@link EmailContent }
     *     
     */
    public EmailContent getNonTemplateEmailContent() {
        return nonTemplateEmailContent;
    }

    /**
     * Sets the value of the nonTemplateEmailContent property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmailContent }
     *     
     */
    public void setNonTemplateEmailContent(EmailContent value) {
        this.nonTemplateEmailContent = value;
    }

    /**
     * Gets the value of the emailTemplateId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailTemplateId() {
        return emailTemplateId;
    }

    /**
     * Sets the value of the emailTemplateId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailTemplateId(String value) {
        this.emailTemplateId = value;
    }

    /**
     * Gets the value of the keyValues property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the keyValues property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKeyValues().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link KeyValueDataType }
     * 
     * 
     */
    public List<KeyValueDataType> getKeyValues() {
        if (keyValues == null) {
            keyValues = new ArrayList<KeyValueDataType>();
        }
        return this.keyValues;
    }
    
    public void setKeyValues(List<KeyValueDataType> keyValues){
    	this.keyValues = keyValues;
    }

    /**
     * Gets the value of the tableValues property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tableValues property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTableValues().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TableDataType }
     * 
     * 
     */
    public List<TableDataType> getTableValues() {
        if (tableValues == null) {
            tableValues = new ArrayList<TableDataType>();
        }
        return this.tableValues;
    }
    
    public void setTableValues(List<TableDataType> tableValues){
    	this.tableValues = tableValues;
    }

    /**
     * Gets the value of the emailAttachments property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the emailAttachments property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEmailAttachments().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EmailAttachment }
     * 
     * 
     */
    public List<EmailAttachment> getEmailAttachments() {
        if (emailAttachments == null) {
            emailAttachments = new ArrayList<EmailAttachment>();
        }
        return this.emailAttachments;
    }

	public void setEmailAttachments(List<EmailAttachment> emailAttachments){
		this.emailAttachments = emailAttachments;
		
	}

}
