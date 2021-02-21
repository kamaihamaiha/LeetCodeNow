package cn.leetcode.melo.dance.string;

/**
 * 翻转字符串里的单词
 * https://leetcode-cn.com/explore/featured/card/bytedance/242/string/1011/
 * <p>
 * 输入："the sky is blue"
 * 输出："blue is sky the"
 * <p>
 * 输入："a good   example"
 * 输出："example good a"
 * 解释：如果两个单词间有多余的空格，将反转后单词间的空格减少到只含一个。
 */
public class LC05 {
    public static void main(String[] args) {
        System.out.println(reverseWords("a good   example"));

    }

    public static String reverseWords(String s) {
        if (s.isEmpty()) return "";
        String[] temp = s.split(" ");
        StringBuffer ss = new StringBuffer("");
        for (int i = temp.length - 1; i >= 0; i--) {
            if (!temp[i].isEmpty()) {
                ss.append(" ");
                ss.append(temp[i]);
            }
        }


        return ss.toString().trim();
    }
}
