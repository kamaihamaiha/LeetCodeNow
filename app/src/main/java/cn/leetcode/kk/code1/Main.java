package cn.leetcode.kk.code1;

import java.util.HashMap;
import java.util.Map;

/**
 * 1. 两数之和
 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 * <p>
 * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。
 * 示例:
 * <p>
 * 给定 nums = [2, 7, 11, 15], target = 9
 * <p>
 * 因为 nums[0] + nums[1] = 2 + 7 = 9
 * 所以返回 [0, 1]
 */
public class Main {

    public static void main(String[] args) {

        int[] nums = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};

        for (int target = 3; target < 20; target++) {
            int[] ints = Solution.twoSum(nums, target);

            if (ints[0] != -1) {
                System.out.println("nums[" + ints[0] + "] + " + "nums[" + ints[1] + "] = " + target);
            }
        }
    }

}
