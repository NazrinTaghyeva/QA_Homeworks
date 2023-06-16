import java.util.Scanner;

public class SumOfDigitNumb {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Include the number:)");
        int num = sc.nextInt();
        int sum = 0;
        while (num != 0) {
            int digitOfNumber = num % 10;
            sum += digitOfNumber;
            num = num / 10 ;

        }
        System.out.println(sum);
    }
}
