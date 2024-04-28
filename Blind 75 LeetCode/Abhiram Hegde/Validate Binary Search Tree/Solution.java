class Solution{
    public boolean isValidBST(TreeNode root){
        return isValidBST(root,Long.MIN_VALUE,Long.MAX_VALUE);
    }
    private boolean isValidBST(TreeNode node,long lowerBound,long upperBound){
        if(node==null){
            return true;
        }
        if(node.val<=lowerBound || node.val>=upperBound){
            return false;
        }
        return isValidBST(node.left,lowerBound,node.val) && isValidBST(node.right,node.val,upperBound);
    }
}
