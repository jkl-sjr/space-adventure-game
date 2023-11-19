package main.java.items.enums;

public enum UnrefinedMetals {

    ALUMINIUM_ORE(1,2),
    IRON_ORE(2,1),
    COBALT_ORE(3,3),
    MAGNESIUM_ORE(4,2),
    LEAD_ORE(5, 3),
    TIN_ORE(6, 2);

    public final int number;
    public final int value;

    UnrefinedMetals(int number, int value) {
        this.number = number;
        this.value = value;
    }

}
