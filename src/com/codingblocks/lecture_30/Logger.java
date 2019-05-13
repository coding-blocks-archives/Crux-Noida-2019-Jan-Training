package com.codingblocks.lecture_30;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Logger {

    private static Logger instance;

    private File file;
    private PrintStream out;

    private Logger(){
        file = new File("log.txt");
        try {
            out = new PrintStream(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static Logger getInstance(){
        if (instance == null){
            instance = new Logger();
        }
        return instance;
    }

    public void log(String message){
        out.println(message);
    }
}
