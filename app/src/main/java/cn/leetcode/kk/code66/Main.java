package cn.leetcode.kk.code66;

/**
 * 66. 加一
 * 给定一个由整数组成的非空数组所表示的非负整数，在该数的基础上加一。
 * <p>
 * 最高位数字存放在数组的首位， 数组中每个元素只存储单个数字。
 * <p>
 * 你可以假设除了整数 0 之外，这个整数不会以零开头。
 * <p>
 * 示例 1:
 * <p>
 * 输入: [1,2,3]
 * 输出: [1,2,4]
 * 解释: 输入数组表示数字 123。
 * 示例 2:
 * <p>
 * 输入: [4,3,2,1]
 * 输出: [4,3,2,2]
 * 解释: 输入数组表示数字 4321。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/plus-one
 */
public class Main {

    public static void main(String[] args) {

    }

    public static int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {

            //第一轮要 +1,是题目要求。 第二轮以后 +1 是因为上一轮进位了。
            digits[i]++;
            digits[i] = digits[i] % 10;
            if (digits[i] != 0) {
                //如果没有进位，则后面的不需要计算了.
                return digits;
            }
        }

        //如果到这里，还没有返回。 则是所有的位都发生了进位。 那么的 digits[] 所有位都是 0. 需要新增最高位
        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }
}
