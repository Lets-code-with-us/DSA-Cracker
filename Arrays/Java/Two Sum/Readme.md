# Two Sum Problem

Given an array of integers `nums` and an integer `target`, return the indices of the two numbers such that they add up to the target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

## Examples:

### Example 1:
```plaintext
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
```
### Example 2
```plaintext
Input: nums = [3,2,4], target = 6
Output: [1,2]
```
### Example 3
```plaintext
Input: nums = [3,3], target = 6
Output: [0,1]
```
## Constraints:
- `2 <= nums.length <= 10^4`
- `-10^9 <= nums[i] <= 10^9`
- `-10^9 <= target <= 10^9`
- Only one valid answer exists.

# Two Sum - Java Code Explanation

The given Java code solves the Two Sum problem using a HashMap.

## Explanation:

### HashMap Initialization:
- A `HashMap` named `numMap` is initialized to store numbers and their indices.

### Iterating through Numbers:
- The code iterates through the array of numbers (`nums`).

### Complement Calculation:
- For each number, it calculates the complement needed to reach the target (`target - nums[i]`).

### Checking for Complement in HashMap:
- It checks if the complement is already present in the `numMap`.
- If found, it returns the indices of the two numbers that sum up to the target.

### Storing Numbers in HashMap:
- If the complement is not found, it stores the current number and its index in the `numMap`.

### Returning Result:
- If no solution is found during the iteration, it returns an empty array (`new int[] {}`).
