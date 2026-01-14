package SOLIDPrinciples.SRP.GoodCode;

public class Invoice {

    private double amount;

    //Additional Functionality
    public void generateInvoice(){
        System.out.println("Invoice generated & printed for amount " + amount);
    }

}
