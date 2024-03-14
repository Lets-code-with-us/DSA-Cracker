### Explanation

The `wordBreak` method takes a string `s` and a list of strings `wordDict` as input and returns a boolean value indicating whether `s` can be segmented into words from `wordDict`.

1. **Initialization**:
   - Create a HashSet `wordSet` containing all words from `wordDict`.
   - Initialize a boolean array `dp` of size `s.length() + 1`. `dp[i]` will be `true` if the substring `s[0:i]` can be segmented into words from `wordDict`.
   - Set `dp[0] = true` since an empty string can always be segmented into words from `wordDict`.

2. **Dynamic Programming**:
   - Iterate over each index `i` from `1` to `s.length()`:
     - For each index `i`, iterate over each index `j` from `0` to `i`:
       - If `dp[j]` is `true` (meaning the substring `s[0:j]` can be segmented) and the substring `s[j:i]` is present in `wordSet`, set `dp[i] = true`.
       - Break out of the inner loop if a segmentation is found for the current `i`.

3. **Return**:
   - Return `dp[s.length()]`, which indicates whether the entire string `s` can be segmented into words from `wordDict`.
