# Code Explanation: 3 Sum - Python Solution

## Explanation:

- Sort the input array nums. Sorting helps in avoiding duplicates and makes it easier to handle the array.
- Iterate through each element nums[i] of the array: If i > 0 and the current element is the same as the previous one, skip it to avoid duplicate triplets.
- Initialize two pointers j and k to the next element and the last element respectively.
- Use the two-pointer technique within the remaining part of the array (j < k):
- Calculate the sum totSum of the triplet (nums[i], nums[j], nums[k]).
- If totSum is less than zero, increment j.
- If totSum is greater than zero, decrement k.
- If totSum is zero, append the triplet [nums[i], nums[j], nums[k]] to the result ans.
- Increment j and decrement k.
- Skip duplicate elements by incrementing j or decrementing k while they are equal to their previous elements.
- Return the result ans.

## Complexity:
- Time Complexity: O(n^2)
- Space Complexity: O(1)