package cn.leetcode.melo;

/**
 * 2016. 增量元素之间的最大差值
 */
public class LC2016 {
    public static void main(String[] args) {

    }

    public int maximumDifference(int[] nums) {

        int ans = -1, min = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > min) {
                ans = Math.max(ans, nums[i] - min);
            } else {
                min = nums[i];
            }
        }

        return ans;

    }
}
