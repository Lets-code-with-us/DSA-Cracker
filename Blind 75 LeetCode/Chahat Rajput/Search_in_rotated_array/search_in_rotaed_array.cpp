class Solution {
public:
    int search(vector<int>& nums, int target) {
        int start=0,end=nums.size()-1;
        while(start<=end){
           int mid=(start+end)/2;
           if(nums[mid]==target)
           {return mid;}
           //left part sorted he
           if(nums[start]<=nums[mid]){
            if(target<nums[mid] && target>=nums[start]){
                end=mid-1;   
            }
            else{
                start=mid+1;
            }
           }
           //right part sorted he
           else{
           if(target>nums[mid] && target <=nums[end]){
               start=mid+1;
           }
            else{
                end=mid-1;
            }
        }
        }
        return -1;
    }
};