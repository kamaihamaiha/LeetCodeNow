package cn.leetcode.melo;

public class LC688 {
    public static void main(String[] args) {

    }

    //骑士有八种走法
    int[][] dirs = {{1, 2}, {1, -2}, {2, 1}, {2, -1}, {-1, -2}, {-1, 2}, {-2, 1}, {-2, -1}};

    public double knightProbability(int n, int k, int row, int column) {
        double[][][] dp = new double[k + 1][n][n];
        //开始走步
        for (int step = 0; step <= k; step++) {

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    //第0步肯定是在nn里
                    if (step == 0) {
                        dp[step][i][j] = 1;
                    } else {
                        //不是第一步就开始移动
                        for (int[] dir : dirs) {
                            int ni = i + dir[0];
                            int nj = j + dir[1];
                            //走完之后 还在棋盘内的
                            if (ni >= 0 && ni < n && nj >= 0 && nj < n) {
                                //这个点的 概率就要+1/8
                                dp[step][i][j] += dp[step - 1][ni][nj] / 8;
                            }

                        }

                    }

                }

            }


        }
        //返回第几步的 就是答案
        return dp[k][row][column];

    }
}
