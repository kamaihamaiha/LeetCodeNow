package cn.leetcode.kk.code14;


import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void testLongestCommonPrefix() {
        // test case
        String[] test_case_1 = new String[]{"flower", "flow", "flight"};
        String exception_1 = "fl";


        String ret = Solution.longestCommonPrefix(test_case_1);
        Assert.assertEquals(exception_1, ret);
    }
}