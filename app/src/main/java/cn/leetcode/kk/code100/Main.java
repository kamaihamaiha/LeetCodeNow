package cn.leetcode.kk.code100;

import cn.leetcode.melo.model.TreeNode;

/**
 * 100. 相同的数
 * 给定两个二叉树，编写一个函数来检验它们是否相同。
 *
 * 如果两个树在结构上相同，并且节点具有相同的值，则认为它们是相同的。
 *
 * 示例 1:
 *
 * 输入:       1         1
 *           / \       / \
 *          2   3     2   3
 *
 *         [1,2,3],   [1,2,3]
 *
 * 输出: true
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/same-tree
 */
public class Main {
    public static void main(String[] args) {

    }

    /**
     * 节点都一样，且值也一样才可以
     * @param p
     * @param q
     * @return
     */
    public static boolean isSameTree(TreeNode p,TreeNode q){
        if (p == null && q == null){
            return true;
        }

        if (p == null || q == null){
            return false;
        }

        if (p.val != q.val){
            return false;
        }


        return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
    }
}
