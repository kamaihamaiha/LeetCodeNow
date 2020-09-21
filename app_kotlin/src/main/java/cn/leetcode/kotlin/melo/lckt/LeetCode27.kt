package cn.leetcode.kotlin.melo.lckt

/**
 * 27. 移除元素
 *
 * 给你一个数组 nums 和一个值 val，你需要 原地 移除所有数值等于 val 的元素，并返回移除后数组的新长度。

不要使用额外的数组空间，你必须仅使用 O(1) 额外空间并 原地 修改输入数组。

元素的顺序可以改变。你不需要考虑数组中超出新长度后面的元素。

https://leetcode-cn.com/problems/remove-element/
 */
object LeetCode27 {
    @JvmStatic
    fun main(args: Array<String>) {
        var s = arrayListOf<Int>(0, 1, 2, 5, 8, 15634, 1, 65456).toIntArray()
        removeElement(s, 1)

    }

    // 双指针
    fun removeElement(nums: IntArray, `val`: Int): Int {
        if (nums.size == 0) return 0
        if (nums.size == 1) {
            if (nums[0] == `val`) return 0
            if (nums[0] != `val`) return 1
        }
        var p = 0


        for (i in nums.indices) {
            if (nums[i] != `val`) {
                nums[p] = nums[i];
                p++
            }


        }

        return p

    }

    fun removeElement1(nums: IntArray, `val`: Int): Int {
        if (nums.size == 0) return 0
        var temp = nums[0]
//    先冒泡排序 类似的
        for (i in nums.indices) {
            for (j in i + 1 until nums.size) {
                if (nums[i] > nums[j]) {
                    temp = nums[i]
                    nums[i] = nums[j]
                    nums[j] = temp
                }
            }
        }

        return 0
    }


}

