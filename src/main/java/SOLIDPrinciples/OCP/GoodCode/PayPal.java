package SOLIDPrinciples.OCP.GoodCode;

public class PayPal implements IPaymentMethod{
    @Override
    public void pay(double amount) {
        System.out.println("Making Payment via PayPal " + amount);
    }

}
