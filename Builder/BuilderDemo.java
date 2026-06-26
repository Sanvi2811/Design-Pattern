package Builder;

public class BuilderDemo {
    public static void main(String[] args) {
        Phone b = new PhoneBuilder().setRam("Ram").setStorage("Battery").setProcessor("CPU").build();
        System.out.println(b);



    Laptop a = new LaptopBuilder().setRam("Ram").setStorage("Battery").setProcessor("GPU").build();
        System.out.println(a);
    }
}
