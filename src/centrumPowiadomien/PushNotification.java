package centrumPowiadomien;

public class PushNotification extends Notification {
    PushNotification(String message) {
        super(message);
    }

    @Override
    public void send() {
        System.out.print("Push");
    }
}
