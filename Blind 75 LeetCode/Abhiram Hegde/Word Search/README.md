## Explanation of the Solution Class

### `exist` Method
- **Input**: 
  - `char[][] board`: 2D array representing the board.
  - `String word`: Word to search for in the board.
- **Output**: 
  - `boolean`: Returns true if the word exists in the board, otherwise false.

1. **Initialization**:
   - Get the number of rows and columns of the board.
2. **Nested Loop**:
   - Iterate over each cell in the board.
   - Check if the current cell matches the first character of the word.
3. **Backtracking**: 
   - If the first character matches, call the `backtrack` method to check if the word can be formed from that cell.
4. **Return**: 
   - If the word is found, return true.
5. If the loop completes without finding the word, return false.

### `backtrack` Method
- **Input**:
  - `char[][] board`: 2D array representing the board.
  - `int row, col`: Current position on the board.
  - `int index`: Current index of the character in the word.
  - `String word`: Word to search for in the board.
- **Output**:
  - `boolean`: Returns true if the word can be formed from the current position, otherwise false.

1. **Base Case**:
   - If the index equals the length of the word, all characters are found, return true.
2. **Boundary Check**:
   - If the current position is out of bounds or doesn't match the character at the current index in the word, return false.
3. **Mark Current Cell**:
   - Mark the current cell as visited by replacing the character with '#' to avoid revisiting it.
4. **Recursive Call**:
   - Recursively call `backtrack` for adjacent cells, incrementing the index in the word.
   - Check neighboring cells (up, down, left, right) recursively.
5. **Restore Board**:
   - After the recursive calls, restore the original character in the current cell.
6. **Return**: 
   - Return whether the word was found from the current position.
