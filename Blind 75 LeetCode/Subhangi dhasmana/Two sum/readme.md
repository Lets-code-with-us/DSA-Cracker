# Code Explanation: Two Sum Problem - Python Solution

## Explanation:

- The naive solution is commented out, which uses nested loops to check all possible pairs of indices. This results in O(n^2) time complexity, and it is less efficient.

- The optimized solution uses a dictionary prevMap to keep track of previously encountered numbers and their indices. The key idea is to calculate the complement (rem) of the current number with respect to the target.

- In the loop, for each element in nums, it checks if the complement (rem) is already present in prevMap. If it is, it means a pair with the required sum has been found, and the function returns the indices of the two numbers.

- If the complement is not in prevMap, it adds the current number to the dictionary with its index.

- If no such pair is found during the entire iteration, an empty list is returned.

## Complexity:
- Time Complexity: O(n)
- Space Complexity: O(n)