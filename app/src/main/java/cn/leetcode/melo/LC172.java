package cn.leetcode.melo;

/**
 * 阶乘后的零
 *
 * 2  5
 *
 */
public class LC172 {
    public static void main(String[] args) {
        System.out.println(trailingZeroes(13) + "");
    }

    public static int trailingZeroes(int n) {
        int end = 1;
        for (int i = 1; i <= n; i++) {
            end = end * i;
        }
        int back=0;
        for (int i = 10; i <= end; i *= 10) {
            if (end % i == 0) {
                back = Math.max(back, (i/10+"").length());
            }else {
                break;
            }
        }

        return back;
    }
}
