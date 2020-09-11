package cn.leetcode.kk.code461;

/**
 * 146: 汉明距离
 */
public class Solution {


    /**
     * 用 Java API 自带的函数运算
     *
     * @param x
     * @param y
     * @return
     */
    public int hammingDistance(int x, int y) {
        return Integer.bitCount(x ^ y);
    }

    /**
     * 先异或运算，然后移位判断 1 的个数。
     *
     * @param x
     * @param y
     * @return
     */
    public int hammingDistance2(int x, int y) {
        int oxrValue = x ^ y;
        int count = 0;
        while (oxrValue > 0) {
            if (oxrValue % 2 == 1) {
                count++;
            }
            oxrValue /= 2;
        }

        return count;
    }
}
