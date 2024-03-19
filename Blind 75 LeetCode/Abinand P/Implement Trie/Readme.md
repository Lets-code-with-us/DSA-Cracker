## Class: TrieNode

This class represents a node in a trie data structure.

### Properties

- `children`: An unordered map storing child nodes corresponding to characters.
- `isEndOfWord`: A boolean indicating whether the node represents the end of a word.

### Constructor

- Initializes the `isEndOfWord` property to `false`.

## Class: Trie

This class implements a trie data structure for efficient string storage and retrieval.

### Properties

- `root`: A pointer to the root node of the trie.

### Constructor

- Initializes the `root` property with a new `TrieNode` object.

### Methods

#### `insert`

Inserts a word into the trie.

##### Parameters

- `word`: A string representing the word to be inserted into the trie.

##### Implementation

- Traverses the trie character by character.
- If a character's corresponding child node does not exist, creates a new node for it.
- Updates the `isEndOfWord` property of the last node in the word to `true`.

#### `search`

Searches for a word in the trie.

##### Parameters

- `word`: A string representing the word to search for in the trie.

##### Returns

- `true` if the word is found in the trie, `false` otherwise.

##### Implementation

- Traverses the trie character by character.
- If at any point a character's corresponding child node does not exist, returns `false`.
- After traversing the entire word, checks if the last node's `isEndOfWord` property is `true`.

#### `startsWith`

Checks if there is any word in the trie that starts with the given prefix.

##### Parameters

- `prefix`: A string representing the prefix to check for.

##### Returns

- `true` if there exists any word in the trie that starts with the given prefix, `false` otherwise.

##### Implementation

- Traverses the trie character by character.
- If at any point a character's corresponding child node does not exist, returns `false`.
- After traversing the entire prefix, returns `true`.

