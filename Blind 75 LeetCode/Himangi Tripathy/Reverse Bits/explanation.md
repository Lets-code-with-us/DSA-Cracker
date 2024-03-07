public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int res=0;//we initialized res to 0
        for(int i=0;i<32;i++){//we traverse the 32 bit integer
            res=(res<<1) | (n&1);//res is equal to bitwise OR operation of res left shift 1 and  bitwise and operation of n and 1
            n=n>>1;//n signed right shift 1
        }
        return res;//we return res
        
    }
}