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
}
