package nivel2AbstractFactory;

public class JapanPhoneNumber implements PhoneNumber {
    private String number;

    public JapanPhoneNumber(String number) {
        this.number = number;
    }

    @Override
    public String getFormattedNumber() {
        return "+81 " + number;
    }
}
