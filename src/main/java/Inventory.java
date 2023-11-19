package main.java;

import main.java.items.Item;
import main.java.items.uniques.StrengthItem;
import main.java.items.uniques.ScienceItem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static main.java.Game.*;

public class Inventory {
    public static List<Item> inventory = new ArrayList<>();
    static Scanner scan = new Scanner(System.in);

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
        System.out.printf("Credits : $%d\n", credits);
        System.out.printf("Strength  : %.2f\n", playerStrength);
        System.out.printf("Science : %.2f\n\n", playerScience);

        useInventoryItem();
        clearScreen();
    }

    static void useInventoryItem() {
        System.out.println("Would you like to use any items?");
        String choice = scan.nextLine();
        Item itemToUse = null;

        if (choice.equalsIgnoreCase("yes")) {
            System.out.println("Which item would you like to use?");
            String itemChoice = scan.nextLine();

            for (Item item : inventory) {
                if (itemChoice.equalsIgnoreCase(item.name)) {
                    if (item instanceof ScienceItem) {
                        ((ScienceItem) item).useItem();
                    } else if (item instanceof StrengthItem) {
                        ((StrengthItem) item).useItem();
                    }
                    itemToUse = item;

                }
            }

            inventory.remove(itemToUse);
        } else if (choice.equalsIgnoreCase("no")) {
            System.out.println();
            return;
        } else {
            System.out.println("That is not a valid option.");
            useInventoryItem();
        }

        System.out.println();
    }

}
