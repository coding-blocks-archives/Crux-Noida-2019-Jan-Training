package com.codingblocks.lecture_12;

public class LexoNumber {
    public static void main(String[] args) {
        lexo(0, 2, 100);
    }

    public static void lexo(int processed, int start, int end){
        if (processed > end){
            return;
        }

        for (int i = 0; i < 10; i++) {

            if (processed == 0 && i == 0){
                continue;
            }

            int item = processed * 10 + i;

            if (item >= start && item <= end) {
                System.out.println(item);
            }

            lexo(item, start, end);
        }
    }
}
