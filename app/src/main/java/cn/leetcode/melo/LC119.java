package cn.leetcode.melo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 最垃圾的自然是递归
 *
 */
public class LC119 {
    public static void main(String[] args) {
        List<Integer> hh = getRow2(10);
        int a = hh.get(0);
    }

    public static List<Integer> getRow(int rowIndex) {
        Integer[] dp = new Integer[rowIndex + 1];
        //都加 1
        Arrays.fill(dp,1);
        //从第二个开始
        for(int i = 2;i < dp.length;i++){
            for(int j = i - 1;j > 0;j--)
                //等
                dp[j] = dp[j] + dp[j - 1];
        }
        List<Integer> res = Arrays.asList(dp);
        return res;
    }



    public static List<Integer> getRow2(int rowIndex) {
        List<Integer> backLis = new ArrayList<>();

        if (rowIndex == 0) {
            backLis.add(1);
            return backLis;
        } else if (rowIndex == 1) {
            backLis.add(1);
            backLis.add(1);
            return backLis;
        } else {
            backLis.add(1);
        }

        for (int i = 1; i < rowIndex ; i++) {
            int sum = getRow(rowIndex - 1).get(i - 1) + getRow(rowIndex - 1).get(i);
            backLis.add(sum);
        }
        backLis.add(1);
        return backLis;
    }
}
