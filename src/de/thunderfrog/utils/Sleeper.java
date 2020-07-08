package de.thunderfrog.utils;

public class Sleeper {
    public static void sleepNL(Integer t) throws InterruptedException {
        Thread.sleep(t);
        System.out.println("\n");
    }
}
