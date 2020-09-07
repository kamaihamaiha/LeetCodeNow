package cn.leetcode.kotlin.melo.model

/**
 * 链表结构
 * 1-2-3-4-5
 */
class ListNode {
    var `val` = 0
    var next: ListNode? = null

    internal constructor( ) {
        this.`val` = `val`
    }
    internal constructor(`val`: Int) {
        this.`val` = `val`
    }

    internal constructor(`val`: Int, next: ListNode?) {
        this.`val` = `val`
        this.next = next
    }

    override fun toString(): String {
        return "ListNode(`val`=$`val`, next=$next)"
    }
}