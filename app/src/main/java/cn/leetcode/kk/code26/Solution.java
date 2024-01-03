package cn.leetcode.kk.code26;

/**
 * 26. 删除有序数组中的重复项
 * https://leetcode.cn/problems/remove-duplicates-from-sorted-array/description/
 */
public class Solution {

    /**
     * 双指针法
     * @param nums
     * @return
     */
    public int removeDuplicates(int[] nums) {
        if(nums.length == 0) return 0;

        // 第一个元素不需要判断，所以从第二个元素开始判断
        int i = 1; // 慢指针
        for (int j = 1; j < nums.length; j++) { // j 快指针，扫描数组元素
            if (nums[j] != nums[i - 1]) { // nums[j]（当前扫描到的元素 不和前面（去重的临时数组）的元素一样）,则将其放入临时数组
                nums[i] = nums[j];
                i++;
            }
        }

        return i;
    }
}
