package cn.leetcode.kotlin.MeloZhangZhen

import cn.leetcode.kotlin.MeloZhangZhen.model.ListNode

/**
 * 141
 * 给定一个链表，判断链表中是否有环。

为了表示给定链表中的环，我们使用整数 pos 来表示链表尾连接到链表中的位置（索引从 0 开始）。 如果 pos 是 -1，则在该链表中没有环。

 

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/linked-list-cycle

 */

object LeetCode141 {

    @JvmStatic
    fun main(args: Array<String>) {
        val listNode1 = ListNode(3)
        val listNode2 = ListNode(2)
        val listNode3 = ListNode(0)
        val listNode4 = ListNode(-4)

        //穿 环
        listNode1.next = listNode2
        listNode2.next = listNode3
        listNode3.next = listNode4
        listNode4.next = listNode1


    }
}








/**
 * 赛跑理论  套圈,一块 一慢,如果被套圈了 ,说明有圈
 *
 */
fun hasCycle(head: ListNode?): Boolean {

    return false
}

/**
 * 自杀式断开,把左手右手练到一起,如果 有人左右自我拉到一起了 那说明是有环的...
 *
 *
 */
fun hasCycle1(head: ListNode?): Boolean {
    return killSelf(head)
}


fun killSelf(head: ListNode?): Boolean {
    //自己拉自己  有环
    if (head == head?.next) {
        return true
    }
    //无后了 没环
    if (head?.next==null){
        return false
    }
    //断开自己  右手变成了头
    val breaker = head.next
    //左手 拉 右手 头元素 脱链
    head.next = head

    return killSelf(breaker)
}

/**
 * 都有 next.. 循环下去了  不对 有环 就跳不出来了
 */
fun hasNext(head: ListNode?): Boolean {
    var temList = head
    if (head?.next != null) {
        temList = head.next
        hasNext(temList)
    }
    return false

}