package cn.leetcode.melo;

/**
 * https://leetcode-cn.com/problems/optimal-division/solution/
 */
public class LC553 {
    public static void main(String[] args) {
        System.out.println(16 / 2 / 2);
        System.out.println((16 / 2) / 2);

    }

    /**
     * 给定一组正整数，相邻的整数之间将会进行浮点除法操作。例如， [2,3,4] -> 2 / 3 / 4 。
     * <p>
     * 但是，你可以在任意位置添加任意数目的括号，来改变算数的优先级。你需要找出怎么添加括号，才能得到最大的结果，并且返回相应的字符串格式的表达式。你的表达式不应该含有冗余的括号。
     *
     * @param nums
     * @return
     */
    //思路:最大,所以要分子最大,分母最小,因为是除法,所以前面 第一个数一定是分子,否则只会变小.剩下的都是分母
    //分母 就要求最小,先括号
    public String optimalDivision(int[] nums) {
        StringBuilder ans = new StringBuilder();
        ans.append(nums[0]);
        if (nums.length == 1) {
        } else if (nums.length == 2) {
            ans.append("/" + nums[1]);
        } else {
            ans.append("/(");
            for (int i = 1; i < nums.length - 1; i++) {
                ans.append(nums[i] + "/");
            }
            ans.append(nums[nums.length - 1]);
            ans.append(")");


        }

        return ans.toString();


    }
}
