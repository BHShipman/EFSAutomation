
package com.imc.efs.automation.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.imc.efs.automation.service package. 
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

    private final static QName _RequestEfsCheckResponse_QNAME = new QName("http://webservice.automation.efs.imc.com/", "requestEfsCheckResponse");
    private final static QName _ResumeEfsCheckIssuance_QNAME = new QName("http://webservice.automation.efs.imc.com/", "resumeEfsCheckIssuance");
    private final static QName _ResumeEfsCheckIssuanceResponse_QNAME = new QName("http://webservice.automation.efs.imc.com/", "resumeEfsCheckIssuanceResponse");
    private final static QName _RequestEfsCheck_QNAME = new QName("http://webservice.automation.efs.imc.com/", "requestEfsCheck");
    private final static QName _FileUpload_QNAME = new QName("http://webservice.automation.efs.imc.com/", "FileUpload");
    private final static QName _Exception_QNAME = new QName("http://webservice.automation.efs.imc.com/", "Exception");
    private final static QName _ValidateCredentialsResponse_QNAME = new QName("http://webservice.automation.efs.imc.com/", "validateCredentialsResponse");
    private final static QName _EfsMoneyCode_QNAME = new QName("http://webservice.automation.efs.imc.com/", "EfsMoneyCode");
    private final static QName _EfsCheckRequest_QNAME = new QName("http://webservice.automation.efs.imc.com/", "EfsCheckRequest");
    private final static QName _ValidateCredentials_QNAME = new QName("http://webservice.automation.efs.imc.com/", "validateCredentials");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.imc.efs.automation.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FileUpload }
     * 
     */
    public FileUpload createFileUpload() {
        return new FileUpload();
    }

    /**
     * Create an instance of {@link Exception }
     * 
     */
    public Exception createException() {
        return new Exception();
    }

    /**
     * Create an instance of {@link ValidateCredentialsResponse }
     * 
     */
    public ValidateCredentialsResponse createValidateCredentialsResponse() {
        return new ValidateCredentialsResponse();
    }

    /**
     * Create an instance of {@link EfsMoneyCode }
     * 
     */
    public EfsMoneyCode createEfsMoneyCode() {
        return new EfsMoneyCode();
    }

    /**
     * Create an instance of {@link ValidateCredentials }
     * 
     */
    public ValidateCredentials createValidateCredentials() {
        return new ValidateCredentials();
    }

    /**
     * Create an instance of {@link EfsCheckRequest }
     * 
     */
    public EfsCheckRequest createEfsCheckRequest() {
        return new EfsCheckRequest();
    }

    /**
     * Create an instance of {@link ResumeEfsCheckIssuance }
     * 
     */
    public ResumeEfsCheckIssuance createResumeEfsCheckIssuance() {
        return new ResumeEfsCheckIssuance();
    }

    /**
     * Create an instance of {@link RequestEfsCheckResponse }
     * 
     */
    public RequestEfsCheckResponse createRequestEfsCheckResponse() {
        return new RequestEfsCheckResponse();
    }

    /**
     * Create an instance of {@link ResumeEfsCheckIssuanceResponse }
     * 
     */
    public ResumeEfsCheckIssuanceResponse createResumeEfsCheckIssuanceResponse() {
        return new ResumeEfsCheckIssuanceResponse();
    }

    /**
     * Create an instance of {@link RequestEfsCheck }
     * 
     */
    public RequestEfsCheck createRequestEfsCheck() {
        return new RequestEfsCheck();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestEfsCheckResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.automation.efs.imc.com/", name = "requestEfsCheckResponse")
    public JAXBElement<RequestEfsCheckResponse> createRequestEfsCheckResponse(RequestEfsCheckResponse value) {
        return new JAXBElement<RequestEfsCheckResponse>(_RequestEfsCheckResponse_QNAME, RequestEfsCheckResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResumeEfsCheckIssuance }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.automation.efs.imc.com/", name = "resumeEfsCheckIssuance")
    public JAXBElement<ResumeEfsCheckIssuance> createResumeEfsCheckIssuance(ResumeEfsCheckIssuance value) {
        return new JAXBElement<ResumeEfsCheckIssuance>(_ResumeEfsCheckIssuance_QNAME, ResumeEfsCheckIssuance.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResumeEfsCheckIssuanceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.automation.efs.imc.com/", name = "resumeEfsCheckIssuanceResponse")
    public JAXBElement<ResumeEfsCheckIssuanceResponse> createResumeEfsCheckIssuanceResponse(ResumeEfsCheckIssuanceResponse value) {
        return new JAXBElement<ResumeEfsCheckIssuanceResponse>(_ResumeEfsCheckIssuanceResponse_QNAME, ResumeEfsCheckIssuanceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestEfsCheck }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.automation.efs.imc.com/", name = "requestEfsCheck")
    public JAXBElement<RequestEfsCheck> createRequestEfsCheck(RequestEfsCheck value) {
        return new JAXBElement<RequestEfsCheck>(_RequestEfsCheck_QNAME, RequestEfsCheck.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FileUpload }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.automation.efs.imc.com/", name = "FileUpload")
    public JAXBElement<FileUpload> createFileUpload(FileUpload value) {
        return new JAXBElement<FileUpload>(_FileUpload_QNAME, FileUpload.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Exception }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.automation.efs.imc.com/", name = "Exception")
    public JAXBElement<Exception> createException(Exception value) {
        return new JAXBElement<Exception>(_Exception_QNAME, Exception.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidateCredentialsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.automation.efs.imc.com/", name = "validateCredentialsResponse")
    public JAXBElement<ValidateCredentialsResponse> createValidateCredentialsResponse(ValidateCredentialsResponse value) {
        return new JAXBElement<ValidateCredentialsResponse>(_ValidateCredentialsResponse_QNAME, ValidateCredentialsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EfsMoneyCode }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.automation.efs.imc.com/", name = "EfsMoneyCode")
    public JAXBElement<EfsMoneyCode> createEfsMoneyCode(EfsMoneyCode value) {
        return new JAXBElement<EfsMoneyCode>(_EfsMoneyCode_QNAME, EfsMoneyCode.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EfsCheckRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.automation.efs.imc.com/", name = "EfsCheckRequest")
    public JAXBElement<EfsCheckRequest> createEfsCheckRequest(EfsCheckRequest value) {
        return new JAXBElement<EfsCheckRequest>(_EfsCheckRequest_QNAME, EfsCheckRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidateCredentials }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.automation.efs.imc.com/", name = "validateCredentials")
    public JAXBElement<ValidateCredentials> createValidateCredentials(ValidateCredentials value) {
        return new JAXBElement<ValidateCredentials>(_ValidateCredentials_QNAME, ValidateCredentials.class, null, value);
    }

}
