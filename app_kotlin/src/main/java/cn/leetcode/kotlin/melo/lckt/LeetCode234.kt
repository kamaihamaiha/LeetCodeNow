package cn.leetcode.kotlin.melo.lckt

import cn.leetcode.kotlin.melo.model.ListNode

/**
 * LeetCode
 * 234. 回文链表
 * 请判断一个链表是否为回文链表
 *
 * todo 问题再反转之后就被反转了
 * 递归的跳出条件摸不清楚
 */
object LeetCode234 {
    var copyStringList = arrayListOf<Int>()

    @JvmStatic
    fun main(args: Array<String>) {
        val listNode1 = ListNode(0)
        val listNode2 = ListNode(1)
        val listNode3 = ListNode(2)
        val listNode4 = ListNode(1)
        val listNode5 = ListNode(0)


        //穿

        listNode1.next = listNode2
        listNode2.next = listNode3
        listNode3.next = listNode4
        listNode4.next = listNode5


        isPalindrome(listNode1)

    }


    fun isPalindrome(head: ListNode?): Boolean {

        val oldList = copy(head)

        val back = reverseList1(head)

        return deng(oldList, back)

    }

    private fun copy(listNode: ListNode?): ListNode? {
        //换成数组
        var copyList = ListNode()

        getval(listNode)
        copyStringList.forEach {
            copyList.`val` = it
            copyList.next = ListNode()
            copyList = copyList.next!!
        }
        return copyList
    }


    private fun getval(listNode: ListNode?) {
        if (listNode==null)return
        while (listNode?.next != null) {
            copyStringList.add(listNode.`val`)
            getval(listNode.next)
        }


    }

    private fun deng(head: ListNode?, back: ListNode?): Boolean {
        return if (head == null && back == null) {
            return true
        } else if (head == null && back != null) {
            return false
        } else if (head != null && back == null) {

            return false
        } else {
            if (head?.`val` != back?.`val`) {
                return false
            } else {
                deng(head?.next, back?.next)
            }
        }
    }

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
}