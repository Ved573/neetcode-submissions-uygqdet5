class Solution {

    public int islandPerimeter(int[][] grid) {

        int rows = grid.length;
        int cols = grid[0].length;

        boolean[][] visited = new boolean[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {

                if (grid[i][j] == 1) {
                    return dfs(grid, visited, i, j);
                }

            }
        }

        return 0;
    }

    private int dfs(int[][] grid, boolean[][] visited, int row, int col) {

        // Outside grid
        if (row < 0 || row >= grid.length || col < 0 || col >= grid[0].length) {
            return 1;
        }

        // Water contributes one side
        if (grid[row][col] == 0) {
            return 1;
        }

        // Already visited land contributes nothing
        if (visited[row][col]) {
            return 0;
        }

        visited[row][col] = true;

        int up = dfs(grid, visited, row - 1, col);
        int down = dfs(grid, visited, row + 1, col);
        int left = dfs(grid, visited, row, col - 1);
        int right = dfs(grid, visited, row, col + 1);

        return up + down + left + right;
    }
}