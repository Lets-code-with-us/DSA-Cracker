# Solution Explanation - Two Sum (Python3)

## Step 1 : Creating a Dictionary/HashMap

`a = {}` creating an empty dictionary/HashMap

`for i,n in enumerate(nums):` Iterates through each number `n` and its index `i` in the nums list

`a[n] = i` Maps each number `n` to its corresponding index `i` in the dictionary `a`. This allows for efficient lookup of indices based on   values

## Sterp 2 : Finding the pair

`for i, n in enumerate(nums):` Iterates through the nums list again

`diff = target - n` Calculates the difference needed to reach the target sum

`if diff in a and a[diff] != i:` 

Checks if :

The difference `diff` exists as a key in the dictionary `a` (meaning its complement is present in the list)

The index of `diff` is not the same as the current index `i` (to avoid using the same number twice)

If both conditions are true, it means a pair has been found

`return [i, a[diff]]` Returns a list containing the indices of the two numbers that add up to the target

## Step 3 : Handling no pair

`return []` If no pair is found after iterating through the entire list, an empty list is returned, indicating that no such pair exists.

## NOTE :
Time Complexity - O(n) 

Space Complexity  - O(n)
