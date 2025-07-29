package rejestrWiadomosci;

public class EmailMassage extends Massage {
    EmailMassage(String massage) {
        super(massage);
    }

    @Override
    public void send() {
        System.out.print("Email: ");
    }
}
