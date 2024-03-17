class Solution {
    public int[] countBits(int n) {
        int[] ans = new int[n+1];//ans is a new array initialized with array length n+1;
        for(int i=1;i<=n;i++){// we traverse the array ans
            ans[i]=ans[i/2]+(i%2);//here we assign the values for different indexes in the array 
        }
        return ans;//we return the array ans
        
    }
}