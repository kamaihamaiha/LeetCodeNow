package cn.leetcode.kk.code121;

/**
 * 121. 买卖股票的最佳时机
 */
public class Main {

    public static void main(String[] args) {

        int[] stock1 = new int[]{7,1,5,3,6,4};
        int[] stock2 = new int[]{7,6,4,3,1};
        int maxProfit = Solution.maxProfit2(stock2);
        System.out.println(maxProfit);
    }
}
