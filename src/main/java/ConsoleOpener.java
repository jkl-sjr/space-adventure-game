package main.java;

import java.io.*;
import java.awt.GraphicsEnvironment;
import java.net.URISyntaxException;
public class ConsoleOpener {
    public static void main (String [] args) throws IOException, InterruptedException, URISyntaxException{
        Console console = System.console();
        if(console == null && !GraphicsEnvironment.isHeadless()){
            String filename = ConsoleOpener.class.getProtectionDomain().getCodeSource().getLocation().toString().substring(6);
            Runtime.getRuntime().exec(new String[]{"cmd","/c","start","cmd","/k","java -jar \"" + filename + "\""});
        }else{
            Game.main(new String[0]);
            System.out.println("Program has ended, please type 'exit' to close the console");
        }
    }
}
