package cn.leetcode.kotlin.MeloZhangZhen

import cn.leetcode.kotlin.MeloZhangZhen.model.ListNode

/**
 * 206 反转一个单链表。


 */

object LeetCode206 {
    @JvmStatic
    fun main(args: Array<String>) {

    }


}

/**
 * 一直 for 太垃圾
 */

fun reverseList(head: ListNode?): ListNode? {
//    递归 不断找到最后一个
    var backListNode: ListNode? = ListNode()
    var mHead: ListNode? = head

    while (mHead?.next != null) {
        while (backListNode?.next == null) {
            backListNode?.next = getLast(mHead)
        }
    }
    return backListNode?.next
}
fun getLast(head: ListNode?): ListNode? {
    var temp = head
    while (temp?.next != null) {
        temp = temp.next
    }
    //顺便断开他
    temp?.next = temp
    return temp
}
/**
 * 断开 再接!
 *
 * 这应该是 双指针吧
 */
fun reverseList1(head: ListNode?): ListNode? {
    var backListNode: ListNode? = null
    var mHead: ListNode? = head

    var otherList: ListNode?
    while (mHead?.next != null) {
        otherList = mHead?.next
        //断开第一个
        mHead?.next = mHead
        //断开的的当屁股
        mHead?.next = backListNode
        //新屁股
        backListNode = mHead
        //
        mHead = otherList

    }
    //下个是空了 最后一个 接上后来的屁股
    mHead?.next = backListNode
    return mHead

}


