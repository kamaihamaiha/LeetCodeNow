package cn.leetcode.kotlin.melo.lckt

/**
 * 283. 移动零
 *
 * 必须在原数组上操作，不能拷贝额外的数组。
尽量减少操作次数
 */
object LeetCode283 {
    @JvmStatic
    fun main(args: Array<String>) {

    }

    /**
     * 如果不限制原数组
     */
    fun moveZeroes2(nums: IntArray): Unit {
//        if (nums.isNotEmpty()) {
//            var temp = nums.filter { it != 0 } as ArrayList
//            nums.forEach { if (it == 0) temp.add(0) }
//            nums = temp.toIntArray()
//        }

    }

    /**
     * 冒泡..这么,冒泡,冒0
     */
    fun moveZeroes(nums: IntArray): Unit {
        if (nums.isNotEmpty()) {

            var temp = nums[0]
            //冒泡排序
            for (i in nums.indices) {
                for (j in i + 1 until nums.size) {
                    if (nums[i] == 0|| nums[j]!=0) {
                        temp = nums[j]
                        nums[j] = nums[i]
                        nums[i] = temp
                    }
                }

            }
        }
    }
}

