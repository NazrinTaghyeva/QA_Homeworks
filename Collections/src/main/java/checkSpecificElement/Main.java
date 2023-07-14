package checkSpecificElement;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        System.out.println("Write the specific number");
        int specificNumber = sc.nextInt();
        System.out.print("Write the size of List:");
        int listSize = sc.nextInt();
        for (int i = 0; i < listSize; i++) {
            list.add((int) (Math.random()*100));
        }
        System.out.println(list);
        if (list.contains(specificNumber)){
            System.out.println("Specific element found");
        }else {
            System.out.println("Specific number not found");
        }
    }
}
