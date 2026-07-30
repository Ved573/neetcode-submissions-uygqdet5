class Solution {
    public int tribonacci(int n) {
      int dp[]=new int[n+1];
      Arrays.fill(dp,-1);
      return helper(n,dp);
    }
    public int helper(int n,int[]dp){
      if(n==0){
        dp[n]=0;
        return dp[n];
      }
      else if(n==1||n==2){
        dp[n]=1;
        return dp[n];
      }
      if(dp[n]!=-1){
        return dp[n];
      }
      
      int first=helper(n-1,dp);
      int second=helper(n-2,dp);
      int third=helper(n-3,dp);
      dp[n]=first+second+third;
      return dp[n];
    }
}
