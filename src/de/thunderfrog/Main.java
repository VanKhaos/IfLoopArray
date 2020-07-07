package de.thunderfrog;

import de.thunderfrog.appMain.appInit;
import de.thunderfrog.appMain.appMenu;

import java.io.IOException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException, InterruptedException {
        // Init App
        appInit.startApp();
        appMenu.drawOption();
    }
}
