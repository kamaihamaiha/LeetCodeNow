package cn.leetcode.melo.dance.string;

import java.util.HashSet;

/**
 * https://leetcode-cn.com/explore/featured/card/bytedance/242/string/1012/
 * 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
 * <p>
 * s = "abcabcbb"
 */
public class LC01 {
    public static void main(String[] args) {

        String s = "";


        int o = lengthOfLongestSubstring(s);
        System.out.println(o + "");
    }

    /*
    每一个自己到下一个自己的距离 可以用双指针
     */
    public static int lengthOfLongestSubstring(String s) {
        if (s.isEmpty()) return 0;
        //一个 hashSet 记录 s中的不重复的
        HashSet<Character> hh = new HashSet();
        //双指针
        int indexL = 0;
        int indexR = -1;
        int back = 1;

        for (int i = 0; i < s.length() - 1; i++) {
            indexL = i;
            indexR = indexL + 1;
            hh.add(s.charAt(indexL));

            while (indexR < s.length() && !hh.contains(s.charAt(indexR))) {
                hh.add(s.charAt(indexR));
                indexR++;
            }

            back = Math.max(back, hh.size());
            hh.clear();
        }

        return back;
    }
}
