package main.java.actions;

import main.items.Item;
import main.items.enums.Gases;

import java.util.ArrayList;
import java.util.List;

import static main.java.Game.playerScience;
import static main.java.Inventory.inventory;

public class GasSyphon {
    // Gets num of gases syphoned by player
    private static int numGasesSyphoned = (int) (Math.random() * (30 * playerScience) + 1);

    public static void gasSyphon() {
        // Initializes list
        List<Gases> gasesSyphoned = new ArrayList<>();

        for (int num = 0; num < numGasesSyphoned; num++) {
            // Gets random number from gas numbers
            int index = (int) (Math.random() * Gases.values().length);

            // Loops through gases finding one with index
            for (Gases gas : Gases.values()) {
                if (gas.number == index) {
                    gasesSyphoned.add(gas);
                }
            }
        }

        // Adds gases to inventory
        System.out.println("You syphoned:");
        for (Gases gas : gasesSyphoned){
            inventory.add(new Item(gas.name(), gas.value));
            System.out.printf("%s: $%d\n", gas.name(), gas.value);
        }
    }
}
