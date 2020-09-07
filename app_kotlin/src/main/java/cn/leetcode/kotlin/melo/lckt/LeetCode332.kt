package cn.leetcode.kotlin.melo.lckt

import java.util.*
import kotlin.collections.HashMap

/**
 * todo  下班回家搞明白
 * 332. 重新安排行程
 *
 * 给定一个机票的字符串二维数组 [from, to]，子数组中的两个成员分别表示飞机出发和降落的机场地点，对该行程进行重新规划排序。所有这些机票都属于一个从 JFK（肯尼迪国际机场）出发的先生，所以该行程必须从 JFK 开始。

说明:

如果存在多种有效的行程，你可以按字符自然排序返回最小的行程组合。例如，行程 ["JFK", "LGA"] 与 ["JFK", "LGB"] 相比就更小，排序更靠前
所有的机场都用三个大写字母表示（机场代码）。
假定所有机票至少存在一种合理的行程。
示例 1:

输入: [["MUC", "LHR"], ["JFK", "MUC"], ["SFO", "SJC"], ["LHR", "SFO"]]
输出: ["JFK", "MUC", "LHR", "SFO", "SJC"]
示例 2:

输入: [["JFK","SFO"],["JFK","ATL"],["SFO","ATL"],["ATL","JFK"],["ATL","SFO"]]
输出: ["JFK","ATL","JFK","SFO","ATL","SFO"]
解释: 另一种有效的行程是 ["JFK",

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/reconstruct-itinerary
 */

/**
 * http://www.slyar.com/blog/eular-graph.html
 *
 * 欧拉回路 欧拉通路
 *
 * //通俗点  通路 就是一笔画 能从起点到结束,回来是 起点到结束 还要到起点
 *
 * 欧拉通路 (欧拉迹):通过图中每条边且只通过一次，并且经过每一顶点的通路。

欧拉回路 (欧拉闭迹):通过图中每条边且只通过一次，并且经过每一顶点的回路。

欧拉图:存在欧拉回路的图。

简单说欧拉通路就是首尾不相接，而欧拉回路要求首尾相接。
 */

object LeetCode332 {
    @JvmStatic
    fun main(args: Array<String>) {

    }
    //PriorityQueue  优先队列
    var map: HashMap<String, PriorityQueue<String>> = HashMap<String, PriorityQueue<String>>()
    var itinerary: LinkedList<String> = LinkedList<String>()
    //
    fun findItinerary(tickets: List<List<String?>>): List<String?>? {
        //先遍历所有机票
        for (ticket in tickets) {
            //获得起点和终点
            val src = ticket[0]
            val dst = ticket[1]
            //如果集合里已经有这个终点了,就加进去
            if (!map.containsKey(src)) {
                if (src != null) {
                    map.put(src, PriorityQueue<String>())
                }
            }
            // 优先队列 加上终点  遍历一圈了 就是所有都首尾相加了
            map.get(src)?.offer(dst)
        }
        //获取 JFK 开头的组合
        dfs("JFK")
        //倒过来
        itinerary.reverse()

        return itinerary
    }

    fun dfs(curr: String?) {
        //从这个地方起点的优先队列,还不是空的话
        while (map.containsKey(curr) && map.get(curr)?.size!! > 0) {
            // 队列的头 看看能走第二的那
            val tmp: String = map.get(curr)!!.poll()
            //再找第二个
            dfs(tmp)
        }
        if (curr != null) {
            itinerary.add(curr)
        }
    }
}
