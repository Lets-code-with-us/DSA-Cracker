class Solution {
  public boolean canJump(int[] nums) {
    int reachable = 0; // Keeps track of the furthest reachable index

    for (int i = 0; i < nums.length; i++) {
      if (i > reachable) return false; // If current index is beyond reachable, no path exists

      reachable = Math.max(reachable, i + nums[i]); // Update reachable to the furthest possible index based on current index and jump distance
    }

    return true; // If loop completes, reachable index reaches the last element (can jump to the end)
  }
}

**Explanation:**

This code implements a greedy approach to determine if you can jump to the end of an array (`nums`). Here's a breakdown of the logic:

1. **`reachable` Variable:** A variable `reachable` is initialized to 0, representing the starting index (index 0). It keeps track of the furthest index we can reach based on the jumps encountered so far.

2. **Iteration:** The code iterates through each element (`nums[i]`) in the array.

3. **Checking Reachability:** It checks if the current index `i` is greater than `reachable`. If it is, it means we can't reach the current index from any previous element with our current jump abilities. In this case, there's no path to the end, so the function returns `false`.

4. **Updating Reachable Index:** If the current index is reachable, the code updates `reachable` to the furthest possible index based on:
   - Current index `i`
   - Jump distance from the current element (`nums[i]`)
   - `Math.max` ensures `reachable` always points to the furthest reachable position.

5. **Final Result:** After iterating through the entire array, if the loop completes without returning `false`, it signifies `reachable` has reached the last element (`nums.length - 1`). This indicates a path exists to jump to the end, so the function returns `true`.
