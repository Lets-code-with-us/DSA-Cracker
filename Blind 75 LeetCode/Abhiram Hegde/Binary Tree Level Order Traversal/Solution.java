class Solution{
    public List<List<Integer>> levelOrder(TreeNode root){
        List<List<Integer>> result=new ArrayList<>();
        if(root==null){
            return result;
        }
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            List<Integer> level=new ArrayList<>();
            int levelSize=queue.size();
            for(int i=0;i<levelSize;i++){
                TreeNode node=queue.poll();
                level.add(node.val);
                if(node.left!=null){
                    queue.offer(node.left);
                }
                if(node.right!=null){
                    queue.offer(node.right);
                }
            }
            result.add(level);
        }
        return result;
    }
}
