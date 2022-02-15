package cn.leetcode.melo;

import java.util.ArrayList;
import java.util.List;

public class LC1380 {
    public static void main(String[] args) {

    }

    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> lNums = new ArrayList<>();


        int col = Integer.MAX_VALUE;
        for (int i = 0; i < matrix.length; i++) {
            int min = Integer.MAX_VALUE;
            for (int j = 0; j < matrix[i].length; j++) {
                if (min > matrix[i][j]) {
                    col = j;
                    min = matrix[i][j];
                }
            }
            //再遍历所有的col 判断是不是最大的
            int max = Integer.MIN_VALUE;

            for (int n = 0; n < matrix.length; n++) {
                //找出他们的最大`
                max = Math.max(max, matrix[n][col]);

            }
            if (max == min) {
                lNums.add(min);
            }
        }


        return lNums;

    }
}
