package contacts;

public class Contact {
    private String username;
    private String mail;
    private String cardNumber;
    private String street;
    private String city;
    private String zip;
 
    public Contact(){
        this("kuchajar","kuchajar@fit.cvut.cz","1234-1234-1234-1234","street","city","zip");
    }
 
    public Contact(String username, String mail, String cardNumber,
            String street, String city, String zip) {
        super();
        this.username = username;
        this.mail = mail;
        this.cardNumber = cardNumber;
        this.street = street;
        this.city = city;
        this.zip = zip;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getMail() {
        return mail;
    }
    public void setMail(String mail) {
        this.mail = mail;
    }
    public String getCardNumber() {
        return cardNumber;
    }
    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }
    public String getStreet() {
        return street;
    }
    public void setStreet(String street) {
        this.street = street;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getZip() {
        return zip;
    }
    public void setZip(String zip) {
        this.zip = zip;
    }
}
