## House Robber (Dynamic Programming)

This code implements a dynamic programming solution to find the maximum amount of money a thief can steal from a row of houses (`nums`) without robbing adjacent houses.

**Explanation:**

1. **Base Cases:**
   - Checks for empty (`n == 0`) and single-house (`n == 1`) scenarios and returns the appropriate amount (0 or the single house's value).

2. **`dp` Array:**
   - Creates an array `dp` of size `n` to store the maximum amount robable up to each house.
   - Initializes `dp[0]` with the value of the first house (`nums[0]`).
   - Initializes `dp[1]` with the maximum of the first two houses (`Math.max(nums[0], nums[1])`).

3. **Dynamic Programming Iteration:**
   - Uses a loop (`i` from 2 to `n - 1`) to iterate through the remaining houses.
   - At each house `i`:
     - `dp[i]` is calculated as the maximum of:
       - `dp[i - 1]`: This represents the maximum amount possible if the thief **doesn't** rob house `i`, considering the maximum up to house `i - 1`.
       - `dp[i - 2] + nums[i]`: This represents the maximum amount possible if the thief **robs** house `i`, by adding its value to the maximum obtainable up to house `i - 2` (considering not robbing the previous house).

4. **Result:**
   - `dp[n - 1]` holds the maximum amount robable considering the entire array, as it represents the maximum up to the last house (`n - 1`). This value is returned.

**Main Function:**

- Creates an instance of `Solution`.
- Defines a sample array of house values (`nums`).
- Calls `rob` to find the maximum amount.
- Prints the result.

**Complexity:**

- Time Complexity: O(n) due to the single loop iterating through the array.
- Space Complexity: O(n) for the `dp` array.
