package rejestrWiadomosci;

public class PushMassage extends Massage {
    PushMassage(String content) {
        super(content);
    }

    @Override
    public void send() {
        System.out.print("Push: ");
    }
}
