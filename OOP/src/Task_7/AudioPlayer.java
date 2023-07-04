package Task_7;

public class AudioPlayer implements Playable{

    @Override
    public void play() {
        System.out.println("Play Audio.....");
    }

    @Override
    public void stop() {
        System.out.println("Stop Audio.....");
    }
}
