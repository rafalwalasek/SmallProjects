package senderSystem;

public class PushNotification extends Notification {
    PushNotification(String message) {
        super(message);
    }

    @Override
    void send() {
        System.out.println("Metoda Push: " + getMessage());
    }
}
