package cn.leetcode.kk.code344;

public class Solution {

    public static void reverseString(char[] s) {

        if (s.length == 1) {
            return;
        }

        for (int i = 0; i < s.length / 2; i++) {
            char tempS = s[i];
            s[i] = s[s.length - 1 - i];
            s[s.length - 1 - i] = tempS;
        }

        System.out.println(s);
    }
}
