package Climbing_Stairs;

public class Solution {

    public int climbStairs(int n) {
        if (n <= 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            int[] steps = new int[n + 1];
            steps[0] = 1; // Initialize for 0 stairs
            steps[1] = 1; // Initialize for 1 stair

            for (int i = 2; i <= n; i++) {
                steps[i] = steps[i - 1] + steps[i - 2];
            }

            return steps[n];
        }
    }
}
