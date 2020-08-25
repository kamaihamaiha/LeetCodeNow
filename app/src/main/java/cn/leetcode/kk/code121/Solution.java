package cn.leetcode.kk.code121;

/**
 * 给定一个数组，它的第 i 个元素是一支给定股票第 i 天的价格。
 * <p>
 * 如果你最多只允许完成一笔交易（即买入和卖出一支股票一次），设计一个算法来计算你所能获取的最大利润。
 * <p>
 * 注意：你不能在买入股票前卖出股票。
 * <p>
 *  
 * <p>
 * 示例 1:
 * <p>
 * 输入: [7,1,5,3,6,4]
 * 输出: 5
 * 解释: 在第 2 天（股票价格 = 1）的时候买入，在第 5 天（股票价格 = 6）的时候卖出，最大利润 = 6-1 = 5 。
 * 注意利润不能是 7-1 = 6, 因为卖出价格需要大于买入价格；同时，你不能在买入前卖出股票。
 * 示例 2:
 * <p>
 * 输入: [7,6,4,3,1]
 * 输出: 0
 * 解释: 在这种情况下, 没有交易完成, 所以最大利润为 0。
 */
public class Solution {

    /**
     * 暴力破解。 时间复杂度大
     *
     * @param prices
     * @return
     */
    public static int maxProfit(int[] prices) {
        if (prices.length == 0) {
            return 0;
        }

        int profit = 0;
        for (int i = 0; i < prices.length; i++) {
            int buy = prices[i]; //买入
            for (int j = i + 1; j < prices.length; j++) {
                int sale = prices[j]; //卖出
                if (profit < sale - buy) {
                    profit = sale - buy;
                }
            }
        }

        return profit;
    }

    /**
     * 动态规划法
     * @param prices
     * @return
     */
    public static int maxProfit2(int[] prices) {
        if (prices.length == 0) {
            return 0;
        }

        int profit = 0;
        int minPrice = prices[0];
        for (int i = 1; i < prices.length; i++) {
            if (minPrice > prices[i]){
                minPrice = prices[i];
            } else if (profit < prices[i] - minPrice){
                profit = prices[i] - minPrice;
            }
        }

        return profit;
    }
}
