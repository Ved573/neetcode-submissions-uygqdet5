class Solution {
    public int rob(int[] nums) {

        int[] dp = new int[nums.length + 1];

        // Base cases
        dp[nums.length] = 0;
        dp[nums.length - 1] = nums[nums.length - 1];

        // Fill DP from right to left
        for (int i = nums.length - 2; i >= 0; i--) {

            // Take current house OR skip current house
            dp[i] = Math.max(
                nums[i] + dp[i + 2],
                dp[i + 1]
            );
        }

        return dp[0];
    }
}