## Intuition

the problem statement needs only the sum of maximum subarray
* take a sum variable with INT_MIN value 
* using loop, traverse and find the sum of the elements 
* inside loop update the value of sum in each iteration 
* if the sum value is below 0 then intitialize sum value with 0 at that iteration inside the loop 
* return the sum