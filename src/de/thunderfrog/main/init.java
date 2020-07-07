package de.thunderfrog.main;

import de.thunderfrog.utils.Logger;
import de.thunderfrog.appMenu.appMenu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static de.thunderfrog.utils.AppConfig.*;

public class init {

    // Start the Main App
    public static void startApp() {
        Logger.log("Welcome to " + appName);
        Logger.log("Version: " + appVersion);
        Logger.log("Creator: " + appCreator + " | Contact: " + appCreatorMail);
        Logger.log("________________________________________________________");
    }

    // Draw the Option Menu
    public static void drawOption() throws IOException {
        // BufferedReader for Readline
        BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
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
            appMenu.switchMenu(input);
            // Debug user input
            System.err.println(input);
        } while (!input.equals("4"));
    }
}
