package senderSystem;

public class EmailNotification extends Notification {
    public EmailNotification(String message) {
        super(message);
    }

    @Override
    void send() {
        System.out.println("Metoda Email: " + getMessage());
    }
}
