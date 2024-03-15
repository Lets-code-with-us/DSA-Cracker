# Explanation: Implement Trie(Prefix Tree)

# Deatiled Approach
1. Just implement trie functions and try to understand first how will work
2. Now we have to implement all the functions which declare in the code
3. Insert function inserts the string characters one by one in trie by adding nodes in trie and one tracker who track the nodes if it reaches at the lats index then return true
4. Search function searches the word in the trie if yes then return true otherwise false
5. startsWith function check that given prefix is present in the trie or not

# Complexity
- Time Complexity: O(n),length of word
- Space Complexity:O(n),for creating and storing the words in trie