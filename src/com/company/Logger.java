package com.company;

import java.io.File;

public interface Logger {
    String DEFAULT_FILE_NAME = "log.txt";
    void writeLogging(String toLog);

    default boolean doesLogfileExist(){
        demoPrivateMethod();
        File logFile = new File(DEFAULT_FILE_NAME);
        return logFile.exists();
    }

    private void demoPrivateMethod(){
        System.out.println("This is a private method");

    }
}

