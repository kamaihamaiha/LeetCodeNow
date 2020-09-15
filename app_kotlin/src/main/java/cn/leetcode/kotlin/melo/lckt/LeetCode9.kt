package cn.leetcode.kotlin.melo.lckt

/**
 * 9. 回文数
 *
 * 123  false
 * 123321 是
 *
 * -1 不是
 */
object LeetCode9 {
    var oneInt: Int = 0
    var oldlength: Int = 0
    var newX: Int = 0

    @JvmStatic
    fun main(args: Array<String>) {
//        println(isPalindrome(21))
//        println(isPalindrome(121))
//        println(isPalindrome(-1))
//        println(isPalindrome(0))


        println(reverse(153423646))
    }

    /**
     *先反转 再看看是不是一样
     * 之前反转的太垃圾了 这次好好反转
     */
    fun isPalindrome(x: Int): Boolean {

        if (x < 0) {
            return false
        }
        if (x == 0) {
            return true
        }
        if (x > 0) {
            return (reverse(x) == x)
        }
        return false

    }

    /**
     * 走到这都是正数了  不考虑负数了
     */
    fun reverse(x: Int): Int {
        if (x < 0) {
            newX = -x
        } else {
            newX = x
        }
//        先看看是几位数
        oldlength = newX.toString().length
//        println()
        getFirst(newX)
//        溢出返回 0

        if (x < 0) {
            return -oneInt
        } else {
            return oneInt
        }


    }

    fun getFirst(x: Int) {
        //记录一下 反向乘
//        几个0
        var digits = Math.pow(10.0, (oldlength - x.toString().length).toDouble()).toInt()
        var bits = (x / Math.pow(10.0, (x.toString().length - 1).toDouble())).toInt()
        oneInt = oneInt + digits * bits
        if (oneInt > Int.MAX_VALUE) {
            oneInt = 0
        } else {
            if (x.toString().length > 1) {
                getFirst((x % Math.pow(10.0, (x.toString().length - 1).toDouble())).toInt())
            }
        }
    }

}

