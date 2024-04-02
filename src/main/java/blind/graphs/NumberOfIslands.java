package blind.graphs;

public class NumberOfIslands {
    public static int numIslands(char[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        int island = 0;
        for (int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                if (grid[i][j] == '1'){
                    island++;
                    dfs(grid, i, j);
                }
            }
        }
        return island;
    }

    static void dfs(char[][] grid, int row, int col){
        if (row < 0 || col < 0 || row >= grid.length || col >= grid[0].length || grid[row][col] == '0') return;
        grid[row][col] = '0';
        dfs(grid, row-1, col);
        dfs(grid, row, col+1);
        dfs(grid, row, col-1);
        dfs(grid, row+1, col);
    }

    public static void main(String[] args) {
        System.out.println(numIslands(new char[][]{{'1','1','1','1','0'},{'1','1','0','1','0'},{'1','1','0','0','0'},{'0','0','1','0','0'}}));
    }
}
