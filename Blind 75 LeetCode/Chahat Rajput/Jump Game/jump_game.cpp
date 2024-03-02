class Solution {
public:
    bool canJump(vector<int>& nums) {
    /*tab tak jump krte rho jab tak last element per na pohonch jao through element in array    */
        int reachable=0;//kintne steps ek elem ke acc hm last tak ponhc jayege
        for(int i=0;i<nums.size();i++){
            //if my reachble is still and i is increasing jhol he last ele nhi phonch skte
            if(reachable <i){
                return false;
            }

            reachable=max(reachable,i+nums[i]);//steps reachle me dal do
            /*Ex:
            2 3 1 1 4
            0 1 2 3 4
            reachable=max(reachable,i+nums[i])

            max(0,0+2)=>2
            vese bhi hm 2 steps age ja skte he and index 2 per hm agye which is 1

            max(1,1+3)=>4 now we reach at our desired element return true
            */
        }
    return true;
    }
};