package Task_3;

public class Main {
    public static void main(String[] args) {
     Media media[] = {new Movie(),new Music()};
     for (int i = 0 ; i< media.length;i++){
         Media m = media[i];
         m.play();
     }
    }
}
