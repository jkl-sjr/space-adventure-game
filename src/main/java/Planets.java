package main.java;

public enum Planets {
    BREAK(-1), // ends game sequence
    MERCURY(1),
    VENUS(2),
    EARTH(3),
    MARS(4),
    JUPITER(5),
    SATURN(6),
    URANUS(7),
    NEPTUNE(8);

    final int number;

    Planets(int number){
        this.number = number;
    }
}
