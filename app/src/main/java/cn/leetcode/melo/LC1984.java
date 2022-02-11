package cn.leetcode.melo;

import java.util.Arrays;

/**
 * 最小差
 * https://leetcode-cn.com/problems/minimum-difference-between-highest-and-lowest-of-k-scores/
 */
public class LC1984 {
    public static void main(String[] args) {

    }

    public static int minimumDifference(int[] nums, int k) {
        int a = Integer.MAX_VALUE;
        if (k == 1) {
            return 0;
        }
        //先排序 再双指针or窗口滑动
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - k + 1; i++) {
            a = Math.min(nums[i + k - 1] - nums[i], a);
        }

        return a;
    }
}
