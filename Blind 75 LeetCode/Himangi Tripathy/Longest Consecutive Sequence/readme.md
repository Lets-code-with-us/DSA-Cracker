class Solution {
    public int longestConsecutive(int[] nums) {
            int ans = 0;//we set ans to 0
    Set<Integer> seen = Arrays.stream(nums).boxed().collect(Collectors.toSet());//we make array stream named seem

    for (int num : nums) {//we traverse 

      if (seen.contains(num - 1))//if seen contains num-1 then
        continue;//continue the loop
      int length = 1;//length is assigned 1
      while (seen.contains(++num))//as long as seen contains ++num then
        ++length;//length is incremented
      ans = Math.max(ans, length);//ans is assigned the maximum value of ans and length
    }

    return ans;//we return ans

        
    }
}