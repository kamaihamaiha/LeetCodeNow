package cn.leetcode.kk.code21;

public class Main {

    public static void main(String[] args) {

        ListNode l1 = new ListNode(1,new ListNode(2,new ListNode(4)));
        ListNode l2 = new ListNode(1,new ListNode(3,new ListNode(4)));

        ListNode mergeTwoListNode = Solution.mergeTwoListNode2(l1, l2);

        while (mergeTwoListNode != null) {
            System.out.println(mergeTwoListNode.value);

            mergeTwoListNode = mergeTwoListNode.nextNode;
        }


    }
}
