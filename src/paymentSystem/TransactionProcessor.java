package paymentSystem;

public class TransactionProcessor {
    public void processPayment(PaymentMethod method, double amount) {
        method.pay(amount);
    }
}
