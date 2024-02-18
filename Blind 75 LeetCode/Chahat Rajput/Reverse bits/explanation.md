Explanation:-Reverse Bits

*****Detailed Approach******


1.**Initialize a variable "result" in which store a answer**

2.***Loop 0 to 32***

3.***Store right most bit by taking "&" with 1 (n&1) so that we know that right most bit is 1 or 0***

4.**In "reverse" now do ith time left shift of the bits to reverse the bits so that lsb bit come first**

5.**In "result" store or of reverse and result (reverse | result)**

6.***Now do right shift of n because next time lsb will change and do & with other bit**


*******Complexity*********

Space:-O(1)
Time:-O(n)
