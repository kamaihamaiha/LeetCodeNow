package cn.leetcode.kotlin.melo.lckt

/**
 * 26. 删除排序数组中的重复项
 */
object LeetCode26 {
    @JvmStatic
    fun main(args: Array<String>) {
        var nums = arrayListOf<Int>(0, 0, 1, 1, 1, 2, 2, 3, 3, 4).toIntArray()
        var nums1 = arrayListOf<Int>(1, 1, 2 ).toIntArray()
        removeDuplicates(nums1)
    }

    /**
     * 双指针,一个记录真实位置,一个记录到不重复的位置
     */
    fun removeDuplicates(nums: IntArray): Int {
        var a = 0
        var b = 1

        nums.forEachIndexed { index, i ->
//            保证不越界
            if (b <= index) {
                //找到了不重复的值
                if (nums[a] != nums[b]) {
                    nums[a + 1] = nums[b]
                    a++
                    b++
                } else {
                    b++
                }
            }
        }
        a++
        return a
    }

}

