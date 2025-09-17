// Last updated: 9/17/2025, 1:30:19 AM
class Solution {
    public int numIslands(char[][] grid) {
        int count = 0;
        int rows = grid.length;
        if (rows == 0)
            return 0;
        int cols = grid[0].length;

        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                if (grid[r][c] == '1') {
                    count++;
                    dfs(grid, r, c);
                }
            }
        }

        return count;
    }

    public void dfs(char[][] grid, int r, int c) {
        int rows = grid.length;
        int cols = grid[0].length;

        if(r<0 || c<0 || r>=rows || c>=cols || grid[r][c] == '0') return;

        grid[r][c]= '0'; //mark as visited

        dfs(grid, r-1, c);
        dfs(grid, r+1, c);
        dfs(grid, r, c-1);
        dfs(grid, r, c+1);

    }
}