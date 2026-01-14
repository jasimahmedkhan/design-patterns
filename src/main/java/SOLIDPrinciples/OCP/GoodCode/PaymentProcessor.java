package SOLIDPrinciples.OCP.GoodCode;

public class PaymentProcessor {

    public void processPayment(IPaymentMethod paymentMethod, double amount){
        paymentMethod.pay(amount);
    }
}
