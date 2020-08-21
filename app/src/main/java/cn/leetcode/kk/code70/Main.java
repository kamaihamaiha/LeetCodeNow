package cn.leetcode.kk.code70;

public class Main {

    public static void main(String[] args) {
        Solution solution = new Solution();

        for (int i = 1; i <= 30; i++) {
            int value = solution.climbStairs(i);
            System.out.println(i + " > " + value);
        }
    }
}
