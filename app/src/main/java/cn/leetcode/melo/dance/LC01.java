package cn.leetcode.melo.dance;

/**
 * https://leetcode-cn.com/explore/featured/card/bytedance/242/string/1012/
 * 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
 * <p>
 * s = "abcabcbb"
 */
public class LC01 {
    public static void main(String[] args) {

        String s = "abcabcbb";


        int o = lengthOfLongestSubstring(s);
        System.out.println(o + "");
    }

    /*
    每一个自己到下一个自己的距离 可以用双指针
     */
    public static int lengthOfLongestSubstring(String s) {
        if (s.isEmpty()) return 0;
        int max =1;
//        int index1=0;
//        int index2=1;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    max = Math.max(max, j - i);
                    break;
                }
            }
        }

        return max;
    }
}
