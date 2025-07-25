package senderSystem;

public class SMSNotification extends Notification {
    public SMSNotification(String message) {
        super(message);
    }

    @Override
    void send() {
        System.out.println("Metoda SMS: " + getMessage());
    }
}
