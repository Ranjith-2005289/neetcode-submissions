class Solution {
    public int coinChange(int[] coins, int amount) {
        // dp[i] = minimum number of coins needed to make amount i
        int[] dp = new int[amount + 1];
        // Initially, assume every amount is impossible
        // amount + 1 means "not possible"
        Arrays.fill(dp, amount + 1);
        // To make amount 0, we need 0 coins
        dp[0] = 0;
        // Find the answer for every amount from 1 to amount
        for (int i = 1; i <= amount; i++) {
            // Try every coin
            for (int coin : coins) {
                // We can use this coin only if coin <= i
                if (coin <= i) {

                // Use this coin + best answer for remaining amount
                    dp[i] = Math.min(dp[i], dp[i - coin] + 1);
                }
            }
        }
        // If amount is still impossible, return -1
        if (dp[amount] == amount + 1) {
            return -1;
        }

        return dp[amount];
    }
}
