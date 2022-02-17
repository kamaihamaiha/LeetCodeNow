package cn.leetcode.melo;

import java.util.ArrayList;
import java.util.List;

/**
 * 最简分数
 */
public class LC1447 {
    public static void main(String[] args) {

    }

    public List<String> simplifiedFractions(int n) {

        List<String> back = new ArrayList<>();
        //分母
        for (int i = 2; i <=n; i++) {
            //分子
            for (int j = 1; j <=i; j++) {
//                j/i
                if (gcd(j, i) == 1) {
                    back.add(j + "/" + i);

                }
            }
        }
        return back;
    }

    public int gcd(int a, int b) {
        return b != 0 ? gcd(b, a % b) : a;
    }

}
