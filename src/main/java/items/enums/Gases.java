package main.items.enums;

public enum Gases {

    HYDROGEN(1, 50),
    HELIUM3(2, 150),
    CO2(3, 45),
    H20(4, 15);

    public final int number;
    public final int value;

    Gases(int number, int value){
        this.number = number;
        this.value = value;
    }
}
