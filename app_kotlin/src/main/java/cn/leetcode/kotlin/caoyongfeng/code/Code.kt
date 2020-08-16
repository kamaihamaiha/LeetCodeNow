package cn.leetcode.kotlin.caoyongfeng.code

import cn.leetcode.kotlin.caoyongfeng.model.ListNode

/**
 * Created by caoyongfeng on 2020/8/14
 * email: caoyongfeng@123eblog.com
 */
class Code {

    fun code1(){
        val l1 = ListNode(1, ListNode(5, ListNode(6)))
        val l2 = ListNode(1, ListNode(4, ListNode(7)))
        val node = mergerTwoList(l1, l2)
        node.print()
    }

    private fun mergerTwoList(l1: ListNode, l2: ListNode): ListNode {
        return if ( l1.value <= l2.value){
            val next = l1.next
            if (next == null){
                l1.next = l2
            }else{
                l1.next = mergerTwoList(next,l2)
            }
            l1
        }else{
            mergerTwoList(l2,l1)
        }

    }

    fun code2(){
        val nums = arrayOf(-2, 1, -3, 4, -1, 2, 1, -5, 4)
        maxSubArray(nums)
//        print(nums.contentToString())
    }



    fun maxSubArray(nums: Array<Int>):Int{
        var max = 0
        for (i in (1 .. nums.size)){
            print(i)
        }
        return max
    }

    fun getSubArray(nums: Array<Int>,length:Int){

    }

    fun getArraySum(nums: Array<Int>): Int {
        var sum = 0
        nums.forEach {
            sum+=it
        }
        return sum
    }



}