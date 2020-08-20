@file:Suppress("NO_TAIL_CALLS_FOUND")

package cn.leetcode.kotlin.lwx_star

import cn.leetcode.kotlin.lwx_star.model.TreeNode

/**
 *    author : 李文星
 *    e-mail : 15168881989@163.com
 *    date   : 2020/8/2010:55 AM
 *    desc   : 给定一个二叉树，检查它是否是镜像对称的。
 *              例如，二叉树 [1,2,2,3,4,4,3] 是对称的。
 *              但是下面这个 [1,2,2,null,3,null,3] 则不是镜像对称的:
 *              你可以运用递归和迭代两种方法解决这个问题吗？
 *    version: 1.0
 */
class Solution {
    fun isSymmetric(root: TreeNode?) {
        if (root == null) true else cmp(root.left, root.right);
    }
    private tailrec fun cmp(node1: TreeNode?, node2: TreeNode?): Boolean {
        if (node1 == null && node2 == null) {
            return true
        }
        return if (node1 == null || node2 == null || node1.value !== node2.value) {
            false
        } else cmp(node1.left, node2.right) && cmp(node1.right, node2.left)
    }
}