
package ru.aksndr.client;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAXWS SI.
 * JAX-WS RI 2.1-02/02/2007 03:56 AM(vivekp)-FCS
 * Generated source version: 2.1
 * 
 */
@WebServiceClient(name = "HelloService", targetNamespace = "http://server.aksndr.ru/", wsdlLocation = "http://localhost:8080/services/Hello?wsdl")
public class HelloService
    extends Service
{

    private final static URL HELLOSERVICE_WSDL_LOCATION;

    static {
        URL url = null;
        try {
            url = new URL("http://localhost:8080/services/Hello?wsdl");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        HELLOSERVICE_WSDL_LOCATION = url;
    }

    public HelloService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public HelloService() {
        super(HELLOSERVICE_WSDL_LOCATION, new QName("http://server.aksndr.ru/", "HelloService"));
    }

    /**
     * 
     * @return
     *     returns Greetings
     */
    @WebEndpoint(name = "HelloPort")
    public Greetings getHelloPort() {
        return (Greetings)super.getPort(new QName("http://server.aksndr.ru/", "HelloPort"), Greetings.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Greetings
     */
    @WebEndpoint(name = "HelloPort")
    public Greetings getHelloPort(WebServiceFeature... features) {
        return (Greetings)super.getPort(new QName("http://server.aksndr.ru/", "HelloPort"), Greetings.class, features);
    }

}