package cn.leetcode.kk.code53;

/**
 * 给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
 * <p>
 * 示例:
 * <p>
 * 输入: [-2,1,-3,4,-1,2,1,-5,4]
 * 输出: 6
 * 解释: 连续子数组 [4,-1,2,1] 的和最大，为 6。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/maximum-subarray
 */
public class Main {

    public static void main(String[] args) {
        int[] testNums = new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int sum = Solution.maxSubArraySum(testNums);

        System.out.println(sum);
        System.out.println(maxSubArraySum(testNums));
    }

    public static int maxSubArraySum(int[] numArray) {
        if (numArray == null) {
            return 0;
        }
        if (numArray.length == 1) {
            return numArray[0];
        }

        int maxSum = numArray[0];
        int tempSum = numArray[0];

        for (int i = 1; i < numArray.length; i++) {
            if (tempSum < 0) {
                //1: 避免前面的数造成子列和减小，tempSum 小于零只会让子列和更小，所以丢弃，然后重新赋值
                tempSum = numArray[i];
            } else {
                tempSum += numArray[i];
            }

            //2: 避免后面的数造成子列和减小，因为 numArray[i] 可能 < 0,会导致子列和减小。
            if (maxSum < tempSum) {
                maxSum = tempSum;
            }
        }

        return maxSum;
    }

    public int maxSubArraySum2(int[] numArray) {
        if (numArray == null) {
            return -1;
        }
        if (numArray.length == 1) {
            return numArray[0];
        }
        int maxSum = numArray[0];
        int tempSum = numArray[0];

        for (int i = 1; i < numArray.length; i++) {
            if (tempSum < 0) {
                //如果之前的子序和小于 0，那么抛弃这个 tempSum，重新赋值
                tempSum = numArray[i];
            } else {
                tempSum += numArray[i];
            }

            if (maxSum < tempSum){
                maxSum = tempSum;
            }
        }

        return maxSum;
    }


}
