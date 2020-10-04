package cn.leetcode.kk.code136;

/**
 * 136. 只出现一次的数字
 */
public class Main {

    public static void main(String[] args) {

        int number = new Solution().singleNumber(new int[]{4, 1, 2, 1, 2});
        int number2 = new Solution().singleNumber2(new int[]{4, 1, 2, 1, 2});
        System.out.println(number);
        System.out.println(number2);
    }
}
