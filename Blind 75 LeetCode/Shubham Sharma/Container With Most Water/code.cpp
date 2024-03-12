class Solution {
public:
    int maxArea(vector<int>& height) {
        int area=-1e8;
        int n=height.size();
        
        int i=0, j=n-1;

        while(i<n){
            int l= min(height[i], height[j]);                  
            area = max(area, (j-i)*l);
            if(l==height[i]){
                i++;
            }
            else{
                j--;
            }   
        }
       return area;
    }
};