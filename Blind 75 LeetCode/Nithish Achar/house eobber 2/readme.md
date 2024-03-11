## House Robber (Non-Consecutive Houses)

This code implements a dynamic programming solution to find the maximum amount of money a thief can steal from a row of houses (`nums`) considering the constraint that they cannot rob adjacent houses.

**Key Point:** This approach handles cases where the thief cannot rob the first or last house in the row.

**Explanation:**

1. **Base Cases:**
   - Checks for empty (`n == 0`) and single-house (`n == 1`) scenarios and returns the appropriate amount (0 or the single house's value).

2. **Separate Calculations:**
   - The problem is divided into two subproblems:
     - `maxWithoutFirst`: Maximum amount possible if the thief **cannot** rob the first house (`nums[0]`).
     - `maxWithoutLast`: Maximum amount possible if the thief **cannot** rob the last house (`nums[n - 1]`).
   - A helper function `robLinear` is used to calculate the maximum amount for each subproblem.

3. **`robLinear` Function:**
   - This function takes a subarray (`nums[start:end]`) as input, excluding the first or last element depending on the subproblem.
   - It uses a dynamic programming approach with two variables:
     - `prevMax`: Represents the maximum amount robable considering the house two positions before the current one.
     - `currMax`: Represents the maximum amount robable considering the house one position before the current one.
   - Iterates through the subarray (`i` from `start` to `end`):
     - Updates `currMax` as the maximum of:
       - `prevMax + nums[i]`: Represents the total achievable by robbing the current house (`nums[i]`) combined with the maximum obtainable up to the house two positions before (`prevMax`).
       - The current value of `currMax` (which might already consider not robbing the current house).
     - Shifts `prevMax` to hold the previous value of `currMax`.

4. **Final Result:**
   - After processing the subproblems, the function `rob` returns the maximum value between `maxWithoutFirst` and `maxWithoutLast`, representing the optimal solution considering both scenarios.

**Main Function:**

- Creates an instance of `Solution`.
- Defines two sample arrays (`nums1` and `nums2`) for demonstration.
- Calls `rob` for each array to find the maximum amount robable.
- Prints the results.

**Complexity:**

- Time Complexity: O(n) due to two calls to `robLinear` which iterate through subarrays of size at most `n - 1`.
- Space Complexity: O(1) as it uses constant extra space.

**Note:** This approach avoids redundant calculations within `rob` as `robLinear` performs the core dynamic programming logic for each subproblem.
