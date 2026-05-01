package Factory;

public class Emailfactory implements Notificationfactory {

    @Override
    public Notification createNotification() {
       return new EmailNotification();
    }
    
}
