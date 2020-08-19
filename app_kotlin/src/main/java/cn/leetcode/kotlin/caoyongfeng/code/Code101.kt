package cn.leetcode.kotlin.caoyongfeng.code

import cn.leetcode.kotlin.caoyongfeng.model.TreeNode

/**
 * Created by caoyongfeng on 2020/8/19
 * email: caoyongfeng@123eblog.com
 */
class Code101 {

    fun isSymmetric(node:TreeNode?):Boolean{
        if (node == null) return true
        return isNextSymmetric(node.left,node.right)
    }

    fun isNextSymmetric(left:TreeNode?,right:TreeNode?): Boolean {
        if (left == null&& right == null) return true
        if (left?.value == right?.value){
            return isNextSymmetric(left?.right, right?.left)&&isNextSymmetric(left?.left,right?.right)
        }else{
            return false
        }
    }
}