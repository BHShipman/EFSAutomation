
package com.imc.business.logic.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

import com.imc.efs.automation.data.EfsCheckRequest;
import com.imc.efs.automation.data.EfsMoneyCode;
import com.imc.efs.automation.data.FileUpload;
import com.imc.efs.automation.dto.MoneyCodeDetailsDTO;
import com.imc.efs.automation.entities.Requests;
import com.imc.efs.automation.entities.Requesttypes;
import com.imc.efs.automation.entities.Status;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.imc.business.logic.service package. 
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

    private final static QName _GetMoneyCodeDetailsResponse_QNAME = new QName("http://ws.logic.business.automation.efs.imc.com/", "GetMoneyCodeDetailsResponse");
    private final static QName _SendApprovalRequestEmail_QNAME = new QName("http://ws.logic.business.automation.efs.imc.com/", "sendApprovalRequestEmail");
    private final static QName _GetRequestTypeResponse_QNAME = new QName("http://ws.logic.business.automation.efs.imc.com/", "getRequestTypeResponse");
    private final static QName _SendIssuanceEmail_QNAME = new QName("http://ws.logic.business.automation.efs.imc.com/", "sendIssuanceEmail");
    private final static QName _ValidateIsNotDuplicateRequest_QNAME = new QName("http://ws.logic.business.automation.efs.imc.com/", "validateIsNotDuplicateRequest");
    private final static QName _GetUsersEfsCheckLimit_QNAME = new QName("http://ws.logic.business.automation.efs.imc.com/", "getUsersEfsCheckLimit");
    private final static QName _UpdateRequest_QNAME = new QName("http://ws.logic.business.automation.efs.imc.com/", "updateRequest");
    private final static QName _GetMoneyCodeDetails_QNAME = new QName("http://ws.logic.business.automation.efs.imc.com/", "GetMoneyCodeDetails");
    private final static QName _CreateIssueDocResponse_QNAME = new QName("http://ws.logic.business.automation.efs.imc.com/", "createIssueDocResponse");
    private final static QName _GetRequestResponse_QNAME = new QName("http://ws.logic.business.automation.efs.imc.com/", "getRequestResponse");
    private final static QName _SendIssuanceEmailResponse_QNAME = new QName("http://ws.logic.business.automation.efs.imc.com/", "sendIssuanceEmailResponse");
    private final static QName _GetRequest_QNAME = new QName("http://ws.logic.business.automation.efs.imc.com/", "getRequest");
    private final static QName _CreateIssueDoc_QNAME = new QName("http://ws.logic.business.automation.efs.imc.com/", "createIssueDoc");
    private final static QName _ValidateRequestInputAgainstConfigResponse_QNAME = new QName("http://ws.logic.business.automation.efs.imc.com/", "validateRequestInputAgainstConfigResponse");
    private final static QName _Exception_QNAME = new QName("http://ws.logic.business.automation.efs.imc.com/", "Exception");
    private final static QName _ValidateRequestInputAgainstConfig_QNAME = new QName("http://ws.logic.business.automation.efs.imc.com/", "validateRequestInputAgainstConfig");
    private final static QName _EfsMoneyCode_QNAME = new QName("http://ws.logic.business.automation.efs.imc.com/", "EfsMoneyCode");
    private final static QName _StoreDocuments_QNAME = new QName("http://ws.logic.business.automation.efs.imc.com/", "storeDocuments");
    private final static QName _GetUsersEfsCheckLimitResponse_QNAME = new QName("http://ws.logic.business.automation.efs.imc.com/", "getUsersEfsCheckLimitResponse");
    private final static QName _SendApprovalRequestEmailResponse_QNAME = new QName("http://ws.logic.business.automation.efs.imc.com/", "sendApprovalRequestEmailResponse");
    private final static QName _ValidateCredentialsResponse_QNAME = new QName("http://ws.logic.business.automation.efs.imc.com/", "validateCredentialsResponse");
    private final static QName _ValidateHasInvoiceResponse_QNAME = new QName("http://ws.logic.business.automation.efs.imc.com/", "validateHasInvoiceResponse");
    private final static QName _ValidateHasInvoice_QNAME = new QName("http://ws.logic.business.automation.efs.imc.com/", "validateHasInvoice");
    private final static QName _FileUpload_QNAME = new QName("http://ws.logic.business.automation.efs.imc.com/", "FileUpload");
    private final static QName _ToRequest_QNAME = new QName("http://ws.logic.business.automation.efs.imc.com/", "toRequest");
    private final static QName _ValidateIsNotDuplicateRequestResponse_QNAME = new QName("http://ws.logic.business.automation.efs.imc.com/", "validateIsNotDuplicateRequestResponse");
    private final static QName _IssueMoneyCode_QNAME = new QName("http://ws.logic.business.automation.efs.imc.com/", "IssueMoneyCode");
    private final static QName _EfsCheckRequest_QNAME = new QName("http://ws.logic.business.automation.efs.imc.com/", "EfsCheckRequest");
    private final static QName _CreateIssuanceTransactionResponse_QNAME = new QName("http://ws.logic.business.automation.efs.imc.com/", "createIssuanceTransactionResponse");
    private final static QName _SaveRequestResponse_QNAME = new QName("http://ws.logic.business.automation.efs.imc.com/", "saveRequestResponse");
    private final static QName _GetRequestType_QNAME = new QName("http://ws.logic.business.automation.efs.imc.com/", "getRequestType");
    private final static QName _CreateIssuanceTransaction_QNAME = new QName("http://ws.logic.business.automation.efs.imc.com/", "createIssuanceTransaction");
    private final static QName _GetIssuedRequests_QNAME = new QName("http://ws.logic.business.automation.efs.imc.com/", "getIssuedRequests");
    private final static QName _UpdateRequestResponse_QNAME = new QName("http://ws.logic.business.automation.efs.imc.com/", "updateRequestResponse");
    private final static QName _ToRequestResponse_QNAME = new QName("http://ws.logic.business.automation.efs.imc.com/", "toRequestResponse");
    private final static QName _SaveRequest_QNAME = new QName("http://ws.logic.business.automation.efs.imc.com/", "saveRequest");
    private final static QName _ReleaseAPHoldResponse_QNAME = new QName("http://ws.logic.business.automation.efs.imc.com/", "releaseAPHoldResponse");
    private final static QName _GetStatusResponse_QNAME = new QName("http://ws.logic.business.automation.efs.imc.com/", "getStatusResponse");
    private final static QName _IssueMoneyCodeResponse_QNAME = new QName("http://ws.logic.business.automation.efs.imc.com/", "IssueMoneyCodeResponse");
    private final static QName _GetStatus_QNAME = new QName("http://ws.logic.business.automation.efs.imc.com/", "getStatus");
    private final static QName _GetIssuedRequestsResponse_QNAME = new QName("http://ws.logic.business.automation.efs.imc.com/", "getIssuedRequestsResponse");
    private final static QName _ValidateCredentials_QNAME = new QName("http://ws.logic.business.automation.efs.imc.com/", "validateCredentials");
    private final static QName _ReleaseAPHold_QNAME = new QName("http://ws.logic.business.automation.efs.imc.com/", "releaseAPHold");
    private final static QName _StoreDocumentsResponse_QNAME = new QName("http://ws.logic.business.automation.efs.imc.com/", "storeDocumentsResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.imc.business.logic.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ValidateRequestInputAgainstConfigResponse }
     * 
     */
    public ValidateRequestInputAgainstConfigResponse createValidateRequestInputAgainstConfigResponse() {
        return new ValidateRequestInputAgainstConfigResponse();
    }

    /**
     * Create an instance of {@link CreateIssueDoc }
     * 
     */
    public CreateIssueDoc createCreateIssueDoc() {
        return new CreateIssueDoc();
    }

    /**
     * Create an instance of {@link Exception }
     * 
     */
    public Exception createException() {
        return new Exception();
    }

    /**
     * Create an instance of {@link EfsMoneyCode }
     * 
     */
    public EfsMoneyCode createEfsMoneyCode() {
        return new EfsMoneyCode();
    }

    /**
     * Create an instance of {@link ValidateRequestInputAgainstConfig }
     * 
     */
    public ValidateRequestInputAgainstConfig createValidateRequestInputAgainstConfig() {
        return new ValidateRequestInputAgainstConfig();
    }

    /**
     * Create an instance of {@link SendApprovalRequestEmailResponse }
     * 
     */
    public SendApprovalRequestEmailResponse createSendApprovalRequestEmailResponse() {
        return new SendApprovalRequestEmailResponse();
    }

    /**
     * Create an instance of {@link GetUsersEfsCheckLimitResponse }
     * 
     */
    public GetUsersEfsCheckLimitResponse createGetUsersEfsCheckLimitResponse() {
        return new GetUsersEfsCheckLimitResponse();
    }

    /**
     * Create an instance of {@link StoreDocuments }
     * 
     */
    public StoreDocuments createStoreDocuments() {
        return new StoreDocuments();
    }

    /**
     * Create an instance of {@link SendApprovalRequestEmail }
     * 
     */
    public SendApprovalRequestEmail createSendApprovalRequestEmail() {
        return new SendApprovalRequestEmail();
    }

    /**
     * Create an instance of {@link SendIssuanceEmail }
     * 
     */
    public SendIssuanceEmail createSendIssuanceEmail() {
        return new SendIssuanceEmail();
    }

    /**
     * Create an instance of {@link GetRequestTypeResponse }
     * 
     */
    public GetRequestTypeResponse createGetRequestTypeResponse() {
        return new GetRequestTypeResponse();
    }

    /**
     * Create an instance of {@link GetMoneyCodeDetailsResponse }
     * 
     */
    public GetMoneyCodeDetailsResponse createGetMoneyCodeDetailsResponse() {
        return new GetMoneyCodeDetailsResponse();
    }

    /**
     * Create an instance of {@link GetUsersEfsCheckLimit }
     * 
     */
    public GetUsersEfsCheckLimit createGetUsersEfsCheckLimit() {
        return new GetUsersEfsCheckLimit();
    }

    /**
     * Create an instance of {@link ValidateIsNotDuplicateRequest }
     * 
     */
    public ValidateIsNotDuplicateRequest createValidateIsNotDuplicateRequest() {
        return new ValidateIsNotDuplicateRequest();
    }

    /**
     * Create an instance of {@link UpdateRequest }
     * 
     */
    public UpdateRequest createUpdateRequest() {
        return new UpdateRequest();
    }

    /**
     * Create an instance of {@link GetMoneyCodeDetails }
     * 
     */
    public GetMoneyCodeDetails createGetMoneyCodeDetails() {
        return new GetMoneyCodeDetails();
    }

    /**
     * Create an instance of {@link SendIssuanceEmailResponse }
     * 
     */
    public SendIssuanceEmailResponse createSendIssuanceEmailResponse() {
        return new SendIssuanceEmailResponse();
    }

    /**
     * Create an instance of {@link GetRequest }
     * 
     */
    public GetRequest createGetRequest() {
        return new GetRequest();
    }

    /**
     * Create an instance of {@link CreateIssueDocResponse }
     * 
     */
    public CreateIssueDocResponse createCreateIssueDocResponse() {
        return new CreateIssueDocResponse();
    }

    /**
     * Create an instance of {@link GetRequestResponse }
     * 
     */
    public GetRequestResponse createGetRequestResponse() {
        return new GetRequestResponse();
    }

    /**
     * Create an instance of {@link IssueMoneyCodeResponse }
     * 
     */
    public IssueMoneyCodeResponse createIssueMoneyCodeResponse() {
        return new IssueMoneyCodeResponse();
    }

    /**
     * Create an instance of {@link GetStatus }
     * 
     */
    public GetStatus createGetStatus() {
        return new GetStatus();
    }

    /**
     * Create an instance of {@link GetIssuedRequestsResponse }
     * 
     */
    public GetIssuedRequestsResponse createGetIssuedRequestsResponse() {
        return new GetIssuedRequestsResponse();
    }

    /**
     * Create an instance of {@link GetStatusResponse }
     * 
     */
    public GetStatusResponse createGetStatusResponse() {
        return new GetStatusResponse();
    }

    /**
     * Create an instance of {@link ReleaseAPHoldResponse }
     * 
     */
    public ReleaseAPHoldResponse createReleaseAPHoldResponse() {
        return new ReleaseAPHoldResponse();
    }

    /**
     * Create an instance of {@link ValidateCredentials }
     * 
     */
    public ValidateCredentials createValidateCredentials() {
        return new ValidateCredentials();
    }

    /**
     * Create an instance of {@link StoreDocumentsResponse }
     * 
     */
    public StoreDocumentsResponse createStoreDocumentsResponse() {
        return new StoreDocumentsResponse();
    }

    /**
     * Create an instance of {@link ReleaseAPHold }
     * 
     */
    public ReleaseAPHold createReleaseAPHold() {
        return new ReleaseAPHold();
    }

    /**
     * Create an instance of {@link ValidateIsNotDuplicateRequestResponse }
     * 
     */
    public ValidateIsNotDuplicateRequestResponse createValidateIsNotDuplicateRequestResponse() {
        return new ValidateIsNotDuplicateRequestResponse();
    }

    /**
     * Create an instance of {@link ToRequest }
     * 
     */
    public ToRequest createToRequest() {
        return new ToRequest();
    }

    /**
     * Create an instance of {@link FileUpload }
     * 
     */
    public FileUpload createFileUpload() {
        return new FileUpload();
    }

    /**
     * Create an instance of {@link IssueMoneyCode }
     * 
     */
    public IssueMoneyCode createIssueMoneyCode() {
        return new IssueMoneyCode();
    }

    /**
     * Create an instance of {@link ValidateHasInvoiceResponse }
     * 
     */
    public ValidateHasInvoiceResponse createValidateHasInvoiceResponse() {
        return new ValidateHasInvoiceResponse();
    }

    /**
     * Create an instance of {@link ValidateCredentialsResponse }
     * 
     */
    public ValidateCredentialsResponse createValidateCredentialsResponse() {
        return new ValidateCredentialsResponse();
    }

    /**
     * Create an instance of {@link ValidateHasInvoice }
     * 
     */
    public ValidateHasInvoice createValidateHasInvoice() {
        return new ValidateHasInvoice();
    }

    /**
     * Create an instance of {@link SaveRequestResponse }
     * 
     */
    public SaveRequestResponse createSaveRequestResponse() {
        return new SaveRequestResponse();
    }

    /**
     * Create an instance of {@link EfsCheckRequest }
     * 
     */
    public EfsCheckRequest createEfsCheckRequest() {
        return new EfsCheckRequest();
    }

    /**
     * Create an instance of {@link CreateIssuanceTransactionResponse }
     * 
     */
    public CreateIssuanceTransactionResponse createCreateIssuanceTransactionResponse() {
        return new CreateIssuanceTransactionResponse();
    }

    /**
     * Create an instance of {@link UpdateRequestResponse }
     * 
     */
    public UpdateRequestResponse createUpdateRequestResponse() {
        return new UpdateRequestResponse();
    }

    /**
     * Create an instance of {@link GetIssuedRequests }
     * 
     */
    public GetIssuedRequests createGetIssuedRequests() {
        return new GetIssuedRequests();
    }

    /**
     * Create an instance of {@link CreateIssuanceTransaction }
     * 
     */
    public CreateIssuanceTransaction createCreateIssuanceTransaction() {
        return new CreateIssuanceTransaction();
    }

    /**
     * Create an instance of {@link GetRequestType }
     * 
     */
    public GetRequestType createGetRequestType() {
        return new GetRequestType();
    }

    /**
     * Create an instance of {@link SaveRequest }
     * 
     */
    public SaveRequest createSaveRequest() {
        return new SaveRequest();
    }

    /**
     * Create an instance of {@link ToRequestResponse }
     * 
     */
    public ToRequestResponse createToRequestResponse() {
        return new ToRequestResponse();
    }

    /**
     * Create an instance of {@link MoneyCodeDetailsDTO }
     * 
     */
    public MoneyCodeDetailsDTO createMoneyCodeDetailsDTO() {
        return new MoneyCodeDetailsDTO();
    }

    /**
     * Create an instance of {@link Requests }
     * 
     */
    public Requests createRequests() {
        return new Requests();
    }

    /**
     * Create an instance of {@link Requesttypes }
     * 
     */
    public Requesttypes createRequesttypes() {
        return new Requesttypes();
    }

    /**
     * Create an instance of {@link Status }
     * 
     */
    public Status createStatus() {
        return new Status();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMoneyCodeDetailsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.logic.business.automation.efs.imc.com/", name = "GetMoneyCodeDetailsResponse")
    public JAXBElement<GetMoneyCodeDetailsResponse> createGetMoneyCodeDetailsResponse(GetMoneyCodeDetailsResponse value) {
        return new JAXBElement<GetMoneyCodeDetailsResponse>(_GetMoneyCodeDetailsResponse_QNAME, GetMoneyCodeDetailsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendApprovalRequestEmail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.logic.business.automation.efs.imc.com/", name = "sendApprovalRequestEmail")
    public JAXBElement<SendApprovalRequestEmail> createSendApprovalRequestEmail(SendApprovalRequestEmail value) {
        return new JAXBElement<SendApprovalRequestEmail>(_SendApprovalRequestEmail_QNAME, SendApprovalRequestEmail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRequestTypeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.logic.business.automation.efs.imc.com/", name = "getRequestTypeResponse")
    public JAXBElement<GetRequestTypeResponse> createGetRequestTypeResponse(GetRequestTypeResponse value) {
        return new JAXBElement<GetRequestTypeResponse>(_GetRequestTypeResponse_QNAME, GetRequestTypeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendIssuanceEmail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.logic.business.automation.efs.imc.com/", name = "sendIssuanceEmail")
    public JAXBElement<SendIssuanceEmail> createSendIssuanceEmail(SendIssuanceEmail value) {
        return new JAXBElement<SendIssuanceEmail>(_SendIssuanceEmail_QNAME, SendIssuanceEmail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidateIsNotDuplicateRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.logic.business.automation.efs.imc.com/", name = "validateIsNotDuplicateRequest")
    public JAXBElement<ValidateIsNotDuplicateRequest> createValidateIsNotDuplicateRequest(ValidateIsNotDuplicateRequest value) {
        return new JAXBElement<ValidateIsNotDuplicateRequest>(_ValidateIsNotDuplicateRequest_QNAME, ValidateIsNotDuplicateRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUsersEfsCheckLimit }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.logic.business.automation.efs.imc.com/", name = "getUsersEfsCheckLimit")
    public JAXBElement<GetUsersEfsCheckLimit> createGetUsersEfsCheckLimit(GetUsersEfsCheckLimit value) {
        return new JAXBElement<GetUsersEfsCheckLimit>(_GetUsersEfsCheckLimit_QNAME, GetUsersEfsCheckLimit.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.logic.business.automation.efs.imc.com/", name = "updateRequest")
    public JAXBElement<UpdateRequest> createUpdateRequest(UpdateRequest value) {
        return new JAXBElement<UpdateRequest>(_UpdateRequest_QNAME, UpdateRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMoneyCodeDetails }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.logic.business.automation.efs.imc.com/", name = "GetMoneyCodeDetails")
    public JAXBElement<GetMoneyCodeDetails> createGetMoneyCodeDetails(GetMoneyCodeDetails value) {
        return new JAXBElement<GetMoneyCodeDetails>(_GetMoneyCodeDetails_QNAME, GetMoneyCodeDetails.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateIssueDocResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.logic.business.automation.efs.imc.com/", name = "createIssueDocResponse")
    public JAXBElement<CreateIssueDocResponse> createCreateIssueDocResponse(CreateIssueDocResponse value) {
        return new JAXBElement<CreateIssueDocResponse>(_CreateIssueDocResponse_QNAME, CreateIssueDocResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRequestResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.logic.business.automation.efs.imc.com/", name = "getRequestResponse")
    public JAXBElement<GetRequestResponse> createGetRequestResponse(GetRequestResponse value) {
        return new JAXBElement<GetRequestResponse>(_GetRequestResponse_QNAME, GetRequestResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendIssuanceEmailResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.logic.business.automation.efs.imc.com/", name = "sendIssuanceEmailResponse")
    public JAXBElement<SendIssuanceEmailResponse> createSendIssuanceEmailResponse(SendIssuanceEmailResponse value) {
        return new JAXBElement<SendIssuanceEmailResponse>(_SendIssuanceEmailResponse_QNAME, SendIssuanceEmailResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.logic.business.automation.efs.imc.com/", name = "getRequest")
    public JAXBElement<GetRequest> createGetRequest(GetRequest value) {
        return new JAXBElement<GetRequest>(_GetRequest_QNAME, GetRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateIssueDoc }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.logic.business.automation.efs.imc.com/", name = "createIssueDoc")
    public JAXBElement<CreateIssueDoc> createCreateIssueDoc(CreateIssueDoc value) {
        return new JAXBElement<CreateIssueDoc>(_CreateIssueDoc_QNAME, CreateIssueDoc.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidateRequestInputAgainstConfigResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.logic.business.automation.efs.imc.com/", name = "validateRequestInputAgainstConfigResponse")
    public JAXBElement<ValidateRequestInputAgainstConfigResponse> createValidateRequestInputAgainstConfigResponse(ValidateRequestInputAgainstConfigResponse value) {
        return new JAXBElement<ValidateRequestInputAgainstConfigResponse>(_ValidateRequestInputAgainstConfigResponse_QNAME, ValidateRequestInputAgainstConfigResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Exception }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.logic.business.automation.efs.imc.com/", name = "Exception")
    public JAXBElement<Exception> createException(Exception value) {
        return new JAXBElement<Exception>(_Exception_QNAME, Exception.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidateRequestInputAgainstConfig }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.logic.business.automation.efs.imc.com/", name = "validateRequestInputAgainstConfig")
    public JAXBElement<ValidateRequestInputAgainstConfig> createValidateRequestInputAgainstConfig(ValidateRequestInputAgainstConfig value) {
        return new JAXBElement<ValidateRequestInputAgainstConfig>(_ValidateRequestInputAgainstConfig_QNAME, ValidateRequestInputAgainstConfig.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EfsMoneyCode }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.logic.business.automation.efs.imc.com/", name = "EfsMoneyCode")
    public JAXBElement<EfsMoneyCode> createEfsMoneyCode(EfsMoneyCode value) {
        return new JAXBElement<EfsMoneyCode>(_EfsMoneyCode_QNAME, EfsMoneyCode.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StoreDocuments }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.logic.business.automation.efs.imc.com/", name = "storeDocuments")
    public JAXBElement<StoreDocuments> createStoreDocuments(StoreDocuments value) {
        return new JAXBElement<StoreDocuments>(_StoreDocuments_QNAME, StoreDocuments.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUsersEfsCheckLimitResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.logic.business.automation.efs.imc.com/", name = "getUsersEfsCheckLimitResponse")
    public JAXBElement<GetUsersEfsCheckLimitResponse> createGetUsersEfsCheckLimitResponse(GetUsersEfsCheckLimitResponse value) {
        return new JAXBElement<GetUsersEfsCheckLimitResponse>(_GetUsersEfsCheckLimitResponse_QNAME, GetUsersEfsCheckLimitResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendApprovalRequestEmailResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.logic.business.automation.efs.imc.com/", name = "sendApprovalRequestEmailResponse")
    public JAXBElement<SendApprovalRequestEmailResponse> createSendApprovalRequestEmailResponse(SendApprovalRequestEmailResponse value) {
        return new JAXBElement<SendApprovalRequestEmailResponse>(_SendApprovalRequestEmailResponse_QNAME, SendApprovalRequestEmailResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidateCredentialsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.logic.business.automation.efs.imc.com/", name = "validateCredentialsResponse")
    public JAXBElement<ValidateCredentialsResponse> createValidateCredentialsResponse(ValidateCredentialsResponse value) {
        return new JAXBElement<ValidateCredentialsResponse>(_ValidateCredentialsResponse_QNAME, ValidateCredentialsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidateHasInvoiceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.logic.business.automation.efs.imc.com/", name = "validateHasInvoiceResponse")
    public JAXBElement<ValidateHasInvoiceResponse> createValidateHasInvoiceResponse(ValidateHasInvoiceResponse value) {
        return new JAXBElement<ValidateHasInvoiceResponse>(_ValidateHasInvoiceResponse_QNAME, ValidateHasInvoiceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidateHasInvoice }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.logic.business.automation.efs.imc.com/", name = "validateHasInvoice")
    public JAXBElement<ValidateHasInvoice> createValidateHasInvoice(ValidateHasInvoice value) {
        return new JAXBElement<ValidateHasInvoice>(_ValidateHasInvoice_QNAME, ValidateHasInvoice.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FileUpload }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.logic.business.automation.efs.imc.com/", name = "FileUpload")
    public JAXBElement<FileUpload> createFileUpload(FileUpload value) {
        return new JAXBElement<FileUpload>(_FileUpload_QNAME, FileUpload.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ToRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.logic.business.automation.efs.imc.com/", name = "toRequest")
    public JAXBElement<ToRequest> createToRequest(ToRequest value) {
        return new JAXBElement<ToRequest>(_ToRequest_QNAME, ToRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidateIsNotDuplicateRequestResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.logic.business.automation.efs.imc.com/", name = "validateIsNotDuplicateRequestResponse")
    public JAXBElement<ValidateIsNotDuplicateRequestResponse> createValidateIsNotDuplicateRequestResponse(ValidateIsNotDuplicateRequestResponse value) {
        return new JAXBElement<ValidateIsNotDuplicateRequestResponse>(_ValidateIsNotDuplicateRequestResponse_QNAME, ValidateIsNotDuplicateRequestResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IssueMoneyCode }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.logic.business.automation.efs.imc.com/", name = "IssueMoneyCode")
    public JAXBElement<IssueMoneyCode> createIssueMoneyCode(IssueMoneyCode value) {
        return new JAXBElement<IssueMoneyCode>(_IssueMoneyCode_QNAME, IssueMoneyCode.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EfsCheckRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.logic.business.automation.efs.imc.com/", name = "EfsCheckRequest")
    public JAXBElement<EfsCheckRequest> createEfsCheckRequest(EfsCheckRequest value) {
        return new JAXBElement<EfsCheckRequest>(_EfsCheckRequest_QNAME, EfsCheckRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateIssuanceTransactionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.logic.business.automation.efs.imc.com/", name = "createIssuanceTransactionResponse")
    public JAXBElement<CreateIssuanceTransactionResponse> createCreateIssuanceTransactionResponse(CreateIssuanceTransactionResponse value) {
        return new JAXBElement<CreateIssuanceTransactionResponse>(_CreateIssuanceTransactionResponse_QNAME, CreateIssuanceTransactionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveRequestResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.logic.business.automation.efs.imc.com/", name = "saveRequestResponse")
    public JAXBElement<SaveRequestResponse> createSaveRequestResponse(SaveRequestResponse value) {
        return new JAXBElement<SaveRequestResponse>(_SaveRequestResponse_QNAME, SaveRequestResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.logic.business.automation.efs.imc.com/", name = "getRequestType")
    public JAXBElement<GetRequestType> createGetRequestType(GetRequestType value) {
        return new JAXBElement<GetRequestType>(_GetRequestType_QNAME, GetRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateIssuanceTransaction }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.logic.business.automation.efs.imc.com/", name = "createIssuanceTransaction")
    public JAXBElement<CreateIssuanceTransaction> createCreateIssuanceTransaction(CreateIssuanceTransaction value) {
        return new JAXBElement<CreateIssuanceTransaction>(_CreateIssuanceTransaction_QNAME, CreateIssuanceTransaction.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetIssuedRequests }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.logic.business.automation.efs.imc.com/", name = "getIssuedRequests")
    public JAXBElement<GetIssuedRequests> createGetIssuedRequests(GetIssuedRequests value) {
        return new JAXBElement<GetIssuedRequests>(_GetIssuedRequests_QNAME, GetIssuedRequests.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateRequestResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.logic.business.automation.efs.imc.com/", name = "updateRequestResponse")
    public JAXBElement<UpdateRequestResponse> createUpdateRequestResponse(UpdateRequestResponse value) {
        return new JAXBElement<UpdateRequestResponse>(_UpdateRequestResponse_QNAME, UpdateRequestResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ToRequestResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.logic.business.automation.efs.imc.com/", name = "toRequestResponse")
    public JAXBElement<ToRequestResponse> createToRequestResponse(ToRequestResponse value) {
        return new JAXBElement<ToRequestResponse>(_ToRequestResponse_QNAME, ToRequestResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.logic.business.automation.efs.imc.com/", name = "saveRequest")
    public JAXBElement<SaveRequest> createSaveRequest(SaveRequest value) {
        return new JAXBElement<SaveRequest>(_SaveRequest_QNAME, SaveRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReleaseAPHoldResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.logic.business.automation.efs.imc.com/", name = "releaseAPHoldResponse")
    public JAXBElement<ReleaseAPHoldResponse> createReleaseAPHoldResponse(ReleaseAPHoldResponse value) {
        return new JAXBElement<ReleaseAPHoldResponse>(_ReleaseAPHoldResponse_QNAME, ReleaseAPHoldResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetStatusResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.logic.business.automation.efs.imc.com/", name = "getStatusResponse")
    public JAXBElement<GetStatusResponse> createGetStatusResponse(GetStatusResponse value) {
        return new JAXBElement<GetStatusResponse>(_GetStatusResponse_QNAME, GetStatusResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IssueMoneyCodeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.logic.business.automation.efs.imc.com/", name = "IssueMoneyCodeResponse")
    public JAXBElement<IssueMoneyCodeResponse> createIssueMoneyCodeResponse(IssueMoneyCodeResponse value) {
        return new JAXBElement<IssueMoneyCodeResponse>(_IssueMoneyCodeResponse_QNAME, IssueMoneyCodeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.logic.business.automation.efs.imc.com/", name = "getStatus")
    public JAXBElement<GetStatus> createGetStatus(GetStatus value) {
        return new JAXBElement<GetStatus>(_GetStatus_QNAME, GetStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetIssuedRequestsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.logic.business.automation.efs.imc.com/", name = "getIssuedRequestsResponse")
    public JAXBElement<GetIssuedRequestsResponse> createGetIssuedRequestsResponse(GetIssuedRequestsResponse value) {
        return new JAXBElement<GetIssuedRequestsResponse>(_GetIssuedRequestsResponse_QNAME, GetIssuedRequestsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidateCredentials }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.logic.business.automation.efs.imc.com/", name = "validateCredentials")
    public JAXBElement<ValidateCredentials> createValidateCredentials(ValidateCredentials value) {
        return new JAXBElement<ValidateCredentials>(_ValidateCredentials_QNAME, ValidateCredentials.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReleaseAPHold }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.logic.business.automation.efs.imc.com/", name = "releaseAPHold")
    public JAXBElement<ReleaseAPHold> createReleaseAPHold(ReleaseAPHold value) {
        return new JAXBElement<ReleaseAPHold>(_ReleaseAPHold_QNAME, ReleaseAPHold.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StoreDocumentsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.logic.business.automation.efs.imc.com/", name = "storeDocumentsResponse")
    public JAXBElement<StoreDocumentsResponse> createStoreDocumentsResponse(StoreDocumentsResponse value) {
        return new JAXBElement<StoreDocumentsResponse>(_StoreDocumentsResponse_QNAME, StoreDocumentsResponse.class, null, value);
    }

}
