/**
 * InfoLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.dataaccess.footballpool;

public class InfoLocator extends org.apache.axis.client.Service implements eu.dataaccess.footballpool.Info {

/**
 * This Visual DataFlex Web Service exposes functions for the current
 * football pool
 */

    public InfoLocator() {
    }


    public InfoLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public InfoLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for InfoSoap
    private java.lang.String InfoSoap_address = "http://footballpool.dataaccess.eu/data/info.wso";

    public java.lang.String getInfoSoapAddress() {
        return InfoSoap_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String InfoSoapWSDDServiceName = "InfoSoap";

    public java.lang.String getInfoSoapWSDDServiceName() {
        return InfoSoapWSDDServiceName;
    }

    public void setInfoSoapWSDDServiceName(java.lang.String name) {
        InfoSoapWSDDServiceName = name;
    }

    public eu.dataaccess.footballpool.InfoSoapType getInfoSoap() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(InfoSoap_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getInfoSoap(endpoint);
    }

    public eu.dataaccess.footballpool.InfoSoapType getInfoSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            eu.dataaccess.footballpool.InfoSoapBindingStub _stub = new eu.dataaccess.footballpool.InfoSoapBindingStub(portAddress, this);
            _stub.setPortName(getInfoSoapWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setInfoSoapEndpointAddress(java.lang.String address) {
        InfoSoap_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (eu.dataaccess.footballpool.InfoSoapType.class.isAssignableFrom(serviceEndpointInterface)) {
                eu.dataaccess.footballpool.InfoSoapBindingStub _stub = new eu.dataaccess.footballpool.InfoSoapBindingStub(new java.net.URL(InfoSoap_address), this);
                _stub.setPortName(getInfoSoapWSDDServiceName());
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
        if ("InfoSoap".equals(inputPortName)) {
            return getInfoSoap();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://footballpool.dataaccess.eu", "Info");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://footballpool.dataaccess.eu", "InfoSoap"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("InfoSoap".equals(portName)) {
            setInfoSoapEndpointAddress(address);
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
