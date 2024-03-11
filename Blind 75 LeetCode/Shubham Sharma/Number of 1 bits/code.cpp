class Solution {
public:
    int hammingWeight(uint32_t n) {
        int count=0;
        while(n>0){
            //if there is 1 present in the right most digit of binary number 
             if(n&1==1){
                 count++;
             }
            n=n>>1;  //right shift 
        }
        return count;
    }
};
