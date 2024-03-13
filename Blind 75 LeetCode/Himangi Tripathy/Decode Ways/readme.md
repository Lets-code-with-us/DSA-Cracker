class Solution {
    public int numDecodings(String s) {
        final int n = s.length();//final value of n is assigned to the length of the string s
    int[] dp = new int[n + 1];//new intger array dp has index of n+1
    dp[n] = 1; //dp nth index element is 1
    dp[n - 1] = isValid(s.charAt(n - 1)) ? 1 : 0;//if dp n-1th index element is same as character at string s with n-1 th index element then it is equal to 1 else it is equal to 0

    for (int i = n - 2; i >= 0; --i) {//we start traversal from n-2th element to 0th index element in backward direction
      if (isValid(s.charAt(i)))//isValid is true that is the character at ith index of string s then
        dp[i] += dp[i + 1];//ith element of dp array is sum of ith  and (i+1)th element of dp array 
      if (isValid(s.charAt(i), s.charAt(i + 1)))//isValid is true i.e character at ith index of string s and character at (i+1)th index of string s 
        dp[i] += dp[i + 2];//we set the ith element of dp array as the sum of ith and (i+2)th element of dp array
    }

    return dp[0];//we return the 1st element of dp array
  }

  private boolean isValid(char c) {//private method of name isValid with one character c as argument which returns a boolean value
    return c != '0';//we return true if character c is not equal to '0'
  }

  private boolean isValid(char c1, char c2) {//private method of name isValid with 2 character c1, c2 as arguments which returns a boolean value
    return c1 == '1' || c1 == '2' && c2 < '7';//we return true if c1 is '1' or c1 is '2' and c2 is less than '7'
  }
}