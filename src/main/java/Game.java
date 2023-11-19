package main.java;

import static main.java.GameLoop.gameLoop;

public class Game {
    // public static boolean isAlive = true;
    public static Planets playerLocation;
    public static int credits;
    public static float playerStrength = 0.1f;
    public static float playerScience = 0.1f;

    public static void main(String[] args) {
        System.out.println("You are a space explorer wishing to explore the Solar System.");
        gameLoop();
    }

    public static void clearScreen(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

}
