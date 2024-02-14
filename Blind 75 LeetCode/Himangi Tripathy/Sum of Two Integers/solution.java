class Solution {
    public int getSum(int a, int b) {
        while(b!=0){
            final int carry=a&b;
            a^=b;
            b= carry<<1;
        }
        return a;
    }
}