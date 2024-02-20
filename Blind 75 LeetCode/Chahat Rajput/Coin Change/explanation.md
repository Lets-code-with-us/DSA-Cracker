Explanation:-Coin Exchange

Approach:-It is a dp approach in which we store results of subproblems.Memoization helps to avoid recalculating results for the same subproblems


**Detailed Approach**
1.Initialize a vector in which we store result 
2.We know that for 0 coin we need 0 coin so  dp[0]=0 
3.Loop 1 t0 amount
    (i) Loop 0 to n
    Now check 
        if(i>=coins[j])
            dp[i]=min(dp[i-coins[j]]+1,dp[i]);
4.Atlast return dp[amount] if find match otherwise return -1            

**Complexity**

Space:O(n),for the memoization table(dp)
Time:O(m*n)where n is amount and m is the no. of coins.