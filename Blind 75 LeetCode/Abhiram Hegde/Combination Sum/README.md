## Explanation of Solution Class

### `combinationSum` Method
- **Input**: `int[] candidates`, `int target`
- **Output**: `List<List<Integer>>`
- **Description**: This method takes an array of integers `candidates` and an integer `target`. It returns a list of all unique combinations of candidates where the chosen numbers sum to the target.
  
### `backtrack` Method
- **Parameters**: `List<List<Integer>> result`, `List<Integer> tempList`, `int[] candidates`, `int remain`, `int start`
- **Description**: This is a helper method for the backtracking algorithm. It recursively explores all possible combinations of candidates to find those that sum up to the target.
  - If `remain` is less than 0, it means the current combination exceeds the target, so the method returns without further exploration.
  - If `remain` equals 0, it means the current combination sums up to the target, so it adds the current combination (`tempList`) to the `result` list.
  - Otherwise, it iterates through the `candidates` array, starting from index `start`. For each candidate, it adds it to `tempList`, reduces `remain` by the candidate's value, and recursively calls `backtrack`. After the recursive call, it removes the last element from `tempList` to backtrack and explore other combinations.

### Example Usage
- The `main` method demonstrates how to use the `Solution` class with example inputs and prints the results.

