package de.thunderfrog;

import de.thunderfrog.main.init;

import java.io.IOException;
import java.util.ArrayList;

public class Main {

    // Arrays
    public static String[] sArray;
    public static Integer[] iArray;

    // ArrayList
    public static ArrayList<String> alString = new ArrayList<String>();
    public static ArrayList<Integer> alInteger = new ArrayList<Integer>();

    public static void main(String[] args) throws IOException {
        // Init App
        init.startApp();
        init.drawOption();
    }
}
