package Builder;

public class PhoneBuilder implements Builder{
private String Ram;
private String Storage;
private String Processor;
@Override
public PhoneBuilder setRam(String Ram) {
    this.Ram = Ram;
    return this;
}
@Override
public PhoneBuilder setStorage(String Storage) {
   this.Storage = Storage;
   return this;
}
@Override
public PhoneBuilder setProcessor(String Processor) {
    this.Processor = Processor;
    return this;
}

public Phone build() {
   return new Phone(Ram,Storage,Processor);
}
    
}
