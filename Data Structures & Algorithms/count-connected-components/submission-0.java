class Solution {
    public int countComponents(int n, int[][] edges) {
      ArrayList<ArrayList<Integer>> adjList=new ArrayList<>();
      for(int i=0;i<n;i++){
        adjList.add(new ArrayList<>());
      }
      for(int edge[] : edges ){
        int U=edge[0];
        int V=edge[1];
        adjList.get(U).add(V);
        adjList.get(V).add(U);
      }
      boolean[] visited=new boolean[n];
      int result=0;
      for(int i=0;i<n;i++){
        if(!visited[i]){
            ArrayList<Integer> comp=new ArrayList<>();
            dfsHelper(i,adjList,visited,comp);
            result++;
        }
      }
      return result;
    }
    void dfsHelper(int vertex,ArrayList<ArrayList<Integer>> adjList,boolean[] visited,ArrayList<Integer> comp){
        visited[vertex]=true;
        comp.add(vertex);
        for(int neighbour : adjList.get(vertex)){
            if(!visited[neighbour]){
                dfsHelper(neighbour,adjList,visited,comp);
            }
        }
    }
}
