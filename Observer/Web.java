package Observer;

public class Web  implements Observer{

    @Override
    public void update(int price) {
      System.out.println(" Web Price " +price);
    }
    
}
