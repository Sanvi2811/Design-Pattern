package Builder;

public class Phone {
    private String Ram;
    private String Storage;
    private String Processor;

    public Phone(String Ram, String Storage, String Processor){
        this. Ram = Ram;
        this.Storage = Storage;
        this.Processor = Processor;
    }

    @Override
    public String toString(){
        return Ram+" "+Storage+" "+Processor;
    }

}
