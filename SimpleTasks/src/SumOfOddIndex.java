import java.util.Scanner;

public class SumOfOddIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write the length of array: ");
        int len = sc.nextInt();
        int arr[] = new int[len];
        int sumOddIndex = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {

            if (i % 2 != 0){
                sumOddIndex += arr[i];
            }
        }

        System.out.println("SumOddIndex is : " + sumOddIndex);

    }
}
