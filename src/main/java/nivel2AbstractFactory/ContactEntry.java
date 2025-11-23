package nivel2AbstractFactory;

public class ContactEntry {
    private Address address;
    private PhoneNumber phoneNumber;

    public ContactEntry(Address address, PhoneNumber phoneNumber) {
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Address: " + address.getFormattedAddress() +
                "\nPhone: " + phoneNumber.getFormattedNumber();
    }
}
