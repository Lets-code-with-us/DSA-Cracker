# Intuition
The problem involves designing a data structure to store words and efficiently perform searches, where a word may contain '.' as a wildcard character that can match any letter. To achieve this, we can use a trie data structure to store the words. Each node in the trie represents a letter, and the presence of a word is indicated by marking the last node of the word. When searching for a word with '.' characters, we perform a depth-first search through the trie, branching to all possible letters at each '.' character.

# Approach
## TrieNode Class
- Define a TrieNode class representing each node in the trie.
- Each node has an array of TrieNode pointers, one for each lowercase letter, and a boolean flag indicating whether the node represents the end of a word.

## WordDictionary Class
- Implement a WordDictionary class to manage the trie and provide functionality to add words and search for them.
- Use a trie-based approach to store words in the dictionary.
- Implement methods `addWord(word)` to add a word to the dictionary and `search(word)` to search for a word.
- In the `addWord` method, traverse the trie, creating new nodes as needed for each letter of the word.
- In the `search` method, perform a depth-first search through the trie, handling '.' characters by branching to all possible letters.

## searchInNode Helper Function
- Implement a helper function `searchInNode` to perform depth-first search with wildcard matching.
- Recursively traverse the trie, moving to the next character in the word and corresponding trie node.
- If a '.' character is encountered, explore all possible branches by iterating over the children of the current node.

# Complexity Analysis
- Time Complexity:
  - Adding a word: O(n), where n is the length of the word.
  - Searching for a word: O(n), where n is the length of the word.
- Space Complexity:
  - O(m), where m is the total number of characters in all words stored in the trie.
