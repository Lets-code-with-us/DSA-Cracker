**Longest Consecutive Sequence**

**Problem:**

Given an unsorted integer array `nums`, find the length of the longest consecutive sequence of elements present in the array.

**Steps:**

1. **Handle Empty Input:** If `nums` is null or empty, return 0 (no consecutive sequence).

2. **Create a HashSet:** Create a `HashSet` named `set` to store unique elements from the input array. This allows for efficient lookups to check if a number exists in the set.

3. **Add Elements to HashSet:** Iterate through the `nums` array and add each element (`num`) to the `set`.

4. **Initialize Variables:**
   - `longestStreak`: An integer variable initialized to 0 to track the length of the longest consecutive sequence found so far.

5. **Iterate through the Set:** Iterate through the `set` again (using a `for` loop with elements from `set`).

6. **Check for Sequence Start:** For each number (`num`) in the `set`:
   - If `set` does not contain `num - 1` (the number before the current number), it implies `num` is the starting element of a potential consecutive sequence.

7. **Expand the Sequence:**
   - Initialize `currentNum` to the current number (`num`).
   - Initialize `currentStreak` to 1, representing the current sequence length (starting with `num`).
   - Use a `while` loop to keep expanding the sequence as long as `set` contains the next consecutive number (`currentNum + 1`).
     - Inside the loop:
       - Increment `currentNum` to move to the next number in the sequence.
       - Increment `currentStreak` to update the current sequence length.

8. **Update Longest Streak:** After exploring the sequence starting from `num`, compare the `currentStreak` with the `longestStreak`. Update `longestStreak` to hold the larger value, effectively keeping track of the longest sequence found so far.

9. **Return Result:** Finally, return the `longestStreak` variable, which represents the length of the longest consecutive sequence in the input array.

**Explanation:**

1. The code first handles empty input scenarios.
2. It utilizes a `HashSet` for efficient lookups to determine if consecutive numbers exist in the array.
3. By iterating through the `set` (containing unique elements), the code ensures each potential starting point of a sequence is considered.
4. The `while` loop within the main loop efficiently expands the sequence as long as consecutive elements are found in the `set`.
5. The `longestStreak` variable is updated to track the maximum sequence length encountered during the exploration.

**Time Complexity:**

O(N), where N is the length of the input array `nums`. This is because the code iterates through the set (which has at most N unique elements) and performs constant-time lookups in the hash set.
