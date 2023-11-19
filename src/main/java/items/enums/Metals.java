package main.items.enums;

public enum Metals {

    ALUMINIUM_ORE(1,2),
    IRON_ORE(2,1),
    COBALT_ORE(3,3),
    MAGNESIUM_ORE(4,2);

    public final int number;
    public final int value;

    Metals (int number, int value) {
        this.number = number;
        this.value = value;
    }

}
