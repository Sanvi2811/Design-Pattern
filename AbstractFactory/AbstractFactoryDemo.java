package AbstractFactory;

public class AbstractFactoryDemo {
   public static void main(String[] args) {
    Factory f = new LightTheme();
    f.install();
    System.out.println();
    f = new DarkTheme();
    f.install();
   } 
}
