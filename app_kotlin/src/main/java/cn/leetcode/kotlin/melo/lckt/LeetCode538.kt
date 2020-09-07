package cn.leetcode.kotlin.melo.lckt

import cn.leetcode.kotlin.melo.model.TreeNode


object LeetCode538 {


    @JvmStatic
    fun main(args: Array<String>) {

    }
    private  var sum = 0
    fun convertBST(root: TreeNode?): TreeNode? {
        if (root != null) {
//            找到右边的尽头
            convertBST(root.right);
            sum += root.`val`!!
            //累加了
            root.`val` = sum
            //在累加左边的
            convertBST(root.left)

        }

        return root

    }
}

