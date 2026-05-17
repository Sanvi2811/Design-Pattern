package Adapter;

public class AdapterDemo {
    public static void main(String[] args) {
        MediaPlayer m = new Adapter(new OldMediaPLayer());
        m.play();
    }
}
