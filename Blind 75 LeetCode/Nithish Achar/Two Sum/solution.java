class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer>map = new HashMap();
    
        // fill the HM
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],i);
        }
        //searching
        for((int i=0;i<nums.length;i++)
        int num= num[i];
        int rem=target-num;
        if(map.containsKey(rem)){
            int index=map.get(rem);
            if (index==i)Continue;
            return new int[]{i,index};
    }
}
return new int[]{};
}
