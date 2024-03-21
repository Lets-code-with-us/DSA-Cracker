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
