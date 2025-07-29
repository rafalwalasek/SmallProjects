package rejestrWiadomosci;

import java.util.ArrayList;
import java.util.HashSet;

public class RejestrApp {
    public static void main(String[] args) {

        ArrayList<Massage> massageHistory = new ArrayList<>();

        massageHistory.add(new EmailMassage("Cześć!"));
        massageHistory.add(new PushMassage("Ala ma kota"));
        massageHistory.add(new SMSMassage("Pin: 3532"));
        massageHistory.add(new PushMassage("Ala ma byka"));
        massageHistory.add(new EmailMassage("O! Jeeeee....."));
        massageHistory.add(new PushMassage("12 Tak"));
        massageHistory.add(new SMSMassage("Pin: 9999"));
        massageHistory.add(new PushMassage("Ala ma byka"));
        massageHistory.add(new EmailMassage("O! Jeeeee....."));
        massageHistory.add(new PushMassage("Ala ma kota"));
        massageHistory.add(new SMSMassage("Pin: 3532"));

        for (Massage massage : massageHistory) {
            massage.send();
            System.out.println(massage);
        }

        System.out.println("--------------------------------");
        HashSet<Massage> uniqueSentMessages = new HashSet<>(massageHistory);
        uniqueSentMessages.addAll(massageHistory);

        for (Massage massage : uniqueSentMessages) {
            massage.send();
            System.out.println(massage);
        }

        System.out.println("--------------------------------");
        System.out.println("Ilosc wiadomosci: " + massageHistory.size());
        System.out.println("Ilosc unikalnych wiadomosci: " + uniqueSentMessages.size());

    }
}
