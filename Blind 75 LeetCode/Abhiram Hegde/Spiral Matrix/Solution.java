class Solution{
    public List<Integer>spiralOrder(int[][] matrix){
        int rows=matrix.length;
        int cols=matrix[0].length;
        List<Integer> result=new ArrayList<>();
        int left=0,right=cols-1,top=0,bottom=rows-1;
        while(left<=right && top<=bottom){
            for(int col=left;col<=right;col++){
                result.add(matrix[top][col]);
            }
            top++;
            for(int row=top;row<=bottom;row++){
                result.add(matrix[row][right]);
            }
            right--; 
            if(top<=bottom){
                for(int col=right;col>=left;col--){
                    result.add(matrix[bottom][col]);
                }
                bottom--;
            } 
            if(left<=right){
                for(int row=bottom;row>=top;row--){
                    result.add(matrix[row][left]);
                }
                left++;
            }
        }
        return result;
    }
}
