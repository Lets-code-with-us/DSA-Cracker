class Solution{
    public int[] productExceptSelf(int[] nums){
        int n=nums.length;
        int[] answer=new int[n];
        answer[0]=1;
        for(int i=1;i<n;i++){
            answer[i]=nums[i-1]*answer[i-1];
        }
        int x=1;
        for(int i=n-1;i>=0;i--){
            answer[i]=answer[i]*x;
            x=x*nums[i];
        }
        return answer;
    }
}
