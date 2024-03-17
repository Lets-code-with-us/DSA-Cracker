# Explanation:- Word Search-II

Approach:-We have to store whole words in trie and then travverse the grid to find char. we have to move all directions of the char. to find further matching ele. and if we find all then store into result again repeat whoke process again

# Detailed Appraoch

1. In trie we put the words(which we have to find from grid) node by node 

2. Then we traverse on grid and search related char. froma trie if found then mark it as '$' because we already traverse it.

3. Take one char from grid (go in all directions but not to that which already visited means marked as '$') and search it from trie  if found then move the pointer to that node in trie and simulatneously we check thta if EndofWord==false so that we can reach end of the word

4. Then In result append the word which we correctly found

5. Now undo the whole process means remove '$' sign from grid because now we again repeat the process again...

6. Finally return the result

# Complexity

- Time:-O(m*n)
- Space:-O(m*n)