package cn.leetcode.kk.code53;

/**
 * 求最大子列和
 *
 */
 class Solution {

    /**
     * 求最大子列和
     * @param nums 数组
     * @return -1： 数组为空
     */
     static int maxSubArraySum(int[] nums){

        if (nums == null) {
            return -1;
        }

        if (nums.length == 1) {
            return nums[0];
        }

        int sum = nums[0];

        //临时子列和
        int tempSum = nums[0];

        //从第二个元素开始遍历
        for (int i = 1; i < nums.length; i++) {
            if (tempSum < 0){ //这里是把前面的 < 0 的子列和去掉
                tempSum = nums[i];
            } else {
                tempSum += nums[i];
            }

            if (sum < tempSum){
                sum = tempSum;
            }
        }

        return sum;
    }
}
