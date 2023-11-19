package main.java.actions;

import main.java.items.Item;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static main.java.Game.credits;
import static main.java.GameLoop.gameLoop;
import static main.java.Inventory.inventory;

public class Marketplace {
    static Scanner scan = new Scanner(System.in);
    static List<Item> itemsToSell = new ArrayList<>();

    public static void marketplace() {


        System.out.println("Would you like to buy or sell items today?");

        String choice = scan.nextLine();

        if (choice.equalsIgnoreCase("buy")) {
            return;
        } else if (choice.equalsIgnoreCase("sell")) {
            sellItems();
        } else if (choice.equalsIgnoreCase("no")) {
            gameLoop();
        } else {
            System.out.println("That is not a valid option.");
            marketplace();
        }

    }

    public static void sellItems() {
        System.out.println("What would you like to sell?");
        String choice = scan.nextLine();

        for (Item item : inventory) {
            if (item.name.equalsIgnoreCase(choice)){
                itemsToSell.add(item);
                credits += item.value;
            }
        }

        inventory.removeAll(itemsToSell);

    }
}
