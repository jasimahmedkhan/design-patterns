package SOLIDPrinciples.OCP.GoodCode;

public class Main {
    public static void main(String[] args) {
        PaymentProcessor paymentProcessor = new PaymentProcessor();
        paymentProcessor.processPayment(new CreditCard(), 1000);
    }
}
