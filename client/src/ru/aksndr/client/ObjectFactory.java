
package ru.aksndr.client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ru.aksndr.client package. 
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

    private final static QName _SayHello_QNAME = new QName("http://server.aksndr.ru/", "sayHello");
    private final static QName _SayHelloResponse_QNAME = new QName("http://server.aksndr.ru/", "sayHelloResponse");
    private final static QName _GetCourse_QNAME = new QName("http://server.aksndr.ru/", "getCourse");
    private final static QName _GetCourseResponse_QNAME = new QName("http://server.aksndr.ru/", "getCourseResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ru.aksndr.client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetCourse }
     * 
     */
    public GetCourse createGetCourse() {
        return new GetCourse();
    }

    /**
     * Create an instance of {@link GetCourseResponse }
     * 
     */
    public GetCourseResponse createGetCourseResponse() {
        return new GetCourseResponse();
    }

    /**
     * Create an instance of {@link SayHelloResponse }
     * 
     */
    public SayHelloResponse createSayHelloResponse() {
        return new SayHelloResponse();
    }

    /**
     * Create an instance of {@link SayHello }
     * 
     */
    public SayHello createSayHello() {
        return new SayHello();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SayHello }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.aksndr.ru/", name = "sayHello")
    public JAXBElement<SayHello> createSayHello(SayHello value) {
        return new JAXBElement<SayHello>(_SayHello_QNAME, SayHello.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SayHelloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.aksndr.ru/", name = "sayHelloResponse")
    public JAXBElement<SayHelloResponse> createSayHelloResponse(SayHelloResponse value) {
        return new JAXBElement<SayHelloResponse>(_SayHelloResponse_QNAME, SayHelloResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCourse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.aksndr.ru/", name = "getCourse")
    public JAXBElement<GetCourse> createGetCourse(GetCourse value) {
        return new JAXBElement<GetCourse>(_GetCourse_QNAME, GetCourse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCourseResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.aksndr.ru/", name = "getCourseResponse")
    public JAXBElement<GetCourseResponse> createGetCourseResponse(GetCourseResponse value) {
        return new JAXBElement<GetCourseResponse>(_GetCourseResponse_QNAME, GetCourseResponse.class, null, value);
    }

}
