# Solution Explanation - Contains Duplicate (Python3)

## Step 1 : Set Creation

`a_set = set()` creates an empty set named `a_set`

(Sets are used to store unique elements efficiently)

## Step 2 : Iteration

`for n in nums:` iterates through each number `n` in the input list `nums`

## Step 3 : Checking for duplicates

`if n in a_set:` checks if the current number `n` is already present in the set `a_set`

If it is, a duplicate has been found, so the method returns True immediately

## Step 4 : Adding to the set

`a_set.add(n)` adds the current number `n` to the set `a_set` if it wasn't already present

## Step 5 : No duplicates found

`return False` is executed only if the loop completes without finding any duplicates, indicating that all elements in the list are unique

## NOTE

Time complexity - O(n)

Space Complexity - O(n)
