package cn.leetcode.kotlin.melo.lckt

/**
 * 486. todo 没看懂
预测赢家
给定一个表示分数的非负整数数组。 玩家 1 从数组任意一端拿取一个分数，
随后玩家 2 继续从剩余数组任意一端拿取分数，然后玩家 1 拿，…… 。每次一个玩家只能拿取一个分数，分数被拿取之后不再可取。直到没有剩余分数可取时游戏结束。最终获得分数总和最多的玩家获胜。
给定一个表示分数的数组，预测玩家1是否会成为赢家。你可以假设每个玩家的玩法都会使他的分数最大化。
 */
object LeetCode486 {
    @JvmStatic
    fun main(args: Array<String>) {
    }
}


fun PredictTheWinner(nums: IntArray): Boolean {
    return total(nums, 0, nums.size - 1, 1) >= 0
}
/**
 * 数组  从 start 到 end turn 记录方向
 */
fun total(nums: IntArray, start: Int, end: Int, turn: Int): Int {
    //长度只有一个的时候  那就一种结果
    if (start == end) {
        return nums[start] * turn
    }
    //超过一个的时候  左拿一个
    val scoreStart = nums[start] * turn + total(nums, start + 1, end, -turn)
    val scoreEnd = nums[end] * turn + total(nums, start, end - 1, -turn)
    return Math.max(scoreStart * turn, scoreEnd * turn) * turn
}