class Solution {
    public int getSum(int a, int b) {
        while(b!=0){//as long as b is not equal to 0 then
            final int carry=a&b;//final value of carry is a and b or a multiplied with b in binary
            a^=b;//here a is assigned the value of a xor b
            b= carry<<1;//b is assigned the value of carry left shift 1
        }
        return a;// we return the value of a
    }
}