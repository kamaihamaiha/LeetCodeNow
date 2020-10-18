package cn.leetcode.kotlin.melo.lckt

/**
 * 整数反转
 */
object LeetCode7 {
    @JvmStatic
    fun main(args: Array<String>) {
        println(-5 + 1 / 4 + 2 * -3 + 5)

        println(reverse(901000).toString())

    }

    /**
     * 最垃圾的反转字符串方法
     * 正常用除法和取模 才是对的
     */
    fun reverse(x: Int): Int {
        try {
            var jisuan = x

            if (jisuan.toString().startsWith("-")) {
                jisuan = -x
            }
            var bacStringarry = jisuan.toString().toCharArray().reversedArray()
            //反过来
            var back = StringBuffer("")
            bacStringarry.forEach { back.append(it) }
            var backint: Int = Integer.parseInt(back.toString())!!


            if (x.toString().startsWith("-")) {
                backint = -backint
            }
            return backint

        } catch (e: Exception) {
            return 0

        }

    }
}

