package cn.leetcode.kk.code160;

/**
 * 编写一个程序，找到两个单链表相交的起始节点。
 * <p>
 * 注意：
 * <p>
 * 如果两个链表没有交点，返回 null.
 * 在返回结果后，两个链表仍须保持原有的结构。
 * 可假定整个链表结构中没有循环。
 * 程序尽量满足 O(n) 时间复杂度，且仅用 O(1) 内存。
 */
public class Solution {

    /**
     * 获取两个链表相交节点
     *
     * @param headA
     * @param headB
     * @return
     */
    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }

        ListNode cursor1 = headA.next;
        ListNode cursor2 = headB.next;

        while (cursor1 != null) {
            cursor1 = cursor1.next;
            cursor2 = cursor2.next;
            if (cursor1 == null) {
                cursor1 = headB;
            }
            if (cursor2 == null) {
                cursor2 = headA;
            }
            if (cursor1.val == cursor2.val) {

                break;
            }
        }

        return cursor1;
    }
}
