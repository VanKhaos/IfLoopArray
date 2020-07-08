package de.thunderfrog;

import de.thunderfrog.appMain.AppInit;
import de.thunderfrog.appMain.AppMenu;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException, InterruptedException {
        // Init App
        AppInit.startApp();
        AppMenu.drawOption();
    }
}
