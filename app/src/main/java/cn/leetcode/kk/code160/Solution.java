package cn.leetcode.kk.code160;

import cn.leetcode.kk.model.ListNode;

public class Solution {

    public static ListNode getIntersectionNode(ListNode headA, ListNode headB){
        if (headA == null || headB == null){
            return null;
        }

        ListNode pA,pB;
        pA = headA;
        pB = headB;

        while (pA != pB){
            pA = (pA == null ? headB : pA.next);
            pB = (pB == null ? headA : pB.next);
        }

        return pA;
    }
}
