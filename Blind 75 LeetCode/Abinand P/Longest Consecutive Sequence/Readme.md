## Class: Solution

This class contains a method `longestConsecutive()` to find the length of the longest consecutive sequence in a given vector of integers.

### Method: `longestConsecutive`

Finds the length of the longest consecutive sequence in the given vector of integers.

#### Parameters

- `nums`: A vector of integers representing the input numbers.

#### Returns

An integer representing the length of the longest consecutive sequence.

#### Approach

1. **Create HashSet:**
   - Convert the input vector `nums` into an unordered set to remove duplicates and enable constant-time lookup.
2. **Iterate Through Numbers:**
   - Iterate through each number in the set.
3. **Check for Sequence Start:**
   - For each number `num`, if `num - 1` is not present in the set, it indicates the start of a sequence.
4. **Find Sequence Length:**
   - Starting from `num`, increment the current number `currentNum` and keep track of the sequence length `lengthSeq` until `currentNum + 1` is present in the set.
5. **Update Maximum Length:**
   - Update the maximum sequence length `maxSeq` with the maximum value between the current sequence length `lengthSeq` and the existing maximum sequence length.
6. **Return Result:**
   - Return the maximum sequence length `maxSeq`.

#### Time Complexity
- The time complexity of this method is O(n), where n is the number of elements in the input vector `nums`. 
  - Converting the vector into a set takes O(n) time.
  - The loop iterates through the elements in the set, and within the loop, each element is checked and possibly visited once, leading to O(n) complexity overall.

#### Space Complexity
- The space complexity of this method is O(n), where n is the number of elements in the input vector `nums`. 
  - The unordered set stores all unique elements from the input vector, potentially requiring additional space proportional to the number of elements in `nums`.
