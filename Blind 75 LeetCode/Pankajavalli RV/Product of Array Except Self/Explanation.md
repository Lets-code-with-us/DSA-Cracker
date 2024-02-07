# Solution Explanation - Product of Array Except Self (Python3)

## Step 1 : Initialization

prefix = [1]: Defines an empty list prefix and initializes it with a single element 1. This list will ultimately store the product of elements from the beginning of the list up to each index.

postfix = [1]: Similarly, creates another list postfix with a single element 1 to store the product of elements from the end of the list to each index.

res = []: Creates an empty list res to store the final result, which will have the same length as nums

## Step 2 : Building Prefix and Postfix Products

for i in range(0, len(nums)): Iterates through each index i of the list nums from the beginning.

val = prefix[-1] * nums[i]: Calculates the product of the last element in prefix (representing the product of elements before i) and the current element nums[i].

prefix.append(val): Appends the calculated product val to the prefix list, effectively building the product of elements up to each index.
for i in range(len(nums) - 1, -1, -1): Similarly iterates through all indices i of nums but from the end to the beginning.

val = nums[i] * postfix[0]: Calculates the product of the current element nums[i] and the first element in postfix (representing the product of elements after i).

postfix = [val] + postfix: Prepends the calculated product val to the postfix list, building the product of elements from the end to each index.

## Step 3 : Calculating final results

for i in range(0, len(nums)): Iterates through each index i of nums again.

lst.append(prefix[i] * postfix[i+1]): Calculates the product of the corresponding element in prefix (product before i) and the element at i+1 in postfix (product after i+1), effectively finding the product of all elements except nums[i].

append adds this final product to the res list.

## Step 4 : Returning the result

return res: Returns the final list lst containing the product of all elements except the corresponding element in the original list nums

## NOTE

Time complexity - O(n)

Space Complexity - O(n)
