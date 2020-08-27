import cn.leetcode.kotlin.MeloZhangZhen.model.ListNode
import cn.leetcode.kotlin.MeloZhangZhen.model.TreeNode
import kotlin.math.max

/**
给定一个二叉树，找出其最大深度。

二叉树的深度为根节点到最远叶子节点的最长路径上的节点数。

说明: 叶子节点是指没有子节点的节点。

示例：
给定二叉树 [3,9,20,null,null,15,7]，

3
/ \
9  20
/  \
15   7
返回它的最大深度 3 。


 */

object LeetCode104 {
    @JvmStatic
    fun main(args: Array<String>) {
        val mTrueTree = TreeNode(1,
                TreeNode(9,
                        null,
                        null),
                TreeNode(20,
                        TreeNode(15, null, null),
                        TreeNode(7, null, null)))


        println(maxDepth(mTrueTree))

    }


}


fun maxDepth(root: TreeNode?): Int {


    return if (root == null) {
        0
    } else {
        //取下一层  左边最大+1  右边最大+1

        (maxDepth(root.left) + 1).coerceAtLeast(maxDepth(root.right) + 1)
    }

}

