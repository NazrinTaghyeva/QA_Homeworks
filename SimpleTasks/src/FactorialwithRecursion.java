import java.util.Scanner;

public class FactorialwithRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Include the number........");
        int number = sc.nextInt();
        if (number >=0) {
            int ans = factorialWithRecursion(number);
            System.out.println("Factorial is: " + ans);
        }else {
            System.out.println("This number is negative..............");
        }
    }

    public static int factorialWithRecursion(int num){
        if (num == 0){
            return 1;
        }else {
            return num * (factorialWithRecursion(num-1));
        }
    }
}