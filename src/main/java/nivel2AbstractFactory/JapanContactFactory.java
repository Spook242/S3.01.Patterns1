package nivel2AbstractFactory;

public class JapanContactFactory implements ContactFactory {

    @Override
    public Address createAddress(String city, String street, String postalCode) {
        return new JapanAddress(city, street, postalCode);
    }

    @Override
    public PhoneNumber createPhoneNumber(String number) {
        return new JapanPhoneNumber(number);
    }
}
