package Factory;

public class Pushfactory implements Notificationfactory {

    @Override
    public Notification createNotification() {
       return new PushNotification();
    }  
}
