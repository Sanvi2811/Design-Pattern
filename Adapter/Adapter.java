package Adapter;

public class Adapter implements MediaPlayer {
private OldMediaPLayer old;

public Adapter(OldMediaPLayer old){
    this .old = old;
}

    @Override
    public void play() {
    old.playMP3();
    }
    
}
