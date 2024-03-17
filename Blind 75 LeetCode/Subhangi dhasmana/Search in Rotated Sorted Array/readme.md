# Code Explanation: Search in a sorted array - Python Solution

## Explanation:

- The algorithm initializes two pointers low and high to mark the boundaries of the search range. low starts at the beginning of the array, and high starts at the end of the array.

- It enters a while loop that continues as long as low is less than or equal to high. This loop performs binary search iterations to narrow down the search range.

- Inside the loop, it calculates the mid index as the midpoint of the current search range.

- It checks if the element at the mid index is equal to the target. If it is, it returns the mid index, indicating that the target has been found.

- If the element at the mid index is not equal to the target, the algorithm checks whether the left half or the right half of the current search range is sorted.

- Depending on whether the left or right half is sorted, and the relationship between the target and the elements in the sorted half, the algorithm updates the low or high pointer to narrow down the search range further.

- If the target is not found after the while loop completes, the algorithm returns -1 to indicate that the target is not present in the array.

## Complexity:
- Time Complexity: O(logn)
- Space Complexity: O(1)