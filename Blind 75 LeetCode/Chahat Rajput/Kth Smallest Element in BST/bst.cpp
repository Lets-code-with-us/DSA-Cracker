class Solution {
public:
    vector<int> v;
    void preorder(TreeNode* node){
        if (node == NULL)
        return;
        // First print data of node
        v.push_back(node->val);
 
        // Then recur on left subtree
        preorder(node->left);
 
        // Now recur on right subtree
        preorder(node->right);
    }
    int kthSmallest(TreeNode* root, int k) {
        preorder(root);

        sort(v.begin(),v.end());

        return v[k-1];
    }
};