package checkSpecificElement;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SpecificNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        list.add(15);
        list.add(20);
        list.add(10);
        list.add(30);
        list.add(45);
        list.add(50);
        System.out.println(list);
        System.out.println("Write Specific Number: ");
        int specificNumber = scanner.nextInt();
        if (list.contains(specificNumber)){
            System.out.println("Specific number  found");
        }else {
            System.out.println("Specific number not found");
        }
    }
}
