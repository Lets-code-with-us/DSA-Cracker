### Code Explanation

1. Create a HashSet to store unique elements.
2. Iterate through each element `num` in the input array `nums`.
    - Check if the HashSet already contains the current element `num`.
        - If it does, return `true` because a duplicate has been found.
    - If not, add the current element `num` to the HashSet.
3. If the loop completes without finding any duplicates, return `false`.

### Time Complexity
- The time complexity of this solution is O(n), where n is the number of elements in the input array `nums`. This is because we iterate through the array once.

### Space Complexity
- The space complexity is also O(n) in the worst case, where n is the number of elements in the input array `nums`. This is because in the worst case, we may need to store all elements of `nums` in the HashSet.
