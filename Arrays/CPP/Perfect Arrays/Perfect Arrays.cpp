//User function Template for C++

class Solution{
    public:
    bool IsPerfect(int a[],int n)
    {
        // Complete the function
        if( n == 1) return true;
        for(int i=0,j=n-1;i<=(n/2)+1;i++,j--){
            if(a[i]!=a[j]) return false;
        }
        return true;
    }
};
