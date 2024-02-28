# Word Break

## Class: Solution

This class contains a method `wordBreak()` to determine if a given string `s` can be segmented into space-separated sequences to form a valid sentence, using words from a dictionary `wordDict`.

### Method: `wordBreak`

Determines whether the string `s` can be segmented into space-separated sequences to form a valid sentence, using words from the dictionary `wordDict`.

#### Parameters

- `s`: A string representing the input string to be segmented.
- `wordDict`: A vector of strings representing the words in the dictionary.

#### Returns

A boolean value indicating whether the string `s` can be segmented into space-separated sequences to form a valid sentence using words from `wordDict`.

### Approach

The `wordBreak()` method utilizes dynamic programming to determine whether the input string `s` can be segmented into space-separated sequences to form a valid sentence using words from the dictionary `wordDict`.

1. **Dynamic Programming (DP):**
   - Initialize a DP array `dp` of size `n + 1`, where `n` is the length of the input string `s`.
   - Set `dp[n]` to `true`, indicating that an empty string is valid.
   - Convert the `wordDict` vector into an unordered set `wordSet` for efficient word lookup.

2. **Bottom-Up DP:**
   - Iterate over the characters of the input string `s` from right to left.
   - For each index `i` in the input string:
     - Check if any word in the `wordDict` can be formed starting from index `i`.
     - If a word in the `wordDict` can be formed and the substring from index `i` to `i + word.length()` is valid (i.e., `dp[i + word.length()]` is `true`), set `dp[i]` to `true` and break out of the loop.

3. **Result:**
   - Return the value of `dp[0]`, which indicates whether the entire string `s` can be segmented into space-separated sequences to form a valid sentence.

The approach efficiently determines whether the input string `s` can be segmented into space-separated sequences to form a valid sentence using words from the dictionary `wordDict` with a time complexity of O(n^2), where n is the length of the input string `s`.
