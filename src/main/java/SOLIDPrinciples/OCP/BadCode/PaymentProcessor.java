package SOLIDPrinciples.OCP.BadCode;

 public class PaymentProcessor {

    public void processPayment(String paymentMethod, double amount){
        if (paymentMethod.equals("DebitCard")) {
            System.out.println("Processing payment via Debit Card" + amount);
        } else if (paymentMethod.equals("CreditCard")) {
            System.out.println("Processing payment via Credit Card" + amount);
        } else if (paymentMethod.equals("UPI")) {
            System.out.println("Processing payment via UPI" + amount);
        } else {
            throw new IllegalArgumentException("Invalid Payment Method");
        }
    }
}
