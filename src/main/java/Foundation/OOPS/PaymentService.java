package Foundation.OOPS;

import java.util.HashMap;

public class PaymentService {
    // Storing + Making payment
    HashMap<String, IPaymentMethod> paymentMethods = new HashMap<>();

    public void addPaymentMethod(String name, IPaymentMethod paymentMethod) {
        paymentMethods.put(name, paymentMethod);
    }

    public void makePayment(String name) {
        IPaymentMethod paymentMethod = paymentMethods.get(name);
        paymentMethod.pay(); // Run time Polymorphism
    }

}
