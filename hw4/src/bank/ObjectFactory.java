
package bank;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the bank package. 
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

    private final static QName _AccountExists_QNAME = new QName("http://bank/", "AccountExists");
    private final static QName _AccountBalanceResponse_QNAME = new QName("http://bank/", "AccountBalanceResponse");
    private final static QName _AccountBalance_QNAME = new QName("http://bank/", "AccountBalance");
    private final static QName _ChangeBalanceResponse_QNAME = new QName("http://bank/", "ChangeBalanceResponse");
    private final static QName _AccountExistsResponse_QNAME = new QName("http://bank/", "AccountExistsResponse");
    private final static QName _ChangeBalance_QNAME = new QName("http://bank/", "ChangeBalance");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: bank
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ChangeBalanceResponse }
     * 
     */
    public ChangeBalanceResponse createChangeBalanceResponse() {
        return new ChangeBalanceResponse();
    }

    /**
     * Create an instance of {@link ChangeBalance }
     * 
     */
    public ChangeBalance createChangeBalance() {
        return new ChangeBalance();
    }

    /**
     * Create an instance of {@link AccountExistsResponse }
     * 
     */
    public AccountExistsResponse createAccountExistsResponse() {
        return new AccountExistsResponse();
    }

    /**
     * Create an instance of {@link AccountBalanceResponse }
     * 
     */
    public AccountBalanceResponse createAccountBalanceResponse() {
        return new AccountBalanceResponse();
    }

    /**
     * Create an instance of {@link AccountBalance }
     * 
     */
    public AccountBalance createAccountBalance() {
        return new AccountBalance();
    }

    /**
     * Create an instance of {@link AccountExists }
     * 
     */
    public AccountExists createAccountExists() {
        return new AccountExists();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccountExists }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bank/", name = "AccountExists")
    public JAXBElement<AccountExists> createAccountExists(AccountExists value) {
        return new JAXBElement<AccountExists>(_AccountExists_QNAME, AccountExists.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccountBalanceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bank/", name = "AccountBalanceResponse")
    public JAXBElement<AccountBalanceResponse> createAccountBalanceResponse(AccountBalanceResponse value) {
        return new JAXBElement<AccountBalanceResponse>(_AccountBalanceResponse_QNAME, AccountBalanceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccountBalance }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bank/", name = "AccountBalance")
    public JAXBElement<AccountBalance> createAccountBalance(AccountBalance value) {
        return new JAXBElement<AccountBalance>(_AccountBalance_QNAME, AccountBalance.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChangeBalanceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bank/", name = "ChangeBalanceResponse")
    public JAXBElement<ChangeBalanceResponse> createChangeBalanceResponse(ChangeBalanceResponse value) {
        return new JAXBElement<ChangeBalanceResponse>(_ChangeBalanceResponse_QNAME, ChangeBalanceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccountExistsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bank/", name = "AccountExistsResponse")
    public JAXBElement<AccountExistsResponse> createAccountExistsResponse(AccountExistsResponse value) {
        return new JAXBElement<AccountExistsResponse>(_AccountExistsResponse_QNAME, AccountExistsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChangeBalance }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bank/", name = "ChangeBalance")
    public JAXBElement<ChangeBalance> createChangeBalance(ChangeBalance value) {
        return new JAXBElement<ChangeBalance>(_ChangeBalance_QNAME, ChangeBalance.class, null, value);
    }

}
