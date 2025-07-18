package paymentSystem;

public class PayPalPayment implements PaymentMethod {
    @Override
    public void pay(double amount) {
        System.out.println("Płatność PayPal: " + amount + " zł");
    }
}
