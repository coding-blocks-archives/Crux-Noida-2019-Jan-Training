package com.codingblocks.lecture_27;

public class LCS {
    public static void main(String[] args) {

        String f = "aman";
        String s = "manan";

        System.out.println(lcsItr(f, s));

//        Integer[][] memory = new Integer[f.length()+1][s.length()+1];
//        System.out.println(lcsDP(f, s, f.length(), s.length(), memory));
    }

    public static int lcs(String f, String s, int flen, int slen){

        if (flen == 0 || slen == 0){
            return 0;
        }

        int res = 0;

        if (f.charAt(flen-1) == s.charAt(slen-1)){
            res = 1 + lcs(f, s, flen-1, slen-1);
        } else {
            int r_first = lcs(f, s, flen-1, slen);
            int r_second = lcs(f, s, flen, slen-1);

            res = Math.max(r_first, r_second);
        }

        return res;

    }

    public static int lcsDP(String f, String s, int flen, int slen, Integer[][] memory){

        if (flen == 0 || slen == 0){
            return 0;
        }

        if (memory[flen][slen] != null){
            return memory[flen][slen];
        }

        int res = 0;

        if (f.charAt(flen-1) == s.charAt(slen-1)){
            res = 1 + lcs(f, s, flen-1, slen-1);
        } else {
            int r_first = lcsDP(f, s, flen-1, slen, memory);
            int r_second = lcsDP(f, s, flen, slen-1, memory);

            res = Math.max(r_first, r_second);
        }

        memory[flen][slen] = res;

        return res;

    }

    public static int lcsItr(String first, String second){
        Integer[][] memory = new Integer[first.length() + 1][second.length() + 1];

        for (int flen = 0; flen <= first.length() ; flen++) {
            for (int slen = 0; slen <= second.length() ; slen++) {
                if (flen == 0 || slen == 0){
                    memory[flen][slen] = 0;
                } else {
                    if (first.charAt(flen-1) == second.charAt(slen-1)){
                        memory[flen][slen] = 1 + memory[flen-1][slen-1];
                    } else {
                        memory[flen][slen] = Math.max(memory[flen-1][slen], memory[flen][slen-1]);
                    }
                }
            }
        }

        return memory[first.length()][second.length()];
    }
}
