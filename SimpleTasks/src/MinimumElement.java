import java.util.Scanner;

public class MinimumElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write the length of array: ");
        int len = sc.nextInt();
        int arr[] = new int[len];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int min = arr[0];


        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Minimum number is : " + min);

    }
}
