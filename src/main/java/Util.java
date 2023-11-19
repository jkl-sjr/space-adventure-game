package main.java;

import java.util.Scanner;

import static main.java.Game.clearScreen;
import static main.java.Game.playerLocation;
import static main.java.GameLoop.gameLoop;
import static main.java.GasSyphon.gasSyphon;
import static main.java.Mine.mine;

public class Util {

    public static void arrivalMessage(){
        System.out.println("You have arrived on " + playerLocation + ". What do you wish to do now?");
    }

    public static void actionChoice() {
        Scanner scan = new Scanner(System.in);

        System.out.println("1. Mine for Rare Metals\n2. Syphon off Gases\n3. Leave");
        String choice = scan.nextLine();

        switch (choice){
            case "1":
                clearScreen();
                mine();
                break;
            case "2":
                clearScreen();
                gasSyphon();
                break;
            case "3":
                clearScreen();
                gameLoop();
                break;
            case "inventory":
                clearScreen();
                Inventory.printInventory();
                break;
            default:
                System.out.println("Invalid Input.");
                actionChoice();
                break;
        }
        gameLoop();
    }

}
