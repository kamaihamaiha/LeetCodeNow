package cn.leetcode.kk.code70;
 class Solution {


    /**
     * 按照斐波那契数列计算
     * @param n
     * @return
     */
     int climbStairs(int n){
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        int tempA = 1;
        int tempB = 2;

        int temp = tempA + tempB;
        while (n > 3){
            tempA = tempB;
            tempB = temp;
            temp = tempA + tempB;
            n--;
        }

        return temp;
    }
}
