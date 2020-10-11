package cn.leetcode.kotlin.melo.lckt

/**
 * 最后一个单词的长度
 */
object LeetCode58 {
    @JvmStatic
    fun main(args: Array<String>) {
        var bac = lengthOfLastWord("h wordle")
        1 == 1

    }

    /**
     * char
     */
    fun lengthOfLastWord(s: String): Int {

        var s2 = s.trim()
        if (s2.equals("")) return 0
        //倒序遍历 取第一个空格位置
        for (it in s2.length-1 downTo 0) {
            if (s2[it].toString().equals(" ")) {
                return s2.length-it+1
            }
        }
        return 0
    }

    /**
     * 操作字符串
     */
    fun lengthOfLastWord1(s: String): Int {

        var slist = s.trim().split(" ")
        if (slist.size == 0) return 0
        return slist[slist.size - 1].length

    }
}

