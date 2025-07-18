package paymentSystem;

public class CreditCardPayment implements PaymentMethod {
    @Override
    public void pay(double amount) {
        System.out.println("Płatność kartą: " + amount + " zł");
    }
}
