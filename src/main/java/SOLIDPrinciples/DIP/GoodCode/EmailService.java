package SOLIDPrinciples.DIP.GoodCode;

public class EmailService implements INotificationChannel {
    @Override
    public void send(String msg) {
        System.out.println("Sending Email " + msg);
    }
}
