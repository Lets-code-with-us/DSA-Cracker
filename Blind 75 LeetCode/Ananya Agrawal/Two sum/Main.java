class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;// calculate the length of the array
        HashMap<Integer,Integer> map=new HashMap<>();// creating a hashmap
        int[] result=new int[2];
        for(int i=0;i<n;i++){
            if(map.containsKey(target-nums[i])){
                result[1]=i;
                result[0]=map.get(target-nums[i]);
                return result;
            }
            map.put(nums[i],i);

        }

        return result;
    }
}
