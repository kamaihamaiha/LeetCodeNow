package cn.leetcode.kk.code27;

/**
 * https://leetcode.cn/problems/remove-element/description/
 * 移除元素
 * 思想和 code 26 类似
 */
public class Solution {

    public int removeElement(int[] nums, int val) {
        if (nums.length == 0) return 0;

        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            // 如果当前元素不等于 val，则将其放入临时数组
            if (nums[j] != val) {
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }
}
