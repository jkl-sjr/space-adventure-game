package main.java.planets;

import main.java.Planets;

import static main.java.Game.clearScreen;
import static main.java.Game.playerLocation;
import static main.java.Util.actionChoice;
import static main.java.Util.arrivalMessage;

public class Neptune {

    public static void neptune(){
        playerLocation = Planets.NEPTUNE;

        clearScreen();
        arrivalMessage();
        actionChoice();
    }

}
