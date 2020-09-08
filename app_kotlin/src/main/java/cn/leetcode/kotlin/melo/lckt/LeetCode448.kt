package cn.leetcode.kotlin.melo.lckt

/**
 * 448. 找到所有数组中消失的数字
 *
 * 给定一个范围在  1 ≤ a[i] ≤ n ( n = 数组大小 ) 的 整型数组，数组中的元素一些出现了两次，另一些只出现一次。

找到所有在 [1, n] 范围之间没有出现在数组中的数字。

您能在不使用额外空间且时间复杂度为O(n)的情况下完成这个任务吗? 你可以假定返回的数组不算在额外空间内。


 */
object LeetCode448 {
    @JvmStatic
    fun main(args: Array<String>) {
        findDisappearedNumbers(arrayListOf<Int>(4, 3, 2, 7, 8, 2, 3, 1).toIntArray())

    }

    fun findDisappearedNumbers(nums: IntArray): List<Int> {
        if (nums.isEmpty()) return listOf()
        var temp = nums[0]
        //老规矩先冒泡
        for (i in 0 until nums.size) {
            for (j in i + 1 until nums.size) {
                if (nums[j] < nums[i]) {//冒
                    temp = nums[i]
                    nums[i] = nums[j]
                    nums[j] = temp
                }
            }
        }

        var back = nums.filterIndexed { index, i -> index != i + 1 }

        return back


    }


}

