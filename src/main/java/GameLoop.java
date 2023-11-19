package main.java;

import java.util.Scanner;

import static main.java.Game.clearScreen;
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

        System.out.println("Where do you wish to travel?");
        for (Planets planet : Planets.values()){
            if (planet.number == -1) {
                continue;
            }
            System.out.println(planet.number + ": " + planet);
        }

        int choice = scan.nextInt();

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
                break;
            case MARS:
                mars();
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
