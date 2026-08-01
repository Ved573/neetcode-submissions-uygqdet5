class Solution {
    public int findJudge(int n, int[][] trust) {

        int[] indegree = new int[n + 1];
        int[] outdegree = new int[n + 1];

        // Count incoming and outgoing edges
        for (int[] edge : trust) {
            int u = edge[0];
            int v = edge[1];

            outdegree[u]++;
            indegree[v]++;
        }

        // Find the judge
        for (int i = 1; i <= n; i++) {
            if (indegree[i] == n - 1 && outdegree[i] == 0) {
                return i;
            }
        }

        return -1;
    }
}