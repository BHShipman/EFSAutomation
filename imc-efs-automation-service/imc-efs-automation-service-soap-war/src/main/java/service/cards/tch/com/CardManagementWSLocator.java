/**
 * CardManagementWSLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package service.cards.tch.com;

public class CardManagementWSLocator extends org.apache.axis.client.Service implements service.cards.tch.com.CardManagementWS {

    public CardManagementWSLocator() {
    }


    public CardManagementWSLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public CardManagementWSLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for CardManagementEPPort
    private java.lang.String CardManagementEPPort_address = "https://test.efsllc.com/axis2/services/CardManagementWS/";
    //TODO change before production
    //	  Production WSDL
    //    private java.lang.String CardManagementEPPort_address = "https://www.tch.com/axis2/services/CardManagementWS/";

    public java.lang.String getCardManagementEPPortAddress() {
        return CardManagementEPPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String CardManagementEPPortWSDDServiceName = "CardManagementEPPort";

    public java.lang.String getCardManagementEPPortWSDDServiceName() {
        return CardManagementEPPortWSDDServiceName;
    }

    public void setCardManagementEPPortWSDDServiceName(java.lang.String name) {
        CardManagementEPPortWSDDServiceName = name;
    }

    public service.cards.tch.com.CardManagementEP getCardManagementEPPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(CardManagementEPPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getCardManagementEPPort(endpoint);
    }

    public service.cards.tch.com.CardManagementEP getCardManagementEPPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            service.cards.tch.com.CardManagementEPBindingStub _stub = new service.cards.tch.com.CardManagementEPBindingStub(portAddress, this);
            _stub.setPortName(getCardManagementEPPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setCardManagementEPPortEndpointAddress(java.lang.String address) {
        CardManagementEPPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (service.cards.tch.com.CardManagementEP.class.isAssignableFrom(serviceEndpointInterface)) {
                service.cards.tch.com.CardManagementEPBindingStub _stub = new service.cards.tch.com.CardManagementEPBindingStub(new java.net.URL(CardManagementEPPort_address), this);
                _stub.setPortName(getCardManagementEPPortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("CardManagementEPPort".equals(inputPortName)) {
            return getCardManagementEPPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://com.tch.cards.service", "CardManagementWS");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://com.tch.cards.service", "CardManagementEPPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("CardManagementEPPort".equals(portName)) {
            setCardManagementEPPortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
