package cn.leetcode.melo;

import java.util.ArrayList;

/**
 * 同 168
 */
public class LC171 {
    public static void main(String[] args) {
//        A -> 1
//        B -> 2
//        C -> 3
//    ...
//        Z -> 26
        String[] arrayString = new String[]{
                "A"
                , "B"
                , "C"
                , "D"
                , "E"
                , "F"
                , "G"
                , "H"
                , "I"
                , "G"
                , "K"
                , "L"
                , "M"
                , "N"
                , "O"
                , "P"
                , "Q"
                , "R"
                , "S"
                , "T"
                , "U"
                , "V"
                , "W"
                , "X"
                , "Y"
                , "Z"};

        titleToNumber("A");
    }

    public static int titleToNumber(String s) {
        ArrayList<String> az = new ArrayList<>();
        az.add("-1");
        az.add("A");
        az.add("B");
        az.add("C");
        az.add("D");
        az.add("E");

        az.add("F");
        az.add("G");
        az.add("H");
        az.add("I");
        az.add("J");

        az.add("K");
        az.add("L");
        az.add("M");
        az.add("N");
        az.add("O");

        az.add("P");
        az.add("Q");
        az.add("R");
        az.add("S");
        az.add("T");

        az.add("U");
        az.add("V");
        az.add("W");
        az.add("X");
        az.add("Y");
        az.add("Z");
        int a = 0;
        char[] arr = s.toCharArray();

        for (int i = arr.length - 1; i >= 0; i--) {
            int x = az.indexOf(arr[i] + "");
            a += (i + 1) * x*26;

        }

        return a;

    }
}
