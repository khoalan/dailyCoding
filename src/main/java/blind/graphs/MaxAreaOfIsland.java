package blind.graphs;

public class MaxAreaOfIsland {

    public static int maxAreaOfIsland(int[][] grid) {
        int max = 0;
        int row = grid.length;
        int col = grid[0].length;

        for (int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                if (grid[i][j] == 1){
                    max = Math.max(max, dfs(grid, i, j));
                }

            }
        }
        return max;
    }

    static int dfs(int[][] grid, int row, int col){
        if (row < 0 || col < 0 || row >= grid.length || col >= grid[0].length || grid[row][col] == 0)
            return 0;
        grid[row][col] = 0;
        return (1 + dfs(grid, row-1, col) + dfs(grid, row, col+1) + dfs(grid, row, col-1)+ dfs(grid, row+1, col));
    }

    public static void main(String[] args) {
        System.out.println(maxAreaOfIsland(new int[][]{{0,0,1,0,0,0,0,1,0,0,0,0,0},{0,0,0,0,0,0,0,1,1,1,0,0,0}
                ,{0,1,1,0,1,0,0,0,0,0,0,0,0},{0,1,0,0,1,1,0,0,1,0,1,0,0},{0,1,0,0,1,1,0,0,1,1,1,0,0},{0,0,0,0,0,0,0,0,0,0,1,0,0}
                ,{0,0,0,0,0,0,0,1,1,1,0,0,0},{0,0,0,0,0,0,0,1,1,0,0,0,0}}));
    }
}
