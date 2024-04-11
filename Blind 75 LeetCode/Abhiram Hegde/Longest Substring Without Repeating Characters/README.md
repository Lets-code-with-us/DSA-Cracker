# Explanation of Solution class

## Method: lengthOfLongestSubstring

### Parameters:
- `String s`: Input string for which the length of the longest substring without repeating characters needs to be found.

### Returns:
- `int`: Length of the longest substring without repeating characters.

### Code Explanation:
1. Initialize a HashMap named `charIndexMap` to store characters and their corresponding indices.
2. Initialize variables `start` to 0 and `maxLength` to 0.
3. Iterate through the characters of the input string `s` using a for loop.
4. Inside the loop:
    a. Get the character at index `i` of the string `s`.
    b. Check if the character exists in the `charIndexMap` and its index is greater than or equal to `start`.
    c. If the above condition is true, update the `start` to the index of the character in the `charIndexMap` plus 1. This ensures that the substring doesn't contain any repeating characters.
    d. Update the `maxLength` by taking the maximum of its current value and the length of the current substring (i - start + 1).
    e. Put the character and its index `i` into the `charIndexMap`.
5. Return the `maxLength` as the result.

### Time Complexity:
- The time complexity of this solution is O(n), where n is the length of the input string `s`. This is because we only iterate through the string once.
