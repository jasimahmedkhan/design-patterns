package Foundation.OOPS;

public class Client {

    static void main(String[] args) {
        PaymentService paymentService = new PaymentService();
        paymentService.addPaymentMethod("JohnDebitCard", new DebitCard("1234567890", "John"));
        paymentService.addPaymentMethod("JohnCreditCard", new CreditCard("1234567890", "John") );
        paymentService.addPaymentMethod("JohnUPI", new UPI("john007") );

        paymentService.makePayment("JohnDebitCard");
        paymentService.makePayment("JohnCreditCard");
        paymentService.makePayment("JohnUPI");
    }
}
