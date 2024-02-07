# Code Explanation: Contains Duplicate - java Solution

## Explanation:

Intuition
We would use HashSet to solve this problem

Approach
We create HashSet to store each num from nums array and check if num that we are about to store in set are already there, if true we return true, else we return false

Complexity
Time complexity:
O(n) -> we iterate over nums array only once
Space complexity:
O(n) -> we use HashSet to store nums
