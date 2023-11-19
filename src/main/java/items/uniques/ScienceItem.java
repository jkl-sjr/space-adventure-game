package main.java.items.uniques;

import main.java.items.Item;

import static main.java.Game.playerScience;

public class ScienceItem extends Item {
    public float scienceIncrease;

    public static String[] scienceItemNames = {"Goggles", "Lab Coat", "Microscope", "Chemistry Set", "Experiment Contract"};

    public ScienceItem(String name, int value, float scienceIncrease) {
        super(name, value);
        this.scienceIncrease = scienceIncrease;
    }

    public void useItem() {
        playerScience += scienceIncrease;
    }
}
