package inventory;

import java.util.Scanner;

public class InventoryMenu {
    public void menu(){
        boolean process = true;
        Scanner sc = new Scanner(System.in);
        Inventory inventory = new Inventory();
        while (process) {
            System.out.println("""
                    ******************* Which operation do you want choose? *********************
                    1.Add Item To Inventory
                    2.Update  Quantity Existing Item
                    3.Remove Item From Inventory
                    4.Check Item
                    5.Print All Items
                    6.Exit
                    """);
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    inventory.addItem();
                    break;
                case 2:
                    System.out.println("Which Item do you want update? Write the key this element:");
                    String item = sc.next();
                    System.out.println("Write new Quantity:");
                    int newQuantity = sc.nextInt();
                    inventory.updateItem(item,newQuantity);
                    break;
                case 3:
                    System.out.println("Which Item do you want remove? Write the key this element:");
                    String removeItem = sc.next();
                    inventory.removeItem(removeItem);
                    break;
                case 4:
                    System.out.println("Which item do you want Check? Write the key this element:");
                    String checkItem = sc.next();
                    inventory.checkItem(checkItem);
                    break;
                case 5:
                    inventory.printAllItems();
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    System.out.println("This operation is invalid:(");
            }
            System.out.println("Do you want continue? Yes/No");
            String ans = sc.next();
            if (ans.equalsIgnoreCase("Yes")){
                process = true;
            }else {
                System.exit(0);
            }
        }
    }
}
