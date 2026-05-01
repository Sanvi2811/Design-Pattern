package Factory;

public class SMSfactory implements Notificationfactory {

    @Override
    public Notification createNotification() {
       return new SMSNotification();
       
    }
    
}
