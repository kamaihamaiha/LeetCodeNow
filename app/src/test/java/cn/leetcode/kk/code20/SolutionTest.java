package cn.leetcode.kk.code20;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

    @Test
    public void testValid() {
        Solution solution = new Solution();
        assertTrue(solution.isValidV2("()"));
        assertTrue(solution.isValidV2("()[]{}"));
        assertFalse(solution.isValidV2("(]"));
        assertFalse(solution.isValidV2("([)]"));
        assertTrue(solution.isValidV2("{[]}"));
    }
}