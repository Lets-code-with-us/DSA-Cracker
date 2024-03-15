class Solution {
public:
    int maxArea(vector<int>& height) {
        int ans = 0;
        int n = height.size();
        
        int start = 0;
        int end = n-1;

        while(start <= end){
            int temp = abs(end - start) * min(height[start], height[end]);

            ans = max(ans, temp);
            if(height[start] < height[end]) start++;
            else end--;
        }
        
        return ans;
    }
};
