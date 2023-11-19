package main.java.planets;

import main.java.Planets;

import static main.java.Game.playerLocation;
import static main.java.Util.arrivalMessage;
import static main.java.actions.Refinery.refine;

public class Mars {

    public static void mars(){
        playerLocation = Planets.MARS;

        arrivalMessage();
        refine();
    }

}
