class Solution {

    int rows, cols;
    int[][] directions = {{1,0}, {-1,0}, {0,1}, {0,-1}};

    public List<List<Integer>> pacificAtlantic(int[][] heights) {

        rows = heights.length;
        cols = heights[0].length;

        boolean[][] pacific = new boolean[rows][cols];
        boolean[][] atlantic = new boolean[rows][cols];

        // Pacific DFS (Top row + Left column)
        for (int i = 0; i < rows; i++) {
            dfs(i, 0, pacific, heights);
            dfs(i, cols - 1, atlantic, heights);
        }

        // Atlantic DFS (Bottom row + Right column)
        for (int j = 0; j < cols; j++) {
            dfs(0, j, pacific, heights);
            dfs(rows - 1, j, atlantic, heights);
        }

        List<List<Integer>> ans = new ArrayList<>();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (pacific[i][j] && atlantic[i][j]) {
                    ans.add(Arrays.asList(i, j));
                }
            }
        }

        return ans;
    }

    private void dfs(int row, int col, boolean[][] visited, int[][] heights) {

        if (visited[row][col])
            return;

        visited[row][col] = true;

        for (int[] dir : directions) {

            int newRow = row + dir[0];
            int newCol = col + dir[1];

            if (newRow < 0 || newRow >= rows ||
                newCol < 0 || newCol >= cols)
                continue;

            // Reverse flow condition
            if (heights[newRow][newCol] >= heights[row][col]) {
                dfs(newRow, newCol, visited, heights);
            }
        }
    }
}