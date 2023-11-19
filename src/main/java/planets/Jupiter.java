package main.java.planets;

import main.java.Planets;

import static main.java.Game.clearScreen;
import static main.java.Game.playerLocation;
import static main.java.Util.actionChoice;
import static main.java.Util.arrivalMessage;

public class Jupiter {

    public static void jupiter(){
        playerLocation = Planets.JUPITER;

        clearScreen();
        arrivalMessage();
        actionChoice();
    }

}
