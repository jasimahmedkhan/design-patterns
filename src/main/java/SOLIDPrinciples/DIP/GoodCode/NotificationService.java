package SOLIDPrinciples.DIP.GoodCode;

public class NotificationService {
    private final INotificationChannel INotificationChannel;

    public NotificationService(INotificationChannel channel){
        this.INotificationChannel = channel;
    }

    public void notify(String msg){
        INotificationChannel.send(msg);
    }
}
