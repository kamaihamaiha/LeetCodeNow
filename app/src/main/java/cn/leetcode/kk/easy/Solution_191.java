package cn.leetcode.kk.easy;

/**
 * 191. 位1的个数
 * https://leetcode.cn/problems/number-of-1-bits/description/
 */
public class Solution_191 {

    public int hammingWeight(int n) {
        int num = 0;
        for(int i = 0; i < 32; i++) { // int 4byte = 32bit
            if((n & (i << i)) != 0) { // n 和 2^i 位运算
                num++;
            }
        }
        return num;
    }
}
