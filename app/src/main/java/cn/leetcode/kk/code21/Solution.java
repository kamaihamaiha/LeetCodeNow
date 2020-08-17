package cn.leetcode.kk.code21;

/**
 * 核心代码.
 * <p>
 * 将两个升序链表合并为一个新的 升序 链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。
 * 示例：
 * <p>
 * 输入：1->2->4, 1->3->4
 * 输出：1->1->2->3->4->4
 */
public class Solution {

    public static ListNode mergeTwoListNode(ListNode listNode1, ListNode listNode2) {

        if (listNode1 == null) {
            return listNode2;
        }

        if (listNode2 == null) {
            return listNode1;
        }

        ListNode mergeListNode = new ListNode();
        mergeListNode.value = -1;

        ListNode move = mergeListNode;

        while (listNode1 != null && listNode2 != null) {
            if (listNode1.value <= listNode2.value) {
                move.nextNode = listNode1;
                listNode1 = listNode1.nextNode;
            } else {
                move.nextNode = listNode2;
                listNode2 = listNode2.nextNode;
            }

            move = move.nextNode;
        }

        move.nextNode = (listNode1 == null ? listNode2 : listNode1);

        return mergeListNode.nextNode;
    }

    /**
     * 用递归方法
     * @param listNode1
     * @param listNode2
     * @return
     */
    public static ListNode mergeTwoListNode2(ListNode listNode1, ListNode listNode2) {

        if (listNode1 == null) {
            return listNode2;
        }

        if (listNode2 == null) {
            return listNode1;
        }

        if (listNode1.value < listNode2.value){
            listNode1.nextNode = mergeTwoListNode2(listNode1.nextNode,listNode2);
            return listNode1;
        } else {
            listNode2.nextNode = mergeTwoListNode2(listNode1,listNode2.nextNode);
            return listNode2;
        }

    }
}
