public class Solution {
    public int climbStairs(int n) {
        if (n <= 2) {
            return n;
        }

        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 2;

        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[n];
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int n = 5; // You can replace 5 with the desired number of stairs
        int ways = solution.climbStairs(n);
        System.out.println("Number of distinct ways to climb " + n + " stairs: " + ways);
    }
}
