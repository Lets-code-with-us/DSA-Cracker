class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> resultSet = new ArrayList<>();

        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++){
            if(i==0||(i>0 && nums[i]!=nums[i-1])){
                int target=-nums[i];
                int left=i+1;
                int right=nums.length-1;

                while(left<right){
                    int sum=nums[left]+nums[right];

                    if(sum==target){
                        resultSet.add(Arrays.asList(nums[i],nums[left],nums[right]));

                        while(left <right && nums[left]==nums[left+1]) left++;
                        while(left<right && nums[right]==nums[right-1]) right--;

                        left++;
                        right--;
                    }
                    else if(sum <target){
                        left++;
                    }
                    else{
                        right--;
                    }
                }
            }

        }
        return resultSet;
    }
}
