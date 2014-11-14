
package pl.adamborowski.kot;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the pl.adamborowski.kot package. 
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

    private final static QName _DeleteCatResponse_QNAME = new QName("http://kot.adamborowski.pl/", "deleteCatResponse");
    private final static QName _GetCats_QNAME = new QName("http://kot.adamborowski.pl/", "getCats");
    private final static QName _AddCatResponse_QNAME = new QName("http://kot.adamborowski.pl/", "addCatResponse");
    private final static QName _FindCat_QNAME = new QName("http://kot.adamborowski.pl/", "findCat");
    private final static QName _FindCatResponse_QNAME = new QName("http://kot.adamborowski.pl/", "findCatResponse");
    private final static QName _GetCatsPaged_QNAME = new QName("http://kot.adamborowski.pl/", "getCatsPaged");
    private final static QName _DeleteCat_QNAME = new QName("http://kot.adamborowski.pl/", "deleteCat");
    private final static QName _InitResponse_QNAME = new QName("http://kot.adamborowski.pl/", "initResponse");
    private final static QName _GetCatsPagedResponse_QNAME = new QName("http://kot.adamborowski.pl/", "getCatsPagedResponse");
    private final static QName _GetCatsResponse_QNAME = new QName("http://kot.adamborowski.pl/", "getCatsResponse");
    private final static QName _AddCat_QNAME = new QName("http://kot.adamborowski.pl/", "addCat");
    private final static QName _Init_QNAME = new QName("http://kot.adamborowski.pl/", "init");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: pl.adamborowski.kot
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AddCat }
     * 
     */
    public AddCat createAddCat() {
        return new AddCat();
    }

    /**
     * Create an instance of {@link Init }
     * 
     */
    public Init createInit() {
        return new Init();
    }

    /**
     * Create an instance of {@link DeleteCat }
     * 
     */
    public DeleteCat createDeleteCat() {
        return new DeleteCat();
    }

    /**
     * Create an instance of {@link InitResponse }
     * 
     */
    public InitResponse createInitResponse() {
        return new InitResponse();
    }

    /**
     * Create an instance of {@link GetCatsPagedResponse }
     * 
     */
    public GetCatsPagedResponse createGetCatsPagedResponse() {
        return new GetCatsPagedResponse();
    }

    /**
     * Create an instance of {@link GetCatsResponse }
     * 
     */
    public GetCatsResponse createGetCatsResponse() {
        return new GetCatsResponse();
    }

    /**
     * Create an instance of {@link AddCatResponse }
     * 
     */
    public AddCatResponse createAddCatResponse() {
        return new AddCatResponse();
    }

    /**
     * Create an instance of {@link FindCat }
     * 
     */
    public FindCat createFindCat() {
        return new FindCat();
    }

    /**
     * Create an instance of {@link FindCatResponse }
     * 
     */
    public FindCatResponse createFindCatResponse() {
        return new FindCatResponse();
    }

    /**
     * Create an instance of {@link GetCatsPaged }
     * 
     */
    public GetCatsPaged createGetCatsPaged() {
        return new GetCatsPaged();
    }

    /**
     * Create an instance of {@link DeleteCatResponse }
     * 
     */
    public DeleteCatResponse createDeleteCatResponse() {
        return new DeleteCatResponse();
    }

    /**
     * Create an instance of {@link GetCats }
     * 
     */
    public GetCats createGetCats() {
        return new GetCats();
    }

    /**
     * Create an instance of {@link AbstractObject }
     * 
     */
    public AbstractObject createAbstractObject() {
        return new AbstractObject();
    }

    /**
     * Create an instance of {@link Cat }
     * 
     */
    public Cat createCat() {
        return new Cat();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteCatResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kot.adamborowski.pl/", name = "deleteCatResponse")
    public JAXBElement<DeleteCatResponse> createDeleteCatResponse(DeleteCatResponse value) {
        return new JAXBElement<DeleteCatResponse>(_DeleteCatResponse_QNAME, DeleteCatResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCats }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kot.adamborowski.pl/", name = "getCats")
    public JAXBElement<GetCats> createGetCats(GetCats value) {
        return new JAXBElement<GetCats>(_GetCats_QNAME, GetCats.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddCatResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kot.adamborowski.pl/", name = "addCatResponse")
    public JAXBElement<AddCatResponse> createAddCatResponse(AddCatResponse value) {
        return new JAXBElement<AddCatResponse>(_AddCatResponse_QNAME, AddCatResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindCat }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kot.adamborowski.pl/", name = "findCat")
    public JAXBElement<FindCat> createFindCat(FindCat value) {
        return new JAXBElement<FindCat>(_FindCat_QNAME, FindCat.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindCatResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kot.adamborowski.pl/", name = "findCatResponse")
    public JAXBElement<FindCatResponse> createFindCatResponse(FindCatResponse value) {
        return new JAXBElement<FindCatResponse>(_FindCatResponse_QNAME, FindCatResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCatsPaged }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kot.adamborowski.pl/", name = "getCatsPaged")
    public JAXBElement<GetCatsPaged> createGetCatsPaged(GetCatsPaged value) {
        return new JAXBElement<GetCatsPaged>(_GetCatsPaged_QNAME, GetCatsPaged.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteCat }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kot.adamborowski.pl/", name = "deleteCat")
    public JAXBElement<DeleteCat> createDeleteCat(DeleteCat value) {
        return new JAXBElement<DeleteCat>(_DeleteCat_QNAME, DeleteCat.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InitResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kot.adamborowski.pl/", name = "initResponse")
    public JAXBElement<InitResponse> createInitResponse(InitResponse value) {
        return new JAXBElement<InitResponse>(_InitResponse_QNAME, InitResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCatsPagedResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kot.adamborowski.pl/", name = "getCatsPagedResponse")
    public JAXBElement<GetCatsPagedResponse> createGetCatsPagedResponse(GetCatsPagedResponse value) {
        return new JAXBElement<GetCatsPagedResponse>(_GetCatsPagedResponse_QNAME, GetCatsPagedResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCatsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kot.adamborowski.pl/", name = "getCatsResponse")
    public JAXBElement<GetCatsResponse> createGetCatsResponse(GetCatsResponse value) {
        return new JAXBElement<GetCatsResponse>(_GetCatsResponse_QNAME, GetCatsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddCat }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kot.adamborowski.pl/", name = "addCat")
    public JAXBElement<AddCat> createAddCat(AddCat value) {
        return new JAXBElement<AddCat>(_AddCat_QNAME, AddCat.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Init }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kot.adamborowski.pl/", name = "init")
    public JAXBElement<Init> createInit(Init value) {
        return new JAXBElement<Init>(_Init_QNAME, Init.class, null, value);
    }

}
