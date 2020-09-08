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

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as ListNode

        if (`val` != other.`val`) return false
        if (next != other.next) return false

        return true
    }

    override fun hashCode(): Int {
        var result = `val`
        result = 31 * result + (next?.hashCode() ?: 0)
        return result
    }
}