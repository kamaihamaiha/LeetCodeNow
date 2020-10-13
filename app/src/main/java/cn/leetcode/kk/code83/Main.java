package cn.leetcode.kk.code83;


import cn.leetcode.kk.model.ListNode;

/**
 * 83. 删除排序链表中的重复元素
 * 给定一个排序链表，删除所有重复的元素，使得每个元素只出现一次。
 *
 * 示例 1:
 *
 * 输入: 1->1->2
 * 输出: 1->2
 * 示例 2:
 *
 * 输入: 1->1->2->3->3
 * 输出: 1->2->3
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/remove-duplicates-from-sorted-list
 */
public class Main {

    public static void main(String[] args) {

    }


    /**
     * 删除排序链表。
     * @param head
     * @return
     */
    public static ListNode deleteDuplicates(ListNode head) {
        ListNode newHead = head;
        while (newHead != null && newHead.next != null) {
            //因为是有序链表，所以只需要判断下一个节点的 value 和当前的节点 value 相同，然后当前节点的 next 指向下一个
            //节点的 next 节点。
            if (newHead.value == newHead.next.value) {
                newHead.next = newHead.next.next;
            } else {
                newHead = newHead.next;
            }
        }

        return head;
    }
}
