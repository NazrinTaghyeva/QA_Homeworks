import java.util.Scanner;

public class CountOfOddElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array length...");
        int length = sc.nextInt();
        int arr[] = new int[length];
        System.out.println("Enter array elements..");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                System.out.println(arr[i]);
            }
        }

    }
}
