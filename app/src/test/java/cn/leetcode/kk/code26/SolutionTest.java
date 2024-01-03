package cn.leetcode.kk.code26;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

    @Test
    public void testRemoveDuplicates() {
        Solution solution = new Solution();
        int[] nums = new int[]{1, 1, 1, 2};
        int k = solution.removeDuplicates(nums);
        assertEquals(2, k);

    }

}