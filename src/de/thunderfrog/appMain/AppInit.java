package de.thunderfrog.appMain;

import de.thunderfrog.utils.Logger;

import static de.thunderfrog.appMain.AppConfig.*;

public class AppInit {

    // Start the Main App
    public static void startApp() {
        Logger.log("Welcome to " + appName);
        Logger.log("Version: " + appVersion);
        Logger.log("Creator: " + appCreator + " | Contact: " + appCreatorMail);
        Logger.log("________________________________________________________");
    }
}
