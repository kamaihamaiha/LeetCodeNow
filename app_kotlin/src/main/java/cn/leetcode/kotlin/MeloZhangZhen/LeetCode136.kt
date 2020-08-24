package cn.leetcode.kotlin.MeloZhangZhen

/**
给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。

说明：

你的算法应该具有线性时间复杂度。 你可以不使用额外空间来实现吗？
输入: [2,2,1]
输出: 1
输入: [4,1,2,1,2]
输出: 4
 */

object LeetCode136 {


    @JvmStatic
    fun main(args: Array<String>) {
        val nums1 = arrayListOf<Int>(2, 2, 1).toIntArray()
        val nums2 = arrayListOf<Int>(4, 1, 2, 1, 2).toIntArray()
        singleNumber(nums1)

    }
}

/**
 * 正解为 位运算
 *
 *  single ^= num;
 *  0^a=a
 *  0^a^a=0
 *
 *  所以所有数字两边了都复原了
 *  一遍的就是咱的值!!!!
 *  有意思
 *
 *  但是
 *  内存消耗：36.2 MB, 在所有 Kotlin 提交中击败了40.91%的用户
 *
 */
fun singleNumber(nums: IntArray): Int {
    var single = 0
    for (num in nums) {
        single = single xor num
    }
    return single


}

/**
 * 栈的思想 后进来的  和前面匹配了就一起消失
 * 还是用了额外的空间
 */
fun singleNumber3(nums: IntArray): Int {
    val backA = arrayListOf<Int>()

    nums.forEach {
        if (backA.contains(it)) {
            backA.remove(it)
        } else {
            backA.add(it)
        }
    }
    //数据不对劲 报错,可以自定义去
    if (backA.size == 0) throw Exception()
    return backA[0]

}

/**
 * 最水的计算
 * 前面找 一个 后面找一个  同一个 就是唯一的
 *
 * 用了高级函数 所以 搞的很慢 lc 会用一个超级大的数组玩爆你
 */
fun singleNumber2(nums: IntArray): Int {
    nums.forEach {
        if (nums.lastIndexOf(it) == nums.indexOf(it)) return it
    }

    return -1

}