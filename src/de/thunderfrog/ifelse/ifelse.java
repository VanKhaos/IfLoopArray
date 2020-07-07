package de.thunderfrog.ifelse;

import de.thunderfrog.utils.Logger;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ifelse {

    public ifelse() {
        Logger.log("Loading If / Else Module");
    }

    // Variable
    public static String value1, value2;
    public static Integer isString, isInteger;

    public static String string1, string2;
    public static Integer int1, int2;

    public static void fxIf() throws IOException, InterruptedException {
        // Buffered Input Reader
        BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));

        // First String
        Logger.log("Please enter a Value");
        string1 = obj.readLine();


        // Second String
        Logger.log("Please enter an other Value thats equal or not equal to Value1");
        string2 = obj.readLine();

        Logger.log("Value1: " + string1 + " | Value2: " + string2);

        if (string1.equals(string2)) {
            Logger.log("Value 1 & Value 2 are equal");
            Logger.log("Plain Code:\n" +
                    "if(Value1.equals(Value2)) {\n" +
                    "       System.out.println(\"Value 1 & Value 2 is equal\");\n" +
                    "\"\");}");
        }

        Thread.sleep(10000);


    }


}
