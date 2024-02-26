# Code Explanation: Combination sum - Python Solution

## Explanation:

- The combSum function is a recursive helper function used to find combinations of numbers from the given list (lst) that sum up to the target value k. It takes parameters i as the starting index, lst as the list of candidates, temp as the current combination being formed, ans as the list to store valid combinations, totSum as the sum of elements in the current combination, and k as the target sum.
- Within the combSum function, it checks if totSum equals k, in which case it appends the current combination to the answer list ans. If totSum exceeds k, it returns without further processing.
- It iterates through the candidates starting from index i, adding each candidate to the current combination (temp) and updating the totSum accordingly.
- Recursively calls itself with updated parameters to explore further combinations.
- After processing a combination, it removes the last added element from the current combination and adjusts the totSum accordingly.

## Complexity:
- Time Complexity: O(2^n)
- Space Complexity: O(2^n)