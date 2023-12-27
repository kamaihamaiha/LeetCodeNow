package cn.leetcode.kk.code1;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public static int[] twoSum(int[] sums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < sums.length; i++) {
            int diffValue = target - sums[i];
            if (map.containsKey(diffValue)) {
                return new int[]{map.get(diffValue), i};
            }

            map.put(sums[i], i);
        }

        //到这里就是没有找到
        return new int[]{-1, -1};
    }

    public static int[] twoSum2(int[] nums, int target) {
        int[] ret = new int[2];
        int len = nums.length;
        int index_a, index_b;
        boolean find = false;
        for(int i = 0; i < len - 1; i++) {
            int temp = target - nums[i];
            for(int j = i + 1; j < len; j++) {
                if(temp == nums[j]) { // 找到了
                    ret[0] = i;
                    ret[1] = j;
                    find = true;
                    break;
                }
            }
            if(find) break;
        }

        return ret;
    }
}
