package Factory;

public class CreditCardFactory implements PaymentFactory {

    @Override
    public Payment createPayment() {
     return new CreditCard();
    }
    
}
