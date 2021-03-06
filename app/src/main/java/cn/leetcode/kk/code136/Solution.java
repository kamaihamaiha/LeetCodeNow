package cn.leetcode.kk.code136;

import java.util.HashMap;
import java.util.Map;

/**
 * 给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
 * <p>
 * 说明：
 * <p>
 * 你的算法应该具有线性时间复杂度。 你可以不使用额外空间来实现吗？
 * <p>
 * 示例 1:
 * <p>
 * 输入: [2,2,1]
 * 输出: 1
 * 示例 2:
 * <p>
 * 输入: [4,1,2,1,2]
 * 输出: 4
 */
public class Solution {

    public int singleNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (map.get(num) == null) {
                map.put(num, 1);
            } else {
                map.put(num, 2);
            }
        }

        int value = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                value = entry.getKey();
                break;
            }
        }

        return value;
    }

    /**
     * 利用异或运算特性计算
     * @param nums
     * @return
     */
    public int singleNumber2(int[] nums) {
        int value = nums[0];
        for (int i = 1; i < nums.length; i++) {
            value = value ^ nums[i];
        }
        return value;
    }
}
