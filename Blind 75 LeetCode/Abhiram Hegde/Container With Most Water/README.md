## Approach
To solve this problem efficiently, we can use the two-pointer approach. Here's how it works:
1. Initialize two pointers `left` and `right` at the beginning and end of the array respectively.
2. Use a variable `maxArea` to keep track of the maximum area found so far, initialized to 0.
3. Iterate while `left` is less than `right`.
   - Calculate the width of the container as `right - left`.
   - Calculate the height of the container as the minimum of `height[left]` and `height[right]`.
   - Calculate the area of the container as `width * height`.
   - Update `maxArea` if the calculated area is greater.
   - Move the pointer corresponding to the smaller height towards the center.
4. Return `maxArea`.
