package main.java.items.uniques;

import main.java.items.Item;

import static main.java.Game.playerStrength;

public class StrengthItem extends Item {
    public float strengthIncrease;

    public static String[] strengthItemNames = {"Dumbbell", "Jump Rope", "Treadmill", "Pickaxe", "Miner's Helmet", "Gas Mask"};

    public StrengthItem(String name, int value, float strengthIncrease) {
        super(name, value);
        this.strengthIncrease = strengthIncrease;
    }

    public void useItem() {
        playerStrength += strengthIncrease;
    }
}
