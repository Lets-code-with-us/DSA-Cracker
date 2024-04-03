import java.util.HashSet;

class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums == null || nums.length == 0)
            return 0;
        
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num); // Add all numbers to the set
        }
        
        int longestStreak = 0;
        
        for (int num : nums) {
            if (!set.contains(num - 1)) { // Check if current number is the start of a sequence
                int currentNum = num;
                int currentStreak = 1;
                
                while (set.contains(currentNum + 1)) { // Expand the sequence
                    currentNum++;
                    currentStreak++;
                }
                
                longestStreak = Math.max(longestStreak, currentStreak);
            }
        }
        
        return longestStreak;
    }
}
