package cn.leetcode.melo;

/**
 * 求平方根  实现 sqrt 方法
 */
public class LC69 {
    public static void main(String[] args) {

    }

    /**
     * 二分法 比较
     *
     * @param x
     * @return
     */
    public int mySqrt(int x) {
        //从 0--x
        int l = 0, r = x, ans = -1;
        //只要
        while (l <= r) {
            //中间值
            int mid = 1 + (r - 1) / 2;
            if ((long) mid * mid <= x) {
                ans = mid;

                l = mid + 1;
            } else {
                r = mid - 1;
            }

        }
        return ans;
    }

}
