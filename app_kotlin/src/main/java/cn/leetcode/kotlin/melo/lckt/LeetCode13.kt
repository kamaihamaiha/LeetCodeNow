package cn.leetcode.kotlin.melo.lckt

/**
 * 13 罗马数字转整数
 *
字符          数值
I             1
V             5
X             10
L             50
C             100
D             500
M             1000

I 可以放在 V (5) 和 X (10) 的左边，来表示 4 和 9。
X 可以放在 L (50) 和 C (100) 的左边，来表示 40 和 90。 
C 可以放在 D (500) 和 M (1000) 的左边，来表示 400 和 900。

 */
object LeetCode13 {
    @JvmStatic
    fun main(args: Array<String>) {


    }
    fun romanToInt(s: String): Int {
        var sum = 0
        //获取该位的数值
        var preNum = getValue(s[0])
        //后面的数值
        for (i in 1 until s.length) {
            val num = getValue(s[i])
//            当前比后面的小 就 - 大就+   iv  就是 5-1  vi 就是 5+1
            if (preNum < num) {
                sum -= preNum
            } else {
                sum += preNum
            }
            preNum = num
        }
        sum += preNum
        return sum
    }

    private fun getValue(ch: Char): Int {
        return when (ch) {
            'I' -> 1
            'V' -> 5
            'X' -> 10
            'L' -> 50
            'C' -> 100
            'D' -> 500
            'M' -> 1000
            else -> 0
        }
    }


}

