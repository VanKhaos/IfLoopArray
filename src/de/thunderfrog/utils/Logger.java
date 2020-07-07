package de.thunderfrog.utils;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Logger {

    // Time Formatter
    public static DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
    // Local Time with Formatter into String
    public static String t = LocalTime.now().format(dtf);

    public static void log(String s){
        System.out.println(t + " | " + s);
    }
    public static void noTimeLog(String s){
        System.out.println(s);
    }
}
