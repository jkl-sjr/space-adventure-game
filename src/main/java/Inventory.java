package main.java;

import main.items.Item;

import java.util.ArrayList;
import java.util.List;

import static main.java.Game.credits;

public class Inventory {
    public static List<Item> inventory = new ArrayList<>();

    public static void printInventory(){
        int inventoryValue = 0;

        System.out.println("\n");

        if (inventory.size() > 0) {
            for (Item item : inventory) {
                inventoryValue += item.value;
                System.out.printf("%s: $%d\n", item.name, item.value);
            }
        } else { System.out.println("Your inventory is empty. "); }
        System.out.printf("Inventory Value: $%d\n",inventoryValue);
        System.out.printf("Credits : $%d\n\n", credits);
    }

}
