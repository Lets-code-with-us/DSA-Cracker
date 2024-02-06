class Solution {
    public int[] twoSum(int[] nums, int target) {
        // create a map to store the index with the number
        Map<Integer, Integer> map = new HashMap<>();

        // loop till end of array
        for(int i=0; i<nums.length; i++) {

            // we are searching for the number  ---> (target - nums[i])
            if(map.containsKey(target - nums[i])) {
                return new int[] {map.get(target - nums[i]), i};
            }
            // put the current number with index
            map.put(nums[i], i);
        }
        return new int[] {-1};
    }
}