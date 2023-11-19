package main.java;

import static main.java.Game.turnsMultiplier;
import static main.java.Game.turnsToGo;

public class EvilDeathRobot {

    public static void theInevitableMarchingOfTime() {
        turnsToGo -= (1 * turnsMultiplier);
    }

    public static void useRefractionDelay() {
        turnsToGo += 5;
    }

}
