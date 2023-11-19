package main.java.planets;

import main.java.Planets;

import static main.java.Game.playerLocation;
import static main.java.Util.arrivalMessage;

public class Mars {

    public static void mars(){
        playerLocation = Planets.MARS;

        arrivalMessage();
    }

}
