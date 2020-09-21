package cn.leetcode.kotlin.melo.lckt

/**
 * 35  搜索插入位置
 */
object LeetCode35 {
    @JvmStatic
    fun main(args: Array<String>) {


    }

    /**
     * 二分法 查找
     */
    fun searchInsert(nums: IntArray, target: Int): Int {
        val n = nums.size
        var left = 0
        var right = n - 1

        var ans = n
        while (left <= right) {
            val mid = (right - left shr 1) + left
            if (target <= nums[mid]) {
                ans = mid
                right = mid - 1
            } else {
                left = mid + 1
            }
        }
        return ans
    }

}

