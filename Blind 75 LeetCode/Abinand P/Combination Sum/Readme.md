# Combination Sum

## Class: Solution

This class contains a method `combinationSum()` to find all unique combinations in `candidates` where the candidate numbers sum up to `target`.

### Method: `combinationSum`

Finds all unique combinations in the `candidates` vector where the candidate numbers sum up to `target`.

#### Parameters

- `candidates`: A vector of integers representing the candidate numbers.
- `target`: An integer representing the target sum.

#### Returns

A 2D vector of integers representing all unique combinations where the candidate numbers sum up to `target`.

### Helper Function: `findcombinations`

This function recursively finds all combinations of candidate numbers that sum up to the given `target`.

#### Parameters

- `ind`: An integer representing the current index of the `candidates` vector.
- `target`: An integer representing the remaining target sum to achieve.
- `arr`: A reference to the `candidates` vector.
- `ans`: A reference to the vector of vectors to store the resulting combinations.
- `ds`: A reference to the vector to store the current combination being explored.

#### Base Condition

- If `ind` equals the size of the `arr` vector, meaning all elements have been processed:
  - If `target` is zero, meaning the target sum has been achieved, add the current combination `ds` to `ans`.
  - Return to exit the current recursive call.

#### Recursive Steps

1. **When the Element is Picked:**
   - If the current element `arr[ind]` is less than or equal to the remaining `target`:
     - Add `arr[ind]` to the current combination `ds`.
     - Recur with `ind` unchanged and `target` reduced by `arr[ind]`.
     - After the recursive call, remove the last element from `ds` to backtrack.

2. **When the Element is Not Picked:**
   - Recur with `ind` incremented by 1 and `target` unchanged.

#### Result
- Return the `ans` vector containing all unique combinations of candidate numbers that sum up to the given `target`.

The approach efficiently finds all unique combinations of candidate numbers from the `candidates` vector that sum up to the given `target` using backtracking and recursion.
