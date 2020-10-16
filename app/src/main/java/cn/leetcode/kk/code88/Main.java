package cn.leetcode.kk.code88;

import java.util.Arrays;

/**
 * 88. 合并两个有序数组
 */
public class Main {
    public static void main(String[] args) {
        int[] nums1 = new int[]{1, 2, 4, 9, 0, 0, 0, 0, 0};
        int[] nums2 = new int[]{2, 4, 8, 12, 16};

        int m = 4;
        int n = 5;

        int[] sortArray = mergedSortArray(nums1, nums2, m, n);
        for (int el : sortArray) {
            System.out.println(el);
        }
    }

    public static int[] mergedSortArray(int[] array1, int[] array2, int m, int n) {
        for (int i = 0; i < m + n; i++) {
            if (i >= m) {
                array1[i] = array2[i - m];
            }
        }

        //对 array1 元素排序. 借助 Java API 的巨人肩膀完成
        Arrays.sort(array1);
        return array1;
    }
}
