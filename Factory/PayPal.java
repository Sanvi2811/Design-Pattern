package Factory;

public class PayPal implements Payment {

    @Override
    public void pay() {
        System.out.println("PayPal Payment");
    }
    
}
