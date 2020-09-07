package cn.leetcode.kotlin.melo.lckt

import cn.leetcode.kotlin.melo.model.TreeNode

/**
 *257. 二叉树的所有路径
 */

object LeetCode257 {
    @JvmStatic
    fun main(args: Array<String>) {

    }
}

/**
 * 回溯? 递归
 */
fun binaryTreePaths(root: TreeNode?): List<String>? {
    if (root == null) return arrayListOf()
    var paths: ArrayList<String> = arrayListOf()
    constructPaths(root, "", paths)
    return paths
}

fun constructPaths(root: TreeNode?, path:String, paths:ArrayList<String>)  {

    if (root != null){
        val pathSB = StringBuffer(path)
        pathSB.append(Integer.toString(root.`val`!!))
        if (root.left == null && root.right == null) {  // 当前节点是叶子节点
            paths.add(pathSB.toString()) // 把路径加入到答案中
        } else {
            pathSB.append("->") // 当前节点不是叶子节点，继续递归遍历
            constructPaths(root.left, pathSB.toString(), paths)
            constructPaths(root.right, pathSB.toString(), paths)
        }
    }
}