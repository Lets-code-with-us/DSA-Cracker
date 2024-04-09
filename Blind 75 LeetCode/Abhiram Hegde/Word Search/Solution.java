class Solution{
    public boolean exist(char[][] board,String word){
        int rows=board.length;
        int cols=board[0].length;
        for(int row=0;row<rows;row++){
            for(int col=0;col<cols;col++){
                if(board[row][col]==word.charAt(0) && backtrack(board,row,col,0,word)){
            return true;
                }
            }
        }
        return false;
    }
    private boolean backtrack(char[][] board,int row,int col,int index,String word){
        if(index==word.length()){
            return true;
        }
        if(row<0 || row>=board.length || col<0 || col>=board[0].length || board[row][col]!=word.charAt(index)){
            return false;
        }
        board[row][col]='#';
        boolean found=backtrack(board,row+1,col,index+1,word) || backtrack(board,row-1,col,index+1,word) || backtrack(board,row,col+1,index+1,word) || backtrack(board,row,col-1,index+1,word);
        board[row][col]=word.charAt(index);
        return found;
    }
}
