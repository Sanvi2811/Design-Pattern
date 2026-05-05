package Factory;

public class UPI implements Payment {

    @Override
    public void pay() {
        System.out.println("UPI Payment");
    }
    
}
