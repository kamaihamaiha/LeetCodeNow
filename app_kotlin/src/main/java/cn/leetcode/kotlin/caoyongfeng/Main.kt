package cn.leetcode.kotlin.caoyongfeng

import cn.leetcode.kotlin.caoyongfeng.code.Code
import cn.leetcode.kotlin.caoyongfeng.code.Code101
import cn.leetcode.kotlin.caoyongfeng.code.Code70
import cn.leetcode.kotlin.caoyongfeng.model.TreeNode

/**
 * Created by caoyongfeng on 2020/8/14
 * email: caoyongfeng@123eblog.com
 */
fun main() {
//    val climbStairs = Code70().climbStairs(3)
//    print(climbStairs)
    val treeNode = TreeNode(1, TreeNode(2, null, TreeNode(4)), TreeNode(2, TreeNode(4), TreeNode(3)))
    val symmetric = Code101().isSymmetric(treeNode)
    print(symmetric)
}