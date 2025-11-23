package nivel2AbstractFactory;

public class JapanAddress implements Address {
    private String city;
    private String street;
    private String postalCode;

    public JapanAddress(String city, String street, String postalCode) {
        this.city = city;
        this.street = street;
        this.postalCode = postalCode;
    }

    @Override
    public String getFormattedAddress() {
        return postalCode + " " + city + ", " + street + ", Japan";
    }
}
