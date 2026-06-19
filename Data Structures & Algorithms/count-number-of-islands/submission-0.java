class Solution {
    public int numIslands(char[][] grid) {
        int rows=grid.length;
        int cols=grid[0].length;
        boolean[][]visited=new boolean[rows][cols];
        int countIslands=0;
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(!visited[i][j] && grid[i][j]=='1'){
                    dfsHelper(i,j,visited,grid);
                    countIslands++;
                }
            }
        }
        return countIslands;
    }
    void dfsHelper(int rows,int cols,boolean[][]visited,char[][] grid){
        //base case
        if(rows>=grid.length||rows<0||cols>=grid[0].length||cols<0||visited[rows][cols]||grid[rows][cols]=='0'){
            return;
        }
        visited[rows][cols]=true;
        dfsHelper(rows-1,cols,visited,grid);
        dfsHelper(rows+1,cols,visited,grid);
        dfsHelper(rows,cols-1,visited,grid);
        dfsHelper(rows,cols+1,visited,grid);
    }
}