package cn.leetcode.melo;

/**
 * 461. 汉明距离
 * https://leetcode-cn.com/problems/hamming-distance/
 * <p>
 * 两个整数之间的汉明距离指的是这两个数字对应二进制位不同的位置的数目。
 * <p>
 * 给出两个整数 x 和 y，计算它们之间的汉明距离。
 */
public class LC461 {
    public static void main(String[] args) {

    }

    /**
     *   异或运算  统计 1 的个数   0101  0100  -->  0001  这样的
     * @param x
     * @param y
     * @return
     */
    public int hammingDistance(int x, int y) {
        return Integer.bitCount(x ^ y);

    }
}
