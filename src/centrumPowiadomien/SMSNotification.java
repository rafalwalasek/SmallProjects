package centrumPowiadomien;

public class SMSNotification extends Notification {
    SMSNotification(String message) {
        super(message);
    }

    @Override
    public void send() {
        System.out.print("SMS");
    }
}
