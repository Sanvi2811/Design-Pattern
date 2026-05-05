package Factory;

public class FactoryDemo {
    public static void main(String[] args) {
        PaymentFactory p = new UPIFactory();
        Payment z = p.createPayment();
        z.pay();
    }
}
