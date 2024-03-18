class Solution {
    public int numDecodings(String s) {
        // Base case: If the string is empty or starts with '0', there is no valid decoding.
        if (s == null || s.length() == 0 || s.charAt(0) == '0') {
            return 0;
        }
        
        int n = s.length();
        // dp[i] represents the number of ways to decode the string s.substring(0, i + 1).
        int[] dp = new int[n + 1];
        dp[0] = 1; // Empty string has one way to decode.
        dp[1] = s.charAt(0) != '0' ? 1 : 0; // Single digit string has one way to decode if it's not '0'.
        
        for (int i = 2; i <= n; i++) {
            // Check if single digit is valid (i.e., not '0').
            if (s.charAt(i - 1) != '0') {
                dp[i] += dp[i - 1];
            }
            // Check if two digits is valid.
            int twoDigits = Integer.parseInt(s.substring(i - 2, i));
            if (twoDigits >= 10 && twoDigits <= 26) {
                dp[i] += dp[i - 2];
            }
        }
        
        return dp[n];
    }
}
