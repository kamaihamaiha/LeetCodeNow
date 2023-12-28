package cn.leetcode.kk.code14;

/**
 * 14. 最长公共前缀
 * https://leetcode.cn/problems/longest-common-prefix/
 *
 * 编写一个函数来查找字符串数组中的最长公共前缀。
 * 如果不存在公共前缀，返回空字符串 ""。
 *
 * 提示：
 *
 * 1 <= strs.length <= 200
 * 0 <= strs[i].length <= 200
 * strs[i] 仅由小写英文字母组成
 *
 *
 * 示例 1：
 *
 * 输入：strs = ["flower","flow","flight"]
 * 输出："fl"
 * 示例 2：
 *
 * 输入：strs = ["dog","racecar","car"]
 * 输出：""
 * 解释：输入不存在公共前缀
 */
public class Solution {

    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 1) return strs[0];
        // method1(横向扫描): 比较两个字符串的最长公共前缀，然后再和第三个比较，以此类推
        String commonPrefix = longerCommonPrefix(strs[0], strs[1]);
        for (int i = 2; i < strs.length; i++) {
            commonPrefix = longerCommonPrefix(commonPrefix, strs[i]);
        }
        return commonPrefix;
    }

    /**
     * 得到两个字符串的最长公共前缀
     * @param str1
     * @param str2
     * @return
     */
    public static String longerCommonPrefix(String str1, String str2) {
        int len = Math.min(str1.length(), str2.length());
        int index = 0;
        while (index < len && str1.charAt(index) == str2.charAt(index)) {
            index++;
        }
        return str1.substring(0, index);
    }
}
