# Intuition
The problem involves searching for words from a given list in a two-dimensional board of characters. We can solve this efficiently using a trie data structure along with a depth-first search (DFS) algorithm. By constructing a trie with the words to search for, we can efficiently traverse the board while checking for valid words at each step.

# Approach
1. **Trie Construction**:
   - Initialize an empty trie root node.
   - Iterate through the given list of words:
     - For each word, traverse the characters and build the corresponding trie nodes, linking them together.
     - Assign the word itself to the trie node representing the end of the word.
   - Return the root node of the constructed trie.

2. **DFS Search**:
   - Initialize an empty result vector to store the found words.
   - Iterate through each cell in the board:
     - Perform a DFS starting from each cell, traversing adjacent cells.
     - During DFS traversal:
       - Check if the current character exists in the trie and move to the corresponding trie node.
       - If a word is found (indicated by a non-empty string in the trie node), add it to the result vector and clear the word in the trie node to avoid duplicates.
       - Mark the visited cell in the board to avoid revisiting.
   - Return the result vector containing the found words.

# Complexity Analysis
- Trie Construction:
  - Time Complexity: O(M), where M is the total number of characters in all words. We iterate through each character of each word to construct the trie.
  - Space Complexity: O(M), the space required to store the trie nodes.

- DFS Search:
  - Time Complexity: O(M * N * 4^L), where M and N are the dimensions of the board, and L is the maximum length of the words. The DFS traversal explores each cell in the board, and at each step, there are at most four directions to explore.
  - Space Complexity: O(L), the space used by the call stack during DFS traversal, where L is the maximum length of the words.
