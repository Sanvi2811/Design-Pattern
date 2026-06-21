package Bridge;

public class BridgeDemo {
    public static void main(String[] args) {
        Device Fan = new Fan(new LG());
        Fan.device();

        System.out.println();

        Device Light = new Light(new Havells());
        Light.device();
    
    }
}
