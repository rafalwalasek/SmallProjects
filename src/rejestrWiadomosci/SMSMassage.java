package rejestrWiadomosci;

public class SMSMassage extends Massage {
    SMSMassage(String content) {
        super(content);
    }

    @Override
    public void send() {
        System.out.print("SMS: ");
    }
}
