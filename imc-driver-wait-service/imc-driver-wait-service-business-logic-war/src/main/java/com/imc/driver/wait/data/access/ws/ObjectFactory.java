
package com.imc.driver.wait.data.access.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

import com.imc.driver.wait.service.data.UserDetailsDTO;
import com.imc.driver.wait.service.entities.Driver;
import com.imc.driver.wait.service.entities.Drwait;
import com.imc.driver.wait.service.entities.DrwaitEventQueue;
import com.imc.driver.wait.service.entities.Locprof;
import com.imc.driver.wait.service.entities.Mcgps;
import com.imc.driver.wait.service.entities.McgpsId;
import com.imc.driver.wait.service.entities.Move;
import com.imc.driver.wait.service.entities.Orchrg;
import com.imc.driver.wait.service.entities.Order;
import com.imc.driver.wait.service.entities.Userid;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.imc.driver.wait.data.access.ws package. 
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

    private final static QName _GetAllDrwaitEventsAllUsersResponse_QNAME = new QName("http://ws.access.data.wait.driver.imc.com/", "getAllDrwaitEventsAllUsersResponse");
    private final static QName _InsertDrwaitEventResponse_QNAME = new QName("http://ws.access.data.wait.driver.imc.com/", "insertDrwaitEventResponse");
    private final static QName _GetBreadcrumbsResponse_QNAME = new QName("http://ws.access.data.wait.driver.imc.com/", "getBreadcrumbsResponse");
    private final static QName _GetAllDrwaitsResponse_QNAME = new QName("http://ws.access.data.wait.driver.imc.com/", "getAllDrwaitsResponse");
    private final static QName _GetLocprofResponse_QNAME = new QName("http://ws.access.data.wait.driver.imc.com/", "getLocprofResponse");
    private final static QName _UserDetailsDTO_QNAME = new QName("http://ws.access.data.wait.driver.imc.com/", "userDetailsDTO");
    private final static QName _GetUserDetails_QNAME = new QName("http://ws.access.data.wait.driver.imc.com/", "getUserDetails");
    private final static QName _GetBreadcrumbs4Response_QNAME = new QName("http://ws.access.data.wait.driver.imc.com/", "getBreadcrumbs4Response");
    private final static QName _GetBreadcrumbs3Response_QNAME = new QName("http://ws.access.data.wait.driver.imc.com/", "getBreadcrumbs3Response");
    private final static QName _UpdateMoveResponse_QNAME = new QName("http://ws.access.data.wait.driver.imc.com/", "updateMoveResponse");
    private final static QName _GetByImportMoveNoResponse_QNAME = new QName("http://ws.access.data.wait.driver.imc.com/", "getByImportMoveNoResponse");
    private final static QName _GetByExportMoveNo_QNAME = new QName("http://ws.access.data.wait.driver.imc.com/", "getByExportMoveNo");
    private final static QName _InsertOrchrgResponse_QNAME = new QName("http://ws.access.data.wait.driver.imc.com/", "insertOrchrgResponse");
    private final static QName _GetAllDrwaitEventsAllUsers_QNAME = new QName("http://ws.access.data.wait.driver.imc.com/", "getAllDrwaitEventsAllUsers");
    private final static QName _GetMove_QNAME = new QName("http://ws.access.data.wait.driver.imc.com/", "getMove");
    private final static QName _UpdateMove_QNAME = new QName("http://ws.access.data.wait.driver.imc.com/", "updateMove");
    private final static QName _GetMoveResponse_QNAME = new QName("http://ws.access.data.wait.driver.imc.com/", "getMoveResponse");
    private final static QName _GetDriverByCodeAndCmpyNoResponse_QNAME = new QName("http://ws.access.data.wait.driver.imc.com/", "getDriverByCodeAndCmpyNoResponse");
    private final static QName _GetUserDetailsResponse_QNAME = new QName("http://ws.access.data.wait.driver.imc.com/", "getUserDetailsResponse");
    private final static QName _GetAllDrwaits_QNAME = new QName("http://ws.access.data.wait.driver.imc.com/", "getAllDrwaits");
    private final static QName _GetUserResponse_QNAME = new QName("http://ws.access.data.wait.driver.imc.com/", "getUserResponse");
    private final static QName _GetBreadcrumbs_QNAME = new QName("http://ws.access.data.wait.driver.imc.com/", "getBreadcrumbs");
    private final static QName _GetUser_QNAME = new QName("http://ws.access.data.wait.driver.imc.com/", "getUser");
    private final static QName _GetDriverByCodeAndCmpyNo_QNAME = new QName("http://ws.access.data.wait.driver.imc.com/", "getDriverByCodeAndCmpyNo");
    private final static QName _InsertDrwait_QNAME = new QName("http://ws.access.data.wait.driver.imc.com/", "insertDrwait");
    private final static QName _UpdateDrwaitEventResponse_QNAME = new QName("http://ws.access.data.wait.driver.imc.com/", "updateDrwaitEventResponse");
    private final static QName _GetAllDrwaitEvents_QNAME = new QName("http://ws.access.data.wait.driver.imc.com/", "getAllDrwaitEvents");
    private final static QName _UpdateDrwaitEvent_QNAME = new QName("http://ws.access.data.wait.driver.imc.com/", "updateDrwaitEvent");
    private final static QName _GetByExportMoveNoResponse_QNAME = new QName("http://ws.access.data.wait.driver.imc.com/", "getByExportMoveNoResponse");
    private final static QName _GetByImportMoveNo_QNAME = new QName("http://ws.access.data.wait.driver.imc.com/", "getByImportMoveNo");
    private final static QName _GetBreadcrumbs2Response_QNAME = new QName("http://ws.access.data.wait.driver.imc.com/", "getBreadcrumbs2Response");
    private final static QName _GetOrder_QNAME = new QName("http://ws.access.data.wait.driver.imc.com/", "getOrder");
    private final static QName _GetAllDrwaitEventsResponse_QNAME = new QName("http://ws.access.data.wait.driver.imc.com/", "getAllDrwaitEventsResponse");
    private final static QName _GetBreadcrumbs3_QNAME = new QName("http://ws.access.data.wait.driver.imc.com/", "getBreadcrumbs3");
    private final static QName _GetBreadcrumbs2_QNAME = new QName("http://ws.access.data.wait.driver.imc.com/", "getBreadcrumbs2");
    private final static QName _GetBreadcrumbs4_QNAME = new QName("http://ws.access.data.wait.driver.imc.com/", "getBreadcrumbs4");
    private final static QName _GetOrderResponse_QNAME = new QName("http://ws.access.data.wait.driver.imc.com/", "getOrderResponse");
    private final static QName _InsertDrwaitResponse_QNAME = new QName("http://ws.access.data.wait.driver.imc.com/", "insertDrwaitResponse");
    private final static QName _GetLocprof_QNAME = new QName("http://ws.access.data.wait.driver.imc.com/", "getLocprof");
    private final static QName _InsertDrwaitEvent_QNAME = new QName("http://ws.access.data.wait.driver.imc.com/", "insertDrwaitEvent");
    private final static QName _InsertOrchrg_QNAME = new QName("http://ws.access.data.wait.driver.imc.com/", "insertOrchrg");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.imc.driver.wait.data.access.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link InsertDrwaitEventResponse }
     * 
     */
    public InsertDrwaitEventResponse createInsertDrwaitEventResponse() {
        return new InsertDrwaitEventResponse();
    }

    /**
     * Create an instance of {@link GetAllDrwaitEventsAllUsersResponse }
     * 
     */
    public GetAllDrwaitEventsAllUsersResponse createGetAllDrwaitEventsAllUsersResponse() {
        return new GetAllDrwaitEventsAllUsersResponse();
    }

    /**
     * Create an instance of {@link GetAllDrwaitsResponse }
     * 
     */
    public GetAllDrwaitsResponse createGetAllDrwaitsResponse() {
        return new GetAllDrwaitsResponse();
    }

    /**
     * Create an instance of {@link GetBreadcrumbsResponse }
     * 
     */
    public GetBreadcrumbsResponse createGetBreadcrumbsResponse() {
        return new GetBreadcrumbsResponse();
    }

    /**
     * Create an instance of {@link UserDetailsDTO }
     * 
     */
    public UserDetailsDTO createUserDetailsDTO() {
        return new UserDetailsDTO();
    }

    /**
     * Create an instance of {@link GetLocprofResponse }
     * 
     */
    public GetLocprofResponse createGetLocprofResponse() {
        return new GetLocprofResponse();
    }

    /**
     * Create an instance of {@link GetUserDetails }
     * 
     */
    public GetUserDetails createGetUserDetails() {
        return new GetUserDetails();
    }

    /**
     * Create an instance of {@link GetBreadcrumbs3Response }
     * 
     */
    public GetBreadcrumbs3Response createGetBreadcrumbs3Response() {
        return new GetBreadcrumbs3Response();
    }

    /**
     * Create an instance of {@link GetBreadcrumbs4Response }
     * 
     */
    public GetBreadcrumbs4Response createGetBreadcrumbs4Response() {
        return new GetBreadcrumbs4Response();
    }

    /**
     * Create an instance of {@link UpdateMoveResponse }
     * 
     */
    public UpdateMoveResponse createUpdateMoveResponse() {
        return new UpdateMoveResponse();
    }

    /**
     * Create an instance of {@link GetByExportMoveNo }
     * 
     */
    public GetByExportMoveNo createGetByExportMoveNo() {
        return new GetByExportMoveNo();
    }

    /**
     * Create an instance of {@link GetByImportMoveNoResponse }
     * 
     */
    public GetByImportMoveNoResponse createGetByImportMoveNoResponse() {
        return new GetByImportMoveNoResponse();
    }

    /**
     * Create an instance of {@link InsertOrchrgResponse }
     * 
     */
    public InsertOrchrgResponse createInsertOrchrgResponse() {
        return new InsertOrchrgResponse();
    }

    /**
     * Create an instance of {@link GetAllDrwaitEventsAllUsers }
     * 
     */
    public GetAllDrwaitEventsAllUsers createGetAllDrwaitEventsAllUsers() {
        return new GetAllDrwaitEventsAllUsers();
    }

    /**
     * Create an instance of {@link GetMove }
     * 
     */
    public GetMove createGetMove() {
        return new GetMove();
    }

    /**
     * Create an instance of {@link UpdateMove }
     * 
     */
    public UpdateMove createUpdateMove() {
        return new UpdateMove();
    }

    /**
     * Create an instance of {@link GetMoveResponse }
     * 
     */
    public GetMoveResponse createGetMoveResponse() {
        return new GetMoveResponse();
    }

    /**
     * Create an instance of {@link GetDriverByCodeAndCmpyNoResponse }
     * 
     */
    public GetDriverByCodeAndCmpyNoResponse createGetDriverByCodeAndCmpyNoResponse() {
        return new GetDriverByCodeAndCmpyNoResponse();
    }

    /**
     * Create an instance of {@link GetUserDetailsResponse }
     * 
     */
    public GetUserDetailsResponse createGetUserDetailsResponse() {
        return new GetUserDetailsResponse();
    }

    /**
     * Create an instance of {@link GetAllDrwaits }
     * 
     */
    public GetAllDrwaits createGetAllDrwaits() {
        return new GetAllDrwaits();
    }

    /**
     * Create an instance of {@link GetUserResponse }
     * 
     */
    public GetUserResponse createGetUserResponse() {
        return new GetUserResponse();
    }

    /**
     * Create an instance of {@link GetBreadcrumbs }
     * 
     */
    public GetBreadcrumbs createGetBreadcrumbs() {
        return new GetBreadcrumbs();
    }

    /**
     * Create an instance of {@link GetUser }
     * 
     */
    public GetUser createGetUser() {
        return new GetUser();
    }

    /**
     * Create an instance of {@link GetDriverByCodeAndCmpyNo }
     * 
     */
    public GetDriverByCodeAndCmpyNo createGetDriverByCodeAndCmpyNo() {
        return new GetDriverByCodeAndCmpyNo();
    }

    /**
     * Create an instance of {@link UpdateDrwaitEventResponse }
     * 
     */
    public UpdateDrwaitEventResponse createUpdateDrwaitEventResponse() {
        return new UpdateDrwaitEventResponse();
    }

    /**
     * Create an instance of {@link InsertDrwait }
     * 
     */
    public InsertDrwait createInsertDrwait() {
        return new InsertDrwait();
    }

    /**
     * Create an instance of {@link GetAllDrwaitEvents }
     * 
     */
    public GetAllDrwaitEvents createGetAllDrwaitEvents() {
        return new GetAllDrwaitEvents();
    }

    /**
     * Create an instance of {@link UpdateDrwaitEvent }
     * 
     */
    public UpdateDrwaitEvent createUpdateDrwaitEvent() {
        return new UpdateDrwaitEvent();
    }

    /**
     * Create an instance of {@link GetByExportMoveNoResponse }
     * 
     */
    public GetByExportMoveNoResponse createGetByExportMoveNoResponse() {
        return new GetByExportMoveNoResponse();
    }

    /**
     * Create an instance of {@link GetByImportMoveNo }
     * 
     */
    public GetByImportMoveNo createGetByImportMoveNo() {
        return new GetByImportMoveNo();
    }

    /**
     * Create an instance of {@link GetOrder }
     * 
     */
    public GetOrder createGetOrder() {
        return new GetOrder();
    }

    /**
     * Create an instance of {@link GetBreadcrumbs2Response }
     * 
     */
    public GetBreadcrumbs2Response createGetBreadcrumbs2Response() {
        return new GetBreadcrumbs2Response();
    }

    /**
     * Create an instance of {@link GetAllDrwaitEventsResponse }
     * 
     */
    public GetAllDrwaitEventsResponse createGetAllDrwaitEventsResponse() {
        return new GetAllDrwaitEventsResponse();
    }

    /**
     * Create an instance of {@link GetBreadcrumbs3 }
     * 
     */
    public GetBreadcrumbs3 createGetBreadcrumbs3() {
        return new GetBreadcrumbs3();
    }

    /**
     * Create an instance of {@link GetBreadcrumbs2 }
     * 
     */
    public GetBreadcrumbs2 createGetBreadcrumbs2() {
        return new GetBreadcrumbs2();
    }

    /**
     * Create an instance of {@link GetBreadcrumbs4 }
     * 
     */
    public GetBreadcrumbs4 createGetBreadcrumbs4() {
        return new GetBreadcrumbs4();
    }

    /**
     * Create an instance of {@link InsertDrwaitResponse }
     * 
     */
    public InsertDrwaitResponse createInsertDrwaitResponse() {
        return new InsertDrwaitResponse();
    }

    /**
     * Create an instance of {@link GetOrderResponse }
     * 
     */
    public GetOrderResponse createGetOrderResponse() {
        return new GetOrderResponse();
    }

    /**
     * Create an instance of {@link InsertDrwaitEvent }
     * 
     */
    public InsertDrwaitEvent createInsertDrwaitEvent() {
        return new InsertDrwaitEvent();
    }

    /**
     * Create an instance of {@link GetLocprof }
     * 
     */
    public GetLocprof createGetLocprof() {
        return new GetLocprof();
    }

    /**
     * Create an instance of {@link InsertOrchrg }
     * 
     */
    public InsertOrchrg createInsertOrchrg() {
        return new InsertOrchrg();
    }

    /**
     * Create an instance of {@link Userid }
     * 
     */
    public Userid createUserid() {
        return new Userid();
    }

    /**
     * Create an instance of {@link McgpsId }
     * 
     */
    public McgpsId createMcgpsId() {
        return new McgpsId();
    }

    /**
     * Create an instance of {@link Move }
     * 
     */
    public Move createMove() {
        return new Move();
    }

    /**
     * Create an instance of {@link Mcgps }
     * 
     */
    public Mcgps createMcgps() {
        return new Mcgps();
    }

    /**
     * Create an instance of {@link Drwait }
     * 
     */
    public Drwait createDrwait() {
        return new Drwait();
    }

    /**
     * Create an instance of {@link DrwaitEventQueue }
     * 
     */
    public DrwaitEventQueue createDrwaitEventQueue() {
        return new DrwaitEventQueue();
    }

    /**
     * Create an instance of {@link Order }
     * 
     */
    public Order createOrder() {
        return new Order();
    }

    /**
     * Create an instance of {@link Driver }
     * 
     */
    public Driver createDriver() {
        return new Driver();
    }

    /**
     * Create an instance of {@link Locprof }
     * 
     */
    public Locprof createLocprof() {
        return new Locprof();
    }

    /**
     * Create an instance of {@link Orchrg }
     * 
     */
    public Orchrg createOrchrg() {
        return new Orchrg();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllDrwaitEventsAllUsersResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.access.data.wait.driver.imc.com/", name = "getAllDrwaitEventsAllUsersResponse")
    public JAXBElement<GetAllDrwaitEventsAllUsersResponse> createGetAllDrwaitEventsAllUsersResponse(GetAllDrwaitEventsAllUsersResponse value) {
        return new JAXBElement<GetAllDrwaitEventsAllUsersResponse>(_GetAllDrwaitEventsAllUsersResponse_QNAME, GetAllDrwaitEventsAllUsersResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertDrwaitEventResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.access.data.wait.driver.imc.com/", name = "insertDrwaitEventResponse")
    public JAXBElement<InsertDrwaitEventResponse> createInsertDrwaitEventResponse(InsertDrwaitEventResponse value) {
        return new JAXBElement<InsertDrwaitEventResponse>(_InsertDrwaitEventResponse_QNAME, InsertDrwaitEventResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBreadcrumbsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.access.data.wait.driver.imc.com/", name = "getBreadcrumbsResponse")
    public JAXBElement<GetBreadcrumbsResponse> createGetBreadcrumbsResponse(GetBreadcrumbsResponse value) {
        return new JAXBElement<GetBreadcrumbsResponse>(_GetBreadcrumbsResponse_QNAME, GetBreadcrumbsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllDrwaitsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.access.data.wait.driver.imc.com/", name = "getAllDrwaitsResponse")
    public JAXBElement<GetAllDrwaitsResponse> createGetAllDrwaitsResponse(GetAllDrwaitsResponse value) {
        return new JAXBElement<GetAllDrwaitsResponse>(_GetAllDrwaitsResponse_QNAME, GetAllDrwaitsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetLocprofResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.access.data.wait.driver.imc.com/", name = "getLocprofResponse")
    public JAXBElement<GetLocprofResponse> createGetLocprofResponse(GetLocprofResponse value) {
        return new JAXBElement<GetLocprofResponse>(_GetLocprofResponse_QNAME, GetLocprofResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserDetailsDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.access.data.wait.driver.imc.com/", name = "userDetailsDTO")
    public JAXBElement<UserDetailsDTO> createUserDetailsDTO(UserDetailsDTO value) {
        return new JAXBElement<UserDetailsDTO>(_UserDetailsDTO_QNAME, UserDetailsDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUserDetails }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.access.data.wait.driver.imc.com/", name = "getUserDetails")
    public JAXBElement<GetUserDetails> createGetUserDetails(GetUserDetails value) {
        return new JAXBElement<GetUserDetails>(_GetUserDetails_QNAME, GetUserDetails.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBreadcrumbs4Response }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.access.data.wait.driver.imc.com/", name = "getBreadcrumbs4Response")
    public JAXBElement<GetBreadcrumbs4Response> createGetBreadcrumbs4Response(GetBreadcrumbs4Response value) {
        return new JAXBElement<GetBreadcrumbs4Response>(_GetBreadcrumbs4Response_QNAME, GetBreadcrumbs4Response.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBreadcrumbs3Response }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.access.data.wait.driver.imc.com/", name = "getBreadcrumbs3Response")
    public JAXBElement<GetBreadcrumbs3Response> createGetBreadcrumbs3Response(GetBreadcrumbs3Response value) {
        return new JAXBElement<GetBreadcrumbs3Response>(_GetBreadcrumbs3Response_QNAME, GetBreadcrumbs3Response.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateMoveResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.access.data.wait.driver.imc.com/", name = "updateMoveResponse")
    public JAXBElement<UpdateMoveResponse> createUpdateMoveResponse(UpdateMoveResponse value) {
        return new JAXBElement<UpdateMoveResponse>(_UpdateMoveResponse_QNAME, UpdateMoveResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetByImportMoveNoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.access.data.wait.driver.imc.com/", name = "getByImportMoveNoResponse")
    public JAXBElement<GetByImportMoveNoResponse> createGetByImportMoveNoResponse(GetByImportMoveNoResponse value) {
        return new JAXBElement<GetByImportMoveNoResponse>(_GetByImportMoveNoResponse_QNAME, GetByImportMoveNoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetByExportMoveNo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.access.data.wait.driver.imc.com/", name = "getByExportMoveNo")
    public JAXBElement<GetByExportMoveNo> createGetByExportMoveNo(GetByExportMoveNo value) {
        return new JAXBElement<GetByExportMoveNo>(_GetByExportMoveNo_QNAME, GetByExportMoveNo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertOrchrgResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.access.data.wait.driver.imc.com/", name = "insertOrchrgResponse")
    public JAXBElement<InsertOrchrgResponse> createInsertOrchrgResponse(InsertOrchrgResponse value) {
        return new JAXBElement<InsertOrchrgResponse>(_InsertOrchrgResponse_QNAME, InsertOrchrgResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllDrwaitEventsAllUsers }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.access.data.wait.driver.imc.com/", name = "getAllDrwaitEventsAllUsers")
    public JAXBElement<GetAllDrwaitEventsAllUsers> createGetAllDrwaitEventsAllUsers(GetAllDrwaitEventsAllUsers value) {
        return new JAXBElement<GetAllDrwaitEventsAllUsers>(_GetAllDrwaitEventsAllUsers_QNAME, GetAllDrwaitEventsAllUsers.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMove }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.access.data.wait.driver.imc.com/", name = "getMove")
    public JAXBElement<GetMove> createGetMove(GetMove value) {
        return new JAXBElement<GetMove>(_GetMove_QNAME, GetMove.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateMove }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.access.data.wait.driver.imc.com/", name = "updateMove")
    public JAXBElement<UpdateMove> createUpdateMove(UpdateMove value) {
        return new JAXBElement<UpdateMove>(_UpdateMove_QNAME, UpdateMove.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMoveResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.access.data.wait.driver.imc.com/", name = "getMoveResponse")
    public JAXBElement<GetMoveResponse> createGetMoveResponse(GetMoveResponse value) {
        return new JAXBElement<GetMoveResponse>(_GetMoveResponse_QNAME, GetMoveResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDriverByCodeAndCmpyNoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.access.data.wait.driver.imc.com/", name = "getDriverByCodeAndCmpyNoResponse")
    public JAXBElement<GetDriverByCodeAndCmpyNoResponse> createGetDriverByCodeAndCmpyNoResponse(GetDriverByCodeAndCmpyNoResponse value) {
        return new JAXBElement<GetDriverByCodeAndCmpyNoResponse>(_GetDriverByCodeAndCmpyNoResponse_QNAME, GetDriverByCodeAndCmpyNoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUserDetailsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.access.data.wait.driver.imc.com/", name = "getUserDetailsResponse")
    public JAXBElement<GetUserDetailsResponse> createGetUserDetailsResponse(GetUserDetailsResponse value) {
        return new JAXBElement<GetUserDetailsResponse>(_GetUserDetailsResponse_QNAME, GetUserDetailsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllDrwaits }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.access.data.wait.driver.imc.com/", name = "getAllDrwaits")
    public JAXBElement<GetAllDrwaits> createGetAllDrwaits(GetAllDrwaits value) {
        return new JAXBElement<GetAllDrwaits>(_GetAllDrwaits_QNAME, GetAllDrwaits.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.access.data.wait.driver.imc.com/", name = "getUserResponse")
    public JAXBElement<GetUserResponse> createGetUserResponse(GetUserResponse value) {
        return new JAXBElement<GetUserResponse>(_GetUserResponse_QNAME, GetUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBreadcrumbs }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.access.data.wait.driver.imc.com/", name = "getBreadcrumbs")
    public JAXBElement<GetBreadcrumbs> createGetBreadcrumbs(GetBreadcrumbs value) {
        return new JAXBElement<GetBreadcrumbs>(_GetBreadcrumbs_QNAME, GetBreadcrumbs.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.access.data.wait.driver.imc.com/", name = "getUser")
    public JAXBElement<GetUser> createGetUser(GetUser value) {
        return new JAXBElement<GetUser>(_GetUser_QNAME, GetUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDriverByCodeAndCmpyNo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.access.data.wait.driver.imc.com/", name = "getDriverByCodeAndCmpyNo")
    public JAXBElement<GetDriverByCodeAndCmpyNo> createGetDriverByCodeAndCmpyNo(GetDriverByCodeAndCmpyNo value) {
        return new JAXBElement<GetDriverByCodeAndCmpyNo>(_GetDriverByCodeAndCmpyNo_QNAME, GetDriverByCodeAndCmpyNo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertDrwait }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.access.data.wait.driver.imc.com/", name = "insertDrwait")
    public JAXBElement<InsertDrwait> createInsertDrwait(InsertDrwait value) {
        return new JAXBElement<InsertDrwait>(_InsertDrwait_QNAME, InsertDrwait.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateDrwaitEventResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.access.data.wait.driver.imc.com/", name = "updateDrwaitEventResponse")
    public JAXBElement<UpdateDrwaitEventResponse> createUpdateDrwaitEventResponse(UpdateDrwaitEventResponse value) {
        return new JAXBElement<UpdateDrwaitEventResponse>(_UpdateDrwaitEventResponse_QNAME, UpdateDrwaitEventResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllDrwaitEvents }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.access.data.wait.driver.imc.com/", name = "getAllDrwaitEvents")
    public JAXBElement<GetAllDrwaitEvents> createGetAllDrwaitEvents(GetAllDrwaitEvents value) {
        return new JAXBElement<GetAllDrwaitEvents>(_GetAllDrwaitEvents_QNAME, GetAllDrwaitEvents.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateDrwaitEvent }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.access.data.wait.driver.imc.com/", name = "updateDrwaitEvent")
    public JAXBElement<UpdateDrwaitEvent> createUpdateDrwaitEvent(UpdateDrwaitEvent value) {
        return new JAXBElement<UpdateDrwaitEvent>(_UpdateDrwaitEvent_QNAME, UpdateDrwaitEvent.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetByExportMoveNoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.access.data.wait.driver.imc.com/", name = "getByExportMoveNoResponse")
    public JAXBElement<GetByExportMoveNoResponse> createGetByExportMoveNoResponse(GetByExportMoveNoResponse value) {
        return new JAXBElement<GetByExportMoveNoResponse>(_GetByExportMoveNoResponse_QNAME, GetByExportMoveNoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetByImportMoveNo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.access.data.wait.driver.imc.com/", name = "getByImportMoveNo")
    public JAXBElement<GetByImportMoveNo> createGetByImportMoveNo(GetByImportMoveNo value) {
        return new JAXBElement<GetByImportMoveNo>(_GetByImportMoveNo_QNAME, GetByImportMoveNo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBreadcrumbs2Response }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.access.data.wait.driver.imc.com/", name = "getBreadcrumbs2Response")
    public JAXBElement<GetBreadcrumbs2Response> createGetBreadcrumbs2Response(GetBreadcrumbs2Response value) {
        return new JAXBElement<GetBreadcrumbs2Response>(_GetBreadcrumbs2Response_QNAME, GetBreadcrumbs2Response.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOrder }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.access.data.wait.driver.imc.com/", name = "getOrder")
    public JAXBElement<GetOrder> createGetOrder(GetOrder value) {
        return new JAXBElement<GetOrder>(_GetOrder_QNAME, GetOrder.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllDrwaitEventsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.access.data.wait.driver.imc.com/", name = "getAllDrwaitEventsResponse")
    public JAXBElement<GetAllDrwaitEventsResponse> createGetAllDrwaitEventsResponse(GetAllDrwaitEventsResponse value) {
        return new JAXBElement<GetAllDrwaitEventsResponse>(_GetAllDrwaitEventsResponse_QNAME, GetAllDrwaitEventsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBreadcrumbs3 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.access.data.wait.driver.imc.com/", name = "getBreadcrumbs3")
    public JAXBElement<GetBreadcrumbs3> createGetBreadcrumbs3(GetBreadcrumbs3 value) {
        return new JAXBElement<GetBreadcrumbs3>(_GetBreadcrumbs3_QNAME, GetBreadcrumbs3 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBreadcrumbs2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.access.data.wait.driver.imc.com/", name = "getBreadcrumbs2")
    public JAXBElement<GetBreadcrumbs2> createGetBreadcrumbs2(GetBreadcrumbs2 value) {
        return new JAXBElement<GetBreadcrumbs2>(_GetBreadcrumbs2_QNAME, GetBreadcrumbs2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBreadcrumbs4 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.access.data.wait.driver.imc.com/", name = "getBreadcrumbs4")
    public JAXBElement<GetBreadcrumbs4> createGetBreadcrumbs4(GetBreadcrumbs4 value) {
        return new JAXBElement<GetBreadcrumbs4>(_GetBreadcrumbs4_QNAME, GetBreadcrumbs4 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOrderResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.access.data.wait.driver.imc.com/", name = "getOrderResponse")
    public JAXBElement<GetOrderResponse> createGetOrderResponse(GetOrderResponse value) {
        return new JAXBElement<GetOrderResponse>(_GetOrderResponse_QNAME, GetOrderResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertDrwaitResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.access.data.wait.driver.imc.com/", name = "insertDrwaitResponse")
    public JAXBElement<InsertDrwaitResponse> createInsertDrwaitResponse(InsertDrwaitResponse value) {
        return new JAXBElement<InsertDrwaitResponse>(_InsertDrwaitResponse_QNAME, InsertDrwaitResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetLocprof }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.access.data.wait.driver.imc.com/", name = "getLocprof")
    public JAXBElement<GetLocprof> createGetLocprof(GetLocprof value) {
        return new JAXBElement<GetLocprof>(_GetLocprof_QNAME, GetLocprof.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertDrwaitEvent }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.access.data.wait.driver.imc.com/", name = "insertDrwaitEvent")
    public JAXBElement<InsertDrwaitEvent> createInsertDrwaitEvent(InsertDrwaitEvent value) {
        return new JAXBElement<InsertDrwaitEvent>(_InsertDrwaitEvent_QNAME, InsertDrwaitEvent.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertOrchrg }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.access.data.wait.driver.imc.com/", name = "insertOrchrg")
    public JAXBElement<InsertOrchrg> createInsertOrchrg(InsertOrchrg value) {
        return new JAXBElement<InsertOrchrg>(_InsertOrchrg_QNAME, InsertOrchrg.class, null, value);
    }

}
