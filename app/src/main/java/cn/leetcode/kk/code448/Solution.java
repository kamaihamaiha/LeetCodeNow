package cn.leetcode.kk.code448;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {

    /**
     * 用 hashMap
     *
     * @param nums
     * @return
     */
    List<Integer> findDisappearedNumbers(int[] nums) {
        if (nums.length == 0) {
            return new ArrayList<>();
        }

        List<Integer> targetNums = new ArrayList<>();
        int size = nums.length;
        Map<Integer, Integer> map = new HashMap<>();

        //把数组的数字当作 key，然后只要有该数就在该 key 存放 1
        for (int i = 0; i < size; i++) {
            map.put(nums[i], 1);
        }

        for (int i = 1; i <= size; i++) {
            if (map.get(i) == null) {
                targetNums.add(i);
            }
        }
        return targetNums;
    }

    /**
     * 动态标记
     * @param nums
     * @return
     */
    List<Integer> findDisappearedNumbers2(int[] nums) {
        if (nums.length == 0) {
            return new ArrayList<>();
        }
        //遍历数组，然后标记
        for (int i = 0; i < nums.length; i++) {
            //把当前位置的数减去一(tempIndex)，然后去标记 tempIndex 对应数值，把它变成相反数
            int tempIndex = (nums[i] < 0 ? nums[i] * -1 : nums[i]) - 1;
//            System.out.println(tempIndex);
            if (nums[tempIndex] > 0) {
                nums[tempIndex] = nums[tempIndex] * -1;
            }
        }

        List<Integer> targetNums = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                targetNums.add(i + 1);
            }
        }

        return targetNums;
    }
}
