package nivel2AbstractFactory;

public class USAContactFactory implements ContactFactory {

    @Override
    public Address createAddress(String city, String street, String postalCode) {
        return new USAAddress(city, street, postalCode);
    }

    @Override
    public PhoneNumber createPhoneNumber(String number) {
        return new USAPhoneNumber(number);
    }
}
