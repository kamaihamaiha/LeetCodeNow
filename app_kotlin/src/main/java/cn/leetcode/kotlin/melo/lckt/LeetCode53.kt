package cn.leetcode.kotlin.melo.lckt

import java.lang.Math.max

object LeetCode53 {
    @JvmStatic
    fun main(args: Array<String>) {
        maxSubArray(arrayOf(1, 3, 5, 6, -9, 13, 11).toIntArray())
    }
}

/**
 * 给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
 * 输入: [-2,1,-3,4,-1,2,1,-5,4]
输出: 6
解释: 连续子数组 [4,-1,2,1] 的和最大，为 6。
 *
 * 思路 :  暴力求和,前面如果为负值,就要抛弃
 *
 */
fun maxSubArray(nums: IntArray): Int {

    when (nums.size) {
        0 -> {
            return 0
        }
        1 -> {
            return nums[0]
        }
        else -> {
            var ans = nums[0]
            var sum = 0
            for (num in nums) {
                if (sum > 0) {
                    sum += num
                } else {
                    //如果前面都是负数,那么就是累赘,就要抛弃掉,从头开始
                    sum = num
                }
                ans = ans.coerceAtLeast(sum)
            }
            return ans
        }


    }

}

/**
 *分治:
 * 分治法解题的一般步骤：
（1）分解，将要解决的问题划分成若干规模较小的同类问题；
（2）求解，当子问题划分得足够小时，用较简单的方法解决；
（3）合并，按原问题的要求，将子问题的解逐层合并构成原问题的解。


拆开两段,最大值是左边,右边,或者跨边,首先排除特殊情了就开始分段
分治 只要拆的够细 一定会拆到中间
所以 核心是 maxCrossingSum方法  已自己为中心左右找到能加到的最大值.max 函数比较

不是最优解!

 */


fun maxSubArray2(nums: IntArray): Int {
    val len = nums.size
    return if (len == 0) {
        0
    } else maxSubArraySum(nums, 0, len - 1)
}

private fun maxCrossingSum(nums: IntArray, left: Int, mid: Int, right: Int): Int {
    // 一定会包含 nums[mid] 这个元素
    var sum = 0
    var leftSum = Int.MIN_VALUE
    // 左半边包含 nums[mid] 元素，最多可以到什么地方
    // 走到最边界，看看最值是什么
    // 计算以 mid 结尾的最大的子数组的和
    for (i in mid downTo left) {
        sum += nums[i]
        if (sum > leftSum) {
            leftSum = sum
        }
    }
    sum = 0
    var rightSum = Int.MIN_VALUE
    // 右半边不包含 nums[mid] 元素，最多可以到什么地方
    // 计算以 mid+1 开始的最大的子数组的和
    for (i in mid + 1..right) {
        sum += nums[i]
        if (sum > rightSum) {
            rightSum = sum
        }
    }
    return leftSum + rightSum
}

private fun maxSubArraySum(nums: IntArray, left: Int, right: Int): Int {
    if (left == right) {
        return nums[left]
    }
    /**
     * 将此值右移[bitCount]个位数，并用零填充最左边的位。
     *
     * 求和的中间值的 效率高
     */
    val mid = left + right ushr 1
    return max3(maxSubArraySum(nums, left, mid),
            maxSubArraySum(nums, mid + 1, right),
            maxCrossingSum(nums, left, mid, right))
}

private fun max3(num1: Int, num2: Int, num3: Int): Int {
    return num1.coerceAtLeast(num2.coerceAtLeast(num3))
}