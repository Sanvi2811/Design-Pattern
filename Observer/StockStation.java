package Observer;

import java.util.ArrayList;
import java.util.List;

public class StockStation  implements Subject{
private List<Observer> observer = new ArrayList<>();
private int price;

     public void setprice(int price){
            this.price = price;
            Notify();
        }
    @Override
    public void addObserver(Observer o) {
        observer.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observer.remove(o);
    }

    @Override
    public void Notify() {
        for(Observer o : observer){
            o.update(price);
        }
    }
    
}
