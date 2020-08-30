package cn.leetcode.kotlin.MeloZhangZhen

import cn.leetcode.kotlin.MeloZhangZhen.model.ListNode

/**
 * [160. 相交链表](https://leetcode-cn.com/problems/intersection-of-two-linked-lists/)
 *
 *2
[1,9,1,2,4]
[3,2,4]
3
1

1  9  1
2  4
3

输入：intersectVal = 8, listA = [4,1,8,4,5], listB = [5,0,1,8,4,5], skipA = 2, skipB = 3
输出：Reference of the node with value = 8

4  1
8  4  5
5  0  1

两个不一样的1
 */

object LeetCode160 {
    @JvmStatic
    fun main(args: Array<String>) {
        //造数据
        val a1 = ListNode(1)
        val a2 = ListNode(9)
        val a3 = ListNode(1)

        val b1 = ListNode(3)

        val c1 = ListNode(2)
        val c2 = ListNode(4)

        a1.next = a2
        a2.next = a3
        a3.next = c1
        b1.next = c1
        c1.next = c2
        /**
         * [2,6,4]
        [1,5]
         */


        val  d1=ListNode(2)
        val  d2=ListNode(6)
        val  d3=ListNode(4)
        val  e1=ListNode(1)
        val  e2=ListNode(5)

//        [1,3,5,7,9,11,13,15,17,19,21]
//        [2]

        val f1 = ListNode(1)
        val f3 = ListNode(3)
        val f5 = ListNode(5)
        val f7 = ListNode(7)
        val f9 = ListNode(9)
        val f11 = ListNode(11)
        val f13= ListNode(13)
        val f15 = ListNode(15)
        val f17 = ListNode(17)
        val f19 = ListNode(19)
        val f21 = ListNode(21)
        f1.next=f3
        f3.next=f5
        f5.next=f7
        f7.next=f9
        f9.next=f11
        f11.next=f13
        f13.next=f15
        f15.next=f17
        f17.next=f19
        f19.next=f21



        val g1 = ListNode(2)


        d1.next=d2
        d2.next=d3
        e1.next=e2

        val  bna=getIntersectionNode(f1, g1)
        val  bna2=getIntersectionNode(d1, e1)
        val  bna1=getIntersectionNode(a1, b1)
        println(bna.toString())
        println(bna1.toString())
        println(bna2.toString())

    }

    /**
     * 双指针法   a+b  = b+a  好像当时物理中,测不等重的小物体的摩擦力的 摞起来
     *
     * A={1,3,5,7,9,11} 和 B={2,4,9,11}
     * 1--3--5--7--9--11  2--4--9--11
     *  1--3--5--7--9--11--2--4--9--11
     *  2--4--9--11--1--3--5--7--9--11
     *
     *   因为长度一样 后面又是重复的  所以从后往前找 有最后一个一样的点就是相交点  也是反向找的意思
     *
     */
    fun getIntersectionNode(headA: ListNode?, headB: ListNode?): ListNode? {
        //不用拼, 长的让短的先起跑,
        var tempList1 = headA
        var tempList2 = headB

        if (headA==null||headB==null){
            return null
        }
        while (tempList1 != null || tempList2 !== null) {

            if ((tempList1 == tempList2)) {
                return tempList1
            }
            //长的跑完跑短的  短的跑完跑长的 变相等于  ab  ba
            if (tempList1 == null) {
                tempList1 = headB
            } else if (tempList2 == null) {
                tempList2 = headA
            } else {
                tempList1 = tempList1.next
                tempList2 = tempList2.next
            }
        }
        return null
    }

    /**
     * 先简单 粗暴的 便利一下
     *
     *
     */
    fun getIntersectionNode1(headA: ListNode?, headB: ListNode?): ListNode? {
        //只要第一个 null
        if (headA == headB) {
            return headA
        }
        var tempList1 = headA
        var tempList2 = headB
        while (tempList1 != null) {
            //不是空就和b的每一个比一下
            while (tempList2 != null) {
                if ((tempList1 == tempList2)) {
                    return tempList1
                }
                tempList2 = tempList2?.next
            }
            tempList2 = headB
            tempList1 = tempList1?.next

        }


        return null

    }

}
