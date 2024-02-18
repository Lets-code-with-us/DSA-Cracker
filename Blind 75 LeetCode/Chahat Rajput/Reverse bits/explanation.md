Explanation:-Reverse Bits

*******Detailed Approach**********


**Initialize a variable "result" in which store a answer**

**Loop 0 to 32**
**Store right most bit by taking "&" with 1 (n&1) so that we know that right most bit is 1 or 0**
**In "reverse" now do ith time left shift of the bits to reverse the bits so that lsb bit come first**
**In "result" store or of reverse and result (reverse | result)**
****Now do right shift of n because next time lsb will change and do & with other bit**


*******Complexity*********

*****Space:-O(1)**
****Time:-O(n)**
