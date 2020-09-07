package cn.leetcode.kotlin.melo.lckt

/**
 *70. 爬楼梯
 *
 *
 * 假设你正在爬楼梯。需要 n 阶你才能到达楼顶。

每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
 */

object LeetCode70 {
    @JvmStatic
    fun main(args: Array<String>) {
        climbStairs(100)

    }


}

/**
 * 到第n 有两种可能 就是第 n-1 +一层 或者 n-2 加两层,
 * 所以到 n 的就是 n-1 和 n-2 的 可能性 相加
 * n-1 n-2 也是  分治到 2 层  递归
 * 有点类似 之前算过的贷款的算法 前一个月还款的本金 对后面的数据是有影响的
 *
 * 斐波那契数列 兔子繁殖的递归方法
 *
 *
 * 奇葩的还有穷举法....javaint 有上限 不到五十就够了
 *
 */
fun climbStairs(n: Int): Int {

    return if (n == 0 || n == 1) {
        1
    } else {
        climbStairs(n - 1) + climbStairs(n - 2)
    }
}

fun climbStairs2(n: Int): Int {

    //一共有 n 个数值 加上 0 有 n+1 个
    val dp = IntArray(n + 1)
    dp[0] = 1
    dp[1] = 1
    for (i in 2..n) {
        dp[i] = dp[i - 2] + dp[i - 1]
    }
    return dp[n]

}