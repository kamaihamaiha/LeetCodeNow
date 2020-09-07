package cn.leetcode.kotlin.melo.lckt

/**
剑指 Offer 20. 表示数值的字符串
请实现一个函数用来判断字符串是否表示数值
（包括整数和小数）。例如
，字符串"+100"、"5e2"、"-123"、"3.1416"、"-1E-16"、"0123"
都表示数值，但"12e"、"1a3.14"、"1.2.3"、"+-5"及"12e+5.4"都不是。


 */

object LeetCodeOffer20 {
    @JvmStatic
    fun main(args: Array<String>) {

    }
}

/**
 * 抓异常方式  ///
 */
fun isNumber(s: String): Boolean {
    if(s.endsWith("f")||s.endsWith("D")) return false;
    try {
        s.toDouble()
        return true;
    }catch (ex :Exception ){
        return false;
    }


}

/**
 * 情况太多了 要吐了..不搞了
 */
fun isNumbe2(s: String): Boolean {
    //空不是
    if (s.isNullOrEmpty()) return false
    val s = s.trim()
    //num  dot   r
    var numFlag = false
    var dotFlag = false
    var eFlag = false
    if (s[0]!='+'&&s[0]!='-'&&!(s[0] in '0'..'9')){
        return false
    }
    for (i in s.indices) {

        //如果是数字
        if (s[i] in '0'..'9') {
            numFlag = true
        } else if (s[i] == '.' && !dotFlag && !eFlag) {
            //有小数点,切只能有一个 还不能有e
            dotFlag = true
        } else if ((s[i] == 'e' || s[i] == 'E') && !dotFlag && !eFlag) {
            //有e 只能有一个 还不能是小数
            eFlag = true
//            有e了 肯定不是num
            numFlag = false
        } else if ((s[i] == '+' || s[i] == '-') && (i == 0 || s[i - 1] == 'e' || s[i - 1] == 'E')) {

        } else {
            return false
        }

    }
    return numFlag
}