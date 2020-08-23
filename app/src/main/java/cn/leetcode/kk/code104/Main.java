package cn.leetcode.kk.code104;

/**
 * 104: 二叉树最大深度
 */
public class Main {

    public static void main(String[] args) {
        TreeNode tree = new TreeNode(3);
        tree.left = new TreeNode(9);
        tree.right = new TreeNode(20);
        tree.right.left = new TreeNode(15);
        tree.right.right = new TreeNode(7);

        int maxDepth = new Solution().maxDepth(tree);

        System.out.println("二叉树最大深度: " + maxDepth);

    }
}
