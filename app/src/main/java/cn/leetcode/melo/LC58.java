package cn.leetcode.melo;

import android.text.TextUtils;

/**
 * 58. 最后一个单词的长度
 * <p>
 * 给定一个仅包含大小写字母和空格 ' ' 的字符串 s，返回其最后一个单词的长度。如果字符串从左向右滚动显示，那么最后一个单词就是最后出现的单词。
 */
public class LC58 {
    public static void main(String[] args) {

    }

    /**
     * 截断..去最后一个
     * @param s
     * @return
     */
    public int lengthOfLastWord(String s) {
        if (s.trim().equals("")) return 0;

        String[] sArr = s.trim().split(" ");
        return sArr[sArr.length - 1].length();

    }
}
