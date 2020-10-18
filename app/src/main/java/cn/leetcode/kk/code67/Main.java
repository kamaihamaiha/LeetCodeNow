package cn.leetcode.kk.code67;

/**
 * 67. 二进制求和
 * 给你两个二进制字符串，返回它们的和（用二进制表示）。
 * 输入为 非空 字符串且只包含数字 1 和 0。
 * <p>
 * 示例 1:
 * <p>
 * 输入: a = "11", b = "1"
 * 输出: "100"
 * 示例 2:
 * <p>
 * 输入: a = "1010", b = "1011"
 * 输出: "10101"
 * <p>
 * <p>
 * 提示：
 * <p>
 * 每个字符串仅由字符 '0' 或 '1' 组成。
 * 1 <= a.length, b.length <= 10^4
 * 字符串如果不是 "0" ，就都不含前导零。
 */
public class Main {
    public static void main(String[] args) {

        String a = "11";
        String b = "1";

        System.out.println(addBinaryMySelf(a, b));
    }

    /**
     * @param a
     * @param b
     * @return
     */
    public static String addBinary(String a, String b) {

        StringBuilder ans = new StringBuilder();
        int ca = 0;

        //同时遍历 2 个字符串. 从 右 → 左
        for (int i = a.length() - 1, j = b.length() - 1; i >= 0 || j >= 0; i--, j--) {

            //sum 是当前位的数值之和. 一开始先加上低位数的进位值。 这个进位值最早是 0。
            int sum = ca;

            //如果 a 字符串没有遍历完，那么 sum 就加上这个位的数值(a.charAt(i) - '0'), 否则就加 0
            sum += (i >= 0 ? a.charAt(i) - '0' : 0);
            //如果 b 字符串没有遍历完，那么 sum 就加上这个位的数值(a.charAt(i) - '0'), 否则就加 0
            sum += (j >= 0 ? b.charAt(j) - '0' : 0);

            //该位置，是 2 的余数。 也就是当前位相加后得到的值
            ans.append(sum % 2);

            //这个是计算进位，给下一轮使用。
            ca = sum / 2;
        }

        //这个是最后一个进位的处理
        ans.append(ca == 1 ? ca : "");
        return ans.reverse().toString();

    }

    public static String addBinaryMySelf(String a, String b) {
        StringBuilder res = new StringBuilder();
        //进位值
        int higherBitValue = 0;

        for (int i = a.length() - 1, j = b.length() - 1; i >= 0 || j >= 0; i--, j--) {
            //当前位数值。 要先加上上轮运算得到的进位值
            int currentBitSum = 0;
            currentBitSum += higherBitValue;

            //如果 a 字符串没有遍历完，则要把当前位上的数值加进去
            if (i >= 0) {
                currentBitSum += a.charAt(i) - '0';
            }
            //如果 b 字符串没有遍历完，则要把当前位上的数值加进去
            if (j >= 0) {
                currentBitSum += b.charAt(j) - '0';
            }

            //计算，当前位应该是多少
            res.append(currentBitSum % 2);
            //计算，进位值
            higherBitValue = currentBitSum / 2;
        }

        //处理最后一个进位
        if (higherBitValue > 0){
            res.append("1");
        }

        //因为是从低位开始拼接的，得到的 res 高位在右边，所以要反转字符串.
        return res.reverse().toString();
    }

    /**
     * 反转字符串
     *
     * @param str
     * @return
     */
    public static String reserve(String str) {
        if (str == null || str.length() <= 1) {
            return str;
        }

        char[] chars = str.toCharArray();
        int length = chars.length;
        for (int i = 0; i <= length / 2; i++) {
            //交换第索引为 i 和 索引为倒数第 i 的数组元素
            char temp = chars[i];
            chars[i] = chars[length - 1 - i];
            chars[length - 1 - i] = temp;
        }
        return new String(chars);
    }


}
