
class Solution {
public:
    int maxArea(vector<int>& height) {
        int start = 0;
        int end = height.size() - 1;
        int maxArea = 0;
        
        while (start < end) {
            int currentArea = min(height[start], height[end]) * (end - start);
            maxArea = max(maxArea, currentArea);
            
            if (height[start] < height[end]) {
                start++;
            } else {
                end--;
            }
        }
        
        return maxArea;
    }
};
