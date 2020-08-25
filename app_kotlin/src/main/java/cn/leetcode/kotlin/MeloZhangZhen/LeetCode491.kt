/**
 * 491. 递增子序列
 * 给定一个整型数组, 你的任务是找到所有该数组的递增子序列，递增子序列的长度至少是2。
 *
 * 输入: [4, 6, 7, 7]
 * 输出: [[4, 6], [4, 7], [4, 6, 7], [4, 6, 7, 7], [6, 7], [6, 7, 7], [7,7], [4,7,7]]

 * 给定数组的长度不会超过15。
 * 数组中的整数范围是 [-100,100]。
 * 给定数组中可能包含重复数字，相等的数字应该被视为递增的一种情况。
 */
var temp: ArrayList<Int> = ArrayList()
var ans: ArrayList<List<Int>> = ArrayList()

// TODO: 2020/8/25   没有理解出来,后面再搞   
object LeetCode491 {

    @JvmStatic
    fun main(args: Array<String>) {
        val mList = arrayListOf<Int>(4, 6, 7, 7).toIntArray()

        println(findSubsequences(mList).size)

    }
}

/**思路就是列出所有的,保留合乎规则的
 */
fun findSubsequences(nums: IntArray): List<List<Int>> {

    var ans: ArrayList<List<Int>> = ArrayList()
    dfs(0, Int.MIN_VALUE, nums)
    return ans

}

fun dfs(cur: Int, last: Int, nums: IntArray) {
//从头开始 到结束 遍历这个集合
    if (cur == nums.size) {
        if (temp.size >= 2) {
            val newList= arrayListOf<Int>()
            newList.addAll(temp)
            ans.add(newList);
        }
        return
    }

    // 当前值 大于最后的值
    if (nums[cur] >= last) {
        temp.add(nums[cur]);
        dfs(cur + 1, nums[cur], nums)
        temp.remove(temp.size - 1)
    }
    /**
     * 没到最后就继续计算
     */
    if (nums[cur] != last) {
        dfs(cur + 1, last, nums)
    }

}


/**
 * 抄袭其他人答案  还是个错的!!!
 */

internal class Solution {
    var temp: ArrayList<Int> = ArrayList()
    var ans: ArrayList<List<Int>> = ArrayList()
    fun findSubsequences(nums: IntArray): List<List<Int>> {
        dfs(0, Int.MIN_VALUE, nums)
        return ans
    }

    fun dfs(cur: Int, last: Int, nums: IntArray) {
        if (cur == nums.size) {
            if (temp.size >= 2) {

                ans.add(ArrayList(temp))
            }
            return
        }
        if (nums[cur] >= last) {
            temp.add(nums[cur])
            dfs(cur + 1, nums[cur], nums)
            temp.remove(temp.size - 1)
        }
        if (nums[cur] != last) {
            dfs(cur + 1, last, nums)
        }
    }
}

/**
 * 拆顺序有点问题
 * 我的理解是:
 * 4677  ->  46 47 47 467 467 477 4677
 * 答案是
 * 4677  ->  46 47 467 4677
 * 没有重复的 47 和 467 理解 但是有 47 没有 477
 * 有 4677 没有 477 所以很不理解
 *
 *
 * 理解过来了 去重就行 有 477
 */
fun findSubsequences1(nums: IntArray): List<List<Int>> {
    val mBackList = arrayListOf<List<Int>>()
    val mAddList = arrayListOf<Int>()

    for (i in nums.indices) {
        //清空
        mAddList.clear()
        //加该元素为起点的后面都加
        mAddList.add(nums[i])
        //循环判断后面加不加
        for (j in (i + 1)..nums.size - 1) {
            if (nums[j] >= mAddList[mAddList.size - 1]) {
                mAddList.add(nums[j])
            }
        }
        //把这个集合 以 自己开头的所有数组
        mBackList.addAll(crushingList(mAddList))
    }
    return mBackList

}

fun crushingList(mNums: List<Int>): List<List<Int>> {
    var backList = arrayListOf<List<Int>>()
    //顺序加  还需要跳着加  还要考虑每次加的都是单独的值
    var mAddList = arrayListOf<Int>()
    mNums.forEach {
        mAddList.add(it)
        if (mAddList.size >= 2) {
            val temp= arrayListOf<Int>()
            temp.addAll(mAddList)
            backList.add(temp)
        }
    }
    //跳加的 跳 1 跳 2 跳
    return backList
}
