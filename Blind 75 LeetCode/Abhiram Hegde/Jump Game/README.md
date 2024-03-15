## Explanation of canJump function

### Algorithm:
1. Initialize `maxReach` to 0. This variable represents the maximum index that can be reached so far.
2. Iterate through the array `nums`:
    a. If the current index `i` is greater than `maxReach`, it means the current index is not reachable from the previous indices, so return `false`.
    b. Update `maxReach` to be the maximum of its current value and `i + nums[i]`, which represents the farthest index that can be reached from the current index `i`.
    c. If `maxReach` reaches or exceeds the last index of the array, return `true` because the last index is reachable.
3. If the loop completes without returning `true`, return `false` because the last index is not reachable.

### Time Complexity:
- The time complexity of this algorithm is O(n), where n is the length of the input array `nums`. This is because the algorithm iterates through the array only once.

### Space Complexity:
- The space complexity of this algorithm is O(1) because it uses only a constant amount of extra space regardless of the input size.
