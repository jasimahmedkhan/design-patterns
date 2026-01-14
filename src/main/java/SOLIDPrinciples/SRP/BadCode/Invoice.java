package SOLIDPrinciples.SRP.BadCode;

public class Invoice {

    private double amount;

    //Additional Functionality
    public void generateInvoice(){
        System.out.println("Invoice generated & printed for amount " +amount);
    }

    public void saveToDatabase(){
        System.out.println("Saving invoice to Database ");
    }

    public void sendEmailNotification(){
        System.out.println("Sending email notification for invoice ");
    }


}
