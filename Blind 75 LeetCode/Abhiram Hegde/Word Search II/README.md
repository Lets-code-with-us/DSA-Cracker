**Class: TrieNode**

* TrieNode is a class that represents a node in a trie data structure.
* It has two attributes:
    * `children`: An array of 26 TrieNode objects, representing the children of the current node. Each index in the array corresponds to a letter in the alphabet (a-z).
    * `word`: A string that stores the entire word if the current node is the end of a word in the trie.

**Method: buildTrie**

* This method builds a trie data structure from a list of words.
* It creates a new TrieNode object as the root of the trie.
* For each word in the input list, it inserts the word into the trie character by character.
* While inserting a word, it traverses the trie from the root node.
* For each character in the word, it creates a new TrieNode object if a child node does not already exist for that character.
* Finally, it sets the `word` attribute of the last node in the path to the current word.

**Method: search**

* This method performs a depth-first search on the trie to find words in the board.
* It takes the following arguments:
    * `board`: A 2D list of characters representing the board.
    * `i`: The current row index.
    * `j`: The current column index.
    * `node`: The current node in the trie.
    * `result`: A list to store the found words.
* The base case of the recursion is when the current index is out of bounds or the character at the current index is '$' (indicating a visited cell) or there is no child node in the trie for the character at the current index.
* If the current character matches a child node in the trie, it continues the search recursively in four directions (up, down, left, and right) from the current cell.
* Before exploring each direction, it marks the current cell as visited by setting the character to '$'.
* If the word attribute of the current node in the trie is not None, it means that the current path in the trie corresponds to a complete word found in the board. It adds the word to the result list and sets the word attribute to None to avoid finding the same word multiple times.
* After exploring all four directions, it backtracks by setting the character back to its original value.

**Method: findWords**

* This method is the main function of the program.
* It takes the board and a list of words as input.
* It creates a trie from the list of words using the `buildTrie` method.
* It iterates through all cells of the board and calls the `search` method for each cell to start the search for words.
* Finally, it returns the list of words found in the board.

**Time Complexity**

* The time complexity of the `findWords` method depends on the size of the board, the number of words, and the length of the words.
* In the worst case, the time complexity can be O(mn * 4^wl), where:
    * m is the number of rows in the board.
    * n is the number of columns in the board.
    * w is the maximum length of a word in the list.
    * l is the average length of a word in the list.
* This is because the search function can potentially explore all paths in the trie for each cell in the board.

**Space Complexity**

* The space complexity of the algorithm is mainly dominated by the trie data structure.
* In the worst case, the trie can contain up to 26 * wl nodes (one for each character in the alphabet for each word in the list, with a maximum length of l).
* Therefore, the space complexity can be O(wl).
