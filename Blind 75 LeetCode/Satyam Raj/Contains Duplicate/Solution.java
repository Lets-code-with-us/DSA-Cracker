class Solution {
    public boolean containsDuplicate(int[] nums) {
		// HashMap to store the value and its freq 
        HashMap<Integer, Integer> map = new HashMap<>();
        int val = 1;
		// loop to nums array
        for(int i : nums) {
			// if i already exists in nums array
            if(map.containsKey(i)) {
                return true;
            }
            map.put(i, val);
        }
		// if not then return false
        return false;
    }
}