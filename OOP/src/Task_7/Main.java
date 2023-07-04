package Task_7;

public class Main {
    public static void main(String[] args) {
     Playable playable[] = {
             new AudioPlayer(),
             new VideoPlayer()
     };
     for (int i = 0; i< playable.length;i++){
         Playable playable1 = playable[i];
         playable1.play();
         playable1.stop();
     }
    }
}
