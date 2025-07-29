package senderSystem;

public abstract class Notification {
    private final String message;

    Notification(String message) {
        this.message = message;
    }

    String getMessage() {
        return message;
    }

    abstract void send();
}
