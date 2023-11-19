package main.java;

import static main.java.GameLoop.gameLoop;

/*
    TODO:
        1: Implement Gas Syphon >/
        2: Implement Game Looping >/
        3. Break game loop
            3.1 Implement Hard Break >/
            3.2 Implement End Sequence
        4: Implement Mars >/
            4.1: Implement Refinery >/
        5: Implement Earth
            5.1: Implement Marketplace
*/

public class Game {
    // public static boolean isAlive = true;
    public static Planets playerLocation;
    public static int credits; // to be implemented with marketplace
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
