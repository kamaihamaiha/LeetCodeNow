package cn.leetcode.kotlin.MeloZhangZhen.model

/**
 * 树形表
 * 二叉树 [1,2,2,3,4,4,3] 是对称的。
 *  [1,2,2,null,3,null,3] 则不是镜像对称的:
 *
        1
       / \
      2   2
     / \ / \
    3  4 4  3
 */
class TreeNode(var `val`: Int?, val left: TreeNode?, val right: TreeNode?) {
}