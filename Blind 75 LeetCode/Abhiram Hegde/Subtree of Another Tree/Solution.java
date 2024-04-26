class Solution{
    public boolean isSubtree(TreeNode root,TreeNode subRoot){
        if(root==null){
            return false;
        }
        if(root.val==subRoot.val){
            if(isSameTree(root,subRoot)){
                return true;
            }
        }
        return isSubtree(root.left,subRoot) || isSubtree(root.right,subRoot);
    }
    private boolean isSameTree(TreeNode root1,TreeNode root2){
        if(root1==null && root2==null){
            return true;
        }
        if(root1==null || root2==null){
            return false;
        }
        return (root1.val==root2.val) && isSameTree(root1.left,root2.left) && isSameTree(root1.right,root2.right);
    }
}
