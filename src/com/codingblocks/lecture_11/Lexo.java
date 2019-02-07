package com.codingblocks.lecture_11;

public class Lexo {
    public static void main(String[] args) {
        String line = "aaa";

        int[] f = freq(line);

        lexo("", f, line.length(), line);
    }

    public static void lexo(String processed, int[] freq, int len, String line){
        if (len == 0){
            if (processed.compareTo(line) <= 0) {
                System.out.println(processed);
            }
            return;
        }

        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > 0){
                freq[i]--;
                lexo(processed + (char)('a' + i), freq, len-1, line);
                freq[i]++;
            }
        }
    }

    public static int[] freq(String line){
        int[] f = new int[26];

        for (int i = 0; i < line.length(); i++) {
            char ch = line.charAt(i);

            f[ch - 'a']++;
        }

        return f;
    }
}
