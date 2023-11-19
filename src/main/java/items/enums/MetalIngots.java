package main.java.items.enums;

public enum MetalIngots {

    ALUMINUM(1, 50),
    IRON(2, 50),
    COBALT(3, 50),
    MAGNESIUM(4, 50),
    LEAD(5, 50),
    TIN(6, 50);

    public final int number;
    public final int value;

    MetalIngots(int number, int value) {
        this.number = number;
        this.value = value;
    }
}
