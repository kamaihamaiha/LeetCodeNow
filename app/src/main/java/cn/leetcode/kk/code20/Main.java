package cn.leetcode.kk.code20;

import cn.leetcode.kk.code20.Solution;

/**
 * 21题: 有效的括号
 */
public class Main {

    public static void main(String[] args) {

        String str1 = "()";
        String str2 = "()[]{}";
        String str3 = "(]";
        String str4 = "([)]";
        String str5 = "{[]}";

        System.out.println(Solution.isValid(str1));
        System.out.println(Solution.isValid(str2));
        System.out.println(Solution.isValid(str3));
        System.out.println(Solution.isValid(str4));
        System.out.println(Solution.isValid(str5));
    }
}
