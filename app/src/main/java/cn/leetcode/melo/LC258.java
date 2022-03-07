package cn.leetcode.melo;

/**
 * 给定一个非负整数 num，反复将各个位上的数字相加，直到结果为一位数。返回这个结果。
 */
public class LC258 {
    public static void main(String[] args) {
        int a = addDigits(555);
        System.out.println(a);
    } 

    public static int addDigits(int num) {
        while (num >= 10) {
            int sum = 0;
            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }
            num = sum;
        }

        return num;


    }

    //递归
    public static int addDigits2(int num) {
        if (num < 10) {
            return num;
        }
        int ans = 0;  //5668
        int numLength = String.valueOf(num).length();
        for (int i = numLength - 1; i >= 0; i--) {
            //5
            ans += num / Math.pow(10, i);
            //668
            num %= Math.pow(10, i);
        }
        return addDigits(ans);

    }


}
