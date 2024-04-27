class Solution{
    public TreeNode buildTree(int[] preorder,int[] inorder){
        return buildTree(preorder,inorder,0,preorder.length-1,0,inorder.length-1);
    }
    private TreeNode buildTree(int[] preorder,int[] inorder,int preStart,int preEnd,int inStart,int inEnd){
        if(preStart>preEnd || inStart>inEnd){
            return null;
        }
        int rootVal=preorder[preStart];
        int rootIndex=inStart;
        while(rootVal!=inorder[rootIndex]){
            rootIndex++;
        }
        TreeNode root=new TreeNode(rootVal);
        int leftSize=rootIndex-inStart;
        root.left=buildTree(preorder,inorder,preStart+1,preStart+leftSize,inStart, rootIndex-1);
        root.right=buildTree(preorder,inorder,preStart+leftSize+1,preEnd,rootIndex+1,inEnd);
        return root;
    }
}
