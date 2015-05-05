
package com.imc.efs.web.service;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "EfsAutomationWS", targetNamespace = "http://impl.webservice.automation.efs.imc.com/", wsdlLocation = "file:/C:/Users/bshipman/AppData/Local/Temp/tempdir3150308018456076057.tmp/EfsAutomationWS_1.wsdl")
public class EfsAutomationWS
    extends Service
{

    private final static URL EFSAUTOMATIONWS_WSDL_LOCATION;
    private final static WebServiceException EFSAUTOMATIONWS_EXCEPTION;
    private final static QName EFSAUTOMATIONWS_QNAME = new QName("http://impl.webservice.automation.efs.imc.com/", "EfsAutomationWS");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("file:/C:/Users/bshipman/AppData/Local/Temp/tempdir3150308018456076057.tmp/EfsAutomationWS_1.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        EFSAUTOMATIONWS_WSDL_LOCATION = url;
        EFSAUTOMATIONWS_EXCEPTION = e;
    }

    public EfsAutomationWS() {
        super(__getWsdlLocation(), EFSAUTOMATIONWS_QNAME);
    }

    public EfsAutomationWS(WebServiceFeature... features) {
        super(__getWsdlLocation(), EFSAUTOMATIONWS_QNAME, features);
    }

    public EfsAutomationWS(URL wsdlLocation) {
        super(wsdlLocation, EFSAUTOMATIONWS_QNAME);
    }

    public EfsAutomationWS(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, EFSAUTOMATIONWS_QNAME, features);
    }

    public EfsAutomationWS(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public EfsAutomationWS(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns EfsAutoService
     */
    @WebEndpoint(name = "EfsAutomationWS")
    public EfsAutoService getEfsAutomationWS() {
        return super.getPort(new QName("http://impl.webservice.automation.efs.imc.com/", "EfsAutomationWS"), EfsAutoService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns EfsAutoService
     */
    @WebEndpoint(name = "EfsAutomationWS")
    public EfsAutoService getEfsAutomationWS(WebServiceFeature... features) {
        return super.getPort(new QName("http://impl.webservice.automation.efs.imc.com/", "EfsAutomationWS"), EfsAutoService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (EFSAUTOMATIONWS_EXCEPTION!= null) {
            throw EFSAUTOMATIONWS_EXCEPTION;
        }
        return EFSAUTOMATIONWS_WSDL_LOCATION;
    }

}
