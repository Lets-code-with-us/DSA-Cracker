# Code Explanation: Word break - Python Solution

## Explanation:

- The wordBreak function aims to determine if a given string s can be segmented into space-separated sequences such that each sequence is a valid word according to the provided wordDict (a list of valid words). It utilizes a recursive helper function construct to achieve this.

- The construct function recursively explores all possible segmentations of the input string current. It checks if current can be broken down into words from the wordDict. It does this by iterating through each word in wordDict and checking if it matches the beginning of current. If a match is found, it recursively calls itself with the remaining part of current. If the remaining part can be segmented into words, it returns True, indicating that the entire current string can be segmented. It memoizes the results to optimize performance by avoiding redundant computations.

## Complexity:
- Time Complexity: O(n^2*m)
- Space Complexity: O(n)