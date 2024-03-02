### Approach
+ The given code implements binary search to efficiently find the insertion point of the target in the sorted array. The binary search algorithm compares the target with the middle element of the array and narrows down the search range by adjusting the start and end indices.

+ If the target is less than the middle element, the search range is adjusted to the left half.
+ If the target is greater than the middle element, the search range is adjusted to the right half.
+ If the target is equal to the middle element, the index of the middle element is returned.
+ The loop continues until the start index is greater than the end index. At this point, the start index represents the insertion point for the target.

### Complexity
+ Time complexity: O(log n) - Binary search reduces the search space by half in each iteration, resulting in a logarithmic time complexity.
+ Space complexity: O(1) - The algorithm uses a constant amount of extra space regardless of the input size.
### Screenshot
![image](https://github.com/dhruvabhat24/DSA-Cracker-/assets/122305929/419b17c1-0872-453c-af7e-dd42f938be2a)
