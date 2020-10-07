package cn.leetcode.kk.code206;

import cn.leetcode.kk.model.ListNode;

/**
 * 206. 反转链表
 * <p> https://leetcode-cn.com/problems/reverse-linked-list/
 * <p>
 * 反转一个单链表。
 * <p>
 * 示例:
 * <p>
 * 输入: 1->2->3->4->5->NULL
 * 输出: 5->4->3->2->1->NULL
 * 进阶:
 * 你可以迭代或递归地反转链表。你能否用两种方法解决这道题？
 */
public class Main {

    public static void main(String[] args) {

    }

    public static ListNode reverseList(ListNode head) {

        ListNode preHead = null;
        ListNode currHead = head;
        while (currHead != null) {

            //把下一个节点，暂存一下
            ListNode nextTemp = currHead.next;

            //这一步的 preHead 是上一次迭代的节点。其实就是重新指定当前节点的 next
            currHead.next = preHead;
            preHead = currHead;

            //链表指针往下走一步
            currHead = nextTemp;
        }

        return preHead;
    }
}
