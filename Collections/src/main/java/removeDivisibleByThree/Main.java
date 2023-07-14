package removeDivisibleByThree;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        System.out.print("Write the size of List:");
        int listSize = sc.nextInt();
        System.out.println("Write the List Elements:");
        for (int i = 0; i < listSize; i++) {
            list.add(sc.nextInt());
        }
        for (int i = 0; i < listSize; i++) {
            if (list.get(i) % 3 != 0) {
                System.out.print(list.get(i) + " ");
            }
        }
    }
}
