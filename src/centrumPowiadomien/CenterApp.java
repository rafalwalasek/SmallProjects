package centrumPowiadomien;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;

public class CenterApp {
    public static void main(String[] args) {

        ArrayList<Notification> inbox = new ArrayList<>();
        LinkedList<Notification> toSendQueue = new LinkedList<>(inbox);
        HashSet<Notification> sentLog = new HashSet<>(toSendQueue);

        inbox.add(new EmailNotification("Cześć"));
        inbox.add(new SMSNotification("Kod: 1234"));
        inbox.add(new PushNotification("Nowa oferta"));
        inbox.add(new PushNotification("Nowa oferta"));
        inbox.add(new EmailNotification("Cześć"));
        inbox.add(new SMSNotification("Kod: 567"));

        for (Notification arrayNote : inbox) {
            arrayNote.send();
            System.out.println(arrayNote);
        }

        System.out.println("--------------------");

        toSendQueue.addAll(inbox);
        for (Notification linkedNote : toSendQueue) {
            linkedNote.send();
            System.out.println(linkedNote);
        }

        System.out.println("--------------------");

        sentLog.addAll(toSendQueue);
        for (Notification hashNote : sentLog) {
            hashNote.send();
            System.out.println(hashNote);
        }

    }
}
