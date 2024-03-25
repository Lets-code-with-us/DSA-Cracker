# WordDictionary Class Explanation

The `WordDictionary` class provides methods to add words to a trie data structure and search for words, supporting wildcard '.' characters.

## WordDictionary Class

### Fields
- `root`: A reference to the root node of the trie.

### Constructor
- `WordDictionary()`: Initializes the `WordDictionary` object by creating a new trie node and setting it as the root.

### Methods

#### `addWord(String word)`
- Adds a word to the trie.
- Iterates through each character of the word.
- If the character is not present in the trie, it creates a new trie node for that character.
- Marks the last node as the end of the word.

#### `search(String word)`
- Searches for a word in the trie.
- Calls a helper method `searchHelper()` to perform the search recursively.
- Returns true if the word is found in the trie, otherwise false.

#### `searchHelper(String word, int index, TrieNode node)`
- A recursive helper method for the `search()` method.
- Checks each character of the word recursively against the trie nodes.
- Supports wildcard '.' characters, which match any character.
- Returns true if the word is found in the trie, otherwise false.

## TrieNode Class

### Fields
- `children`: A map to store child nodes, where the key is the character and the value is the child node.
- `isEndOfWord`: A boolean flag to indicate if the node marks the end of a word.

### Constructor
- `TrieNode()`: Initializes a trie node with an empty map for children and sets `isEndOfWord` to false.

