package cn.leetcode.melo;

public class LC2104 {
    public static void main(String[] args) {

    }

    public long subArrayRanges(int[] nums) {
        long ans = 0l;
        int n = nums.length;
        for (int i = 0; i < nums.length; i++) {
            int minVal = Integer.MAX_VALUE, maxVal = Integer.MIN_VALUE;
            for (int j = i; j < nums.length; j++) {
                minVal = Math.min(minVal, nums[j]);
                maxVal = Math.max(maxVal, nums[j]);
                ans += maxVal - minVal;
            }
        }


        return ans;

    }
}
