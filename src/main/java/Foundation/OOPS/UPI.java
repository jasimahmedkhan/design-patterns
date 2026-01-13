package Foundation.OOPS;

import lombok.Getter;
import lombok.Setter;

public class UPI implements IPaymentMethod{

    @Getter
    @Setter
    private String upiId;

    public UPI(String upiId) {
        this.upiId = upiId;
    }

    @Override
    public void pay() {
        System.out.println("Making payment via UPI");
    }
}
