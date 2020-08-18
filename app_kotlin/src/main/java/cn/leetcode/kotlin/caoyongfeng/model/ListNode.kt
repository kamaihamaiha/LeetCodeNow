package cn.leetcode.kotlin.caoyongfeng.model

/**
 * Created by caoyongfeng on 2020/8/14
 * email: caoyongfeng@123eblog.com
 */
class ListNode(var value: Int,var next: ListNode?=null) {
    fun print() {
        print(value.toString())
        print("->")
        next?.print()
    }
}