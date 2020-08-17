package cn.leetcode.kk.code53;

public class Main {

    public static void main(String[] args) {
        int[] testNums = new int[]{-2,1,-3,4,-1,2,1,-5,4};
        int sum = Solution.maxSubarraySum(testNums);

        System.out.println(sum);
    }
}
