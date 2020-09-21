package cn.leetcode.kotlin.melo.lckt

/**
 * 28. 实现 strStr()
 * 给定一个 haystack 字符串和一个 needle 字符串，在 haystack 字符串中找出 needle 字符串出现的第一个位置 (从0开始)。如果不存在，则返回  -1。


 */

object LeetCode28 {
    @JvmStatic
    fun main(args: Array<String>) {
        "mississippi"
        "issip"
        strStr("mississippi", "issip")
    }

    /**
     * 滑动 窗口 双指针 之类的  长度固定
     */
    fun strStr(haystack: String, needle: String): Int {
        if (needle.equals(haystack)) return 0
        if (needle.isNullOrEmpty()) return 0
        if (!haystack.contains(needle)) return -1


        for (i in 0..haystack.length-needle.length){
            if (haystack.subSequence(i,i+needle.length).equals(needle))return i
        }

            return -1

    }

}

