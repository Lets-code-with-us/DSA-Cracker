Explanation:-Climbing Stairs

*****Detailed Approach*****

**This problem is solved with dp approach in which we store count of stairs and calculate next count using previous element** 
1.**Initialize a vector in which we store no. of distinct ways to climb a stairs** 
2.**We know that on 1st stair we can climb with one way so it is 1 and on 2nd stair we can  with two ways that is 1,1 and 2(taking two steps) so there is 2 distinct ways to climb on stair 2** 
3.**So dp[1]=1 and dp[2]=2** 
4.**Loop 3 to n in which we can add next distinct way using previous two elements** 
5.**dp[i]=dp[i-1]+dp[i-2] In this way you can find no. of distinct ways to climb a stairs** 
6.**At last return dp[n] means last element which is exact number through which we can climb a stairs with distinct ways**

*Complexity*
Space:-O(n),For storing distinct ways to climb
Time:-O(n),For traversing whole array to add sum of previous elem. and store into vector



**Example**
n=4 so there will be 4 stairs now we have to find how we can climb on it with distict ways

Loop from 3 to n
    Initialize,dp[1]=1 and dp[2]=2
#First Iteration
    In array dp=[1,2]
    dp[3]=dp[3-1]+dp[3-2]
    dp[3]=dp[2]+dp[1]
    dp[3]=2+1
    Now dp[3]=3 So array will become [1,2,3]

#Second Iteration
    In array dp=[1,23]
    dp[4]=dp[4-1]+dp[4-2]
    dp[4]=dp[3]+dp[2]
    dp[4]=3+2
    Now dp[4]=5 So array will become [1,2,3,5]
Return dp[n] which is 5 So there will be 5 distinct ways to climb 4 stairs    

