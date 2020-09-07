package cn.leetcode.kotlin.melo.lckt;

public class LeetCode70 {
    public static void main(String[] args) {
        climbStairs(2);
    }

    /**
     * 递归的弊端就是  超时
     * @param n
     * @return
     */
    public static int climbStairs(int n) {

        if (n == 0 | n == 1) {
            return 1;
        } else {
            return climbStairs(n - 1) + climbStairs(n - 2);
        }
    }
}
