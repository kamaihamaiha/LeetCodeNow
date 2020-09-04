package cn.leetcode.kotlin.MeloZhangZhen

import cn.leetcode.kotlin.MeloZhangZhen.model.TreeNode

/**
 * 反转 二叉树  左右反转
 *
 *
4
/   \
2     7
/ \   / \
1   3 6   9

4
/   \
7     2
/ \   / \
9   6 3   1

 */

object LeetCode226 {
    @JvmStatic
    fun main(args: Array<String>) {
        val mTrueTree = TreeNode(1,
                TreeNode(9,
                        TreeNode(105, null, null), TreeNode(15, null, null)
                        ),
                TreeNode(20,
                        TreeNode(150, null, null),
                        TreeNode(7, null, null)))

//        1
//        9 20
//        105 15 150 7

//        1
//        20  9
//        7  150  15  105


        invertTree(mTrueTree)

    }
}

/**
 * 个人思路  反转
 * 1 就是 temp暂存一下 换一个
 * 2 就是 用与的算法 与两遍就是原值
 */
fun invertTree(root: TreeNode?): TreeNode? {

    if (root == null) {
        return null
    }
    val right : TreeNode? = invertTree(root.right)
    val left: TreeNode ?= invertTree(root.left)
    root.left = right
    root.right = left

    return root
}


