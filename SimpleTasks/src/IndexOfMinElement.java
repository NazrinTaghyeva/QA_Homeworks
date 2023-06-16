import java.util.Scanner;

public class IndexOfMinElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write the length of array: ");
        int len = sc.nextInt();
        int arr[] = new int[len];
        int minIndex = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int min = arr[0];


        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                minIndex = i;
            }
        }
        System.out.println("Minimum number is : "  + min + ", Minimum number index is: " + minIndex);

    }
}
