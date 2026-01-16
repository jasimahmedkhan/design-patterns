package SOLIDPrinciples.DIP.GoodCode;

public class SMSService implements INotificationChannel {
    @Override
    public void send(String msg) {
        System.out.println("Sending SMS " + msg);
    }
}
