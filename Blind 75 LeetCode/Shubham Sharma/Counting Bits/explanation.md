## Intuition

* Initializing a vector ans to store the count of set bits for each number from 0 to n.
* started with the base case of n = 0, where the count is 0. 
* Then, iteratively built upon this by using the counts for smaller numbers.
* utilized a while loop to generate the counts until reaching the desired value of n.
* Inside the loop, for each count already present in ans, added 1 to create the count for the next number.
*  This process continued until the vector ans contained the counts for all numbers from 0 to n.