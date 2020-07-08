package de.thunderfrog.appModules;

import de.thunderfrog.utils.Logger;

public class MString {
    // Class Variable
    public static String cVarb = "First String with Text";
    public static String cVarb1 = "Second String with Text and Numbers 154842";
    public static String cVarb2 = "298465";

    public void moduleString() throws InterruptedException {
        Logger.log("Loading String Module");

        // Output Variable
        Logger.log("Print Variable");
        System.out.println("cVarb: " + cVarb);
        System.out.println("cVarb1: " + cVarb1);
        System.out.println("cVarb2: " + cVarb2);

        // Dramatic Pause
        Thread.sleep(2000);

        // Output more String together
        Logger.log("Print more Variable together");
        System.out.println(cVarb + " " + cVarb1);
        Logger.log("with new Line");
        System.out.println(cVarb + "\n" + cVarb1 + "\n" + cVarb2);

        // Dramatic Pause
        Thread.sleep(2000);

        // Add new String to an exists String
        String newVarb = "New String => ";
        cVarb1 += newVarb;
        System.out.println(cVarb1);



    }
}
