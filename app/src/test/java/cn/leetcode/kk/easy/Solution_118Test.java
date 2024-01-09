package cn.leetcode.kk.easy;


import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class Solution_118Test {

    @Test
    public void generate() {
        Solution_118 solution_118 = new Solution_118();
        List<List<Integer>> retList = solution_118.generate(5);

        Assert.assertEquals(5, retList.size());
        for (List<Integer> nums : retList) {
            for (Integer num : nums) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}