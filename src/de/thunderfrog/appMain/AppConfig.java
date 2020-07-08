package de.thunderfrog.appMain;

public class appConfig {
    public static String appName = "IfLoopArray";
    public static String appVersion = "1.0.0";
    public static String appCreator = "Christian Richter";
    public static String appCreatorMail = "Christian.Richter1987@gmail.com";

    public static String getAppName() {
        return appName;
    }

    public static void setAppName(String appName) {
        appConfig.appName = appName;
    }

    public static String getAppVersion() {
        return appVersion;
    }

    public static void setAppVersion(String appVersion) {
        appConfig.appVersion = appVersion;
    }

    public static String getAppCreator() {
        return appCreator;
    }

    public static void setAppCreator(String appCreator) {
        appConfig.appCreator = appCreator;
    }

    public static String getAppCreatorMail() {
        return appCreatorMail;
    }

    public static void setAppCreatorMail(String appCreatorMail) {
        appConfig.appCreatorMail = appCreatorMail;
    }
}
