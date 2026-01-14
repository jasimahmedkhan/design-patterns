package SOLIDPrinciples.OCP.GoodCode;

public class UPI implements IPaymentMethod{
    @Override
    public void pay(double amount) {
        System.out.println("Making payment via UPI " + amount);
    }
}
