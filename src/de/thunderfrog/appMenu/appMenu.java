package de.thunderfrog.appMenu;

import de.thunderfrog.main.init;
import de.thunderfrog.utils.Logger;

import java.io.IOException;

public class appMenu {

    public static void switchMenu(String sid) throws IOException {
        int id = Integer.parseInt(sid);
        switch (id) {
            case 1 -> {
                Logger.log("Case 1");
                init.drawOption();
            }
            case 2 -> {
                Logger.log("Case 2");
                init.drawOption();
            }
            case 3 -> {
                Logger.log("Case 3");
                init.drawOption();
            }
            case 4 -> {
                Logger.log("Bye Bye");
                System.exit(0);
            }
        }
    }

}
