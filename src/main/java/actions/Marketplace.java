package main.java.actions;

import main.java.items.Item;
import main.java.items.uniques.ScienceItem;
import main.java.items.uniques.StrengthItem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static main.java.Game.credits;
import static main.java.GameLoop.gameLoop;
import static main.java.Inventory.inventory;
import static main.java.items.uniques.ScienceItem.scienceItemNames;
import static main.java.items.uniques.StrengthItem.strengthItemNames;

public class Marketplace {
    static Scanner scan = new Scanner(System.in);
    static List<Item> itemsToSell = new ArrayList<>();
    static ArrayList<Item> tempShopItems = new ArrayList<>();
    static ArrayList<Item> shopItems = new ArrayList<>();

    public static void marketplace() {
        tempShopItems.clear();
        shopItems.clear();

        System.out.println("Would you like to buy or sell items today?");

        String choice = scan.nextLine();
        System.out.println();

        if (choice.equalsIgnoreCase("buy")) {
            buyItems();
        } else if (choice.equalsIgnoreCase("sell")) {
            sellItems();
        } else if (choice.equalsIgnoreCase("no")) {
            gameLoop();
        } else {
            System.out.println("That is not a valid option.");
            marketplace();
        }

    }

    public static void buyItems() {
        genMarket();
        for (Item item : shopItems) {
            System.out.printf("%s: $%d\n", item.name, item.value);
        }
        System.out.println();
        System.out.println("What would you like to buy?");
        String choice = scan.nextLine();
        System.out.println();

        for (Item item : shopItems) {
            if (item.name.equalsIgnoreCase(choice)) {
                if (credits >= item.value) {
                    inventory.add(item);
                    credits -= item.value;
                    System.out.printf("Bought %s for %d credits\n\n", item.name, item.value);
                } else {
                    System.out.println("You don't have enough credits to buy this item.");
                }
                break;
            }
        }
    }

    public static void sellItems() {
        System.out.println("What would you like to sell?");
        String choice = scan.nextLine();
        System.out.println();

        for (Item item : inventory) {
            if (item.name.equalsIgnoreCase(choice)){
                itemsToSell.add(item);
                credits += item.value;
            }
        }

        System.out.printf("Sold all %s\n\n", choice);
        inventory.removeAll(itemsToSell);

    }

    private static void genMarket() {
        for (int i = 0; i < 5; i++) {
            int randNum = (int) (Math.random() * 2 + 1);
            int itemValue = (int) (Math.random() * 56 + 45);

            if (randNum == 1) {
                int randElem = (int) (Math.random() * scienceItemNames.length);

                tempShopItems.add(new ScienceItem(scienceItemNames[randElem], itemValue, (float) (Math.random() / 4)));

            } else if (randNum == 2) {
                int randElem = (int) (Math.random() * strengthItemNames.length);

                tempShopItems.add(new StrengthItem(strengthItemNames[randElem], itemValue, (float) (Math.random() / 4)));
            }
        }
        removeDuplicates();
    }

    private static void removeDuplicates() {
        for (Item item : tempShopItems) {
            if (!(shopItems.contains(item))){
                shopItems.add(item);
            }
        }
    }
}
