class Solution {

    public int maxAreaOfIsland(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;

        int maxArea = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {

                if (grid[i][j] == 1) {
                    int area = dfs(grid, i, j);
                    maxArea = Math.max(maxArea, area);
                }

            }
        }

        return maxArea;
    }

    private int dfs(int[][] grid, int i, int j) {

        // Out of bounds
        if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length) {
            return 0;
        }

        // Water or already visited
        if (grid[i][j] == 0) {
            return 0;
        }

        // Mark visited
        grid[i][j] = 0;

        int area = 1;

        area += dfs(grid, i + 1, j); // Down
        area += dfs(grid, i - 1, j); // Up
        area += dfs(grid, i, j + 1); // Right
        area += dfs(grid, i, j - 1); // Left

        return area;
    }
}