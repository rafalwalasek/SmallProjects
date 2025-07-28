package centrumPowiadomien;

public class PushNotification extends Notification {
    public PushNotification(String message) {
        super(message);
    }

    @Override
    public void send() {
        System.out.print("Push");
    }
}
