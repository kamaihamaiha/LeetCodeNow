package cn.leetcode.kk.code28;

/**
 * 28. 找出字符串中第一个匹配项的下标
 * https://leetcode.cn/problems/find-the-index-of-the-first-occurrence-in-a-string/description/
 */
public class Solution {

    public int strStr(String haystack, String needle) {
        if (needle == null || needle.length() == 0) return -1;
        if (haystack == null || haystack.length() == 0) return -1;
        for (int i = 0; i < haystack.length(); i++) {
            int j = 0;
            for (; j < needle.length(); j++) {
                if (i + j >= haystack.length()) return -1;
                if (haystack.charAt(i + j) != needle.charAt(j)) break;
            }
            if (j == needle.length()) return i;
        }
        return -1;
    }
}
