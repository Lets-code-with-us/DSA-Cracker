# Explanation: Design Add and Search Words Data Structure

# Approach
In this problem we have to make a data structure which perform all the operations which is mentioned in the problem.Implementation is exact same as of Implement trie problem just a slight difference there is a dot present in string it means that we have to find all combination through which we can make a string which is present in the data structure.

# Detailed Approach
1. Just implement the functions which is declare in the given code 

2. In addWord() function inserts the string characters one by one in DS(trie) by adding nodes in trie and one tracker who track the nodes if it reaches at the lats index then return true

3. In search() function searches the word in the trie if yes then return true otherwise false

4. But there is one slight diff. which we have to do in this "d..s" this string is given and we have to find any combination which fills the dot so we make SearchAfterDot() to find all possible combination which we can make and if matches(present in DS) then return true otherwise false

5.We put all 26 char. in the place of dot('.') and check that substring present in the DS and move our pinter to fill other dot and try to find out that string is in DS if yes then return True other False

# Complexity
- Time Complexity: O(n),length of word
- Space Complexity:O(n),for creating and storing the words in trie