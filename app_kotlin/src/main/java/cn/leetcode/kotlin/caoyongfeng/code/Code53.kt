package cn.leetcode.kotlin.caoyongfeng.code

/**
 * Created by caoyongfeng on 2020/8/18
 * email: caoyongfeng@123eblog.com
 */
class Code53 {
    /**
     * 参考视频完成
     */
    fun maxSubArray(nums: Array<Int>):Int{
        var max = nums[0]
        var now = 0
        nums.forEach {
            if (now < 0){
                now = it
            }else{
                now+=it
            }
            max = now.coerceAtLeast(max)
        }
        return max
    }
}