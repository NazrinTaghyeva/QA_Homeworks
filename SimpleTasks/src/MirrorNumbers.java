import java.util.Scanner;

public class MirrorNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numb = sc.nextInt();
        int reverse = 0;
        while (numb != 0) {

            int a = numb % 10;
            reverse = reverse * 10 + a;
            numb = numb / 10;

        }

        System.out.println(reverse);
    }
}
