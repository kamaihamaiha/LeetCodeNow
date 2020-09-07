package cn.leetcode.kotlin.melo.lckt

/**
169. 多数元素
给定一个大小为 n 的数组，找到其中的多数元素。多数元素是指在数组中出现次数大于 ⌊ n/2 ⌋ 的元素。

你可以假设数组是非空的，并且给定的数组总是存在多数元素。

 1:可以暴力遍历
 2: 排序后 中间那个肯定是众数
 3:随机....大概率回选的对的,怎么知道自己是对的呢 选到之后 再看再看在集合里有多少
 4:分治  左右两端分开  a 如果是众数 一定是两边其中一边的众数
 5:投票法:Boyer-Moore
 */

object LeetCode169 {
    @JvmStatic
    fun main(args: Array<String>) {
        //造数据
        val nums1 = arrayListOf<Int>(3, 2, 3).toIntArray()
        val nums2 = arrayListOf<Int>(2, 2, 1, 1, 1, 2, 2).toIntArray()
        println(majorityElement(nums1))
        println(majorityElement(nums2))

    }

    /**
     * 投票法
     */
    fun majorityElement(nums: IntArray): Int {

        return 0
    }

    /**
     * 按照大小排序 中间那个肯定是众数,毕竟超过了一半
     * 冒泡
     */
    fun majorityElement2(nums: IntArray): Int {

        var temp: Int
        for (i in nums.indices) {
            for (j in i + 1 until nums.size) {
                if (nums[j] > nums[i]) {
                    temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }

            }

        }
        return nums[nums.size / 2]
    }

    /**
     * 暴力遍历
     */
    fun majorityElement1(nums: IntArray): Int {
        //创建 一个 map key 是 it   升序的 map   取最后一个
        var mMap = HashMap<Int, Int>()
        nums.forEach {
            if (mMap.containsKey(it)) {
                val num = mMap.get(it)?.plus(1)
                mMap.put(it, num!!)
            } else {
                mMap.put(it, 1)
            }
        }
        //取最大的
//        缓存的键值对
        var tempKv = mMap[nums[0]]
        //再遍历取最大的 或者一开始就排序
        ////没意思
        return 0

    }
}
