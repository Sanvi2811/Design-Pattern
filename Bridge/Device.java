package Bridge;

public abstract class Device {
    protected brand brand;
    public Device(brand brand){
        this.brand  = brand;
    }

    abstract void device();
}
