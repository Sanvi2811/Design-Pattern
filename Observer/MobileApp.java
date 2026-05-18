package Observer;

public class MobileApp implements Observer {

    @Override
    public void update(int price) {
        System.out.println(" Mobile app Price "+price);
    }
    
}
