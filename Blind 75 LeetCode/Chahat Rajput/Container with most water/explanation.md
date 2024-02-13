
Explanation:-Container with most water

Approach:-The algorithm maintains two pointers, i and j, representing the left and right ends of the container. It calculates the width l, the height h (minimum of the heights at the pointers), and updates the maximum area if the current area is greater.



********Detail Approach*******

*Code uses two pointer approach
*i and j represents first and last position
*It calculates the width of container as 'j-i'
*It determines the height by selecting the smaller of two heights between
h[i] and h[j]
*Aread is calculayed as height*width
*The code keep track of maximum area encountered during the traversal


Complexity
Space:-O(1),Not any space is used
Time:-O(n),For traversing array and find max area of container