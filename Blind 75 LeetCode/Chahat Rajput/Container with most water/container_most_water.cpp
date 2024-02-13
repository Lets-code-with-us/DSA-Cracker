class Solution {
public:
    int maxArea(vector<int>& height) {
    int n=height.size();
    int i = 0, j = n - 1,area=0,MaxArea=0;
    while (i < j)
    {
        //pehle minimum nikal lo and j-i se multiply kr do and store result into area
        area = min(height[i],height[j])*(j-i);
        //agar area maxarea se badha he to maxarea ko update kro do
        MaxArea=max(MaxArea,area);
        //jo chota he us ka index increment kr do
        if (height[i] < height[j])
        {i++;}
        else{j--;}
    }
    //finally return the MaxArea
    return MaxArea;
    }
};