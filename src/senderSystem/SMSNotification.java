package senderSystem;

public class SMSNotification extends Notification {
    SMSNotification(String message) {
        super(message);
    }

    @Override
    void send() {
        System.out.println("Metoda SMS: " + getMessage());
    }
}
