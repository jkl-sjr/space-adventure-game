package main.java.planets;

import main.java.Planets;

import static main.java.Game.clearScreen;
import static main.java.Game.playerLocation;
import static main.java.Util.actionChoice;
import static main.java.Util.arrivalMessage;

public class Uranus {

    public static void uranus(){
        playerLocation = Planets.URANUS;

        clearScreen();
        arrivalMessage();
        actionChoice();
    }

}
