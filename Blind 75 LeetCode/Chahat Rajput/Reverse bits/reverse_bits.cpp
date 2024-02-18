class Solution {
public:
    uint32_t reverseBits(uint32_t n) {
        int result=0;
        for(int i=0;i<32;i++){
            int lsb=n&1;#right most bit ka pta lgana ki 1 he ya 0
            int reverse=lsb<<(31-i);#ith time left shift kr dena because 
            result=result | reverse;#take or of result and reverse to update final output
            n=n>>1;#do right shift of n because next time take lsb another bit which come after another
        }
        return result;
    }
};