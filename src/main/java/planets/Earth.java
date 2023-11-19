package main.java.planets;

import main.java.Planets;

import static main.java.Game.playerLocation;
import static main.java.actions.Marketplace.marketplace;

public class Earth {

    public static void earth(){
        playerLocation = Planets.EARTH;

        System.out.println("Welcome back home traveler");
        marketplace();

    }

}
