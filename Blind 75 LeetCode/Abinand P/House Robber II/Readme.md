## Class: Solution

This class provides a method `rob` to determine the maximum amount of money you can rob from a given list of non-negative integers representing the amount of money of each house.

### Method: `rob`

Determines the maximum amount of money you can rob from a given list of non-negative integers representing the amount of money of each house.

#### Parameters

- `nums`: A vector of integers representing the amount of money of each house.

#### Returns

An integer representing the maximum amount of money you can rob.

#### Approach

1. **Initialization:** Initialize four variables: `includ1`, `exclud1`, `includ2`, and `exclud2` to track the maximum amount of money you can rob considering two cases: including or excluding the current house.

2. **Base Case:** If there is only one house, return the amount of money in that house.

3. **Dynamic Programming:**
   - Iterate through the list of houses from the first house to the second to last house (`i = 0` to `n - 2`):
     - Calculate the maximum amount of money including the current house:
       - `x = exclud1 + nums[i]`
     - Update `exclud1` to store the maximum amount of money excluding the current house:
       - `exclud1 = max(exclud1, includ1)`
     - Update `includ1` to store the maximum amount of money including the current house:
       - `includ1 = x`
     - Repeat the same process for the next house (`i + 1`):
       - Calculate the maximum amount of money including the next house:
         - `x2 = exclud2 + nums[i + 1]`
       - Update `exclud2` to store the maximum amount of money excluding the next house:
         - `exclud2 = max(exclud2, includ2)`
       - Update `includ2` to store the maximum amount of money including the next house:
         - `includ2 = x2`

4. **Result:**
   - Return the maximum amount of money by considering the maximum of `includ1`, `includ2`, `exclud1`, and `exclud2`.

#### Time Complexity
- The time complexity of this method is O(n), where n is the number of houses in the list, as it iterates through the list of houses once.

#### Space Complexity
- This method has a space complexity of O(1), as it uses only a constant amount of extra space for storing variables, regardless of the input size.
