## Class: Solution

This class provides a method `rob` to determine the maximum amount of money you can rob without alerting the police.

### Method: `rob`

Calculates the maximum amount of money that can be robbed from houses without alerting the police.

#### Parameters

- `nums`: A vector of integers representing the amount of money in each house.

#### Returns

An integer representing the maximum amount of money that can be robbed.

#### Approach

1. **Initialization:** Initialize two variables `rob` and `norob` to track the maximum amount of money robbed with and without robbing the current house, respectively. Start iterating through the houses.

2. **Iteration:**
   - For each house `nums[i]`, calculate the new values of `norob` and `rob`:
     - Calculate the new value of `norob` (`nr`) by adding the current house's money to the previous `norob`.
     - Calculate the new value of `rob` (`nrob`) as the maximum of the previous `rob` and `norob`.
     - Update `rob` to `nr` and `norob` to `nrob`.

3. **Result:**
   - After iterating through all houses, return the maximum of `rob` and `norob` as the result.

#### Time Complexity
- The time complexity of this method is O(n), where n is the number of houses, as it iterates through each house once.

#### Space Complexity
- This method has a space complexity of O(1), as it only uses a constant amount of extra space for storing variables `rob` and `norob`.
