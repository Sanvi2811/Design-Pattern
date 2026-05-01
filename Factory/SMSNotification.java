package Factory;

public class SMSNotification implements Notification{

    @Override
    public void message() {
      System.out.println("SMS Notification");
    }
    
}
