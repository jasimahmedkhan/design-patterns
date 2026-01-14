package SOLIDPrinciples.OCP.GoodCode;

public class CreditCard implements IPaymentMethod{
    @Override
    public void pay(double amount) {
        System.out.println("Making Payment via Credit Card " + amount);
    }
}
