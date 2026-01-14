package SOLIDPrinciples.OCP.GoodCode;

public class DebitCard implements IPaymentMethod{

    @Override
    public void pay(double amount) {
        System.out.println("Making Payment via Debit Card " + amount);
    }
}
