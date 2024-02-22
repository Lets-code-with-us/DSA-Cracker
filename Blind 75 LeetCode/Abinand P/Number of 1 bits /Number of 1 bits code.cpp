class Solution {
public:
    int hammingWeight(uint32_t n) {
       int bitMask =1;
       int count = 0;
       for(int i=0;i<32;i++){
           if(n& bitMask) count++;
           n>>= bitMask;
       }
       return count;
    }
};
