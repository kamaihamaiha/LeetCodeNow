package cn.leetcode.kotlin.melo.lckt

/**
 *66 一加  加一!!!
 * 输入: [1,2,3]
输出: [1,2,4]
解释: 输入数组表示数字 123。


 */
object LeetCode66 {
    @JvmStatic
    fun main(args: Array<String>) {
        val digits = intArrayOf(9, 9, 9)
        plusOne(digits)

    }

    var backArry = arrayListOf<Int>()

    fun plusOne(digits: IntArray): IntArray {
        var pos = digits.size - 1

        plusOneLast(digits, pos)
        return backArry.toIntArray()


    }

    /**
     * 迷之递归,要找好退出的条件才可以
     */
    fun plusOneLast(digits: IntArray, pos: Int)  {

        if (digits[pos] + 1 < 10) {
            digits[pos] = digits[pos] + 1
            backArry.addAll(digits.toList())

        } else {
            digits[pos] = digits[pos] + 1 - 10
            //如果是第一位 要前面加一
            if (pos == 0) {

                backArry.addAll(digits.toList())
                backArry.add(0, 1)


            }else{
            plusOneLast(digits, pos - 1)}
        }

    }

}

