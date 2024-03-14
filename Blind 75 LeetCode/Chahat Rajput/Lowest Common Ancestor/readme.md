Explanation:-Lowest Common Ancestor of a Binary Tree

Approach:-We have to find lowest common ancestor of nodes we can do it using recursion

**Detailed Approach**

1.Start from root go to left side first for finding p or q
	*If p or q founds then returns its root ele.
	*If not founds then go left side for searching ele. if not found then go right to finding the ele.

2.If we not found p or q to left side the go right for finding p or q
	*Same process

3.Suppose we found one ele. from left and could not found elem from right then we return the ele. which we found either p or q and 		vice-versa

**Steps**
Step1:- Root->left if found any return the root
Step2:- If not able to find ele. on left side of root then Root->right 
Step3:- Return Least Common Root in both traversal

**Complexity**
Time:-O(n),for traversing the tree
Space:-O(1),no extra space is used