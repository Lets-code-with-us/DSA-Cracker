## Function: sequentialDigits

This function generates all sequential digits between two given integers `low` and `high`.

### Parameters

- `low`: An integer representing the lower bound of the range.
- `high`: An integer representing the upper bound of the range.

### Returns

A slice of integers containing all sequential digits within the range [`low`, `high`], sorted in ascending order.

### Approach

1. **Initialize Variables:**
   - Initialize `resl` as an empty slice of integers to store the result.
   - Calculate the number of digits in `low` and `high` and store them in `dl` and `dh`, respectively.
   - Initialize an empty map `ans` to store unique sequential digits.

2. **Generate Sequential Digits:**
   - Iterate from 0 to 8 (inclusive) to consider each possible starting digit.
   - Call the helper function `helper` to generate sequential digits starting from the current digit.

3. **Helper Function:**
   - The helper function recursively generates sequential digits starting from the current digit (`curr`) within the specified range.
   - If the current digit is within the range and not already present in `ans`, add it to `ans`.
   - If the last digit of the current number is 9, return.
   - Recursively call the helper function with the next sequential digit.

4. **Construct Result:**
   - Convert the keys of `ans` into a slice of integers and append them to `resl`.
   - Sort `resl` in ascending order.

5. **Return Result:**
   - Return the sorted slice `resl`.

### Time Complexity
- The time complexity of this function is \(O(1)\) because the number of possible sequential digits is fixed and small (only 9 digits).

### Space Complexity
- The space complexity of this function is \(O(1)\) because the space used by the result and the auxiliary map is not proportional to the input size.
