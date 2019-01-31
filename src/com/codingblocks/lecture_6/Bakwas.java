package com.codingblocks.lecture_6;

import java.io.File;
import java.io.PrintStream;
import java.util.Scanner;

public class Bakwas {
    public static void main(String[] args) throws Exception {

        File f = new File("happy.txt");
        Scanner s = new Scanner(f);

        File output = new File("output.txt");

        PrintStream out = new PrintStream(output);

        while (s.hasNextLine()){
            out.print(s.nextLine());
        }
    }
}
