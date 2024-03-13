Explanation:-Kth Smallest Element in BST

Approach:-

**Detailed Approach**

1. Initialize a vector in which you store your elemnets of tree 

2. Traverse a tree through any traversal(can use preorder) and put values into vector

3. Now sort(ascending) the vector

4. Atlast return v[k-1](k is index elemnt which you have to return)

**Complexity**
Time:-o(nlogn),where n is size of an array,for sorting an array and traversing BST for finding smallest kth ele.
Space:-O(n),for storing ele. of BST. 