package cn.leetcode.melo;


/**
 * feidi  wenti 飞地问题
 * <p>
 * https://leetcode-cn.com/problems/number-of-enclaves/
 */
public class LC1020 {

    public static void main(String[] args) {
        int[][] game = {{1, 1, 1, 1}, {1, 0, 0, 0}, {1, 1, 1, 1}, {0, 0, 0, 0}};
        new LC1020().numEnclaves(game);
    }


    public static int[][] dirs = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
    private int m, n;
    private boolean[][] visited;


    //深度搜索  dfs
    public int numEnclaves(int[][] grid) {

        int result = 0;
        //思路就是搜索四个边和其相关联的都不是飞地   剩下的还是1的 则都是飞地
        m = grid.length;
        n = grid[0].length;
        visited = new boolean[m][n];

        //创一个同样大小的矩阵记录结果
        //1描边
        for (int i = 0; i < m; i++) {
            //上
            dfs(grid, i, 0);
            dfs(grid, i, n - 1);
        }
        //减少重复计算
        for (int i = 1; i < n - 1; i++) {
            dfs(grid, 0, i);
            dfs(grid, m - 1, i);
        }
        //结果
        for (int i = 0; i < visited.length; i++) {
            for (int j = 0; j < visited[i].length; j++) {
                if (grid[i][j] == 1 && !visited[i][j]) {
                    result++;
                }
            }
        }

        return result;

    }

    public void dfs(int[][] grid, int row, int col) {
        //不在范围内的
        if (row < 0 || row >= m || col < 0 || col >= n
                || grid[row][col] == 0
                || visited[row][col]

        ) {
            return;
        }
        //访问的到的都是true
        visited[row][col] = true;
        //和他相邻的重新判断一下是否能访问到2
        //如果是1  上下左右位移一下还是1的继续比较
        for (int[] dir : dirs) {
            dfs(grid, row + dir[0], col + dir[1]);
        }

    }
}
