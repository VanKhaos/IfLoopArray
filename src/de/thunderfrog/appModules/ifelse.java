package de.thunderfrog.appModules;

import de.thunderfrog.appMain.appMenu;
import de.thunderfrog.utils.Logger;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ifelse {

    // Variable
    public static String value1, value2;
    public static Integer isInteger;

    public static void fxIf() throws IOException, InterruptedException {
        Logger.log("Loading If / Else Module");

        // Buffered Input Reader
        BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));

        // First String
        Logger.log("Please enter a Value");
        value1 = obj.readLine();

        // Check Value String or Integer
        try {
            Integer.parseInt(value1);
            isInteger = 1;
            Logger.log("Value 1 is a valid integer number");
        }catch (NumberFormatException e){
            isInteger = 0;
            Logger.log("Value 1 is a valid string");
        }

        // Second String
        Logger.log("Please enter an other Value thats equal or not equal to Value1");
        value2 = obj.readLine();

        // Check Value String or Integer
        try {
            Integer.parseInt(value2);
            isInteger = 1;
            Logger.log("Value 2 is a valid integer number");
        }catch (NumberFormatException e){
            isInteger = 0;
            Logger.log("Value 2 is a valid string");
        }

        Logger.log("Value1: " + value1 + " | Value2: " + value2);

        if (value1.equals(value2)) {
            Logger.log("Value 1 & Value 2 are equal");
            Logger.log("Plain Code:\n" +
                    "if(value1.equals(value2)) {\n" +
                    "       System.out.println(\"Value 1 & Value 2 is equal\");\n" +
                    "\"\");}");
        }

        Thread.sleep(5000);
        appMenu.drawOption();


    }


}
