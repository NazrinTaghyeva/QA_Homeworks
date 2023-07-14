package average;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        int sum = 0;
        System.out.print("Write the size of List:");
        int listSize = sc.nextInt();
        for (int i = 0; i < listSize; i++) {
            list.add(sc.nextInt());
            sum+=list.get(i);
        }
        System.out.println(list);
        System.out.println("Sum: " + sum/listSize);
    }
}
