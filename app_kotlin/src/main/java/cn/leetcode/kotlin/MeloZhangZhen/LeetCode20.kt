package cn.leetcode.kotlin.MeloZhangZhen

/**
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。

有效字符串需满足：

左括号必须用相同类型的右括号闭合。
左括号必须以正确的顺序闭合。
注意空字符串可被认为是有效字符串。

 解题思路 是栈的思想,也是链表的思想,如果前后两者是搭对了,就可以移除两者,
 */

object LeetCode20 {
    //需要验证的字符串
    private const val s = "{}({}{}){}"
    private const val s2 = "{}({}{[[[}){}"

    @JvmStatic
    fun main(args: Array<String>) {
        println(isValid(s))
        println(isValid(s2))

    }
}

/**
 * 思路 一个个加进去,如果后面一个和前面匹配了 就可以移出去  最后都配对成功了 就说明是个符合的
 * 特殊情况 :null 和奇数
 */
fun isValid(s: String?): Boolean {
//    如果是空返回有效,如果是单数肯定无效
    if (s == null) {
        return true
    } else if (s.length % 2 > 0) {
        return false
    }
    val sArray = s.toCharArray()
    //保存上面的
    val mMatchArray = arrayListOf<String>()

    for (it in sArray.indices) {
        if (it == 0) {
            mMatchArray.add(sArray[it].toString())
        } else {
            mMatchArray.add(sArray[it].toString())

            //如果前后配对上了,而且有超过两个
            if (mMatchArray.size >= 2) {
                if (singletonIsValid(mMatchArray[mMatchArray.size - 2], mMatchArray[mMatchArray.size - 1])) {
                    //移除他俩
                    mMatchArray.removeAt(mMatchArray.size - 1)
                    mMatchArray.removeAt(mMatchArray.size - 1)
                }
            }
        }
    }



    return mMatchArray.size == 0
}

/**
 * 单个比较前后两个字符是否配对
 */
fun singletonIsValid(sPre: String, s: String): Boolean {
    val baseParentheses11 = "("
    val baseParentheses21 = "["
    val baseParentheses31 = "{"

    val baseParentheses12 = ")"
    val baseParentheses22 = "]"
    val baseParentheses32 = "}"
    return when (sPre) {
        baseParentheses11 -> {
            s == baseParentheses12
        }
        baseParentheses21 -> {
            s == baseParentheses22
        }
        baseParentheses31 -> {
            s == baseParentheses32
        }
        else -> {
            false
        }
    }

}
