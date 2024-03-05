## Word Break (Dynamic Programming)

This code implements a dynamic programming solution to determine if a string (`s`) can be segmented into words from a given dictionary (`wordDict`).

**Explanation:**

1. **Input:**
   - `s`: The input string to be segmented.
   - `wordDict`: A list containing the allowed words for segmentation.

2. **`dp` Array:**
   - A boolean array `dp` of size `n + 1` is created (`n` is the length of `s`).
   - `dp[i]` will be `true` if the substring of `s` ending at index `i` can be formed by segmenting words from the dictionary.

3. **Base Case:**
   - `dp[0]` is set to `true` because an empty string can always be segmented.

4. **Dynamic Programming Iteration:**
   - Uses nested loops to build the `dp` array:
     - Outer loop (`i`): iterates through all possible substring lengths (1 to `n`).
     - Inner loop (`j`): iterates through all possible starting indices for substrings ending at `i` (0 to `i - 1`). 
   - Checks two conditions for `dp[i]`:
     - `dp[j]` is `true`: The substring ending at index `j` can be segmented (based on previous calculations).
     - The substring from `j` to `i` (`s.substring(j, i)`) is present in the dictionary (`wordDict.contains(...)`).
   - If both conditions hold, it means the substring ending at `i` can be formed by combining the segmented substring ending at `j` with the current word. Hence, `dp[i]` is set to `true`.
   - The inner loop breaks as soon as a valid segmentation is found for `i` (optimization).

5. **Result:**
   - After iterating through all substrings, `dp[n]` represents whether the entire string `s` can be segmented.
   - The function returns `dp[n]`.

**Complexity:**

- Time Complexity: O(n^2 * m) due to nested loops and potential dictionary lookups within the inner loop (m is the average word length).
- Space Complexity: O(n) for the `dp` array.

**Note:** This approach assumes non-empty words in the dictionary. 
