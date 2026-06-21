package Bridge;

public class Fan  extends Device{

    public Fan(brand brand){
        super(brand);
    }
    @Override
    void device() {
      System.out.println("This is Fan of ");
      brand.text();
    }
    
}
