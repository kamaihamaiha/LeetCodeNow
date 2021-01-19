package cn.leetcode.melo;

/**
 * 125. 验证回文串
 * 给定一个字符串，验证它是否是回文串，只考虑字母和数字字符，可以忽略字母的大小写。
 * <p>
 * 说明：本题中，我们将空字符串定义为有效的回文串。
 * <p>
 * 示例 1:
 * <p>
 * 输入: "A man, a plan, a canal: Panama"
 * 输出: true
 * 示例 2:
 * <p>
 * 输入: "race a car"
 * 输出: false
 *
 *
 *
 * 双指针...就 ok 了 不是字母就跳过
 */
public class LC125 {
    public static void main(String[] args) {
        String hh = "A man, a plan, a canal: Panama";
        isPalindrome(hh);
    }

    public static boolean isPalindrome(String s) {
        //先去空格和模糊大小写
        String ss = s.toLowerCase();
        int mid = ss.length() / 2;
        //双指针
        int start = 0;
        int end = ss.length() - 1;
        while (start <= end) {

            char s1 = ss.charAt(start);
            char s2 = ss.charAt(end);
            if (!isA(s1)) {
                start++;
                continue;
            }
            if (!isA(s2)) {
                end--;
                continue;
            }


            if (s1 != s2) {
                return false;
            } else {
                start++;
                end--;
                continue;
            }

        }
        return true;
    }

    //是否为数字或字母
    public static boolean isA(int s) {
        if ((48 <= s && s <= 57) || (65 <= s && s <= 90) || (97 <= s && s <= 122)) {
            return true;
        }
        return false;
    }


}
