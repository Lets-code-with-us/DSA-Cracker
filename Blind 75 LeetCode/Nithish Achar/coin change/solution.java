public class Solution {
    public int coinChange(int[] coins, int amount) {
        // Initialize an array to store minimum number of coins needed for each amount
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, amount + 1); // Initialize with a value greater than the maximum possible amount
        dp[0] = 0; // No coins needed for amount 0

        // Calculate minimum number of coins needed for each amount from 1 to amount
        for (int i = 1; i <= amount; i++) {
            for (int coin : coins) {
                if (coin <= i) {
                    dp[i] = Math.min(dp[i], 1 + dp[i - coin]);
                }
            }
        }

        return dp[amount] > amount ? -1 : dp[amount];
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] coins = {1, 2, 5};
        int amount = 11;
        int minCoins = solution.coinChange(coins, amount);
        System.out.println("Minimum number of coins needed: " + minCoins);
    }
}
