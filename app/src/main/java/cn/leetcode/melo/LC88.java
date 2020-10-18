package cn.leetcode.melo;

import java.util.Arrays;

/**
 * 合并有序数组
 *
 * 1  先合并 再,冒泡
 *
 * 2 边加 边记录位置  双指针
 */
public class LC88 {
    public static void main(String[] args) {

    }
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        System.arraycopy(nums2, 0, nums1, m, n);
        Arrays.sort(nums1);
    }


}
