class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> numSet=new HashSet<>();
        for(int num:nums){
            numSet.add(num);
        }
        int longest=0;
        for(int num:numSet){
            if(!numSet.contains(num-1)){
                int currentNum=num;
                int currentLength=1;
                while(numSet.contains(currentNum+1)){
                    currentNum++;
                    currentLength++;
                }
                longest=Math.max(longest,currentLength);
            }
        }
        return longest;
    }
}
