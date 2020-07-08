package de.thunderfrog.appModules;

import de.thunderfrog.appMain.AppMenu;
import de.thunderfrog.utils.Logger;
import de.thunderfrog.utils.Sleeper;

import java.io.IOException;

public class MString {
    // Class Variable
    public static String cVarb = "First String with Text";
    public static String cVarb1 = "Second String with Text and Numbers 154842";
    public static String cVarb2 = "298465";

    public static void moduleString() throws InterruptedException, IOException {
        Logger.log("Loading String Module");
        Sleeper.sleepNL(2000);

        // Output Variable
        Logger.log("Output Variable");
        System.out.println("cVarb: " + cVarb);
        System.out.println("cVarb1: " + cVarb1);
        System.out.println("cVarb2: " + cVarb2);

        // Dramatic Pause
        Sleeper.sleepNL(2000);

        // Output more String together
        Logger.log("Output more Variable together");
        System.out.println(cVarb + " " + cVarb1);
        Logger.log("with new Line");
        System.out.println(cVarb + "\n" + cVarb1 + "\n" + cVarb2);

        // Dramatic Pause
        Sleeper.sleepNL(2000);

        // Add new String to an exists String
        Logger.log("Output more Variable together");
        String newVarb = "New String => ";
        newVarb += cVarb1;
        System.out.println(newVarb);

        // Dramatic Pause
        Sleeper.sleepNL(2000);

        // Parse String to Integer
        Logger.log("Parse String to Integer");
        int iVarb = Integer.parseInt(cVarb2);
        System.out.println("String " + cVarb2 + " | " + "Integer " + iVarb);

        // Dramatic Pause
        Sleeper.sleepNL(2000);

        // String length
        Logger.log("String length");
        System.out.println("String1 => " + cVarb.length());
        System.out.println("String2 => " + cVarb1.length());
        System.out.println("String3 => " + cVarb2.length());

        // Dramatic Pause
        Sleeper.sleepNL(2000);

        // Find String character (Index)
        Logger.log("String character index");
        int index = cVarb1.indexOf("e");
        System.out.println("String1 Index 'e' => " + index);

        // Dramatic Pause
        Sleeper.sleepNL(2000);

        // String Replace
        Logger.log("String Replace");
        String repString = "Replace the String char with an other";
        System.out.println(repString);
        String newRepString = repString.replace("e","Z");
        System.out.println("Replace String => " + newRepString);




        AppMenu.drawOption();

    }
}
