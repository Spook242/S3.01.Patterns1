package nivel2AbstractFactory;

public interface ContactFactory {
    Address createAddress(String city, String street, String postalCode);
    PhoneNumber createPhoneNumber(String number);
}
