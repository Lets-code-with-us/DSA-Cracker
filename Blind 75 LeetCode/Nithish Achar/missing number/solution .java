public class Solution {
    public int missingNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int n = nums.length + 1; // Assuming missing number is within range [0, n-1]
        for (int i = 0; i < n; i++) {
            set.add(i);
        }
        for (int num : nums) {
            if (!set.contains(num)) {
                return num;
            }
            set.remove(num); // Remove encountered numbers to find the missing one
        }
        return -1; // Shouldn't reach here (indicates invalid input)
    }
}
