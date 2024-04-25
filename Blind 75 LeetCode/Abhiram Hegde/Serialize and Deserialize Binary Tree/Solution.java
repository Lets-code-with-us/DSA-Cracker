public class Codec{
    public String serialize(TreeNode root){
        StringBuilder sb=new StringBuilder();
        preorder(root,sb);
        return sb.toString();
    }
    private void preorder(TreeNode root,StringBuilder sb){
        if(root==null){
            sb.append("X,");
        } 
        else{
            sb.append(root.val+",");
            preorder(root.left,sb);
            preorder(root.right,sb);
        }
    }
    public TreeNode deserialize(String data){
        String[] nodes=data.split(",");
        int[] index={0};
        return buildTree(nodes,index);
    }
    private TreeNode buildTree(String[] nodes,int[] index){
        if(nodes[index[0]].equals("X")){
            index[0]++;
            return null;
        }
        TreeNode root=new TreeNode(Integer.parseInt(nodes[index[0]]));
        index[0]++;
        root.left=buildTree(nodes,index);
        root.right=buildTree(nodes,index);
        return root;
    }
}
