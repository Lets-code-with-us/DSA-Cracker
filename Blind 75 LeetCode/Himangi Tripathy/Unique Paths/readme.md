class Solution {
    public int uniquePaths(int m, int n) {
        int[] dp = new int[n]; //we create a new array dp of integer type of length n
        dp[0] = 1;//we assign the 1st element of dp array to 1
        for (int i = 0; i < m; i++) { //we start the traversal from 0th index of array till (m-1)th position of grid
            for (int j = 1; j < n; j++) { //we start the traversal from 1th index to nth position of grid
                dp[j] += dp[j - 1]; //we set the jth index of dp array to sum of jth index element and (j-1)th index element of dp array
            } 
        } 
        return dp[n - 1]; //we return dp array's (n-1)th element
        
    }
}