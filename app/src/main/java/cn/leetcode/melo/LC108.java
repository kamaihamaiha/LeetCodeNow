package cn.leetcode.melo;

import cn.leetcode.melo.model.TreeNode;

/**
 * 将一个按照升序排列的有序数组，转换为一棵高度平衡二叉搜索树。
 * <p>
 * 本题中，一个高度平衡二叉树是指一个二叉树每个节点 的左右两个子树的高度差的绝对值不超过 1。
 * <p>
 * <p>
 * 给定有序数组: [-10,-3,0,5,9],
 * <p>
 * 一个可能的答案是：[0,-3,9,-10,null,5]，它可以表示下面这个高度平衡二叉搜索树：
 * <p>
 * 0
 * / \
 * -3   9
 * /   /
 * -10  5
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/convert-sorted-array-to-binary-search-tree
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
class LC108 {
    public static void main(String[] args) {
//        [-10,-3,0,5,9]
        int[] nums = new int[]{-10, -3, 0, 5, 9};
        sortedArrayToBST(nums);
    }

    public static TreeNode sortedArrayToBST(int[] nums) {
        if (nums.length == 0) return null;
        return dfs(nums, 0, nums.length - 1);
    }

    private static TreeNode dfs(int[] nums, int start, int end) {
        if (start > end) {
            return null;
        }
        //先算出中间值
        int mid = (end + start) / 2;
        //中间值就是起点
        TreeNode mRoot = new TreeNode();
        mRoot.val = (nums[mid]);
        //继续分后面的
        if (mid > start + 1)
        if (mid < end - 1) {
            mRoot.right = dfs(nums, mid + 1, end);
        }
        return mRoot;
    }





}


