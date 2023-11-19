package main.java;

import java.util.Scanner;

import static main.java.EvilDeathRobot.theInevitableMarchingOfTime;
import static main.java.Game.clearScreen;
import static main.java.Game.turnsToGo;
import static main.java.Inventory.printInventory;
import static main.java.planets.Earth.earth;
import static main.java.planets.Jupiter.jupiter;
import static main.java.planets.Mars.mars;
import static main.java.planets.Mercury.mercury;
import static main.java.planets.Neptune.neptune;
import static main.java.planets.Saturn.saturn;
import static main.java.planets.Uranus.uranus;
import static main.java.planets.Venus.venus;

public class GameLoop {

    public static void gameLoop(){
        Scanner scan = new Scanner(System.in);

        if (turnsToGo == 0) {
            clearScreen();
            System.out.println("You couldn't fend off the destruction in time.");
            System.out.println("Game Over");
            return;
        }

        System.out.printf("Turns Until Universal Destruction: %s turns\n\n", turnsToGo);

        System.out.println("Where do you wish to travel?");
        for (Planets planet : Planets.values()){
            if (planet.number == -1) {
                continue;
            }
            System.out.println(planet.number + ": " + planet);
        }

        String firstChoice = scan.nextLine();
        int choice = 0;

        if (firstChoice.equalsIgnoreCase("inventory")){
            printInventory();
            gameLoop();
        } else {
            choice = Integer.parseInt(firstChoice);
        }

        Planets planetChoice = Planets.MERCURY;

        for (Planets planet : Planets.values()){
            if (planet.number == choice){
                planetChoice = planet;
            }
        }

        clearScreen();

        switch (planetChoice){
            case BREAK:
                System.out.println("Terminating Game...");
                break;
            case MERCURY:
                mercury();
                break;
            case VENUS:
                venus();
                break;
            case EARTH:
                earth();
                theInevitableMarchingOfTime();
                gameLoop();
                break;
            case MARS:
                mars();
                theInevitableMarchingOfTime();
                gameLoop();
                break;
            case JUPITER:
                jupiter();
                break;
            case SATURN:
                saturn();
                break;
            case URANUS:
                uranus();
                break;
            case NEPTUNE:
                neptune();
                break;
        }
    }
}
