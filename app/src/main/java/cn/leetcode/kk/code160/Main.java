package cn.leetcode.kk.code160;


import cn.leetcode.kk.model.ListNode;

/**
 * 8
 * [4,1,8,4,5]
 * [5,6,1,8,4,5]
 * 2
 * 3
 */
public class Main {

    public static void main(String[] args) {

        ListNode node4 = new ListNode(4);
        ListNode node1 = new ListNode(1);
        ListNode node8 = new ListNode(8);
        ListNode node4_second = new ListNode(4);
        ListNode node5 = new ListNode(5);

        ListNode node5_second = new ListNode(5);
        ListNode node6 = new ListNode(6);

        ListNode pA = node4;
        ListNode pB = node5_second;

//        ListNode pA = lA;
//        ListNode pB = lB;

        pA.next = node1;
        node1.next = node8;
        node8.next = node4_second;
        node4_second.next = node5;

        node5_second.next = node6;
        node6.next = node1;

        ListNode intersectionNode = Solution.getIntersectionNode(pA, pB);

        while (intersectionNode != null){
            System.out.println(intersectionNode.value);
            intersectionNode = intersectionNode.next;
        }

    }
}
