package cn.leetcode.kotlin.melo.lckt

import java.util.*

/**
设计一个支持 push ，pop ，top 操作，并能在常数时间内检索到最小元素的栈。

push(x) —— 将元素 x 推入栈中。
pop() —— 删除栈顶的元素。
top() —— 获取栈顶元素。
getMin() —— 检索栈中的最小元素。

输入：
["MinStack","push","push","push","getMin","pop","top","getMin"]
[[],[-2],[0],[-3],[],[],[],[]]

输出：
[null,null,null,null,-3,null,0,-2]

解释：
MinStack minStack = new MinStack();
minStack.push(-2);
minStack.push(0);
minStack.push(-3);
minStack.getMin();   --> 返回 -3.
minStack.pop();
minStack.top();      --> 返回 0.
minStack.getMin();   --> 返回 -2.

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/min-stack
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

object LeetCode155{


    @JvmStatic
    fun main(args: Array<String>) {

    }
}

/**
 * 记录最小的在 在栈里
 * 1  2  3  1  4  0  -2
 * 1  -  -  1  -  0  -2
 * //更简单的理解 递减的
 * 1  1  1  1  1  0  -2
 *
 */
class MinStack() {

    /** initialize your data structure here. */
    //真实的栈
    private var stack: Stack<Int>? = null
    //辅助的栈 不能用一个记录 最小的
    private var min_stack: Stack<Int>? = null

    //初始化
   init {
        stack = Stack()
        min_stack = Stack()
    }

    fun push(x: Int) {
        stack?.push(x)
        //如果进来的是更小的 就要留下 一样小的 也要留下
        if (min_stack?.size==0||x<= min_stack?.lastElement()!!){
          if( stack!=null){min_stack?.push(x)}

        }

    }

    fun pop() {
        val lastItem=stack?.lastElement()
        stack?.pop()
        //移出去 的是当前最小的  最小栈也要移出去最小的
        if (min_stack?.lastElement()==lastItem){
            min_stack?.pop()
        }
    }

    fun top(): Int? {

        return stack?.lastElement()

    }

    fun getMin(): Int? {
        return min_stack?.lastElement()
    }

}


