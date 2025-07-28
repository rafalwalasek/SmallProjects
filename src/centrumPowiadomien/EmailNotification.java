package centrumPowiadomien;

public class EmailNotification extends Notification {
    public EmailNotification(String message) {
        super(message);
    }

    @Override
    public void send() {
        System.out.print("Email");
    }
}
