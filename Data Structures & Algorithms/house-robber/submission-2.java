class Solution {

    public int rob(int[] nums) {
        int[] dp = new int[nums.length + 1];
        Arrays.fill(dp, -1);

        return helper(0, nums, dp);
    }

    public int helper(int i, int[] nums, int[] dp) {

        // Base case
        if (i >= nums.length) {
            return 0;
        }

        // Already calculated
        if (dp[i] != -1) {
            return dp[i];
        }

        // Choice 1: Rob current house
        int rob = nums[i] + helper(i + 2, nums, dp);

        // Choice 2: Skip current house
        int skip = helper(i + 1, nums, dp);

        // Store answer
        dp[i] = Math.max(rob, skip);

        return dp[i];
    }
}