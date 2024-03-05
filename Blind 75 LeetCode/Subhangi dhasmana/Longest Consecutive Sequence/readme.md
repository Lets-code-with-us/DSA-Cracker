# Code Explanation: Longest Consecutive Sequence - Python Solution

## Explanation:

- The function longestConsecutive takes a list of integers nums as input.
- It initializes a variable longest to store the length of the longest consecutive sequence found.
- It converts the list nums into a set num_set to allow for constant time lookups.
- It iterates through each number in the set num_set.
- For each number n, it checks if n-1 is not in the set, indicating the start of a new consecutive sequence.
- If n-1 is not present, it starts counting the consecutive sequence length by incrementing length until n+length is not in num_set.
- It updates longest with the maximum of its current value and the length of the current consecutive sequence.
- Finally, it returns the longest consecutive sequence length found.

## Complexity:
- Time Complexity: O(n)
- Space Complexity: O(n)