package com.codingblocks.lecture_22;

import java.io.File;

public class FileSystem {
    public static void main(String[] args) {
        File file = new File(".");

        System.out.println(file.getAbsolutePath());
        
        diplay(file, "");
    }

    private static void diplay(File file, String indent) {

        System.out.println(indent + file.getName());

        if (file.isDirectory()){
            File[] children = file.listFiles();

            for (int i = 0; children != null && i < children.length; i++) {
                File child = children[i];

                diplay(child, indent + "\t");
            }
        }
    }
}
