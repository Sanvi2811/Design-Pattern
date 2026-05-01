package Factory;

public class FactoryDemo {
    public static void main(String[] args) {
        Notificationfactory f = new Emailfactory();
        Notification email = f.createNotification();
        email.message();
        

    }
}
