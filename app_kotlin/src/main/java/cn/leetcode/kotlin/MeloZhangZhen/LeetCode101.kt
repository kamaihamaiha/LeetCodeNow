import cn.leetcode.kotlin.MeloZhangZhen.model.TreeNode

/**
 *70. 爬楼梯
 *
 *
 *给定一个二叉树，检查它是否是镜像对称的。



例如，二叉树 [1,2,2,3,4,4,3] 是对称的。
但是下面这个 [1,2,2,null,3,null,3] 则不是镜像对称的:
你可以运用递归和迭代两种方法解决这个问题吗？
 */

object LeetCode101 {
    @JvmStatic
    fun main(args: Array<String>) {
        //初始化两个数据[1,2,2,3,4,4,3]
        val mTrueTree = TreeNode(1,
                TreeNode(2,
                        TreeNode(3, null, null),
                        TreeNode(4, null, null)),
                TreeNode(2,
                        TreeNode(4, null, null),
                        TreeNode(3, null, null)))


        val mFalseTree = TreeNode(1,
                TreeNode(2,
                        TreeNode(null, null, null),
                        TreeNode(3, null, null)),
                TreeNode(2,
                        TreeNode(null, null, null),
                        TreeNode(3, null, null)))


        System.out.println(isSymmetric(mTrueTree))
//        System.out.println(isSymmetric(mFalseTree))


    }


}

fun isSymmetric(root: TreeNode?): Boolean {
    //递归  都不是 null 且相等
    var templeft = root?.left
    var tempRight = root?.right

    return checkTree(templeft, tempRight)


}

fun checkTree(templeft: TreeNode?, tempRight: TreeNode?): Boolean {

    return if (templeft == null && tempRight == null) {
        true
    } else if (templeft == null || tempRight == null) {
            false
        } else {
        //镜像对称  是右边的右边 等于左边的左边  中间和中间的一样
            ((templeft.`val` == tempRight.`val`)
                    && (checkTree(templeft.left, tempRight.right))
                    && (checkTree(tempRight.left, templeft.right)))
        }


}

