package cn.leetcode.kk.code69;

/**
 * 69. x 的平方根
 * 实现 int sqrt(int x) 函数。
 * <p>
 * 计算并返回 x 的平方根，其中 x 是非负整数。
 * <p>
 * 由于返回类型是整数，结果只保留整数的部分，小数部分将被舍去。
 * <p>
 * 示例 1:
 * <p>
 * 输入: 4
 * 输出: 2
 * 示例 2:
 * <p>
 * 输入: 8
 * 输出: 2
 * 说明: 8 的平方根是 2.82842...,
 * 由于返回类型是整数，小数部分将被舍去。
 */
public class Main {
    public static void main(String[] args) {

        for (int i = 0; i < 10000; i++) {
            mySqrt(i * i);
        }
    }


    /**
     * 用二分法。
     *
     * @param x
     * @return
     */
    public static int mySqrt(int x) {
        int value = 0;
        if (x == 0) {
            return 0;
        }

        int computeLoop = 0;
        int leftBorder = 1;
        int rightBoder = x;

        while (true) {
            computeLoop++;
            int middle = (leftBorder + rightBoder) / 2;
            if (middle < x / middle) {
                leftBorder = middle;
            } else if (middle == x / middle) {
                value = middle;
                break;
            } else {
                rightBoder = middle;
            }

            if (rightBoder - leftBorder == 1) {
                value = leftBorder;
                break;
            }


        }
        System.out.println(x + " 的平方根是： " + value + ",计算次数： " + computeLoop);
        return value;
    }
}
