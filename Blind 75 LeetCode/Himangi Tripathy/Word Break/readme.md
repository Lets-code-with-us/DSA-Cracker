class Solution {
  public boolean wordBreak(String s, List<String> wordDict) {
    final int n = s.length();//we set final value of n as length of string s
    Set<String> wordSet = new HashSet<>(wordDict);//we create a new hashset named wordSet
    boolean[] dp = new boolean[n + 1];//we create a new array named dp of boolean type
    dp[0] = true;//we set first element of dp array to be true

    for (int i = 1; i <= n; ++i)
      for (int j = 0; j < i; ++j)
        // s[0..j) can be segmented and s[j..i) is in `wordSet`, so s[0..i) can
        // be segmented.
        if (dp[j] && wordSet.contains(s.substring(j, i))) {//if jth index element and the wordSet returns true then
          dp[i] = true;//dp array 's ith element is set true
          break;//then terminate the loop
        }

    return dp[n];//we return the element of nth index
  }
}