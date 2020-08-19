package cn.leetcode.kotlin.caoyongfeng.code

/**
 * Created by caoyongfeng on 2020/8/19
 * email: caoyongfeng@123eblog.com
 */
class Code70 {

    fun climbStairs(n:Int): Int {
        if (n <= 0) return 0
        if (n == 1) return 1
        if (n == 2) return 2
        return climbStairs(n-1)+climbStairs(n-2)
    }
}