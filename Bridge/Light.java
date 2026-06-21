package Bridge;

public class Light extends Device {

    public Light(Bridge.brand brand) {
        super(brand);
    }

    @Override
    void device() {
        System.out.println("This is Light Of ");
        brand.text();
    }
    
}
