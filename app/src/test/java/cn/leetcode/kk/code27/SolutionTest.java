package cn.leetcode.kk.code27;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

    @Test
    public void testRemoveElement() {
        Solution solution = new Solution();
        int[] nums_1 = new int[]{1, 1, 1, 2};
        int[] nums_2 = new int[]{3, 2, 2, 3};
        int k_1 = solution.removeElement(nums_1, 1);
        int k_2 = solution.removeElement(nums_2, 3);

        assertEquals(1, k_1);
        assertEquals(2, k_2);

    }

}