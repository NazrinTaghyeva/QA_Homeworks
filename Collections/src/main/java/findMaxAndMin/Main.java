package findMaxAndMin;

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
        int max = list.get(0);
        int min = list.get(0);
        for (int i = 0; i < listSize; i++) {
            if (max < list.get(i)) {
                max = list.get(i);
            }
            if (min > list.get(i)){
                min = list.get(i);
            }
        }
        System.out.println(list);
        System.out.println("Max:" + max);
        System.out.println("Min:" + min);
    }
}
