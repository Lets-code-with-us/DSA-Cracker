class Solution{
    int maxSum=Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root){
        helper(root);
        return maxSum;
    }
    private int helper(TreeNode node){
        if(node==null){
            return 0;
        }
        int leftMax=Math.max(0,helper(node.left));
        int rightMax=Math.max(0,helper(node.right));
        int currentSum=leftMax+rightMax+node.val;
        maxSum=Math.max(maxSum,currentSum);
        return Math.max(leftMax,rightMax)+node.val;
    }
}
