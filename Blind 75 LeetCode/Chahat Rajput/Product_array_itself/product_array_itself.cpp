class Solution {
public:
    vector<int> productExceptSelf(vector<int>& nums) {
    //Do array bna lo left me left most elements ko mul kr ke dal do same right ka bhi and last dono arrays ko mul kr do
    int n=nums.size();
    //Temporary memory
    int *left=new int[sizeof(int)*n];
    int *right=new int[sizeof(int)*n];
    //Final result vector
    vector<int>prod;
    left[0] = 1;
    //Left array me nums ke element ko mul kr ke dal do
    for (int i = 1; i < n; i++)
    {
        left[i]=left[i-1]*nums[i-1];
    }
    //Right me nums ke ele ke sath mul kr ke right me dal do
    right[n-1]=1;
    for (int j = n-2; j >= 0; j--)
    {
        right[j]=right[j+1]*nums[j+1];
    }
    //
    for (int i = 0; i < n; i++)
    {
        int result=left[i]*right[i];
        prod.push_back(result);
    }
    return prod;
    }
};