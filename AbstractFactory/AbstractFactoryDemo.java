package AbstractFactory;

public class AbstractFactoryDemo {
    public static void main(String[] args) {
        Factory w = new WindowFactory();
        w.install();
        System.out.println();
        Factory m = new MAcOsFactory();
        m.install();
    }
}
