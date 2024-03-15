### Longest Consecutive Sequence

This Java code finds the length of the longest consecutive sequence of integers in an array `nums`.

#### Algorithm Explanation:

1. **Set Initialization:** Create a HashSet `numSet` to store unique numbers from the array `nums`.

2. **Loop through Array:**
   - Iterate through each element `num` in the `nums` array.
   - Add each element to the `numSet`.

3. **Find Longest Consecutive Sequence:**
   - Initialize a variable `longest` to store the length of the longest consecutive sequence found.
   - Iterate through each element `num` in the `numSet`.
     - Check if `num - 1` is not present in `numSet`. If not, it means `num` is the start of a new consecutive sequence.
     - If `num - 1` is not present, initialize `currentNum` with `num` and set `currentLength` to `1`.
     - While `currentNum + 1` is present in `numSet`, increment `currentNum` and `currentLength` to count consecutive elements.
     - Update `longest` with the maximum value between `longest` and `currentLength`.
   - Repeat this process for all elements in `numSet`.

4. **Return Longest Consecutive Sequence Length:** Return the value stored in `longest`.

#### Time Complexity:
- The time complexity of this algorithm is O(n), where n is the number of elements in the input array `nums`.
  - The initial loop to add elements to `numSet` takes O(n).
  - The second loop to find the longest consecutive sequence also takes O(n), but with constant time operations inside the loop.

#### Space Complexity:
- The space complexity of this algorithm is O(n), where n is the number of elements in the input array `nums`.
  - Additional space is used to store unique elements in the `numSet`.
