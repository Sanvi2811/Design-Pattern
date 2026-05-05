package Factory;

public class UPIFactory implements PaymentFactory{

    @Override
    public Payment createPayment() {
        return new UPI();
    }
    
}
