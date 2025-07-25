package senderSystem;

import java.util.ArrayList;
import java.util.List;

public class SendApp {
    public static void main(String[] args) {

        List<Notification> notifications = new ArrayList<>();

        notifications.add(new EmailNotification("wiadomosc 1"));
        notifications.add(new PushNotification("kolejna wiadomosc"));
        notifications.add(new SMSNotification("test wiadomosci"));

        for (Notification notification : notifications) {
            notification.send();
        }

    }
}
