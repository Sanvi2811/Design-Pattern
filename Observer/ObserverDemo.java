package Observer;

public class ObserverDemo {
    public static void main(String[] args) {
        StockStation s = new StockStation();
        Observer Mobileapp = new MobileApp();
        Observer Web = new Web();

        s.addObserver(Mobileapp);
        s.addObserver(Web);

        s.setprice(100);
        s.removeObserver(Mobileapp);
        s.setprice(50);
    }
}
