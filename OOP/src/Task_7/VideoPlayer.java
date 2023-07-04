package Task_7;

public class VideoPlayer implements Playable {
    @Override
    public void play() {
        System.out.println("Play Video.....");
    }

    @Override
    public void stop() {
        System.out.println("Stop Video.....");
    }
}
