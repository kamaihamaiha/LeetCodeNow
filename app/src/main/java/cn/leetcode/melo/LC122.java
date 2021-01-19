package cn.leetcode.melo;

public class LC122 {
    public static void main(String[] args) {
        int back = maxProfit(new int[]{1, 2, 6, 9});
    }

    public static int maxProfit(int[] prices) {
        int sum = 0;
        //后面大于前面的就可以
        for (int i = 0; i < prices.length - 1; i++) {
            if (prices[i + 1] > prices[i]) {
                sum += prices[i + 1] - prices[i];
            }
        }
        return sum;

    }
}
