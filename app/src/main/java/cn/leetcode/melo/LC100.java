package cn.leetcode.melo;

import cn.leetcode.kk.model.TreeNode;

/**
 * 二叉树的 比较
 *  遍历二叉树
 *
 */
public class LC100 {
    public static void main(String[] args) {

    }
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        } else if (p == null || q == null) {
            return false;
        } else if (p.value != q.value) {
            return false;
        } else {
            return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
        }
    }



}
