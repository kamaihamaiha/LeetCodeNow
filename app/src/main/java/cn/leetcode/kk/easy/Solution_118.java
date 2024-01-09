package cn.leetcode.kk.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * 118. 杨辉三角
 * https://leetcode.cn/problems/pascals-triangle/description/
 */
public class Solution_118 {

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ret = new ArrayList<>();

        for (int row = 0; row < numRows; row++) {
            // 存放每一行的数字集合
            List<Integer> lineNums = new ArrayList<>();
            for (int column = 0; column < row; column++) {
                // 如果是一行第一个或者最后一个，则为1
                if (column == 0 || column == row - 1) {
                    lineNums.add(1);
                } else {
                    // 上一行的数字集合
                    List<Integer> preLineNums = ret.get(row - 1);
                    // 当前数字 = 上一行的当前数字 + 上一行的前一个数字
                    lineNums.add(preLineNums.get(column - 1) + preLineNums.get(column));
                }
            }
            ret.add(lineNums);
        }
        return ret;
    }
}
