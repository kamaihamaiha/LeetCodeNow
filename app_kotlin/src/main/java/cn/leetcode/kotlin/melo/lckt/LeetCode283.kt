package cn.leetcode.kotlin.melo.lckt

/**
 * 283. 移动零
 */
object LeetCode283 {
    @JvmStatic
    fun main(args: Array<String>) {

    }

    /**
     * 冒泡..这么,冒泡,冒0
     */
    fun moveZeroes(nums: IntArray): Unit {
        if (!(nums == null || nums.size == 0)) {

            var temp = nums[0]
            //冒泡排序
            for (i in nums.indices) {
                for (j in i + 1 until nums.size) {
                    if (nums[i] == 0) {
                        temp = nums[j]
                        nums[j] = nums[i]
                        nums[i] = temp
                    }
                }

            }
        }
    }
}

