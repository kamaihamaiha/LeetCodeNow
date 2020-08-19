import cn.leetcode.kotlin.MeloZhangZhen.model.ListNode

object LeetCode21 {
    @JvmStatic
    fun main(args: Array<String>) {
        val list1 = ListNode(1, ListNode(2, ListNode(4)))
        val list2 = ListNode(1, ListNode(3, ListNode(4)))
        mergeTwoLists(list1, list2)
    }


}

/**
 * 将两个升序链表合并为一个新的 升序 链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。
 *
 * 输入：1->2->4, 1->3->4
 * 输出：1->1->2->3->4->4
 *
 * 思路 :递归  比较出谁小,谁在前面,后面继续比较, 先排除空列表,再返回就是最小的列表.
 */
fun mergeTwoLists(l1: ListNode?, l2: ListNode?): ListNode? {

    return when {
        l1 == null -> {
            l2
        }
        l2 == null -> {
            l1
        }
        l1.`val` < l2.`val` -> {
            l1.next = mergeTwoLists(l1.next, l2)
            l1
        }
        else -> {
            l2.next = mergeTwoLists(l2.next, l1)
            l2
        }
    }

}

