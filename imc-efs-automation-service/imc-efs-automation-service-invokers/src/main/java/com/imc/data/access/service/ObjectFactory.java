
package com.imc.data.access.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

import com.imc.efs.automation.dto.CredentialsDTO;
import com.imc.efs.automation.dto.GpIntegrationDTO;
import com.imc.efs.automation.entities.Requests;
import com.imc.efs.automation.entities.Requesttypes;
import com.imc.efs.automation.entities.Status;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.imc.data.access.service package. 
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

    private final static QName _AddRequest_QNAME = new QName("http://ws.access.data.automation.efs.imc.com/", "addRequest");
    private final static QName _AddRequestResponse_QNAME = new QName("http://ws.access.data.automation.efs.imc.com/", "addRequestResponse");
    private final static QName _ReleaseAPHold_QNAME = new QName("http://ws.access.data.automation.efs.imc.com/", "releaseAPHold");
    private final static QName _ExecuteRecievedIntegrations_QNAME = new QName("http://ws.access.data.automation.efs.imc.com/", "executeRecievedIntegrations");
    private final static QName _GetEfsGpVendorIdByCompany_QNAME = new QName("http://ws.access.data.automation.efs.imc.com/", "getEfsGpVendorIdByCompany");
    private final static QName _GetStatus_QNAME = new QName("http://ws.access.data.automation.efs.imc.com/", "getStatus");
    private final static QName _CheckIfFirstTimeVendorResponse_QNAME = new QName("http://ws.access.data.automation.efs.imc.com/", "checkIfFirstTimeVendorResponse");
    private final static QName _GetStatusResponse_QNAME = new QName("http://ws.access.data.automation.efs.imc.com/", "getStatusResponse");
    private final static QName _ReleaseAPHoldResponse_QNAME = new QName("http://ws.access.data.automation.efs.imc.com/", "releaseAPHoldResponse");
    private final static QName _ReturnRequestWithReferenceResponse_QNAME = new QName("http://ws.access.data.automation.efs.imc.com/", "returnRequestWithReferenceResponse");
    private final static QName _GetDivisionByDriverIdResponse_QNAME = new QName("http://ws.access.data.automation.efs.imc.com/", "getDivisionByDriverIdResponse");
    private final static QName _GetRequestsOfStatusIssuedResponse_QNAME = new QName("http://ws.access.data.automation.efs.imc.com/", "getRequestsOfStatusIssuedResponse");
    private final static QName _IntegrateIssuanceResponse_QNAME = new QName("http://ws.access.data.automation.efs.imc.com/", "integrateIssuanceResponse");
    private final static QName _GetRequestsById_QNAME = new QName("http://ws.access.data.automation.efs.imc.com/", "getRequestsById");
    private final static QName _UpdateRequestResponse_QNAME = new QName("http://ws.access.data.automation.efs.imc.com/", "updateRequestResponse");
    private final static QName _GetRequestTypeById_QNAME = new QName("http://ws.access.data.automation.efs.imc.com/", "getRequestTypeById");
    private final static QName _GetEncryptedCredentialsResponse_QNAME = new QName("http://ws.access.data.automation.efs.imc.com/", "GetEncryptedCredentialsResponse");
    private final static QName _SaveDocument_QNAME = new QName("http://ws.access.data.automation.efs.imc.com/", "saveDocument");
    private final static QName _AddAndReturnRequestWithReferencesResponse_QNAME = new QName("http://ws.access.data.automation.efs.imc.com/", "addAndReturnRequestWithReferencesResponse");
    private final static QName _GetRequestsByIdResponse_QNAME = new QName("http://ws.access.data.automation.efs.imc.com/", "getRequestsByIdResponse");
    private final static QName _GetUsersEfsCheckLimitResponse_QNAME = new QName("http://ws.access.data.automation.efs.imc.com/", "getUsersEfsCheckLimitResponse");
    private final static QName _IntegrateIssuance_QNAME = new QName("http://ws.access.data.automation.efs.imc.com/", "integrateIssuance");
    private final static QName _ReturnRequestWithReference_QNAME = new QName("http://ws.access.data.automation.efs.imc.com/", "returnRequestWithReference");
    private final static QName _GetEfsCheckLimitByUser_QNAME = new QName("http://ws.access.data.automation.efs.imc.com/", "getEfsCheckLimitByUser");
    private final static QName _GetRequestTypeByIdResponse_QNAME = new QName("http://ws.access.data.automation.efs.imc.com/", "getRequestTypeByIdResponse");
    private final static QName _ExecuteRecievedIntegrationsResponse_QNAME = new QName("http://ws.access.data.automation.efs.imc.com/", "executeRecievedIntegrationsResponse");
    private final static QName _CheckIfQualifiedVendor_QNAME = new QName("http://ws.access.data.automation.efs.imc.com/", "checkIfQualifiedVendor");
    private final static QName _Exception_QNAME = new QName("http://ws.access.data.automation.efs.imc.com/", "Exception");
    private final static QName _GetEfsGpVendorIdByCompanyResponse_QNAME = new QName("http://ws.access.data.automation.efs.imc.com/", "getEfsGpVendorIdByCompanyResponse");
    private final static QName _GetDocumentFilePathsByRequestId_QNAME = new QName("http://ws.access.data.automation.efs.imc.com/", "getDocumentFilePathsByRequestId");
    private final static QName _SaveDocumentResponse_QNAME = new QName("http://ws.access.data.automation.efs.imc.com/", "saveDocumentResponse");
    private final static QName _CheckIfDuplicateRequestResponse_QNAME = new QName("http://ws.access.data.automation.efs.imc.com/", "checkIfDuplicateRequestResponse");
    private final static QName _GetEfsCheckLimitByUserResponse_QNAME = new QName("http://ws.access.data.automation.efs.imc.com/", "getEfsCheckLimitByUserResponse");
    private final static QName _CheckIfDuplicateRequest_QNAME = new QName("http://ws.access.data.automation.efs.imc.com/", "checkIfDuplicateRequest");
    private final static QName _UpdateRequest_QNAME = new QName("http://ws.access.data.automation.efs.imc.com/", "updateRequest");
    private final static QName _UpdateAndReturnRequestWithReferenceResponse_QNAME = new QName("http://ws.access.data.automation.efs.imc.com/", "updateAndReturnRequestWithReferenceResponse");
    private final static QName _GetDocumentFilePathsByRequestIdResponse_QNAME = new QName("http://ws.access.data.automation.efs.imc.com/", "getDocumentFilePathsByRequestIdResponse");
    private final static QName _CheckIfQualifiedVendorResponse_QNAME = new QName("http://ws.access.data.automation.efs.imc.com/", "checkIfQualifiedVendorResponse");
    private final static QName _GetUsersEfsCheckLimit_QNAME = new QName("http://ws.access.data.automation.efs.imc.com/", "getUsersEfsCheckLimit");
    private final static QName _GetRequestsOfStatusIssued_QNAME = new QName("http://ws.access.data.automation.efs.imc.com/", "getRequestsOfStatusIssued");
    private final static QName _GetDivisionByDriverId_QNAME = new QName("http://ws.access.data.automation.efs.imc.com/", "getDivisionByDriverId");
    private final static QName _GetEncryptedCredentials_QNAME = new QName("http://ws.access.data.automation.efs.imc.com/", "GetEncryptedCredentials");
    private final static QName _UpdateAndReturnRequestWithReference_QNAME = new QName("http://ws.access.data.automation.efs.imc.com/", "updateAndReturnRequestWithReference");
    private final static QName _AddAndReturnRequestWithReferences_QNAME = new QName("http://ws.access.data.automation.efs.imc.com/", "addAndReturnRequestWithReferences");
    private final static QName _CheckIfFirstTimeVendor_QNAME = new QName("http://ws.access.data.automation.efs.imc.com/", "checkIfFirstTimeVendor");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.imc.data.access.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Exception }
     * 
     */
    public Exception createException() {
        return new Exception();
    }

    /**
     * Create an instance of {@link GetEfsCheckLimitByUser }
     * 
     */
    public GetEfsCheckLimitByUser createGetEfsCheckLimitByUser() {
        return new GetEfsCheckLimitByUser();
    }

    /**
     * Create an instance of {@link ExecuteRecievedIntegrationsResponse }
     * 
     */
    public ExecuteRecievedIntegrationsResponse createExecuteRecievedIntegrationsResponse() {
        return new ExecuteRecievedIntegrationsResponse();
    }

    /**
     * Create an instance of {@link GetRequestTypeByIdResponse }
     * 
     */
    public GetRequestTypeByIdResponse createGetRequestTypeByIdResponse() {
        return new GetRequestTypeByIdResponse();
    }

    /**
     * Create an instance of {@link CheckIfQualifiedVendor }
     * 
     */
    public CheckIfQualifiedVendor createCheckIfQualifiedVendor() {
        return new CheckIfQualifiedVendor();
    }

    /**
     * Create an instance of {@link ReturnRequestWithReference }
     * 
     */
    public ReturnRequestWithReference createReturnRequestWithReference() {
        return new ReturnRequestWithReference();
    }

    /**
     * Create an instance of {@link GetRequestsByIdResponse }
     * 
     */
    public GetRequestsByIdResponse createGetRequestsByIdResponse() {
        return new GetRequestsByIdResponse();
    }

    /**
     * Create an instance of {@link GetUsersEfsCheckLimitResponse }
     * 
     */
    public GetUsersEfsCheckLimitResponse createGetUsersEfsCheckLimitResponse() {
        return new GetUsersEfsCheckLimitResponse();
    }

    /**
     * Create an instance of {@link IntegrateIssuance }
     * 
     */
    public IntegrateIssuance createIntegrateIssuance() {
        return new IntegrateIssuance();
    }

    /**
     * Create an instance of {@link UpdateAndReturnRequestWithReference }
     * 
     */
    public UpdateAndReturnRequestWithReference createUpdateAndReturnRequestWithReference() {
        return new UpdateAndReturnRequestWithReference();
    }

    /**
     * Create an instance of {@link CheckIfFirstTimeVendor }
     * 
     */
    public CheckIfFirstTimeVendor createCheckIfFirstTimeVendor() {
        return new CheckIfFirstTimeVendor();
    }

    /**
     * Create an instance of {@link AddAndReturnRequestWithReferences }
     * 
     */
    public AddAndReturnRequestWithReferences createAddAndReturnRequestWithReferences() {
        return new AddAndReturnRequestWithReferences();
    }

    /**
     * Create an instance of {@link GetUsersEfsCheckLimit }
     * 
     */
    public GetUsersEfsCheckLimit createGetUsersEfsCheckLimit() {
        return new GetUsersEfsCheckLimit();
    }

    /**
     * Create an instance of {@link GetRequestsOfStatusIssued }
     * 
     */
    public GetRequestsOfStatusIssued createGetRequestsOfStatusIssued() {
        return new GetRequestsOfStatusIssued();
    }

    /**
     * Create an instance of {@link GetDivisionByDriverId }
     * 
     */
    public GetDivisionByDriverId createGetDivisionByDriverId() {
        return new GetDivisionByDriverId();
    }

    /**
     * Create an instance of {@link GetEncryptedCredentials }
     * 
     */
    public GetEncryptedCredentials createGetEncryptedCredentials() {
        return new GetEncryptedCredentials();
    }

    /**
     * Create an instance of {@link CheckIfDuplicateRequestResponse }
     * 
     */
    public CheckIfDuplicateRequestResponse createCheckIfDuplicateRequestResponse() {
        return new CheckIfDuplicateRequestResponse();
    }

    /**
     * Create an instance of {@link GetEfsCheckLimitByUserResponse }
     * 
     */
    public GetEfsCheckLimitByUserResponse createGetEfsCheckLimitByUserResponse() {
        return new GetEfsCheckLimitByUserResponse();
    }

    /**
     * Create an instance of {@link CheckIfDuplicateRequest }
     * 
     */
    public CheckIfDuplicateRequest createCheckIfDuplicateRequest() {
        return new CheckIfDuplicateRequest();
    }

    /**
     * Create an instance of {@link UpdateRequest }
     * 
     */
    public UpdateRequest createUpdateRequest() {
        return new UpdateRequest();
    }

    /**
     * Create an instance of {@link UpdateAndReturnRequestWithReferenceResponse }
     * 
     */
    public UpdateAndReturnRequestWithReferenceResponse createUpdateAndReturnRequestWithReferenceResponse() {
        return new UpdateAndReturnRequestWithReferenceResponse();
    }

    /**
     * Create an instance of {@link GetDocumentFilePathsByRequestIdResponse }
     * 
     */
    public GetDocumentFilePathsByRequestIdResponse createGetDocumentFilePathsByRequestIdResponse() {
        return new GetDocumentFilePathsByRequestIdResponse();
    }

    /**
     * Create an instance of {@link CheckIfQualifiedVendorResponse }
     * 
     */
    public CheckIfQualifiedVendorResponse createCheckIfQualifiedVendorResponse() {
        return new CheckIfQualifiedVendorResponse();
    }

    /**
     * Create an instance of {@link SaveDocumentResponse }
     * 
     */
    public SaveDocumentResponse createSaveDocumentResponse() {
        return new SaveDocumentResponse();
    }

    /**
     * Create an instance of {@link GetDocumentFilePathsByRequestId }
     * 
     */
    public GetDocumentFilePathsByRequestId createGetDocumentFilePathsByRequestId() {
        return new GetDocumentFilePathsByRequestId();
    }

    /**
     * Create an instance of {@link GetEfsGpVendorIdByCompanyResponse }
     * 
     */
    public GetEfsGpVendorIdByCompanyResponse createGetEfsGpVendorIdByCompanyResponse() {
        return new GetEfsGpVendorIdByCompanyResponse();
    }

    /**
     * Create an instance of {@link GetStatus }
     * 
     */
    public GetStatus createGetStatus() {
        return new GetStatus();
    }

    /**
     * Create an instance of {@link GetEfsGpVendorIdByCompany }
     * 
     */
    public GetEfsGpVendorIdByCompany createGetEfsGpVendorIdByCompany() {
        return new GetEfsGpVendorIdByCompany();
    }

    /**
     * Create an instance of {@link ReturnRequestWithReferenceResponse }
     * 
     */
    public ReturnRequestWithReferenceResponse createReturnRequestWithReferenceResponse() {
        return new ReturnRequestWithReferenceResponse();
    }

    /**
     * Create an instance of {@link ReleaseAPHoldResponse }
     * 
     */
    public ReleaseAPHoldResponse createReleaseAPHoldResponse() {
        return new ReleaseAPHoldResponse();
    }

    /**
     * Create an instance of {@link GetStatusResponse }
     * 
     */
    public GetStatusResponse createGetStatusResponse() {
        return new GetStatusResponse();
    }

    /**
     * Create an instance of {@link CheckIfFirstTimeVendorResponse }
     * 
     */
    public CheckIfFirstTimeVendorResponse createCheckIfFirstTimeVendorResponse() {
        return new CheckIfFirstTimeVendorResponse();
    }

    /**
     * Create an instance of {@link ExecuteRecievedIntegrations }
     * 
     */
    public ExecuteRecievedIntegrations createExecuteRecievedIntegrations() {
        return new ExecuteRecievedIntegrations();
    }

    /**
     * Create an instance of {@link AddRequestResponse }
     * 
     */
    public AddRequestResponse createAddRequestResponse() {
        return new AddRequestResponse();
    }

    /**
     * Create an instance of {@link AddRequest }
     * 
     */
    public AddRequest createAddRequest() {
        return new AddRequest();
    }

    /**
     * Create an instance of {@link ReleaseAPHold }
     * 
     */
    public ReleaseAPHold createReleaseAPHold() {
        return new ReleaseAPHold();
    }

    /**
     * Create an instance of {@link GetRequestTypeById }
     * 
     */
    public GetRequestTypeById createGetRequestTypeById() {
        return new GetRequestTypeById();
    }

    /**
     * Create an instance of {@link SaveDocument }
     * 
     */
    public SaveDocument createSaveDocument() {
        return new SaveDocument();
    }

    /**
     * Create an instance of {@link GetEncryptedCredentialsResponse }
     * 
     */
    public GetEncryptedCredentialsResponse createGetEncryptedCredentialsResponse() {
        return new GetEncryptedCredentialsResponse();
    }

    /**
     * Create an instance of {@link AddAndReturnRequestWithReferencesResponse }
     * 
     */
    public AddAndReturnRequestWithReferencesResponse createAddAndReturnRequestWithReferencesResponse() {
        return new AddAndReturnRequestWithReferencesResponse();
    }

    /**
     * Create an instance of {@link GetRequestsOfStatusIssuedResponse }
     * 
     */
    public GetRequestsOfStatusIssuedResponse createGetRequestsOfStatusIssuedResponse() {
        return new GetRequestsOfStatusIssuedResponse();
    }

    /**
     * Create an instance of {@link IntegrateIssuanceResponse }
     * 
     */
    public IntegrateIssuanceResponse createIntegrateIssuanceResponse() {
        return new IntegrateIssuanceResponse();
    }

    /**
     * Create an instance of {@link GetRequestsById }
     * 
     */
    public GetRequestsById createGetRequestsById() {
        return new GetRequestsById();
    }

    /**
     * Create an instance of {@link UpdateRequestResponse }
     * 
     */
    public UpdateRequestResponse createUpdateRequestResponse() {
        return new UpdateRequestResponse();
    }

    /**
     * Create an instance of {@link GetDivisionByDriverIdResponse }
     * 
     */
    public GetDivisionByDriverIdResponse createGetDivisionByDriverIdResponse() {
        return new GetDivisionByDriverIdResponse();
    }

    /**
     * Create an instance of {@link Requests }
     * 
     */
    public Requests createRequests() {
        return new Requests();
    }

    /**
     * Create an instance of {@link Status }
     * 
     */
    public Status createStatus() {
        return new Status();
    }

    /**
     * Create an instance of {@link CredentialsDTO }
     * 
     */
    public CredentialsDTO createCredentialsDTO() {
        return new CredentialsDTO();
    }

    /**
     * Create an instance of {@link GpIntegrationDTO }
     * 
     */
    public GpIntegrationDTO createGpIntegrationDTO() {
        return new GpIntegrationDTO();
    }

    /**
     * Create an instance of {@link Requesttypes }
     * 
     */
    public Requesttypes createRequesttypes() {
        return new Requesttypes();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.access.data.automation.efs.imc.com/", name = "addRequest")
    public JAXBElement<AddRequest> createAddRequest(AddRequest value) {
        return new JAXBElement<AddRequest>(_AddRequest_QNAME, AddRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddRequestResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.access.data.automation.efs.imc.com/", name = "addRequestResponse")
    public JAXBElement<AddRequestResponse> createAddRequestResponse(AddRequestResponse value) {
        return new JAXBElement<AddRequestResponse>(_AddRequestResponse_QNAME, AddRequestResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReleaseAPHold }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.access.data.automation.efs.imc.com/", name = "releaseAPHold")
    public JAXBElement<ReleaseAPHold> createReleaseAPHold(ReleaseAPHold value) {
        return new JAXBElement<ReleaseAPHold>(_ReleaseAPHold_QNAME, ReleaseAPHold.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExecuteRecievedIntegrations }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.access.data.automation.efs.imc.com/", name = "executeRecievedIntegrations")
    public JAXBElement<ExecuteRecievedIntegrations> createExecuteRecievedIntegrations(ExecuteRecievedIntegrations value) {
        return new JAXBElement<ExecuteRecievedIntegrations>(_ExecuteRecievedIntegrations_QNAME, ExecuteRecievedIntegrations.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEfsGpVendorIdByCompany }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.access.data.automation.efs.imc.com/", name = "getEfsGpVendorIdByCompany")
    public JAXBElement<GetEfsGpVendorIdByCompany> createGetEfsGpVendorIdByCompany(GetEfsGpVendorIdByCompany value) {
        return new JAXBElement<GetEfsGpVendorIdByCompany>(_GetEfsGpVendorIdByCompany_QNAME, GetEfsGpVendorIdByCompany.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.access.data.automation.efs.imc.com/", name = "getStatus")
    public JAXBElement<GetStatus> createGetStatus(GetStatus value) {
        return new JAXBElement<GetStatus>(_GetStatus_QNAME, GetStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckIfFirstTimeVendorResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.access.data.automation.efs.imc.com/", name = "checkIfFirstTimeVendorResponse")
    public JAXBElement<CheckIfFirstTimeVendorResponse> createCheckIfFirstTimeVendorResponse(CheckIfFirstTimeVendorResponse value) {
        return new JAXBElement<CheckIfFirstTimeVendorResponse>(_CheckIfFirstTimeVendorResponse_QNAME, CheckIfFirstTimeVendorResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetStatusResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.access.data.automation.efs.imc.com/", name = "getStatusResponse")
    public JAXBElement<GetStatusResponse> createGetStatusResponse(GetStatusResponse value) {
        return new JAXBElement<GetStatusResponse>(_GetStatusResponse_QNAME, GetStatusResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReleaseAPHoldResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.access.data.automation.efs.imc.com/", name = "releaseAPHoldResponse")
    public JAXBElement<ReleaseAPHoldResponse> createReleaseAPHoldResponse(ReleaseAPHoldResponse value) {
        return new JAXBElement<ReleaseAPHoldResponse>(_ReleaseAPHoldResponse_QNAME, ReleaseAPHoldResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReturnRequestWithReferenceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.access.data.automation.efs.imc.com/", name = "returnRequestWithReferenceResponse")
    public JAXBElement<ReturnRequestWithReferenceResponse> createReturnRequestWithReferenceResponse(ReturnRequestWithReferenceResponse value) {
        return new JAXBElement<ReturnRequestWithReferenceResponse>(_ReturnRequestWithReferenceResponse_QNAME, ReturnRequestWithReferenceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDivisionByDriverIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.access.data.automation.efs.imc.com/", name = "getDivisionByDriverIdResponse")
    public JAXBElement<GetDivisionByDriverIdResponse> createGetDivisionByDriverIdResponse(GetDivisionByDriverIdResponse value) {
        return new JAXBElement<GetDivisionByDriverIdResponse>(_GetDivisionByDriverIdResponse_QNAME, GetDivisionByDriverIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRequestsOfStatusIssuedResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.access.data.automation.efs.imc.com/", name = "getRequestsOfStatusIssuedResponse")
    public JAXBElement<GetRequestsOfStatusIssuedResponse> createGetRequestsOfStatusIssuedResponse(GetRequestsOfStatusIssuedResponse value) {
        return new JAXBElement<GetRequestsOfStatusIssuedResponse>(_GetRequestsOfStatusIssuedResponse_QNAME, GetRequestsOfStatusIssuedResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IntegrateIssuanceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.access.data.automation.efs.imc.com/", name = "integrateIssuanceResponse")
    public JAXBElement<IntegrateIssuanceResponse> createIntegrateIssuanceResponse(IntegrateIssuanceResponse value) {
        return new JAXBElement<IntegrateIssuanceResponse>(_IntegrateIssuanceResponse_QNAME, IntegrateIssuanceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRequestsById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.access.data.automation.efs.imc.com/", name = "getRequestsById")
    public JAXBElement<GetRequestsById> createGetRequestsById(GetRequestsById value) {
        return new JAXBElement<GetRequestsById>(_GetRequestsById_QNAME, GetRequestsById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateRequestResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.access.data.automation.efs.imc.com/", name = "updateRequestResponse")
    public JAXBElement<UpdateRequestResponse> createUpdateRequestResponse(UpdateRequestResponse value) {
        return new JAXBElement<UpdateRequestResponse>(_UpdateRequestResponse_QNAME, UpdateRequestResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRequestTypeById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.access.data.automation.efs.imc.com/", name = "getRequestTypeById")
    public JAXBElement<GetRequestTypeById> createGetRequestTypeById(GetRequestTypeById value) {
        return new JAXBElement<GetRequestTypeById>(_GetRequestTypeById_QNAME, GetRequestTypeById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEncryptedCredentialsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.access.data.automation.efs.imc.com/", name = "GetEncryptedCredentialsResponse")
    public JAXBElement<GetEncryptedCredentialsResponse> createGetEncryptedCredentialsResponse(GetEncryptedCredentialsResponse value) {
        return new JAXBElement<GetEncryptedCredentialsResponse>(_GetEncryptedCredentialsResponse_QNAME, GetEncryptedCredentialsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveDocument }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.access.data.automation.efs.imc.com/", name = "saveDocument")
    public JAXBElement<SaveDocument> createSaveDocument(SaveDocument value) {
        return new JAXBElement<SaveDocument>(_SaveDocument_QNAME, SaveDocument.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddAndReturnRequestWithReferencesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.access.data.automation.efs.imc.com/", name = "addAndReturnRequestWithReferencesResponse")
    public JAXBElement<AddAndReturnRequestWithReferencesResponse> createAddAndReturnRequestWithReferencesResponse(AddAndReturnRequestWithReferencesResponse value) {
        return new JAXBElement<AddAndReturnRequestWithReferencesResponse>(_AddAndReturnRequestWithReferencesResponse_QNAME, AddAndReturnRequestWithReferencesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRequestsByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.access.data.automation.efs.imc.com/", name = "getRequestsByIdResponse")
    public JAXBElement<GetRequestsByIdResponse> createGetRequestsByIdResponse(GetRequestsByIdResponse value) {
        return new JAXBElement<GetRequestsByIdResponse>(_GetRequestsByIdResponse_QNAME, GetRequestsByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUsersEfsCheckLimitResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.access.data.automation.efs.imc.com/", name = "getUsersEfsCheckLimitResponse")
    public JAXBElement<GetUsersEfsCheckLimitResponse> createGetUsersEfsCheckLimitResponse(GetUsersEfsCheckLimitResponse value) {
        return new JAXBElement<GetUsersEfsCheckLimitResponse>(_GetUsersEfsCheckLimitResponse_QNAME, GetUsersEfsCheckLimitResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IntegrateIssuance }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.access.data.automation.efs.imc.com/", name = "integrateIssuance")
    public JAXBElement<IntegrateIssuance> createIntegrateIssuance(IntegrateIssuance value) {
        return new JAXBElement<IntegrateIssuance>(_IntegrateIssuance_QNAME, IntegrateIssuance.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReturnRequestWithReference }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.access.data.automation.efs.imc.com/", name = "returnRequestWithReference")
    public JAXBElement<ReturnRequestWithReference> createReturnRequestWithReference(ReturnRequestWithReference value) {
        return new JAXBElement<ReturnRequestWithReference>(_ReturnRequestWithReference_QNAME, ReturnRequestWithReference.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEfsCheckLimitByUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.access.data.automation.efs.imc.com/", name = "getEfsCheckLimitByUser")
    public JAXBElement<GetEfsCheckLimitByUser> createGetEfsCheckLimitByUser(GetEfsCheckLimitByUser value) {
        return new JAXBElement<GetEfsCheckLimitByUser>(_GetEfsCheckLimitByUser_QNAME, GetEfsCheckLimitByUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRequestTypeByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.access.data.automation.efs.imc.com/", name = "getRequestTypeByIdResponse")
    public JAXBElement<GetRequestTypeByIdResponse> createGetRequestTypeByIdResponse(GetRequestTypeByIdResponse value) {
        return new JAXBElement<GetRequestTypeByIdResponse>(_GetRequestTypeByIdResponse_QNAME, GetRequestTypeByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExecuteRecievedIntegrationsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.access.data.automation.efs.imc.com/", name = "executeRecievedIntegrationsResponse")
    public JAXBElement<ExecuteRecievedIntegrationsResponse> createExecuteRecievedIntegrationsResponse(ExecuteRecievedIntegrationsResponse value) {
        return new JAXBElement<ExecuteRecievedIntegrationsResponse>(_ExecuteRecievedIntegrationsResponse_QNAME, ExecuteRecievedIntegrationsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckIfQualifiedVendor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.access.data.automation.efs.imc.com/", name = "checkIfQualifiedVendor")
    public JAXBElement<CheckIfQualifiedVendor> createCheckIfQualifiedVendor(CheckIfQualifiedVendor value) {
        return new JAXBElement<CheckIfQualifiedVendor>(_CheckIfQualifiedVendor_QNAME, CheckIfQualifiedVendor.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Exception }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.access.data.automation.efs.imc.com/", name = "Exception")
    public JAXBElement<Exception> createException(Exception value) {
        return new JAXBElement<Exception>(_Exception_QNAME, Exception.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEfsGpVendorIdByCompanyResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.access.data.automation.efs.imc.com/", name = "getEfsGpVendorIdByCompanyResponse")
    public JAXBElement<GetEfsGpVendorIdByCompanyResponse> createGetEfsGpVendorIdByCompanyResponse(GetEfsGpVendorIdByCompanyResponse value) {
        return new JAXBElement<GetEfsGpVendorIdByCompanyResponse>(_GetEfsGpVendorIdByCompanyResponse_QNAME, GetEfsGpVendorIdByCompanyResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDocumentFilePathsByRequestId }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.access.data.automation.efs.imc.com/", name = "getDocumentFilePathsByRequestId")
    public JAXBElement<GetDocumentFilePathsByRequestId> createGetDocumentFilePathsByRequestId(GetDocumentFilePathsByRequestId value) {
        return new JAXBElement<GetDocumentFilePathsByRequestId>(_GetDocumentFilePathsByRequestId_QNAME, GetDocumentFilePathsByRequestId.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveDocumentResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.access.data.automation.efs.imc.com/", name = "saveDocumentResponse")
    public JAXBElement<SaveDocumentResponse> createSaveDocumentResponse(SaveDocumentResponse value) {
        return new JAXBElement<SaveDocumentResponse>(_SaveDocumentResponse_QNAME, SaveDocumentResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckIfDuplicateRequestResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.access.data.automation.efs.imc.com/", name = "checkIfDuplicateRequestResponse")
    public JAXBElement<CheckIfDuplicateRequestResponse> createCheckIfDuplicateRequestResponse(CheckIfDuplicateRequestResponse value) {
        return new JAXBElement<CheckIfDuplicateRequestResponse>(_CheckIfDuplicateRequestResponse_QNAME, CheckIfDuplicateRequestResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEfsCheckLimitByUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.access.data.automation.efs.imc.com/", name = "getEfsCheckLimitByUserResponse")
    public JAXBElement<GetEfsCheckLimitByUserResponse> createGetEfsCheckLimitByUserResponse(GetEfsCheckLimitByUserResponse value) {
        return new JAXBElement<GetEfsCheckLimitByUserResponse>(_GetEfsCheckLimitByUserResponse_QNAME, GetEfsCheckLimitByUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckIfDuplicateRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.access.data.automation.efs.imc.com/", name = "checkIfDuplicateRequest")
    public JAXBElement<CheckIfDuplicateRequest> createCheckIfDuplicateRequest(CheckIfDuplicateRequest value) {
        return new JAXBElement<CheckIfDuplicateRequest>(_CheckIfDuplicateRequest_QNAME, CheckIfDuplicateRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.access.data.automation.efs.imc.com/", name = "updateRequest")
    public JAXBElement<UpdateRequest> createUpdateRequest(UpdateRequest value) {
        return new JAXBElement<UpdateRequest>(_UpdateRequest_QNAME, UpdateRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateAndReturnRequestWithReferenceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.access.data.automation.efs.imc.com/", name = "updateAndReturnRequestWithReferenceResponse")
    public JAXBElement<UpdateAndReturnRequestWithReferenceResponse> createUpdateAndReturnRequestWithReferenceResponse(UpdateAndReturnRequestWithReferenceResponse value) {
        return new JAXBElement<UpdateAndReturnRequestWithReferenceResponse>(_UpdateAndReturnRequestWithReferenceResponse_QNAME, UpdateAndReturnRequestWithReferenceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDocumentFilePathsByRequestIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.access.data.automation.efs.imc.com/", name = "getDocumentFilePathsByRequestIdResponse")
    public JAXBElement<GetDocumentFilePathsByRequestIdResponse> createGetDocumentFilePathsByRequestIdResponse(GetDocumentFilePathsByRequestIdResponse value) {
        return new JAXBElement<GetDocumentFilePathsByRequestIdResponse>(_GetDocumentFilePathsByRequestIdResponse_QNAME, GetDocumentFilePathsByRequestIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckIfQualifiedVendorResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.access.data.automation.efs.imc.com/", name = "checkIfQualifiedVendorResponse")
    public JAXBElement<CheckIfQualifiedVendorResponse> createCheckIfQualifiedVendorResponse(CheckIfQualifiedVendorResponse value) {
        return new JAXBElement<CheckIfQualifiedVendorResponse>(_CheckIfQualifiedVendorResponse_QNAME, CheckIfQualifiedVendorResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUsersEfsCheckLimit }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.access.data.automation.efs.imc.com/", name = "getUsersEfsCheckLimit")
    public JAXBElement<GetUsersEfsCheckLimit> createGetUsersEfsCheckLimit(GetUsersEfsCheckLimit value) {
        return new JAXBElement<GetUsersEfsCheckLimit>(_GetUsersEfsCheckLimit_QNAME, GetUsersEfsCheckLimit.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRequestsOfStatusIssued }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.access.data.automation.efs.imc.com/", name = "getRequestsOfStatusIssued")
    public JAXBElement<GetRequestsOfStatusIssued> createGetRequestsOfStatusIssued(GetRequestsOfStatusIssued value) {
        return new JAXBElement<GetRequestsOfStatusIssued>(_GetRequestsOfStatusIssued_QNAME, GetRequestsOfStatusIssued.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDivisionByDriverId }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.access.data.automation.efs.imc.com/", name = "getDivisionByDriverId")
    public JAXBElement<GetDivisionByDriverId> createGetDivisionByDriverId(GetDivisionByDriverId value) {
        return new JAXBElement<GetDivisionByDriverId>(_GetDivisionByDriverId_QNAME, GetDivisionByDriverId.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEncryptedCredentials }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.access.data.automation.efs.imc.com/", name = "GetEncryptedCredentials")
    public JAXBElement<GetEncryptedCredentials> createGetEncryptedCredentials(GetEncryptedCredentials value) {
        return new JAXBElement<GetEncryptedCredentials>(_GetEncryptedCredentials_QNAME, GetEncryptedCredentials.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateAndReturnRequestWithReference }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.access.data.automation.efs.imc.com/", name = "updateAndReturnRequestWithReference")
    public JAXBElement<UpdateAndReturnRequestWithReference> createUpdateAndReturnRequestWithReference(UpdateAndReturnRequestWithReference value) {
        return new JAXBElement<UpdateAndReturnRequestWithReference>(_UpdateAndReturnRequestWithReference_QNAME, UpdateAndReturnRequestWithReference.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddAndReturnRequestWithReferences }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.access.data.automation.efs.imc.com/", name = "addAndReturnRequestWithReferences")
    public JAXBElement<AddAndReturnRequestWithReferences> createAddAndReturnRequestWithReferences(AddAndReturnRequestWithReferences value) {
        return new JAXBElement<AddAndReturnRequestWithReferences>(_AddAndReturnRequestWithReferences_QNAME, AddAndReturnRequestWithReferences.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckIfFirstTimeVendor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.access.data.automation.efs.imc.com/", name = "checkIfFirstTimeVendor")
    public JAXBElement<CheckIfFirstTimeVendor> createCheckIfFirstTimeVendor(CheckIfFirstTimeVendor value) {
        return new JAXBElement<CheckIfFirstTimeVendor>(_CheckIfFirstTimeVendor_QNAME, CheckIfFirstTimeVendor.class, null, value);
    }

}
