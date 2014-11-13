
package pl.adamborowski.client.generated;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the pl.adamborowski.client.generated package. 
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

    private final static QName _GetKotek_QNAME = new QName("http://kot.adamborowski.pl/", "getKotek");
    private final static QName _GetKotekResponse_QNAME = new QName("http://kot.adamborowski.pl/", "getKotekResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: pl.adamborowski.client.generated
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetKotekResponse }
     * 
     */
    public GetKotekResponse createGetKotekResponse() {
        return new GetKotekResponse();
    }

    /**
     * Create an instance of {@link GetKotek }
     * 
     */
    public GetKotek createGetKotek() {
        return new GetKotek();
    }

    /**
     * Create an instance of {@link Kot }
     * 
     */
    public Kot createKot() {
        return new Kot();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetKotek }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kot.adamborowski.pl/", name = "getKotek")
    public JAXBElement<GetKotek> createGetKotek(GetKotek value) {
        return new JAXBElement<GetKotek>(_GetKotek_QNAME, GetKotek.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetKotekResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kot.adamborowski.pl/", name = "getKotekResponse")
    public JAXBElement<GetKotekResponse> createGetKotekResponse(GetKotekResponse value) {
        return new JAXBElement<GetKotekResponse>(_GetKotekResponse_QNAME, GetKotekResponse.class, null, value);
    }

}
