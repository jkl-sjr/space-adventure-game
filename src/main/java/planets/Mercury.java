package main.java.planets;

import main.java.Planets;

import static main.java.Game.clearScreen;
import static main.java.Game.playerLocation;
import static main.java.Util.actionChoice;
import static main.java.Util.arrivalMessage;

public class Mercury {

    public static void mercury(){
        playerLocation = Planets.MERCURY;

        clearScreen();
        arrivalMessage();
        actionChoice();
    }

}
