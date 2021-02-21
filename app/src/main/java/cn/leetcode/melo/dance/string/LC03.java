package cn.leetcode.melo.dance.string;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * https://leetcode-cn.com/explore/featured/card/bytedance/242/string/1016/
 * <p>
 * 字符串的排列
 * <p>
 * 输入: s1 = "ab" s2 = "eidbaooo"
 * 输出: True
 * 解释: s2 包含 s1 的排列之一 ("ba").
 *
 * ///各种超时
 */
public class LC03 {
    public static void main(String[] args) {

        System.out.println(checkInclusion("ab", "eidbaooo"));
    }

    public static boolean checkInclusion(String s1, String s2) {

        int n = s1.length(), m = s2.length();
        //如果小串大于大串 那就直接返回 false
        if (n > m) return false;
        int[] cnt = new int[26];
        for (char c : s1.toCharArray())
            cnt[c - 'a']++;
        int[] cur = new int[26];
        for (int i = 0; i < m; i++)
            cur[s2.charAt(i) - 'a']++;

        if (check(cnt, cur)) return true;
        for (int i = m; i < n; i++) {
            cur[s2.charAt(i) - 'a']++;
            cur[s2.charAt(i - m) - 'a']--;
            if (check(cnt, cur)) return true;
        }
        return false;




    }

    static boolean check(int[] cnt1, int[] cnt2) {
        for (int i = 0; i < 26; i++) {
            if (cnt1[i] != cnt2[i]) return false;
        }
        return true;
    }

    /**
     * 小串 有多少种可能
     * 思路 如果 s2 中连续的能消除 s1的所有字符 那就返回 true
     * 这也超时????
     *
     * @param s1
     * @param s2
     * @return
     */

    public static boolean checkInclusion21(String s1, String s2) {

        int n = s1.length(), m = s2.length();
        //如果小串大于大串 那就直接返回 false
        if (n > m) return false;
        String smalls2 = "";
        //双指针滑动窗口  用 s1 的长度截取 s2
        for (int i = 0; i < m - n + 1; i++) {
            smalls2 = s2.substring(i, i + n);
            //判断 smalls2 是不是和 s1 的字母重合
            if (Arrays.equals(bubbleSort(smalls2.toCharArray()), bubbleSort(s1.toCharArray()))) {
                return true;
            }
        }
        return false;


    }

    /**
     * 冒泡排序一下
     * @param arr
     * @return
     */
    public static char[] bubbleSort(char[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    char temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

    /**
     * 逻辑是对的  但是会超时
     *
     * @param s1
     * @param s2
     * @return
     */
    public static boolean checkInclusion2(String s1, String s2) {
        ArrayList<Character> hh = new ArrayList();

        for (int i = 0; i < s1.length(); i++) {
            hh.add(s1.charAt(i));
        }

        for (int i = 0; i < s2.length() - s1.length() + 1; i++) {
            //如果这个字符 s1 有那就继续往下
            if (hh.contains(s2.charAt(i))) {
                //取出来连续的这个字符串
                String zhge = s2.substring(i, i + s1.length());
                ArrayList<Character> hh2 = new ArrayList();

                for (int i2 = 0; i2 < zhge.length(); i2++) {
                    hh2.add(zhge.charAt(i2));
                }
                for (int j = 0; j < hh.size(); j++) {
                    hh2.remove(hh.get(j));

                }
                if (hh2.size() == 0) {
                    return true;
                }


            } else {
                continue;
            }

        }


        return false;

    }
}
