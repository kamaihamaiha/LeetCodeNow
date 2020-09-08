package cn.leetcode.kotlin.melo.lckt

import android.graphics.ColorSpace.match

/**
 * 14 最长公共前缀
 * 字节题库  方法众多..分治
 */
object LeetCode14 {
    @JvmStatic
    fun main(args: Array<String>) {
        longestCommonPrefix(arrayOf("flower","flow","flight") )

    }

    fun longestCommonPrefix(strs: Array<String>): String {
        //首先找到最短的字符串，极限就是这个了    不用最短也可以
        if (strs == null || strs.size == 0) return ""
        var minString = strs[0]
        strs.forEach {
            if (it.length < minString.length) minString = it
        }
        return matchMin(strs, minString)

    }

    private fun matchMin(strs: Array<String>, minString: String): String {
        if (minString.isNullOrEmpty()) return ""

        for (i in strs.indices) {
            //都是这个就返回 min
            if (!strs[i].startsWith(minString)) {
                return matchMin(strs, minString.substring(0, minString.length - 1))

            }
        }
        return minString
    }
}

