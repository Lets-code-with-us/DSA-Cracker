# Word Search Problem

## Problem Statement
Given a 2D board of characters and a word, determine if the word exists in the grid. The word can be constructed from letters of sequentially adjacent cells, where "adjacent" cells are horizontally or vertically neighboring. The same letter cell may not be used more than once in the word.

## Intuition
This problem can be efficiently solved using backtracking. We start from each cell of the board and explore all its neighboring cells to check if the word can be formed from that starting cell. We mark visited cells to avoid revisiting them in the current exploration path.

## Approach
1. Iterate through each cell of the board.
2. For each cell, perform a depth-first search (DFS) to explore all possible paths to find the word.
3. Maintain a boolean array to keep track of visited cells.
4. During the DFS, check if the current cell matches the next character in the word and if it's within the boundaries of the board.
5. If a valid match is found, mark the cell as visited and recursively search in its neighboring cells for the next character.
6. If the word is found starting from any cell, return true; otherwise, return false after exploring all cells.
7. Time complexity: O(N * M * 4^L), where N and M are the dimensions of the board and L is the length of the word. This complexity arises from the fact that each cell can be visited up to four times in the worst case (up, down, left, right) during the DFS search, and there are N * M starting positions.
