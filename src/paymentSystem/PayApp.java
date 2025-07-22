package paymentSystem;

public class PayApp {
    public static void main(String[] args) {
        TransactionProcessor tp = new TransactionProcessor();
        tp.processPayment(new PayPalPayment(), 400);
        tp.processPayment(new BankTransferPayment(), 2000);
        tp.processPayment(new CreditCardPayment(), 40000);
    }
}
