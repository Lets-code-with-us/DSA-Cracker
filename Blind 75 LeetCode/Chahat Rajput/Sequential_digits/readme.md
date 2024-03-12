Explanation:-Sequential Digit

Approach:-Sequential digit is Ex:- 12,23 it is a sequential digit because 1<2 and 2<3 so if previous one is less then next one (sorted order) then it is called as sequential digit.
This question uses 2 approach one if from BFS and Other is from storing all possible combinations.

**Detailed Approach**

1.We know that our possible answers are fixed and they have certain possibilty that lies between a fixed range

2.We can store all possible combinations into a vector and the traverse from it

3.If no. is i>=low && i<=high then push it into result(vector)

4.Atlast return the result

5.This is fast approach you can also use BFS for this question

**Complexity**
Time:-O(1),because size and numbers are fixed so it takes fixed and constant time to finding answers
Space:-O(n),for storing answer