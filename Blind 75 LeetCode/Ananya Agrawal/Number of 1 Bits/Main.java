public class Solution {
    public int hammingWeight(int n) {
        int c=0;
        while(n!=0){
            n=(n&(n-1));
            c++;
        }
        return c;
    }
}
        
