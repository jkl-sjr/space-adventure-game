package main.java.actions;

import main.java.items.Item;

import java.util.ArrayList;
import java.util.List;

import static main.java.Game.playerStrength;
import static main.java.Inventory.inventory;
import main.java.items.enums.UnrefinedMetals;

public class Mine {
    // Gets num of items mined by player
    private static int numItemsMined = (int) (Math.random() * (30 * playerStrength) + 1);

    public static void mine() {
        // Initializes lists
        List<UnrefinedMetals> metalsMined = new ArrayList<>();

        for (int num = 0; num < numItemsMined; num++) {
            // Gets number from metal numbers
            int index = (int) (Math.random() * UnrefinedMetals.values().length);

            UnrefinedMetals metal = UnrefinedMetals.values()[(int) (Math.random() * UnrefinedMetals.values().length)];
            metalsMined.add(metal);
        }

        // Adds metals to inventory
        System.out.println("You mined:");
        for (UnrefinedMetals metal : metalsMined){
            inventory.add(new Item(metal.name(), metal.value));
            System.out.printf("%s: $%d\n", metal.name(), metal.value);
        }
    }
}
