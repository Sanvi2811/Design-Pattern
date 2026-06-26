package Builder;

public class LaptopBuilder implements Builder {
private String Ram;
private String Storage;
private String Processor;
    @Override
    public LaptopBuilder setRam(String Ram) {
       this.Ram= Ram;
       return this;
    }

    @Override
    public LaptopBuilder setStorage(String Storage) {
        this.Storage = Storage;
        return this;
    }

    @Override
    public LaptopBuilder setProcessor(String Processor) {
       this.Processor = Processor;
       return this;
    }

    public Laptop build(){
        return new Laptop(Ram, Storage, Processor);
    }
    
}
