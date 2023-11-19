package main.java.actions;

import java.util.*;

import main.java.items.Item;
import main.java.items.enums.MetalIngots;
import main.java.items.enums.UnrefinedMetals;

import static main.java.Game.clearScreen;
import static main.java.Inventory.inventory;

public class Refinery {

    public static void refine() {
        List<Item> itemsToAdd = new ArrayList<>();

        Scanner scan = new Scanner(System.in);
        System.out.println("What would you like to refine?");

        String choice = scan.nextLine();

        if (!(choice.toUpperCase().contains("ORE"))){
            choice += "_ORE";
        }

        System.out.println(choice);

        for (Item item : inventory) {
            if (item.name.equalsIgnoreCase(choice)) {
                for (UnrefinedMetals metals : UnrefinedMetals.values()) {
                    if (choice.equalsIgnoreCase(metals.name())) {
                        for (MetalIngots metal : MetalIngots.values()) {
                            if (metals.number == metal.number) {
                                itemsToAdd.add(new Item(metal.name(), metal.value));
                                break;
                            }
                        }
                        break;
                    }
                }
            }
        }

        String finalChoice = choice;
        inventory.removeIf(item -> item.name.equalsIgnoreCase(finalChoice));
        inventory.addAll(itemsToAdd);
        clearScreen();
    }

}
