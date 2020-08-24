package cn.leetcode.kotlin.MeloZhangZhen

/**
给定一个数组，它的第 i 个元素是一支给定股票第 i 天的价格。

如果你最多只允许完成一笔交易（即买入和卖出一支股票一次），设计一个算法来计算你所能获取的最大利润。

注意：你不能在买入股票前卖出股票。

 
输入: [7,1,5,3,6,4]
输出: 5
解释: 在第 2 天（股票价格 = 1）的时候买入，在第 5 天（股票价格 = 6）的时候卖出，最大利润 = 6-1 = 5 。
注意利润不能是 7-1 = 6, 因为卖出价格需要大于买入价格；同时，你不能在买入前卖出股票。


输入: [7,6,4,3,1]
输出: 0
解释: 在这种情况下, 没有交易完成, 所以最大利润为 0

 */

object LeetCode121 {

    @JvmStatic
    fun main(args: Array<String>) {


        val price1 = arrayListOf<Int>(7, 1, 5, 3, 6, 4)
        val price2 = arrayListOf<Int>(7, 6, 4, 3, 1)
        val price3 = arrayListOf<Int>(7, 6, 114, 3, 1)

        val priceInt1: IntArray = price1.toIntArray()
        val priceInt2: IntArray = price2.toIntArray()
        val priceInt3: IntArray = price3.toIntArray()

        println(maxProfit(priceInt1))
        println(maxProfit(priceInt2))
        println(maxProfit(priceInt3))//114-6  108
    }
}


/**
 * 一次遍历
 * 思路:今天卖的话,前面哪天买最赚
 * 都是假设今天是最高值,今天卖出去, 前面哪天卖挣的最多
 */
fun maxProfit (prices: IntArray): Int {
    //自第一天要是最大最大才能保证 后面是比 他小的,或者记录第一天的值,但是要判空
    var minInt = Int.MAX_VALUE
    //最大利润
    var maxInt = 0
    for (it in prices.indices) {
        //今天之前的最小值 也就是最便宜的买入  记录当天之前的最低值
        minInt = Math.min(prices[it], minInt)
        // 今天的利润是 prices[it]-minInt,之前的事 maxInt 取最大的
        maxInt = Math.max(maxInt, prices[it] - minInt)
    }
    return maxInt
}

/**
 * 思路 :今天买了 哪天卖了最赚,比较所以的利润
 * 基础暴力法
 */
fun maxProfit2(prices: IntArray): Int {
//    每个数为起点,后面数字的最大的 减去前面的数字
    var maxInt = 0

    for (it in prices.indices) {
        val first = prices[it]
        var maxOtherInt = 0
        //找到后面的最小值
        for (it2 in it + 1 until prices.size) {
            maxOtherInt = prices[it2].coerceAtLeast(maxOtherInt)
        }
        maxInt = maxInt.coerceAtLeast(maxOtherInt - first)
    }

    return maxInt
}