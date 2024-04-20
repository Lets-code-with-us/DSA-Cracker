class Solution{
    public int maximalRectangle(char[][] matrix){
        if(matrix==null || matrix.length==0) return 0;
        int rows=matrix.length;
        int cols=matrix[0].length;
        int[] heights=new int[cols];
        int maxArea=0;
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(matrix[i][j]=='1'){
                    heights[j]++;
                } 
                else{
                    heights[j]=0;
                }
            }
            maxArea=Math.max(maxArea,largestRectangleArea(heights));
        }
        return maxArea;
    }
    private int largestRectangleArea(int[] heights){
        int maxArea=0;
        int n=heights.length;
        int[] left=new int[n];
        int[] right=new int[n];
        Stack<Integer> stack=new Stack<>();
        for(int i=0;i<n;i++){
            while(!stack.isEmpty()&&heights[stack.peek()]>=heights[i]){
                stack.pop();
            }
            left[i]=stack.isEmpty()?-1:stack.peek();
            stack.push(i);
        }
        stack.clear();
        for(int i=n-1;i>=0;i--){
            while(!stack.isEmpty()&&heights[stack.peek()]>=heights[i]){
                stack.pop();
            }
            right[i]=stack.isEmpty()?n:stack.peek();
            stack.push(i);
        }
        for(int i=0;i<n;i++){
            maxArea=Math.max(maxArea,heights[i]*(right[i]-left[i]-1));
        }
        return maxArea;
    }
}
