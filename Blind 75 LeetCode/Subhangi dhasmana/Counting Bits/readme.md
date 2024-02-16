# Code Explanation: Counting Bits - Python Solution

## Explanation:

- We are given an integer n and we need to find the number of 1 bits in the binary representation of each number from 0 to n.
- We utilize dynamic programming to solve this problem efficiently.
- We initialize a dynamic programming array dp with size (n+1) to store the count of 1 bits for each number from 0 to n.
- We also initialize an answer array ans with the first element as 0.
- We set an offset variable to keep track of the power of 2. Initially, it is set to 1.
- We iterate from 1 to n, At each iteration, we check if the current index (i) is double of the offset. If it is, we update the offset to i.
- We update dp[i] as 1 + dp[i-offset], which means we are counting the number of 1 bits by adding 1 to the count of 1 bits in the number which is at the offset position behind the current number.
- Finally, we return the dp array which contains the count of 1 bits for each number from 0 to n.

## Complexity:
- Time Complexity: O(n)
- Space Complexity: O(n)