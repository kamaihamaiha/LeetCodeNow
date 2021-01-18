package cn.leetcode.melo;

import cn.leetcode.melo.model.TreeNode;

/**
 * 111. 二叉树的最小深度
 * 给定一个二叉树，找出其最小深度。
 * <p>
 * 最小深度是从根节点到最近叶子节点的最短路径上的节点数量。
 * <p>
 * 说明：叶子节点是指没有子节点的节点。
 * <p>
 * 输入：root = [3,9,20,null,null,15,7]
 * 输出：2
 * <p>
 * 输入：root = [2,null,3,null,4,null,5,null,6]
 * 输出：5
 *
 *
 * 难点在理解题目上??!!
 */
public class LC111 {
    public static void main(String[] args) {
        TreeNode root1 = new TreeNode(1);
        TreeNode root2 = new TreeNode(2);
        TreeNode root3 = new TreeNode(3);
        TreeNode root4 = new TreeNode(4);
        TreeNode root5 = new TreeNode(5);
        TreeNode root6 = new TreeNode(6);

        root2.right = root3;
        root2.left = null;
        root3.right = root4;
        root3.left = null;
        root4.right = root5;
        root4.left = null;
        root5.right = root6;
        root5.left = null;

//        root1.left=root2;
//        root1.right=root3;
//
//        root2.left=root4;
//        root2.right=root5;

//        [1,2,3,4,5]

        System.out.println(minDepth(root2) + "");

    }

    public static int minDepth(TreeNode root) {
        int minDepth = 0;
        if (root == null) return minDepth;
        //看看哪一层有根节点
        return checkIsFinish(root, 1);

    }

    private static int checkIsFinish(TreeNode root, int i) {
        if (root.left == null && root.right == null) {
            return i;
        } else {
            i++;
            int left = Integer.MAX_VALUE;
            int right = Integer.MAX_VALUE;
            if (root.left != null) {
                left = checkIsFinish(root.left, i);
            }
            if (root.right != null) {
                right = checkIsFinish(root.right, i);
            }
            return Math.min(left, right);
        }
    }


}
