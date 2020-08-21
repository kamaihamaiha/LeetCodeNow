package cn.leetcode.kk.code101;

public class Solution {

    /**
     * 判断二叉树是否对称
     *
     * @return
     */
    public static boolean isMirror(TreeNode tree1,TreeNode tree2) {

        if (tree1 == null && tree2 == null) {
            return true;
        }
        //只要有一个为 null，一个不为 null，则不对称
        if (tree1 == null || tree2 == null) {
            return false;
        }

        //对称条件： 子节点数值相等，并且左树的左节点和右树的右边节点相等，左树的右节点和右树的左节相等

        return tree1.value == tree2.value
                && isMirror(tree1.left,tree2.right)
                && isMirror(tree1.right,tree2.left);
    }


}
