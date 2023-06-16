import java.util.Scanner;

public class SwapArraysNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write the Array Length");
        int arraysLength = sc.nextInt();
        int arr[] = new int[arraysLength];
        int middle = arraysLength / 2;
        System.out.println("Write Array Elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }


        for (int i = 0; i < middle; i++) {
            int temp = arr[i];
            arr[i] = arr[i + middle];
            arr[i + middle] = temp;

        }

        for (int i = 0; i < arraysLength; i++) {

            System.out.print(arr[i] + " ");
        }

    }
}
