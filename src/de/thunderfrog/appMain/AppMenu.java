package de.thunderfrog.appMain;

import de.thunderfrog.appModules.ifelse;
import de.thunderfrog.utils.Logger;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class appMenu {

    // Draw the Option Menu
    public static void drawOption() throws IOException, InterruptedException {
        // BufferedReader for Readline
        BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
        // User Input
        String input;

        Logger.log("Please select an option:");
        Logger.log("|----------------------|");
        Logger.log("(1) => If / Else");
        Logger.log("(2) => While Loop");
        Logger.log("(3) => Rest App");
        Logger.log("_______________________");
        Logger.log("(4) => Exit App");
        Logger.log("|----------------------|");
        do {
            input = obj.readLine();
            switchMenu(input);
            // Debug user input
            System.err.println(input);
        } while (!input.equals("4"));
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
            case 4 -> {
                Logger.log("Bye Bye");
                System.exit(0);
            }
            default -> {
                drawOption();
            }
        }
    }

}
