class Solution {
    bool palindro(int x){
        int temp = x,sum=0;
        while(temp!=0){
            int modtemp = temp%10;
            sum = sum*10 + modtemp;
            temp = temp/10;
        }
        return sum == x;
    }
public:
    int PalinArray(int a[], int n)
    {
    	for(int i=0;i<n;i++){
    	    if(!palindro(a[i])){
    	        return 0;
    	    }
    	}
    	return 1;
    }
    
};
