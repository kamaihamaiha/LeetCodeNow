package cn.leetcode.kk.code448;

import java.util.List;

/**
 * 448: 找到所有数组中消失的数字
 * https://leetcode-cn.com/problems/find-all-numbers-disappeared-in-an-array/
 */
public class Main {

    public static void main(String[] args) {
        int[] nums = new int[]{4,3,2,7,6,2,3,1};
        int[] nums2 = new int[]{-4,-3,-2,-7,8,2,-3,-1};
        List<Integer> disappearedNumbers = new Solution().findDisappearedNumbers(nums);
        List<Integer> disappearedNumbers2 = new Solution().findDisappearedNumbers2(nums);
//        System.out.println(disappearedNumbers);
        System.out.println(disappearedNumbers2);
    }
}
