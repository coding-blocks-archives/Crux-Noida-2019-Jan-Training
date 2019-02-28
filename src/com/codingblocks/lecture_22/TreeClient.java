package com.codingblocks.lecture_22;

import java.io.File;
import java.math.BigInteger;
import java.util.Scanner;

public class TreeClient {
    public static void main(String[] args) throws Exception{
        BinaryTree tree = new BinaryTree();

        File file = new File("tree_data.txt");

        Scanner s = new Scanner(file);

        for (int i = 0; i < 5; i++) {
            tree.populate(s);
        }
    }
}
