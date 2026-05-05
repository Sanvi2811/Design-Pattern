package Factory;

public class PayPalFactory implements PaymentFactory {

    @Override
    public Payment createPayment() {
       return new PayPal();
    }
    
}
