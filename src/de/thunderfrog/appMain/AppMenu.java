package de.thunderfrog.appMain;

import de.thunderfrog.appModules.ifelse;
import de.thunderfrog.utils.Logger;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AppMenu {

    // Draw the Option Menu
    public static void drawOption() throws IOException, InterruptedException {
        // BufferedReader for Readline
        BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
        // User Input
        String input;
        // Base Menu
        Logger.log("Please select an option:");
        Logger.log("|----------------------|");
        Logger.log("(1) => String");
        Logger.log("(2) => Integer");
        Logger.log("(3) => Boolean");
        Logger.log("(4) => Float");
        Logger.log("(5) => Double");
        Logger.log("_______________________");
        Logger.log("(6) => If / Else");
        Logger.log("(7) => While Loop");
        Logger.log("(8) => Try Catch");
        Logger.log("(9) => Error Handling");
        Logger.log("_______________________");
        Logger.log("(0) => Exit App");
        Logger.log("|----------------------|");
        // Readline User Input
        input = obj.readLine();
        switchMenu(input);

    }

    public static void switchMenu(String sid) throws IOException, InterruptedException {
        // String to Int
        int id = Integer.parseInt(sid);

        // Option switch case
        switch (id) {
            case 1 -> {
                ifelse.fxIf();
            }
            case 2 -> {
                Logger.log("Case 2");
                drawOption();
            }
            case 3 -> {
                Logger.log("Case 3");
                drawOption();
            }
            case 0 -> {
                Logger.log("Bye Bye");
                System.exit(0);
            }
            default -> {
                drawOption();
            }
        }
    }

}
