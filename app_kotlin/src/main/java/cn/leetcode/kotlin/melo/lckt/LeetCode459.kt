package cn.leetcode.kotlin.melo.lckt

/**
给定一个非空的字符串，判断它是否可以由它的一个子串重复多次构成。给定的字符串只含有小写英文字母，并且长度不超过10000。


输入: "abab"

输出: True

解释: 可由子字符串 "ab" 重复两次构成。

输入: "aba"

输出: False


输入: "abcabcabcabc"

输出: True

解释: 可由子字符串 "abc" 重复四次构成。 (或者子字符串 "abcabc" 重复两次构成。)


 */

object LeetCode459 {


    @JvmStatic
    fun main(args: Array<String>) {
        val s1 = "abab"
        val s2 = "aba"
        val s3 = "abcabcabcabc"
        val s4 = "abacabacabac"
        println(repeatedSubstringPattern(s1))
        println(repeatedSubstringPattern(s2))
        println(repeatedSubstringPattern(s3))
        println(repeatedSubstringPattern(s4))
    }
}

/**
 *
 *
 *    public static boolean repeatedSubstringPattern(String s) {
//首先获取长度
int n = s.length();
// 没有 2位数  肯定不是循环的 直接 false  所以只需要循环一半的字符就行了
for (int i = 1; i * 2 <= n; ++i) {
// 是这个长度的倍数才有可能
if (n % i == 0) {
boolean match = true;
for (int j = i; j < n; ++j) {
// 逐位比较 都对的上的才是 true
if (s.charAt(j) != s.charAt(j - i)) {
match = false;
break;
}
}
//找到了 就返回 true ,找不到继续找
if (match) {
return true;
}
}
}
return false;
}
 */
/**
 * 扫别人 java 代码理解的
 * 1.循环最少一次,所以 for 只需要走一半
 * 2.从一位开始比较循环,以 1 为长度,后面每个对应的 1 都是和第一位一样 为 true
 * 3..类似 2 位往后比 只只要一次循环有不对的,说明就是不符合,就走下一圈,一圈都符合 就可以返回 true 了
 * 4..循环完所有可能都没有,说明就是不符合 就是 false
 */
fun repeatedSubstringPattern(s: String): Boolean {

    val n: Int = s.length
    var i = 1
    while (i * 2 <= n) {//循环一半就行,超过一半了肯定没有
        if (n % i == 0) {//是这个长度的整除才有可能,否则一定 false,节省计算量
            var match = true
            for (j in i until n) {//从这个长度后面开始第一个开始比较 是不是每隔i 的都是一样的,不一样的就是 false
                if (s[j] != s[(j - i)]) {
                    match = false
                    break
                }
            }
            //找到了 就是对了
            if (match) {
                return true
            }
        }
        //找不到继续循环找
        ++i
    }
    //一直没找到 就是 false
    return false

}

/**
 *  思路: 两倍长度后,
 *  abc---abcabc:如果 bcabc 中还有 abc 第一次出现是 第二个串的开头 说明没有重复的
 *  abcabc---abcabcabcabc:如果 bcabcabcabc 中还有 abc 第一次出现是 没到下一个就开始循环了,说明是有重复的
 */
fun repeatedSubstringPattern2(s: String): Boolean {
    //返回首次出现的索引
    return (s + s).indexOf(s, 1) != s.length;

}