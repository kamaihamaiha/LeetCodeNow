package cn.leetcode.melo;

import java.util.ArrayList;
import java.util.List;

/**
 * 最小回文数
 * https://leetcode-cn.com/problems/find-the-closest-palindrome/
 */
public class LC564 {
    public static void main(String[] args) {
        nearestPalindromic("123666");
    }

    //思路 前后置换 12345  换车12321 然后再把中间数 分别 +1和-1
    public static String nearestPalindromic(String n) {
        Long selfNumber = Long.parseLong(n), ans = -1l;
//        选出三个候选人 大直接换的,小

        List<Long> candidates = getCandidates(n);
        for (long candidate : candidates) {
            if (candidate != selfNumber) {
                if (ans == -1 ||
                        Math.abs(candidate - selfNumber) < Math.abs(ans - selfNumber) ||
                        Math.abs(candidate - selfNumber) == Math.abs(ans - selfNumber) && candidate < ans) {
                    ans = candidate;
                }
            }
        }
        return Long.toString(ans);


    }

    private static List<Long> getCandidates(String n) {
        int len = n.length();
        List<Long> candidates = new ArrayList<Long>();
        //10的多少次方
        candidates.add((long) Math.pow(10, len - 1) - 1);
        candidates.add((long) Math.pow(10, len) + 1);
//        自我的前缀  前一半的
        long selfPrefix = Long.parseLong(n.substring(0, (len + 1) / 2));
        //从-1 到自己 到 +1
        for (long i = selfPrefix - 1; i <= selfPrefix + 1; i++) {
            StringBuffer sb = new StringBuffer();
            String prefix = String.valueOf(i);
            sb.append(prefix);
            //反转
            StringBuffer suffix = new StringBuffer(prefix).reverse();
            sb.append(suffix.substring(len & 1));
            String candidate = sb.toString();
            candidates.add(Long.parseLong(candidate));
        }
        return candidates;
    }
}
