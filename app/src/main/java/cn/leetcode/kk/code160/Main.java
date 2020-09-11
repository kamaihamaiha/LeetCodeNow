package cn.leetcode.kk.code160;

/**
 * 160. 相交链表: https://leetcode-cn.com/problems/hamming-distance/
 */
public class Main {

    public static void main(String[] args) {

        ListNode ln1 = new ListNode(0);
        ln1.next = new ListNode(9);
        ln1.next.next = new ListNode(1);
        ln1.next.next.next = new ListNode(2);
        ln1.next.next.next.next = new ListNode(4);

        ListNode ln2 = new ListNode(3);
        ln2.next = ln1.next.next.next;
        ln2.next.next = new ListNode(4);

        ListNode intersectionNode = Solution.getIntersectionNode(ln1, ln2);

        System.out.println(intersectionNode.val);
    }
}
