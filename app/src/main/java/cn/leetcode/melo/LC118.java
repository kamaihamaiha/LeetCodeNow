package cn.leetcode.melo;

import java.util.ArrayList;
import java.util.List;

/**
 * 118 杨辉三角
 * 给定一个非负整数 numRows，生成杨辉三角的前 numRows 行。
 */
public class LC118 {
    public static void main(String[] args) {

    }

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> backlist = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {

            List<Integer> item = new ArrayList<>();
            if (i == 0) {
                item.add(1);
            }  else {
                item.add(1);
                for (int j = 1; j < i; j++) {
                    List<Integer> jizhun = backlist.get(i - 1);
                    item.add(jizhun.get(j - 1)+ jizhun.get(j));
                }
                item.add(1);
            }

            backlist.add(item);
        }

        return backlist;
    }
}
