/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int kthSmallest(TreeNode root, int k) {
        int[] count={0};
        TreeNode[] result=new TreeNode[1];
        traverse(root,k,count,result);
        return result[0].val;
    }
    private void traverse(TreeNode root,int k,int[] count,TreeNode[] result){
        if(root==null){
            return;
        }
        traverse(root.left,k,count,result);
        count[0]++;
        if(count[0]==k){
            result[0]=root;
            return;
        }
        traverse(root.right,k,count,result);
    }
}
