package cn.leetcode.kotlin.MeloZhangZhen

/**
 * 198. 打家劫舍
你是一个专业的小偷，计划偷窃沿街的房屋。每间房内都藏有一定的现金，影响你偷窃的唯一制约因素就是相邻的房屋装有相互连通的防盗系统，如果两间相邻的房屋在同一晚上被小偷闯入，系统会自动报警。

给定一个代表每个房屋存放金额的非负整数数组，计算你 不触动警报装置的情况下 ，一夜之内能够偷窃到的最高金额。


取非相连的 最大和
输入：[1,2,3,1]
输出：4
解释：偷窃 1 号房屋 (金额 = 1) ，然后偷窃 3 号房屋 (金额 = 3)。
     偷窃到的最高金额 = 1 + 3 = 4 。


输入：[2,7,9,3,1]
输出：12
解释：偷窃 1 号房屋 (金额 = 2), 偷窃 3 号房屋 (金额 = 9)，接着偷窃 5 号房屋 (金额 = 1)。
     偷窃到的最高金额 = 2 + 9 + 1 = 12 。

输入：[2,7,9,1,1,100]

100--9--2   100--1--7

 */

object LeetCode198 {
    @JvmStatic
    fun main(args: Array<String>) {
//        测试数据
        var nums1 = arrayListOf<Int>(1, 2, 3, 1)
        var nums2 = arrayListOf<Int>(2, 7, 9, 3, 1)
        var nums3 = arrayListOf<Int>(2, 7, 9, 1, 1, 100)

    }


    fun rob(nums: IntArray): Int {
        //分治 就是  第 n 个的最大  就是 n-1 不能偷  (n-1 之前的最大 加上 n) 或者 第 n-1 的最大的
        if (nums.isEmpty()) {
            return 0
        }
        if (nums.size == 1) {
            return nums[0]
        }
        if (nums.size == 2) {
            return nums[0].coerceAtLeast(nums[1])
        }

        var first = nums[0]
        var second = nums[0].coerceAtLeast(nums[1])
        var temp =second
        for (i in 2 until nums.size) {
            temp = second
            second = Math.max(first + nums[i], second)
            first = temp
        }

        return second
    }
}
