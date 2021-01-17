package cn.leetcode.melo;


import cn.leetcode.melo.model.ListNode;

/**
 * 有序链表删除重复值
 */
public class LC83 {
    public static void main(String[] args) {

    }

    public ListNode deleteDuplicates(ListNode head) {
        ListNode current = head;

        while(current!=null&&current.next!=null){
            if (current.value==current.next.value) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
        return head;
    }
    }
