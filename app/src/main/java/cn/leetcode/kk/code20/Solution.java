package cn.leetcode.kk.code20;

import java.util.Stack;

/**
 * 有效的括号
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
 * <p>
 * 有效字符串需满足：
 * <p>
 * 左括号必须用相同类型的右括号闭合。
 * 左括号必须以正确的顺序闭合。
 * 注意空字符串可被认为是有效字符串。
 * <p>
 * 示例 1:
 * <p>
 * 输入: "()"
 * 输出: true
 * 示例 2:
 * <p>
 * 输入: "()[]{}"
 * 输出: true
 * 示例 3:
 * <p>
 * 输入: "(]"
 * 输出: false
 * 示例 4:
 * <p>
 * 输入: "([)]"
 * 输出: false
 * 示例 5:
 * <p>
 * 输入: "{[]}"
 * 输出: true
 */
public class Solution {

    public static boolean isValid(String s) {
        if (s == null || s.length() % 2 != 0) {
            return false;
        }

        Stack<Character> stack = new Stack();

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                //如果是左括号则入栈
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    stack.push(c);
                    break;
                }
                //如果是右括号，则判断是否是一对，如果是一对，则出栈.如果不是一对，则入栈
                switch (c) {
                    case ')':
                        if ('(' == stack.peek()) {
                            stack.pop();
                        } else {
                            stack.push(c);
                        }
                        break;
                    case ']':
                        if ('[' == stack.peek()) {
                            stack.pop();
                        } else {
                            stack.push(c);
                        }
                        break;
                    case '}':
                        if ('{' == stack.peek()) {
                            stack.pop();
                        } else {
                            stack.push(c);
                        }
                        break;
                }

            }
        }

        //判断，stack 是否为空
        return stack.empty();
    }

    public  boolean isValidV2(String str) {
        if (str == null || str.length() % 2 != 0) {
            return false;
        }

        Stack<Character> stack = new Stack<>();
        for (char c : str.toCharArray()) {
            if(c == '(' || c == '[' || c == '{') { // 左括号都入栈
                stack.push(c);
            } else { // 右括号
                if(stack.isEmpty()) return false; // 栈为空，说明没有左括号，直接返回false
                if (stack.peek() == getPairChar(c)) { // 成堆则出栈
                    stack.pop();
                } else {
                    stack.push(c);
                }
            }
        }
        return stack.isEmpty();
    }

    public char getPairChar(char c) {
        switch (c) {
            case ')':
                return '(';
            case ']':
                return '[';
            case '}':
                return '{';
        }
        return c;
    }
}
