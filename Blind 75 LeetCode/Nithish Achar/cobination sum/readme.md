## Combination Sum (Backtracking with Dynamic Programming)

This code implements a backtracking solution with dynamic programming aspects to find all unique combinations of numbers that add up to a given target (`target`) using an array of candidate numbers (`candidates`).

**Explanation:**

1. **`combinationSum` Function:**
   - Initializes an empty list `allCombinations` to store all valid combinations.
   - Calls the helper function `dfs` to initiate the backtracking search.

2. **`dfs` Helper Function (Backtracking):**
   - Takes `candidates` array, current index (`index`), remaining target (`remainingTarget`), a `currentList` to store the current combination, and the `allCombinations` list.
   - Base cases:
     - If `remainingTarget` becomes 0, a valid combination is found. Add a copy of `currentList` to `allCombinations` (avoiding modification during backtracking).
     - If `remainingTarget` is negative or `index` reaches the end of `candidates`, no valid combinations can be formed from this path.

3. **Include Current Candidate:**
   - Adds the current candidate (`candidates[index]`) to `currentList`.
   - Makes a recursive call to `dfs` with:
     - Same `candidates` array.
     - Updated `index` (to consider next candidates).
     - Updated `remainingTarget` (subtracting the current candidate's value).
     - The updated `currentList`.
     - The same `allCombinations` list for adding potential combinations.

4. **Backtracking:**
   - Removes the last element (current candidate) from `currentList` to explore combinations without the current candidate.

5. **Exclude Current Candidate:**
   - Makes another recursive call to `dfs` with:
     - Same `candidates` array.
     - Incremented `index` (to consider next candidates).
     - Unchanged `remainingTarget`.
     - The same `currentList` (unchanged since the current candidate is excluded).
     - The same `allCombinations` list.

**Key Points:**

- This approach uses backtracking to explore all possible combinations.
- The `dfs` function systematically explores branches of the search tree, considering including or excluding candidates.
- `currentList` keeps track of the current combination being built.
- `allCombinations` accumulates all valid combinations found during backtracking.
- While not a pure dynamic programming solution, it avoids redundant calculations to some extent by exploring combinations based on previous recursive calls.
- Time complexity: O(2^n) in the worst case, where n is the number of candidates (exponential due to exploring all combinations).
- Space complexity: O(n) for the recursion call stack (due to depth of backtracking).
