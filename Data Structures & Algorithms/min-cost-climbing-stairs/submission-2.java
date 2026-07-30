class Solution {

    public int minCostClimbingStairs(int[] cost) {
        int dp[]=new int[cost.length+1];
        Arrays.fill(dp,-1);


        return Math.min(helper(0,dp,cost), helper(1,dp,cost));
    }

    public int helper(int i,int[]dp,int[] cost) {

        // Reached the top
        if (i >= cost.length) {
            return 0;
        }
        if(dp[i]!=-1){
            return dp[i];
        }
        int first=helper(i+1,dp,cost);
        int second=helper(i+2,dp,cost);
        dp[i]=cost[i]+ Math.min(first,second);
        return dp[i];
         
    }
}