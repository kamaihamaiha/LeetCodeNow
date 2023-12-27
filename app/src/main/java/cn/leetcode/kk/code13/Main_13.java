package cn.leetcode.kk.code13;

public class Main_13 {

    public static void main(String[] args) {
        // 罗马数字转整数
    }

    /**
     * I  1
     * V  5
     * X  10
     * L  50
     * C  100
     * D  500
     * M  1000
     * 特殊情况
     * I 可以放在 V (5) 和 X (10) 的左边，来表示 4 和 9。
     * X 可以放在 L (50) 和 C (100) 的左边，来表示 40 和 90。
     * C 可以放在 D (500) 和 M (1000) 的左边，来表示 400 和 900。
     * @param s
     * @return
     */
    public static int romanToInt(String s) {
        int value = 0;
        int beforeTemp = 0;
        char[] chars = s.toCharArray();
        for (int i = chars.length - 1; i >= 0; i--) {
            int temp = 0;
            switch (chars[i]) {
                case 'I':
                    temp = 1;
                    break;
                case 'V':
                    temp = 5;
                    break;
                case 'X':
                    temp = 10;
                    break;
                case 'L':
                    temp = 50;
                    break;
                case 'C':
                    temp = 100;
                    break;
                case 'D':
                    temp = 500;
                    break;
                case 'M':
                    temp = 1000;
                    break;
            }
            // 判断前一个位大小，如果是当前位的 5x或者10x，那么就是特殊情况
            if (i <= chars.length - 1 && temp < value && (beforeTemp == 5 * temp || beforeTemp == 10 * temp)) {
                // 特殊情况
                temp = -temp;
            }
            value += temp;

            beforeTemp = temp;
        }
        return value;
    }
}
