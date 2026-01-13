package Foundation.OOPS;

public class Wallet implements IPaymentMethod{
    @Override
    public void pay() {
        System.out.println("Making payment via Wallet");
    }
}
