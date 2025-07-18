package paymentSystem;

public class BankTransferPayment implements PaymentMethod {
    @Override
    public void pay(double amount) {
        System.out.println("Przelew bankowy: " + amount + " zł");
    }
}
