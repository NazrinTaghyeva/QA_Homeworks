package inventory;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Inventory {
    private HashMap<String, Integer> inventory;

    public Inventory() {
        inventory = new HashMap<>();
    }

    public Inventory(HashMap<String, Integer> inventory) {
        this.inventory = inventory;
    }

    public HashMap<String, Integer> getInventory() {
        return inventory;
    }

    public void setInventory(HashMap<String, Integer> inventory) {
        this.inventory = inventory;
    }

    public void addItem() {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many item do yo want to add?");
        int sizeItem = sc.nextInt();
        System.out.println("Write items and quantities...");
        for (int i = 0; i < sizeItem; i++) {
            inventory.put(sc.next(), sc.nextInt());
        }
        System.out.println("***Elements Successfully Added***");
     }

    public void printAllItems() {
        if (inventory.size() != 0) {
            for (Map.Entry<String, Integer> items : getInventory().entrySet()) {
                String itemsKey = items.getKey();
                int itemsValue = items.getValue();
                System.out.println(itemsKey + " " + itemsValue);
            }
        }else {
            System.out.println("This map is null");
        }
    }

    public void updateItem(String item,int newQuantity) {
        if (inventory.containsKey(item)) {
            inventory.put(item, newQuantity);
            System.out.println("Updated quantity of item:" + item + " " +  newQuantity );
        } else {
            System.out.println("Item not found in inventory:" );
        }

    }
    public boolean checkItem(String item){
        if (inventory.containsKey(item)){
            System.out.println("This item is exist");
        }else {
            System.out.println("This item is not exist");
        }
        return inventory.containsKey(item);
    }
    public void removeItem(String item){
        if (inventory.containsKey(item)){
            inventory.remove(item);
            System.out.println("Removed: " + item);
        }else {
            System.out.println("Item not found in inventory:");
        }
    }


}
