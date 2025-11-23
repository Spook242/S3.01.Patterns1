package nivel2AbstractFactory;

public class USAAddress implements Address {
    private String city;
    private String street;
    private String postalCode;

    public USAAddress(String city, String street, String postalCode) {
        this.city = city;
        this.street = street;
        this.postalCode = postalCode;
    }

    @Override
    public String getFormattedAddress() {
        return street + ", " + city + " " + postalCode + ", USA";
    }
}
