package com.codingblocks.lecture_28;

public class DP {

    public static void main(String[] args) {
        String f = "aman";
        String s = "manan";

        Integer[][] memory = new Integer[f.length() + 1][s.length() + 1];

//        System.out.println(editDistanceDP(f, s, f.length(), s.length(), memory));

        System.out.println(editDistanceDPItr(f, s));

    }

    public static int editDistance(String f, String s, int flen, int slen){
        if (flen == 0){
            return slen;
        }

        if (slen == 0){
            return flen;
        }



        int sol = 0;

        if (f.charAt(flen-1) == s.charAt(slen-1)){
            sol = editDistance(f, s, flen-1, slen-1);
        } else {
            int rm_f = editDistance(f, s, flen-1, slen);
            int rm_s = editDistance(f, s, flen, slen-1);
            int rep = editDistance(f, s, flen-1, slen-1);

            sol = 1 + Math.min(rep, Math.min(rm_f, rm_s));
        }



        return sol;

    }

    public static int editDistanceDP(String f, String s, int flen, int slen, Integer[][] memory){
        if (flen == 0){
            return slen;
        }

        if (slen == 0){
            return flen;
        }

        if (memory[flen][slen] != null){
            return memory[flen][slen];
        }


        int sol = 0;

        if (f.charAt(flen-1) == s.charAt(slen-1)){
            sol = editDistance(f, s, flen-1, slen-1);
        } else {
            int rm_f = editDistanceDP(f, s, flen-1, slen, memory);
            int rm_s = editDistanceDP(f, s, flen, slen-1, memory);
            int rep = editDistanceDP(f, s, flen-1, slen-1, memory);

            sol = 1 + Math.min(rep, Math.min(rm_f, rm_s));
        }

        memory[flen][slen] = sol;

        return sol;

    }

    public static int editDistanceDPItr(String f, String s){
        Integer[][] memory = new Integer[f.length() + 1][s.length() + 1];

        for (int flen = 0; flen <= f.length() ; flen++) {
            for (int slen = 0; slen <= s.length() ; slen++) {
                if (flen == 0){
                    memory[flen][slen] = slen;
                } else if (slen == 0) {
                    memory[flen][slen] = flen;
                } else {
                    if (f.charAt(flen-1) == s.charAt(slen-1)){
                        memory[flen][slen] = memory[flen - 1][slen - 1];
                    } else {
                        int rm_f = memory[flen-1][slen];
                        int rm_s = memory[flen][slen-1];
                        int rep = memory[flen-1][slen-1];
                        memory[flen][slen] = 1 + Math.min(rep, Math.min(rm_f, rm_s));
                    }
                }
            }
        }

        return memory[f.length()][s.length()];
    }
}
