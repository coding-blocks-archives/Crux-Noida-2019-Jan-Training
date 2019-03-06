package com.codingblocks.lecture_23;

import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception{
        File file = new File("tree_data.txt");
        Scanner s = new Scanner(file);

        BinaryTree tree = new BinaryTree();

        int[] pre = {2, 1, 3, 6, 11, 5, 9};
        int[] in = {3, 1, 11, 6, 2, 5, 9};

        tree.populateByPreIn(pre, in);

        tree.display();

        System.out.println();

        tree.copyMirror().display();

//        tree.add(s);
//        tree.add(s);
//        tree.add(s);
//        tree.add(s);
//        tree.add(s);

//        tree.levelOrder();
    }
}
