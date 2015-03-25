
package com.imc.efs.automation.email.service;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.imc.efs.automation.email.service package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.imc.efs.automation.email.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SendEmailRequest }
     * 
     */
    public SendEmailRequest createSendEmailRequest() {
        return new SendEmailRequest();
    }

    /**
     * Create an instance of {@link SenderInfo }
     * 
     */
    public SenderInfo createSenderInfo() {
        return new SenderInfo();
    }

    /**
     * Create an instance of {@link RecipientInfo }
     * 
     */
    public RecipientInfo createRecipientInfo() {
        return new RecipientInfo();
    }

    /**
     * Create an instance of {@link EmailSubject }
     * 
     */
    public EmailSubject createEmailSubject() {
        return new EmailSubject();
    }

    /**
     * Create an instance of {@link EmailContent }
     * 
     */
    public EmailContent createEmailContent() {
        return new EmailContent();
    }

    /**
     * Create an instance of {@link KeyValueDataType }
     * 
     */
    public KeyValueDataType createKeyValueDataType() {
        return new KeyValueDataType();
    }

    /**
     * Create an instance of {@link TableDataType }
     * 
     */
    public TableDataType createTableDataType() {
        return new TableDataType();
    }

    /**
     * Create an instance of {@link EmailAttachment }
     * 
     */
    public EmailAttachment createEmailAttachment() {
        return new EmailAttachment();
    }

    /**
     * Create an instance of {@link SendEmailResponse }
     * 
     */
    public SendEmailResponse createSendEmailResponse() {
        return new SendEmailResponse();
    }

    /**
     * Create an instance of {@link RowDataType }
     * 
     */
    public RowDataType createRowDataType() {
        return new RowDataType();
    }

}
